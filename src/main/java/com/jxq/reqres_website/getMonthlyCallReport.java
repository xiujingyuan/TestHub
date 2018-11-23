package com.jxq.reqres_website;

import com.qa.HttpResModel;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by IntelliJ IDEA.
 * User: yuanxiujing
 * Date: 18/11/20
 * Time: 下午4:16
 */
public interface getMonthlyCallReport {
    @GET("api/genesysCallReport/monthly")
    Call<HttpResModel> getMonthly(@Query("timeKey") String timeKey);
}
