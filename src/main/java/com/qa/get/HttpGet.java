package com.qa.get;

import com.jxq.common.HttpBase;
import com.jxq.reqres_website.getMonthlyCallReport;
import com.qa.HttpResModel;
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
    private getMonthlyCallReport monthlyCall;

    public HttpGet(String host) {
        super(host);
        monthlyCall = super.create(getMonthlyCallReport.class);
    }

    public Response<HttpResModel> getMonthly(String timeKey) throws IOException {
        Call<HttpResModel> call = monthlyCall.getMonthly(timeKey);
        return call.execute();
    }
}
