package com.qa.tests;

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

;

/**
 * Created by IntelliJ IDEA.
 * User: yuanxiujing
 * Date: 18/11/22
 * Time: 下午2:36
 * POST类testcase
 */
public class PostApiTest extends TestBase {
    private static Properties properties;
    private static HttpPost implPost;
    private static String SCHEMA_PATH = "parameters/post/schema/FoxDecreaseLateInterest.json";

    @BeforeSuite
    public void beforeSuite() throws IOException {
        InputStream stream = this.getClass().getClassLoader().getResourceAsStream("env.properties");
        properties = new Properties();
        properties.load(stream);

        String host = properties.getProperty("biz.api.host");
        implPost = new HttpPost(host);
        stream = this.getClass().getClassLoader().getResourceAsStream("parameters/post/FoxDecreaseLateInterestParams.properties");
        properties.load(stream);

        stream = this.getClass().getClassLoader().getResourceAsStream("");
        stream.close();
    }

    @Test(description = "罚息减免。")
    public void testcase1() throws IOException {
        String asset_item_no = properties.getProperty("testcase1.req.asset_item_no");
        int period = Integer.parseInt(properties.getProperty("testcase1.req.period"));
        int amount = Integer.parseInt(properties.getProperty("testcase1.req.amount"));

        Response<HttpResModel> response = implPost.postDecreaseLateInterest(asset_item_no, period, amount);
        HttpResModel body = response.body();
        Assert.assertNotNull(body, "response.body()");
//        将需要验证的response 与 JsonSchema标准对象 进行比较
        JsonSchemaUtils.assertResponseJsonSchema(SCHEMA_PATH, JSONObject.toJSONString(body));

        Assert.assertNotNull(body.getCode(), "code");
        Assert.assertNotNull(body.getMessage(), "message");

//        Assert.assertEquals(body.getCode(),0);
//        Assert.assertEquals(body.getMessage(),"罚息减免成功");

        Assert.assertEquals(body.getCode(), 1);
        body.getMessage().contains("数据不完整，请修改，Rbiz返回数据格式有问题");
//      判断断言码是否为200
        int statusCode = response.code();
        Assert.assertEquals(statusCode, RESPNSE_STATUS_CODE_200, "response status code is 200");
    }
}
