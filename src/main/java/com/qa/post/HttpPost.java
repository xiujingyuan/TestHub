package com.qa.post;

import com.jxq.common.HttpBase;
import com.qa.HttpResModel;
import com.qa.api.FoxApi;
import com.qa.bean.requestBean.FoxDecreaseLateInterestReqBean;
import retrofit2.Call;
import retrofit2.Response;

import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * User: yuanxiujing
 * Date: 18/11/22
 * Time: 下午2:40
 */
public class HttpPost extends HttpBase {
    private FoxApi foxApi;

    public HttpPost(String host) {
        super(host);
        foxApi = super.create(FoxApi.class);
    }

    public Response<HttpResModel> postDecreaseLateInterest(String asset_item_no, int period, int amount) throws IOException {
        FoxDecreaseLateInterestReqBean decreaseLateInterestReqBean =
                FoxDecreaseLateInterestReqBean.getDeaultFoxDecreaseLateInterestReqBean(asset_item_no, period, amount);
        Call<HttpResModel> call = foxApi.postDecreaseLateInterest(decreaseLateInterestReqBean);
        return call.execute();
    }
}
