package com.qa.bean.requestBean;

import com.google.gson.annotations.SerializedName;
import org.testng.Reporter;

import java.util.Calendar;

/**
 * Created by IntelliJ IDEA.
 * User: yuanxiujing
 * Date: 18/11/22
 * Time: 下午2:17
 */
public class FoxDecreaseLateInterestReqBean {

    /**
     * type : FoxDecreaseLateInterest
     * key : TEST0000000001
     * from_system : Fox
     * data : {"asset_item_no":"201773105855255019","period":1,"amount":1941}
     */

    @SerializedName("type")
    private String type;
    @SerializedName("key")
    private String key;
    @SerializedName("from_system")
    private String fromSystem;
    @SerializedName("data")
    private DataBean data;

    public FoxDecreaseLateInterestReqBean() {
    }

    public static FoxDecreaseLateInterestReqBean getDeaultFoxDecreaseLateInterestReqBean(String asset_item_no, int period, int amount) {
        String key = String.valueOf(Calendar.getInstance().getTimeInMillis());

        Reporter.log(key);

        FoxDecreaseLateInterestReqBean decreaseLateInterestReqBean = new FoxDecreaseLateInterestReqBean();
        decreaseLateInterestReqBean.setType("FoxDecreaseLateInterest");
        decreaseLateInterestReqBean.setKey(key);
        decreaseLateInterestReqBean.setFromSystem("Fox");

        DataBean dataBean = new DataBean();
        dataBean.setAssetItemNo(asset_item_no);
        dataBean.setPeriod(period);
        dataBean.setAmount(amount);

        decreaseLateInterestReqBean.setData(dataBean);
        return decreaseLateInterestReqBean;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getFromSystem() {
        return fromSystem;
    }

    public void setFromSystem(String fromSystem) {
        this.fromSystem = fromSystem;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * asset_item_no : 201773105855255019
         * period : 1
         * amount : 1941
         */

        @SerializedName("asset_item_no")
        private String assetItemNo;
        @SerializedName("period")
        private int period;
        @SerializedName("amount")
        private int amount;

        public String getAssetItemNo() {
            return assetItemNo;
        }

        public void setAssetItemNo(String assetItemNo) {
            this.assetItemNo = assetItemNo;
        }

        public int getPeriod() {
            return period;
        }

        public void setPeriod(int period) {
            this.period = period;
        }

        public int getAmount() {
            return amount;
        }

        public void setAmount(int amount) {
            this.amount = amount;
        }
    }
}
