package com.qa.tests.fox;

import com.alibaba.fastjson.JSONObject;
import com.qa.HttpResModel;
import com.qa.common.JsonSchemaUtils;
import com.qa.common.TestBase;
import com.qa.post.HttpPost;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import retrofit2.Response;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by IntelliJ IDEA.
 * User: yuanxiujing
 * Date: 18/11/26
 * Time: 下午8:16
 * 资产同步 fox从BIZ主动拉取
 */
public class AssetSyncTest extends TestBase {
    private static Properties properties;
    private static HttpPost implPost;
    private static String SCHEMA_PATH = "parameters/post/schema/AssetSync.json";

    @BeforeSuite
    public void beforeSuite() throws IOException {
        InputStream stream = this.getClass().getClassLoader().getResourceAsStream("env.properties");
        properties = new Properties();
        properties.load(stream);

        String host = properties.getProperty("fox.api.host");
        implPost = new HttpPost(host);
        stream = this.getClass().getClassLoader().getResourceAsStream("parameters/post/AssetSyncParams.properties");
        properties.load(stream);

        stream = this.getClass().getClassLoader().getResourceAsStream("");
        stream.close();
    }

    @Test(description = "资产同步。")
    public void testcase1() throws IOException {
        int overdue_days = Integer.parseInt(properties.getProperty("testcase1.req.overdue_days"));
        String assetPeriodType = properties.getProperty("testcase1.req.assetPeriodType");
        int assetPeriodCount = Integer.parseInt(properties.getProperty("testcase1.req.assetPeriodCount"));
        int assetPeriodDays = Integer.parseInt(properties.getProperty("testcase1.req.assetPeriodDays"));

        Response<HttpResModel> response = implPost.postAssetSync(overdue_days, assetPeriodType, assetPeriodCount,
                assetPeriodDays);
        HttpResModel body = response.body();
        Assert.assertNotNull(body, "response.body()");
//        将需要验证的response 与 JsonSchema标准对象 进行比较
        JsonSchemaUtils.assertResponseJsonSchema(SCHEMA_PATH, JSONObject.toJSONString(body));

        Assert.assertNotNull(body.getCode(), "code");
        Assert.assertNotNull(body.getMessage(), "message");

        Assert.assertEquals(body.getCode(), 0);
        Assert.assertEquals(body.getMessage(), "ok");
//      判断断言码是否为200
        int statusCode = response.code();
        Assert.assertEquals(statusCode, RESPNSE_STATUS_CODE_200, "response status code is 200");
    }
}
