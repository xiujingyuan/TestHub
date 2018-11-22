package com.qa.api;

import com.qa.HttpModel;
import com.qa.bean.requestBean.FoxDecreaseLateInterestReqBean;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by IntelliJ IDEA.
 * User: yuanxiujing
 * Date: 18/11/22
 * Time: 下午2:11
 */
public interface FoxApi {
    @POST("fox/decrease-late-interest")
    Call<HttpModel> postDecreaseLateInterest(@Body FoxDecreaseLateInterestReqBean foxDecreaseLateInterestReqBean);
}
