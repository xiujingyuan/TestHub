package com.jxq.douban;

import com.jxq.douban.domain.MovieResponseVO;
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
    Call<MovieResponseVO> getmonthly(@Query("timeKey") String timeKey);
}
