package com.qa.bean.requestBean;

import com.google.gson.annotations.SerializedName;
import com.qa.common.RandomValue;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: yuanxiujing
 * Date: 18/11/26
 * Time: 下午2:54
 */
public class AssetSyncReqBean {

    /**
     * code : 0
     * data : {"asset":{"asset_item_number":"2018{{timestamp}}","asset_from_system":"dsq","asset_from_system_name":"贷上钱","asset_type":"现金贷","asset_sub_type":"multiple","asset_name":"2018{{timestamp}}","asset_sign_at":"2018-09-01 23:55:45","asset_grant_at":"2018-09-01 23:55:45","asset_due_at":"2019-03-01 00:00:00","asset_interest_amount":8808,"asset_repaid_interest_amount":0,"asset_principal_amount":300000,"asset_repaid_principal_amount":0,"asset_penalty_amount":22000,"asset_repaid_penalty_amount":0,"asset_decrease_penalty_amount":0,"asset_fee_amount":45192,"asset_repaid_fee_amount":0,"asset_channel":"Paydayloan","asset_city_code":371300,"asset_status":"repay","asset_loan_channel":"hengfeng","asset_repaid_amount":0,"asset_period_type":"month","asset_period_count":6,"asset_period_days":0,"asset_ref_order_no":"","asset_ref_order_type":"game_combo","asset_risk_level":"7","asset_sub_order_type":"consumer","asset_product_name":"","asset_actual_grant_at":"2018-09-01 23:57:45"},"borrower":{"individual_name":"李静","individual_idnum":"371322199012191765","individual_gender":"f","individual_residence":"山东省临沂市罗庄区罗庄办事处沈泉庄村B区2号楼1001室","individual_workplace":"山东省临沂市罗庄区韦姜屯康桥丽都宝莱饭店东临专业减肥店","individual_permanent":"山东省临沂市罗庄区罗庄办事处","individual_company":"瘦典专业减肥店","individual_tel":"14768340456","individual_work_tel":"0539-2411966","individual_residence_tel":"15255535671","individual_mate_name":"章伞","individual_mate_tel":"18909201111","individual_relative_name":"翟宝献","individual_relative_relation":"4","individual_relative_tel":"13792999065","individual_workmate_name":"李有为","individual_workmate_tel":"18354440345","individual_remark":"test1","individual_nation":"汉","individual_email":"14768340456@139.com"},"repayer":{"individual_name":"李静","individual_idnum":"371322199012191765","individual_gender":"f","individual_residence":"山东省临沂市罗庄区罗庄办事处沈泉庄村B区2号楼1001室","individual_workplace":"山东省临沂市罗庄区韦姜屯康桥丽都宝莱饭店东临专业减肥店","individual_permanent":"山东省临沂市罗庄区罗庄办事处","individual_company":"瘦典专业减肥店","individual_tel":"14768340456","individual_work_tel":"0539-2411966","individual_residence_tel":"15255535671","individual_mate_name":"章伞","individual_mate_tel":"18909201111","individual_relative_name":"翟宝献","individual_relative_relation":"4","individual_relative_tel":"13792999065","individual_workmate_name":"李有为","individual_workmate_tel":"18354440345","individual_remark":"test1","individual_nation":"汉","individual_email":"14768340456@139.com"},"asset_transactions":[{"asset_transaction_type":"repayprincipal","asset_transaction_amount":48968,"asset_transaction_status":"unfinish","asset_transaction_expect_finish_time":"2018-10-01 00:00:00","asset_transaction_finish_at":"","asset_transaction_period":1,"asset_transaction_remark":"在[2018-09-01 23:58:16]系统调用API做调整:还款日期调整为[2018-10-01 00:00:00]","asset_transaction_decrease_amount":0,"asset_transaction_repaid_amount":0},{"asset_transaction_type":"repayinterest","asset_transaction_amount":2500,"asset_transaction_status":"unfinish","asset_transaction_expect_finish_time":"2018-10-01 00:00:00","asset_transaction_finish_at":"","asset_transaction_period":1,"asset_transaction_remark":"在[2018-09-01 23:58:16]系统调用API做调整:还款日期调整为[2018-10-01 00:00:00]","asset_transaction_decrease_amount":0,"asset_transaction_repaid_amount":0},{"asset_transaction_type":"repayservice","asset_transaction_amount":7532,"asset_transaction_status":"unfinish","asset_transaction_expect_finish_time":"2018-10-01 00:00:00","asset_transaction_finish_at":"","asset_transaction_period":1,"asset_transaction_remark":"","asset_transaction_decrease_amount":0,"asset_transaction_repaid_amount":0},{"asset_transaction_type":"repayprincipal","asset_transaction_amount":49376,"asset_transaction_status":"unfinish","asset_transaction_expect_finish_time":"2018-11-01 00:00:00","asset_transaction_finish_at":"","asset_transaction_period":2,"asset_transaction_remark":"在[2018-09-01 23:58:16]系统调用API做调整:还款日期调整为[2018-11-01 00:00:00]","asset_transaction_decrease_amount":0,"asset_transaction_repaid_amount":0},{"asset_transaction_type":"repayinterest","asset_transaction_amount":2092,"asset_transaction_status":"unfinish","asset_transaction_expect_finish_time":"2018-11-01 00:00:00","asset_transaction_finish_at":"","asset_transaction_period":2,"asset_transaction_remark":"在[2018-09-01 23:58:16]系统调用API做调整:还款日期调整为[2018-11-01 00:00:00]","asset_transaction_decrease_amount":0,"asset_transaction_repaid_amount":0},{"asset_transaction_type":"repayservice","asset_transaction_amount":7532,"asset_transaction_status":"unfinish","asset_transaction_expect_finish_time":"2018-11-01 00:00:00","asset_transaction_finish_at":"","asset_transaction_period":2,"asset_transaction_remark":"","asset_transaction_decrease_amount":0,"asset_transaction_repaid_amount":0},{"asset_transaction_type":"repayprincipal","asset_transaction_amount":49788,"asset_transaction_status":"unfinish","asset_transaction_expect_finish_time":"2018-12-01 00:00:00","asset_transaction_finish_at":"","asset_transaction_period":3,"asset_transaction_remark":"在[2018-09-01 23:58:16]系统调用API做调整:还款日期调整为[2018-12-01 00:00:00]","asset_transaction_decrease_amount":0,"asset_transaction_repaid_amount":0},{"asset_transaction_type":"repayinterest","asset_transaction_amount":1680,"asset_transaction_status":"unfinish","asset_transaction_expect_finish_time":"2018-12-01 00:00:00","asset_transaction_finish_at":"","asset_transaction_period":3,"asset_transaction_remark":"在[2018-09-01 23:58:16]系统调用API做调整:还款日期调整为[2018-12-01 00:00:00]","asset_transaction_decrease_amount":0,"asset_transaction_repaid_amount":0},{"asset_transaction_type":"repayservice","asset_transaction_amount":7532,"asset_transaction_status":"unfinish","asset_transaction_expect_finish_time":"2018-12-01 00:00:00","asset_transaction_finish_at":"","asset_transaction_period":3,"asset_transaction_remark":"","asset_transaction_decrease_amount":0,"asset_transaction_repaid_amount":0},{"asset_transaction_type":"repayprincipal","asset_transaction_amount":50203,"asset_transaction_status":"unfinish","asset_transaction_expect_finish_time":"2019-01-01 00:00:00","asset_transaction_finish_at":"","asset_transaction_period":4,"asset_transaction_remark":"在[2018-09-01 23:58:16]系统调用API做调整:还款日期调整为[2019-01-01 00:00:00]","asset_transaction_decrease_amount":0,"asset_transaction_repaid_amount":0},{"asset_transaction_type":"repayinterest","asset_transaction_amount":1265,"asset_transaction_status":"unfinish","asset_transaction_expect_finish_time":"2019-01-01 00:00:00","asset_transaction_finish_at":"","asset_transaction_period":4,"asset_transaction_remark":"在[2018-09-01 23:58:16]系统调用API做调整:还款日期调整为[2019-01-01 00:00:00]","asset_transaction_decrease_amount":0,"asset_transaction_repaid_amount":0},{"asset_transaction_type":"repayservice","asset_transaction_amount":7532,"asset_transaction_status":"unfinish","asset_transaction_expect_finish_time":"2019-01-01 00:00:00","asset_transaction_finish_at":"","asset_transaction_period":4,"asset_transaction_remark":"","asset_transaction_decrease_amount":0,"asset_transaction_repaid_amount":0},{"asset_transaction_type":"repayprincipal","asset_transaction_amount":50621,"asset_transaction_status":"unfinish","asset_transaction_expect_finish_time":"2019-02-01 00:00:00","asset_transaction_finish_at":"","asset_transaction_period":5,"asset_transaction_remark":"在[2018-09-01 23:58:16]系统调用API做调整:还款日期调整为[2019-02-01 00:00:00]","asset_transaction_decrease_amount":0,"asset_transaction_repaid_amount":0},{"asset_transaction_type":"repayinterest","asset_transaction_amount":847,"asset_transaction_status":"unfinish","asset_transaction_expect_finish_time":"2019-02-01 00:00:00","asset_transaction_finish_at":"","asset_transaction_period":5,"asset_transaction_remark":"在[2018-09-01 23:58:16]系统调用API做调整:还款日期调整为[2019-02-01 00:00:00]","asset_transaction_decrease_amount":0,"asset_transaction_repaid_amount":0},{"asset_transaction_type":"repayservice","asset_transaction_amount":7532,"asset_transaction_status":"unfinish","asset_transaction_expect_finish_time":"2019-02-01 00:00:00","asset_transaction_finish_at":"","asset_transaction_period":5,"asset_transaction_remark":"","asset_transaction_decrease_amount":0,"asset_transaction_repaid_amount":0},{"asset_transaction_type":"repayprincipal","asset_transaction_amount":51044,"asset_transaction_status":"unfinish","asset_transaction_expect_finish_time":"2019-03-01 00:00:00","asset_transaction_finish_at":"","asset_transaction_period":6,"asset_transaction_remark":"在[2018-09-01 23:58:16]系统调用API做调整:还款日期调整为[2019-03-01 00:00:00]","asset_transaction_decrease_amount":0,"asset_transaction_repaid_amount":0},{"asset_transaction_type":"repayinterest","asset_transaction_amount":424,"asset_transaction_status":"unfinish","asset_transaction_expect_finish_time":"2019-03-01 00:00:00","asset_transaction_finish_at":"","asset_transaction_period":6,"asset_transaction_remark":"在[2018-09-01 23:58:16]系统调用API做调整:还款日期调整为[2019-03-01 00:00:00]","asset_transaction_decrease_amount":0,"asset_transaction_repaid_amount":0},{"asset_transaction_type":"repayservice","asset_transaction_amount":7532,"asset_transaction_status":"unfinish","asset_transaction_expect_finish_time":"2019-03-01 00:00:00","asset_transaction_finish_at":"","asset_transaction_period":6,"asset_transaction_remark":"","asset_transaction_decrease_amount":0,"asset_transaction_repaid_amount":0},{"asset_transaction_type":"repaylateinterest","asset_transaction_amount":22000,"asset_transaction_status":"unfinish","asset_transaction_expect_finish_time":"2018-10-12 00:00:00","asset_transaction_finish_at":"","asset_transaction_period":1,"asset_transaction_remark":"","asset_transaction_decrease_amount":0,"asset_transaction_repaid_amount":0}]}
     */

    @SerializedName("code")
    private String code;
    @SerializedName("data")
    private DataBean data;

    public static AssetSyncReqBean getAssetSyncReqBean(int overdue_days) {
        AssetSyncReqBean assetSyncReqBean = new AssetSyncReqBean();
        DataBean dataBean = new DataBean();

        RandomValue randomValue = new RandomValue();
        String assetPeriodType = randomValue.getPeriodType();
        int assetPeriodCount = randomValue.getPeriodCount();
        int assetPeriodDays = randomValue.getPeriodDays();

        if (assetPeriodType == "month") {
            if (assetPeriodCount == 1) {
                dataBean.setAsset(AssetBean.get1MonthAssetBean(overdue_days));
                dataBean.setAssetTransactions(AssetTransactionsBean.get1MonthAssetTransactions(overdue_days));
            }
            if (assetPeriodCount == 3) {
                dataBean.setAsset(AssetBean.get3MonthsAssetBean(overdue_days));
                dataBean.setAssetTransactions(AssetTransactionsBean.get3MonthsAssetTransactions(overdue_days));
            }
            if (assetPeriodCount == 6) {
                dataBean.setAsset(AssetBean.get6MonthsAssetBean(overdue_days));
                dataBean.setAssetTransactions(AssetTransactionsBean.get6MonthsAssetTransactions(overdue_days));
            }
        } else {
            if (assetPeriodDays == 7) {
                dataBean.setAsset(AssetBean.get7DaysAssetBean(overdue_days));
                dataBean.setAssetTransactions(AssetTransactionsBean.get7DaysAssetTransactions(overdue_days));
            }
            if (assetPeriodDays == 14) {
                dataBean.setAsset(AssetBean.get14DaysAssetBean(overdue_days));
                dataBean.setAssetTransactions(AssetTransactionsBean.get14DaysAssetTransactions(overdue_days));
            }
            if (assetPeriodDays == 30) {
                dataBean.setAsset(AssetBean.get30DaysAssetBean(overdue_days));
                dataBean.setAssetTransactions(AssetTransactionsBean.get30DaysAssetTransactions(overdue_days));
            }
        }

        dataBean.setBorrower(IndividualBean.getIndividualBean());
        dataBean.setRepayer(IndividualBean.getIndividualBean());

        assetSyncReqBean.setCode("0");
        assetSyncReqBean.setData(dataBean);

        return assetSyncReqBean;
    }


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * asset : {"asset_item_number":"2018{{timestamp}}","asset_from_system":"dsq","asset_from_system_name":"贷上钱","asset_type":"现金贷","asset_sub_type":"multiple","asset_name":"2018{{timestamp}}","asset_sign_at":"2018-09-01 23:55:45","asset_grant_at":"2018-09-01 23:55:45","asset_due_at":"2019-03-01 00:00:00","asset_interest_amount":8808,"asset_repaid_interest_amount":0,"asset_principal_amount":300000,"asset_repaid_principal_amount":0,"asset_penalty_amount":22000,"asset_repaid_penalty_amount":0,"asset_decrease_penalty_amount":0,"asset_fee_amount":45192,"asset_repaid_fee_amount":0,"asset_channel":"Paydayloan","asset_city_code":371300,"asset_status":"repay","asset_loan_channel":"hengfeng","asset_repaid_amount":0,"asset_period_type":"month","asset_period_count":6,"asset_period_days":0,"asset_ref_order_no":"","asset_ref_order_type":"game_combo","asset_risk_level":"7","asset_sub_order_type":"consumer","asset_product_name":"","asset_actual_grant_at":"2018-09-01 23:57:45"}
         * borrower : {"individual_name":"李静","individual_idnum":"371322199012191765","individual_gender":"f","individual_residence":"山东省临沂市罗庄区罗庄办事处沈泉庄村B区2号楼1001室","individual_workplace":"山东省临沂市罗庄区韦姜屯康桥丽都宝莱饭店东临专业减肥店","individual_permanent":"山东省临沂市罗庄区罗庄办事处","individual_company":"瘦典专业减肥店","individual_tel":"14768340456","individual_work_tel":"0539-2411966","individual_residence_tel":"15255535671","individual_mate_name":"章伞","individual_mate_tel":"18909201111","individual_relative_name":"翟宝献","individual_relative_relation":"4","individual_relative_tel":"13792999065","individual_workmate_name":"李有为","individual_workmate_tel":"18354440345","individual_remark":"test1","individual_nation":"汉","individual_email":"14768340456@139.com"}
         * repayer : {"individual_name":"李静","individual_idnum":"371322199012191765","individual_gender":"f","individual_residence":"山东省临沂市罗庄区罗庄办事处沈泉庄村B区2号楼1001室","individual_workplace":"山东省临沂市罗庄区韦姜屯康桥丽都宝莱饭店东临专业减肥店","individual_permanent":"山东省临沂市罗庄区罗庄办事处","individual_company":"瘦典专业减肥店","individual_tel":"14768340456","individual_work_tel":"0539-2411966","individual_residence_tel":"15255535671","individual_mate_name":"章伞","individual_mate_tel":"18909201111","individual_relative_name":"翟宝献","individual_relative_relation":"4","individual_relative_tel":"13792999065","individual_workmate_name":"李有为","individual_workmate_tel":"18354440345","individual_remark":"test1","individual_nation":"汉","individual_email":"14768340456@139.com"}
         * asset_transactions : [{"asset_transaction_type":"repayprincipal","asset_transaction_amount":48968,"asset_transaction_status":"unfinish","asset_transaction_expect_finish_time":"2018-10-01 00:00:00","asset_transaction_finish_at":"","asset_transaction_period":1,"asset_transaction_remark":"在[2018-09-01 23:58:16]系统调用API做调整:还款日期调整为[2018-10-01 00:00:00]","asset_transaction_decrease_amount":0,"asset_transaction_repaid_amount":0},{"asset_transaction_type":"repayinterest","asset_transaction_amount":2500,"asset_transaction_status":"unfinish","asset_transaction_expect_finish_time":"2018-10-01 00:00:00","asset_transaction_finish_at":"","asset_transaction_period":1,"asset_transaction_remark":"在[2018-09-01 23:58:16]系统调用API做调整:还款日期调整为[2018-10-01 00:00:00]","asset_transaction_decrease_amount":0,"asset_transaction_repaid_amount":0},{"asset_transaction_type":"repayservice","asset_transaction_amount":7532,"asset_transaction_status":"unfinish","asset_transaction_expect_finish_time":"2018-10-01 00:00:00","asset_transaction_finish_at":"","asset_transaction_period":1,"asset_transaction_remark":"","asset_transaction_decrease_amount":0,"asset_transaction_repaid_amount":0},{"asset_transaction_type":"repayprincipal","asset_transaction_amount":49376,"asset_transaction_status":"unfinish","asset_transaction_expect_finish_time":"2018-11-01 00:00:00","asset_transaction_finish_at":"","asset_transaction_period":2,"asset_transaction_remark":"在[2018-09-01 23:58:16]系统调用API做调整:还款日期调整为[2018-11-01 00:00:00]","asset_transaction_decrease_amount":0,"asset_transaction_repaid_amount":0},{"asset_transaction_type":"repayinterest","asset_transaction_amount":2092,"asset_transaction_status":"unfinish","asset_transaction_expect_finish_time":"2018-11-01 00:00:00","asset_transaction_finish_at":"","asset_transaction_period":2,"asset_transaction_remark":"在[2018-09-01 23:58:16]系统调用API做调整:还款日期调整为[2018-11-01 00:00:00]","asset_transaction_decrease_amount":0,"asset_transaction_repaid_amount":0},{"asset_transaction_type":"repayservice","asset_transaction_amount":7532,"asset_transaction_status":"unfinish","asset_transaction_expect_finish_time":"2018-11-01 00:00:00","asset_transaction_finish_at":"","asset_transaction_period":2,"asset_transaction_remark":"","asset_transaction_decrease_amount":0,"asset_transaction_repaid_amount":0},{"asset_transaction_type":"repayprincipal","asset_transaction_amount":49788,"asset_transaction_status":"unfinish","asset_transaction_expect_finish_time":"2018-12-01 00:00:00","asset_transaction_finish_at":"","asset_transaction_period":3,"asset_transaction_remark":"在[2018-09-01 23:58:16]系统调用API做调整:还款日期调整为[2018-12-01 00:00:00]","asset_transaction_decrease_amount":0,"asset_transaction_repaid_amount":0},{"asset_transaction_type":"repayinterest","asset_transaction_amount":1680,"asset_transaction_status":"unfinish","asset_transaction_expect_finish_time":"2018-12-01 00:00:00","asset_transaction_finish_at":"","asset_transaction_period":3,"asset_transaction_remark":"在[2018-09-01 23:58:16]系统调用API做调整:还款日期调整为[2018-12-01 00:00:00]","asset_transaction_decrease_amount":0,"asset_transaction_repaid_amount":0},{"asset_transaction_type":"repayservice","asset_transaction_amount":7532,"asset_transaction_status":"unfinish","asset_transaction_expect_finish_time":"2018-12-01 00:00:00","asset_transaction_finish_at":"","asset_transaction_period":3,"asset_transaction_remark":"","asset_transaction_decrease_amount":0,"asset_transaction_repaid_amount":0},{"asset_transaction_type":"repayprincipal","asset_transaction_amount":50203,"asset_transaction_status":"unfinish","asset_transaction_expect_finish_time":"2019-01-01 00:00:00","asset_transaction_finish_at":"","asset_transaction_period":4,"asset_transaction_remark":"在[2018-09-01 23:58:16]系统调用API做调整:还款日期调整为[2019-01-01 00:00:00]","asset_transaction_decrease_amount":0,"asset_transaction_repaid_amount":0},{"asset_transaction_type":"repayinterest","asset_transaction_amount":1265,"asset_transaction_status":"unfinish","asset_transaction_expect_finish_time":"2019-01-01 00:00:00","asset_transaction_finish_at":"","asset_transaction_period":4,"asset_transaction_remark":"在[2018-09-01 23:58:16]系统调用API做调整:还款日期调整为[2019-01-01 00:00:00]","asset_transaction_decrease_amount":0,"asset_transaction_repaid_amount":0},{"asset_transaction_type":"repayservice","asset_transaction_amount":7532,"asset_transaction_status":"unfinish","asset_transaction_expect_finish_time":"2019-01-01 00:00:00","asset_transaction_finish_at":"","asset_transaction_period":4,"asset_transaction_remark":"","asset_transaction_decrease_amount":0,"asset_transaction_repaid_amount":0},{"asset_transaction_type":"repayprincipal","asset_transaction_amount":50621,"asset_transaction_status":"unfinish","asset_transaction_expect_finish_time":"2019-02-01 00:00:00","asset_transaction_finish_at":"","asset_transaction_period":5,"asset_transaction_remark":"在[2018-09-01 23:58:16]系统调用API做调整:还款日期调整为[2019-02-01 00:00:00]","asset_transaction_decrease_amount":0,"asset_transaction_repaid_amount":0},{"asset_transaction_type":"repayinterest","asset_transaction_amount":847,"asset_transaction_status":"unfinish","asset_transaction_expect_finish_time":"2019-02-01 00:00:00","asset_transaction_finish_at":"","asset_transaction_period":5,"asset_transaction_remark":"在[2018-09-01 23:58:16]系统调用API做调整:还款日期调整为[2019-02-01 00:00:00]","asset_transaction_decrease_amount":0,"asset_transaction_repaid_amount":0},{"asset_transaction_type":"repayservice","asset_transaction_amount":7532,"asset_transaction_status":"unfinish","asset_transaction_expect_finish_time":"2019-02-01 00:00:00","asset_transaction_finish_at":"","asset_transaction_period":5,"asset_transaction_remark":"","asset_transaction_decrease_amount":0,"asset_transaction_repaid_amount":0},{"asset_transaction_type":"repayprincipal","asset_transaction_amount":51044,"asset_transaction_status":"unfinish","asset_transaction_expect_finish_time":"2019-03-01 00:00:00","asset_transaction_finish_at":"","asset_transaction_period":6,"asset_transaction_remark":"在[2018-09-01 23:58:16]系统调用API做调整:还款日期调整为[2019-03-01 00:00:00]","asset_transaction_decrease_amount":0,"asset_transaction_repaid_amount":0},{"asset_transaction_type":"repayinterest","asset_transaction_amount":424,"asset_transaction_status":"unfinish","asset_transaction_expect_finish_time":"2019-03-01 00:00:00","asset_transaction_finish_at":"","asset_transaction_period":6,"asset_transaction_remark":"在[2018-09-01 23:58:16]系统调用API做调整:还款日期调整为[2019-03-01 00:00:00]","asset_transaction_decrease_amount":0,"asset_transaction_repaid_amount":0},{"asset_transaction_type":"repayservice","asset_transaction_amount":7532,"asset_transaction_status":"unfinish","asset_transaction_expect_finish_time":"2019-03-01 00:00:00","asset_transaction_finish_at":"","asset_transaction_period":6,"asset_transaction_remark":"","asset_transaction_decrease_amount":0,"asset_transaction_repaid_amount":0},{"asset_transaction_type":"repaylateinterest","asset_transaction_amount":22000,"asset_transaction_status":"unfinish","asset_transaction_expect_finish_time":"2018-10-12 00:00:00","asset_transaction_finish_at":"","asset_transaction_period":1,"asset_transaction_remark":"","asset_transaction_decrease_amount":0,"asset_transaction_repaid_amount":0}]
         */

        @SerializedName("asset")
        private AssetBean asset;
        @SerializedName("borrower")
        private IndividualBean borrower;
        @SerializedName("repayer")
        private IndividualBean repayer;
        @SerializedName("asset_transactions")
        private List<AssetTransactionsBean> assetTransactions;

        public AssetBean getAsset() {
            return asset;
        }

        public void setAsset(AssetBean asset) {
            this.asset = asset;
        }

        public IndividualBean getBorrower() {
            return borrower;
        }

        public void setBorrower(IndividualBean borrower) {
            this.borrower = borrower;
        }

        public IndividualBean getRepayer() {
            return repayer;
        }

        public void setRepayer(IndividualBean repayer) {
            this.repayer = borrower;
        }

        public List<AssetTransactionsBean> getAssetTransactions() {
            return assetTransactions;
        }

        public void setAssetTransactions(List<AssetTransactionsBean> assetTransactions) {
            this.assetTransactions = assetTransactions;
        }
    }
}
