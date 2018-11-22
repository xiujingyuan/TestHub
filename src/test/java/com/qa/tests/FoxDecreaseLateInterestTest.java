package com.qa.tests;

import com.alibaba.fastjson.JSONObject;
import com.jxq.reqres_website.base.TestBase;
import com.jxq.tools.JsonSchemaUtils;
import com.qa.HttpModel;
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
 * Date: 18/11/22
 * Time: 下午2:36
 * 罚息减免接口测试
 */
public class FoxDecreaseLateInterestTest extends TestBase {
    private static Properties properties;
    private static HttpPost implPost;
    private static String SCHEMA_PATH = "parameters/post/schema/FoxDecreaseLateInterest.json";

    String asset_item_no = properties.getProperty("testcase1.req.asset_item_no");
    int period = Integer.parseInt(properties.getProperty("testcase1.req.period"));
    int amount = Integer.parseInt(properties.getProperty("testcase1.req.amount"));

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
        Response<HttpModel> response = implPost.postDecreaseLateInterest(asset_item_no, period, amount);
        HttpModel body = response.body();
        Assert.assertNotNull(body, "response.body()");
//        响应返回内容想通过schema标准校验
        JsonSchemaUtils.assertResponseJsonSchema(SCHEMA_PATH, JSONObject.toJSONString(body));
//        再Json化成对象
        Assert.assertNotNull(body.getCode(), "code");
        Assert.assertNotNull(body.getMessage(), "message");
    }

    @Test(description = "判断断言状态码是不是200")
    public void testcase2() throws IOException {
        //断言状态码是不是200
        Response<HttpModel> response = implPost.postDecreaseLateInterest(asset_item_no, period, amount);

        int statusCode = response.code();
        Assert.assertEquals(statusCode, RESPNSE_STATUS_CODE_200, "response status code is 200");
    }
}
