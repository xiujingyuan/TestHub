package com.qa;

import com.jxq.common.HttpBase;
import com.jxq.douban.domain.MovieResponseVO;
import retrofit2.Call;
import retrofit2.Response;

import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * User: yuanxiujing
 * Date: 18/11/20
 * Time: 下午5:37
 */
public class MonthlyCall extends HttpBase {

    private getMonthlyCallReport monthlyCall;

    public MonthlyCall(String host) {
        super(host);
        monthlyCall = super.create(getMonthlyCallReport.class);
    }

    public Response<MovieResponseVO> getMonthly(String timeKey) throws IOException {
        Call<MovieResponseVO> call = monthlyCall.getMonthly(timeKey);
        return call.execute();
    }

}