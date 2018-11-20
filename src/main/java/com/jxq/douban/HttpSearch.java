package com.jxq.douban;

import com.jxq.common.HttpBase;
import com.jxq.douban.domain.MovieResponseVO;
import com.qa.getMonthlyCallReport;
import retrofit2.Call;
import retrofit2.Response;

import java.io.IOException;

/**
 * @Auther: jx
 * @Date: 2018/7/13 17:47
 * @Description:
 */
public class HttpSearch extends HttpBase {

    private ISearch iSearch;
    private getMonthlyCallReport monthlyCall;

    public HttpSearch(String host) {
        super(host);
        iSearch = super.create(ISearch.class);
    }

    public Response<MovieResponseVO> searchTags(String type, String source) throws IOException {
        Call<MovieResponseVO> call = iSearch.searchTags(type, source);
        return call.execute();
    }

    public Response<MovieResponseVO> getMonthly(String timeKey) throws IOException {
        Call<MovieResponseVO> call = monthlyCall.getMonthly(timeKey);
        return call.execute();
    }

}
