package com.jxq.reqres_website;

import com.jxq.common.HttpBase;
import com.jxq.douban.domain.MovieResponseVO;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Response;

import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * User: yuanxiujing
 * Date: 18/11/20
 * Time: 下午6:42
 */
public class CreateUser extends HttpBase {

    private postCreateUser createUser;

    public CreateUser(String host) {
        super(host);
        createUser = super.create(postCreateUser.class);
    }

    public Response<MovieResponseVO> apiUsers(String name, String job) throws IOException {
        Call<MovieResponseVO> call = createUser.apiUsers(name, job);
        return call.execute();
    }
}
