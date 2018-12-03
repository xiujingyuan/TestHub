package com.qa.common;

import com.qa.post.HttpPost;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by IntelliJ IDEA.
 * User: yuanxiujing
 * Date: 18/11/30
 * Time: 下午4:23
 */
public class MakeDataTest {
    private static Properties properties;
    private static HttpPost implPost;

    @BeforeSuite
    public void beforeSuite() throws IOException {
        InputStream stream = this.getClass().getClassLoader().getResourceAsStream("env.properties");
        properties = new Properties();
        properties.load(stream);

        String host = properties.getProperty("fox.api.host");
        implPost = new HttpPost(host);

        stream = this.getClass().getClassLoader().getResourceAsStream("");
        stream.close();
    }

    /**
     * 数据制作
     *
     * @throws IOException
     */
    @Test
    public void make() throws IOException {
        RandomValue randomValue = new RandomValue();
        int overdue_days = randomValue.getNum(1, 365);

        for (int i = 0; i < 1000; i++) {
            implPost.postAssetSync(overdue_days);
        }
    }
}
