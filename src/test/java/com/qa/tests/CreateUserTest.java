package com.qa.tests;

import com.alibaba.fastjson.JSONObject;
import com.jxq.douban.domain.MovieResponseVO;
import com.jxq.reqres_website.CreateUser;
import com.jxq.reqres_website.base.TestBase;
import com.jxq.tools.JsonSchemaUtils;
import org.apache.http.client.ClientProtocolException;
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
 * Time: 下午6:44
 */
public class CreateUserTest extends TestBase {

    private static Properties properties;
    private static CreateUser createUser;
    private static String SCHEMA_PATH = "parameters/post/schema/CreateUser.json";

    @BeforeSuite
    public void beforeSuite() throws IOException {
        InputStream stream = this.getClass().getClassLoader().getResourceAsStream("env.properties");
        properties = new Properties();
        properties.load(stream);
        String host = properties.getProperty("mock.host");
        createUser = new CreateUser(host);
        stream = this.getClass().getClassLoader().getResourceAsStream("parameters/post/CreateUserParams.properties");
        properties.load(stream);
        stream = this.getClass().getClassLoader().getResourceAsStream("");
        stream.close();
    }

    @Test(description = "获取用户。参数:name=morpheus，job=leader")
    public void testcase1() throws IOException {
        String name = properties.getProperty("testcase1.req.name");
        String job = properties.getProperty("testcase1.req.job");

        Response<MovieResponseVO> response = createUser.apiUsers(name, job);
        MovieResponseVO body = response.body();
        Assert.assertNotNull(body, "response.body()");
//        响应返回内容通过schema标准校验
        JsonSchemaUtils.assertResponseJsonSchema(SCHEMA_PATH, JSONObject.toJSONString(body));
//        再Json化成对象
        Assert.assertNotNull(body.getName(), "name");
        Assert.assertNotNull(body.getJob(), "job");
        Assert.assertNotNull(body.getId(), "id");
        Assert.assertNotNull(body.getCreatedAt(), "createdAt");
    }

    @Test(description = "判断断言状态码是不是201")
    public void testcase2() throws ClientProtocolException, IOException {
        //断言状态码是不是200
        String name = properties.getProperty("testcase1.req.name");
        String job = properties.getProperty("testcase1.req.job");

        Response<MovieResponseVO> response = createUser.apiUsers(name, job);
        int statusCode = response.code();
        Assert.assertEquals(statusCode, RESPNSE_STATUS_CODE_201, "response status code is 201");
    }
}


