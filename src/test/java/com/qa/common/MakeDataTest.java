package com.qa.common;

import com.qa.post.HttpPost;
import com.qa.util.DateUtils;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Calendar;
import java.util.Date;
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

        for (int i = 0; i < 16; i++) {
//            RandomValue randomValue = new RandomValue();
//            int overdue_days = randomValue.getNum(1, 2000);
            int overdue_days = 1;
            String assetPeriodType = "day";
            int assetPeriodCount = 1;
            int assetPeriodDays = 30;
            implPost.postAssetSync(overdue_days, assetPeriodType, assetPeriodCount, assetPeriodDays);
        }
    }

    @Test
    public void test() {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.HOUR_OF_DAY, 6);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);

        Date date = new Date();
        String endTime = String.valueOf(date.getTime() / 1000);
        Date startDate = DateUtils.getBeforeTime(-3, date);
        String startDateStr = String.valueOf(startDate.getTime() / 1000);
        System.out.println(startDateStr);
        System.out.println(endTime);
    }

}
