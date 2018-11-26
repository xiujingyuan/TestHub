package com.qa.get;

import com.qa.common.HttpBase;
import com.qa.HttpResModel;
import com.qa.api.FoxApi;
import retrofit2.Call;
import retrofit2.Response;

import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * User: yuanxiujing
 * Date: 18/11/22
 * Time: 下午2:40
 */
public class HttpGet extends HttpBase {
    private FoxApi foxApi;

    public HttpGet(String host) {
        super(host);
        foxApi = super.create(FoxApi.class);
    }

//    获取呼叫中心通时通次月报
    public Response<HttpResModel> getMonthly(String timeKey) throws IOException {
        Call<HttpResModel> call = foxApi.getMonthly(timeKey);
        return call.execute();
    }

    //    获取呼叫中心通时通次日报
    public Response<HttpResModel> getDaily(String timeKey) throws IOException {
        Call<HttpResModel> call = foxApi.getDaily(timeKey);
        return call.execute();
    }
}
