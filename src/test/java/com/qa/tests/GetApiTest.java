package com.qa.tests;

import com.alibaba.fastjson.JSONObject;
import com.jxq.reqres_website.base.TestBase;
import com.jxq.tools.JsonSchemaUtils;
import com.qa.HttpResModel;
import com.qa.get.HttpGet;
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
 * Date: 18/11/20
 * Time: 下午3:30
 */
public class GetApiTest extends TestBase {

    private static Properties properties;
    private static HttpGet implGet;
    private static String SCHEMA_PATH = "parameters/get/schema/MonthlyCallReport.json";

    @BeforeSuite
    public void beforeSuite() throws IOException {
        InputStream stream = this.getClass().getClassLoader().getResourceAsStream("env.properties");
        properties = new Properties();
        properties.load(stream);
        String host = properties.getProperty("Test.host");
        implGet = new HttpGet(host);
        stream = this.getClass().getClassLoader().getResourceAsStream("parameters/get/MonthlyCallReportParams.properties");
        properties.load(stream);
        stream = this.getClass().getClassLoader().getResourceAsStream("");
        stream.close();
    }

    @Test(description = "呼叫中心通时通次月报。参数:timeKey=201810")
    public void testcase1() throws IOException {
        String timeKey = properties.getProperty("testcase1.req.timeKey");

        Response<HttpResModel> response = implGet.getMonthly(timeKey);
        HttpResModel body = response.body();
        Assert.assertNotNull(body, "response.body()");
//        响应返回内容通过schema标准校验
        JsonSchemaUtils.assertResponseJsonSchema(SCHEMA_PATH, JSONObject.toJSONString(body));
    }

    @Test(description = "判断断言状态码是不是200")
    public void testcase2() throws IOException {
        //断言状态码是不是200
        String timeKey = properties.getProperty("testcase1.req.timeKey");
        Response<HttpResModel> response = implGet.getMonthly(timeKey);

        int statusCode = response.code();
        Assert.assertEquals(statusCode, RESPNSE_STATUS_CODE_200, "response status code is 200");
    }
}

