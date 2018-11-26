package com.qa.post;

import com.qa.HttpResModel;
import com.qa.api.FoxApi;
import com.qa.bean.requestBean.AssetSyncReqBean;
import com.qa.bean.requestBean.FoxDecreaseLateInterestReqBean;
import com.qa.common.HttpBase;
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

    //    罚息减免
    public Response<HttpResModel> postDecreaseLateInterest(String asset_item_no, int period, int amount) throws IOException {
        FoxDecreaseLateInterestReqBean decreaseLateInterestReqBean =
                FoxDecreaseLateInterestReqBean.getDeaultFoxDecreaseLateInterestReqBean(asset_item_no, period, amount);
        Call<HttpResModel> call = foxApi.postDecreaseLateInterest(decreaseLateInterestReqBean);
        return call.execute();
    }

    public Response<HttpResModel> postAssetSync(int overdue_days) throws IOException {
        AssetSyncReqBean assetSyncReqBean = AssetSyncReqBean.getDefaultAssetSyncReqBean(overdue_days);
        Call<HttpResModel> call = foxApi.postAssetSync(assetSyncReqBean);
        return call.execute();
    }
}
