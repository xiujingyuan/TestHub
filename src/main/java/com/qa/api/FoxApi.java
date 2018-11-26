package com.qa.api;

import com.qa.HttpResModel;
import com.qa.bean.requestBean.FoxDecreaseLateInterestReqBean;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by IntelliJ IDEA.
 * User: yuanxiujing
 * Date: 18/11/22
 * Time: 下午2:11
 */
public interface FoxApi {
    /**
     * 罚息减免
     * @param body
     * @return
     */
    @POST("fox/decrease-late-interest")
    Call<HttpResModel> postDecreaseLateInterest(@Body FoxDecreaseLateInterestReqBean body);

    /**
     * 获取呼叫中心通时通次月报
     * @param timeKey
     * @return
     */
    @GET("api/genesysCallReport/monthly")
    Call<HttpResModel> getMonthly(@Query("timeKey") String timeKey);
}
