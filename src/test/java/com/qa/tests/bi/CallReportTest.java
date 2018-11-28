package com.qa.tests.bi;

import com.alibaba.fastjson.JSONObject;
import com.qa.HttpResModel;
import com.qa.common.JsonSchemaUtils;
import com.qa.common.TestBase;
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
 * BI GET类testcase
 */
public class CallReportTest extends TestBase {

    private static Properties properties;
    private static HttpGet implGet;
    private static String SCHEMA_PATH = "parameters/get/schema/CallReport.json";

    @BeforeSuite
    public void beforeSuite() throws IOException {
        InputStream stream = this.getClass().getClassLoader().getResourceAsStream("env.properties");
        properties = new Properties();
        properties.load(stream);

        String host = properties.getProperty("bi.api.host");
        implGet = new HttpGet(host);
        stream = this.getClass().getClassLoader().getResourceAsStream("parameters/get/CallReportParams.properties");
        properties.load(stream);

        stream = this.getClass().getClassLoader().getResourceAsStream("");
        stream.close();
    }

    @Test(description = "呼叫中心通时通次月报。参数:timeKey=201810")
    public void testcase1() throws IOException {
        String monthly_timeKey = properties.getProperty("testcase1.req.monthly.timeKey");

        Response<HttpResModel> monthly_response = implGet.getMonthly(monthly_timeKey);
        HttpResModel monthly_body = monthly_response.body();
        Assert.assertNotNull(monthly_body, "response.body()");
//      将需要验证的response 与 JsonSchema标准对象 进行比较
        JsonSchemaUtils.assertResponseJsonSchema(SCHEMA_PATH, JSONObject.toJSONString(monthly_body));

        int monthly_statusCode = monthly_response.code();
//      判断断言码是否为200
        Assert.assertEquals(monthly_statusCode, RESPNSE_STATUS_CODE_200, "response status code is 200");
        Assert.assertEquals(monthly_body.getMsg(), "请求成功！");
        Assert.assertEquals(monthly_body.isSuccess(), true);
    }

    @Test(description = "呼叫中心通时通次日报。参数:timeKey=20181023")
    public void testcase2() throws IOException {
        String daily_timeKey = properties.getProperty("testcase1.req.daily.timeKey");

        Response<HttpResModel> daily_response = implGet.getDaily(daily_timeKey);
        HttpResModel daily_body = daily_response.body();
        Assert.assertNotNull(daily_body, "response.body()");
//      将需要验证的response 与 JsonSchema标准对象 进行比较
        JsonSchemaUtils.assertResponseJsonSchema(SCHEMA_PATH, JSONObject.toJSONString(daily_body));

        int daily_statusCode = daily_response.code();
//      判断断言码是否为200
        Assert.assertEquals(daily_statusCode, RESPNSE_STATUS_CODE_200, "response status code is 200");
        Assert.assertEquals(daily_body.getMsg(), "请求成功！");
        Assert.assertEquals(daily_body.isSuccess(), true);
    }
}

