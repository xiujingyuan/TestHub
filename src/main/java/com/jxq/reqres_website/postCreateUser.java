package com.jxq.reqres_website;

import com.jxq.douban.domain.MovieResponseVO;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by IntelliJ IDEA.
 * User: yuanxiujing
 * Date: 18/11/20
 * Time: 下午6:19
 */
public interface postCreateUser {
    @POST("api/users")
    Call<MovieResponseVO> apiUsers(@Query("name") String name, @Query("job") String job);
}
