package com.qa.bean.requestBean;

import com.google.gson.annotations.SerializedName;
import com.qa.common.getBeforeDate;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: yuanxiujing
 * Date: 18/11/26
 * Time: 下午7:59
 */
public class AssetTransactionsBean {
    /**
     * asset_transaction_type : repayprincipal
     * asset_transaction_amount : 48968
     * asset_transaction_status : unfinish
     * asset_transaction_expect_finish_time : 2018-10-01 00:00:00
     * asset_transaction_finish_at :
     * asset_transaction_period : 1
     * asset_transaction_remark : 在[2018-09-01 23:58:16]系统调用API做调整:还款日期调整为[2018-10-01 00:00:00]
     * asset_transaction_decrease_amount : 0
     * asset_transaction_repaid_amount : 0
     */

    @SerializedName("asset_transaction_type")
    private String assetTransactionType;
    @SerializedName("asset_transaction_amount")
    private int assetTransactionAmount;
    @SerializedName("asset_transaction_status")
    private String assetTransactionStatus;
    @SerializedName("asset_transaction_expect_finish_time")
    private String assetTransactionExpectFinishTime;
    @SerializedName("asset_transaction_finish_at")
    private String assetTransactionFinishAt;
    @SerializedName("asset_transaction_period")
    private int assetTransactionPeriod;
    @SerializedName("asset_transaction_remark")
    private String assetTransactionRemark;
    @SerializedName("asset_transaction_decrease_amount")
    private int assetTransactionDecreaseAmount;
    @SerializedName("asset_transaction_repaid_amount")
    private int assetTransactionRepaidAmount;

    public static List<AssetTransactionsBean> getDefaultAssetTransactions(int overdue_days) {
        getBeforeDate n = new getBeforeDate();
        String asset_transaction_expect_finish_time1 = n.getBeforeDate(overdue_days + 30 * 5);
        String asset_transaction_expect_finish_time2 = n.getBeforeDate(overdue_days + 30 * 4);
        String asset_transaction_expect_finish_time3 = n.getBeforeDate(overdue_days + 30 * 3);
        String asset_transaction_expect_finish_time4 = n.getBeforeDate(overdue_days + 30 * 2);
        String asset_transaction_expect_finish_time5 = n.getBeforeDate(overdue_days + 30 * 1);
        String asset_transaction_expect_finish_time6 = n.getBeforeDate(overdue_days + 30 * 0);

        List<AssetTransactionsBean> transactions = new ArrayList<AssetTransactionsBean>();

        AssetTransactionsBean transactionsBean1 = new AssetTransactionsBean();
        transactionsBean1.setAssetTransactionType("repayprincipal");
        transactionsBean1.setAssetTransactionAmount(48968);
        transactionsBean1.setAssetTransactionStatus("unfinish");
        transactionsBean1.setAssetTransactionExpectFinishTime(asset_transaction_expect_finish_time1 + " 00:00:00");
        transactionsBean1.setAssetTransactionFinishAt("");
        transactionsBean1.setAssetTransactionPeriod(1);
        transactionsBean1.setAssetTransactionRemark("在[2018-09-01 23:58:16]系统调用API做调整:还款日期调整为[2018-10-01 00:00:00]");
        transactionsBean1.setAssetTransactionDecreaseAmount(0);
        transactionsBean1.setAssetTransactionRepaidAmount(0);

        AssetTransactionsBean transactionsBean2 = new AssetTransactionsBean();
        transactionsBean2.setAssetTransactionType("repayinterest");
        transactionsBean2.setAssetTransactionAmount(2500);
        transactionsBean2.setAssetTransactionStatus("unfinish");
        transactionsBean2.setAssetTransactionExpectFinishTime(asset_transaction_expect_finish_time1 + " 00:00:00");
        transactionsBean2.setAssetTransactionFinishAt("");
        transactionsBean2.setAssetTransactionPeriod(1);
        transactionsBean2.setAssetTransactionRemark("在[2018-09-01 23:58:16]系统调用API做调整:还款日期调整为[2018-10-01 00:00:00]");
        transactionsBean2.setAssetTransactionDecreaseAmount(0);
        transactionsBean2.setAssetTransactionRepaidAmount(0);

        AssetTransactionsBean transactionsBean3 = new AssetTransactionsBean();
        transactionsBean3.setAssetTransactionType("repayservice");
        transactionsBean3.setAssetTransactionAmount(7532);
        transactionsBean3.setAssetTransactionStatus("unfinish");
        transactionsBean3.setAssetTransactionExpectFinishTime(asset_transaction_expect_finish_time1 + " 00:00:00");
        transactionsBean3.setAssetTransactionFinishAt("");
        transactionsBean3.setAssetTransactionPeriod(1);
        transactionsBean3.setAssetTransactionRemark("");
        transactionsBean3.setAssetTransactionDecreaseAmount(0);
        transactionsBean3.setAssetTransactionRepaidAmount(0);

        AssetTransactionsBean transactionsBean4 = new AssetTransactionsBean();
        transactionsBean4.setAssetTransactionType("repayprincipal");
        transactionsBean4.setAssetTransactionAmount(49376);
        transactionsBean4.setAssetTransactionStatus("unfinish");
        transactionsBean4.setAssetTransactionExpectFinishTime(asset_transaction_expect_finish_time2 + " 00:00:00");
        transactionsBean4.setAssetTransactionFinishAt("");
        transactionsBean4.setAssetTransactionPeriod(2);
        transactionsBean4.setAssetTransactionRemark("在[2018-09-01 23:58:16]系统调用API做调整:还款日期调整为[2018-10-01 00:00:00]");
        transactionsBean4.setAssetTransactionDecreaseAmount(0);
        transactionsBean4.setAssetTransactionRepaidAmount(0);

        AssetTransactionsBean transactionsBean5 = new AssetTransactionsBean();
        transactionsBean5.setAssetTransactionType("repayinterest");
        transactionsBean5.setAssetTransactionAmount(2092);
        transactionsBean5.setAssetTransactionStatus("unfinish");
        transactionsBean5.setAssetTransactionExpectFinishTime(asset_transaction_expect_finish_time2 + " 00:00:00");
        transactionsBean5.setAssetTransactionFinishAt("");
        transactionsBean5.setAssetTransactionPeriod(2);
        transactionsBean5.setAssetTransactionRemark("在[2018-09-01 23:58:16]系统调用API做调整:还款日期调整为[2018-10-01 00:00:00]");
        transactionsBean5.setAssetTransactionDecreaseAmount(0);
        transactionsBean5.setAssetTransactionRepaidAmount(0);

        AssetTransactionsBean transactionsBean6 = new AssetTransactionsBean();
        transactionsBean6.setAssetTransactionType("repayservice");
        transactionsBean6.setAssetTransactionAmount(7532);
        transactionsBean6.setAssetTransactionStatus("unfinish");
        transactionsBean6.setAssetTransactionExpectFinishTime(asset_transaction_expect_finish_time2 + " 00:00:00");
        transactionsBean6.setAssetTransactionFinishAt("");
        transactionsBean6.setAssetTransactionPeriod(2);
        transactionsBean6.setAssetTransactionRemark("");
        transactionsBean6.setAssetTransactionDecreaseAmount(0);
        transactionsBean6.setAssetTransactionRepaidAmount(0);

        AssetTransactionsBean transactionsBean7 = new AssetTransactionsBean();
        transactionsBean7.setAssetTransactionType("repayprincipal");
        transactionsBean7.setAssetTransactionAmount(49788);
        transactionsBean7.setAssetTransactionStatus("unfinish");
        transactionsBean7.setAssetTransactionExpectFinishTime(asset_transaction_expect_finish_time3 + " 00:00:00");
        transactionsBean7.setAssetTransactionFinishAt("");
        transactionsBean7.setAssetTransactionPeriod(3);
        transactionsBean7.setAssetTransactionRemark("在[2018-09-01 23:58:16]系统调用API做调整:还款日期调整为[2018-10-01 00:00:00]");
        transactionsBean7.setAssetTransactionDecreaseAmount(0);
        transactionsBean7.setAssetTransactionRepaidAmount(0);

        AssetTransactionsBean transactionsBean8 = new AssetTransactionsBean();
        transactionsBean8.setAssetTransactionType("repayinterest");
        transactionsBean8.setAssetTransactionAmount(1680);
        transactionsBean8.setAssetTransactionStatus("unfinish");
        transactionsBean8.setAssetTransactionExpectFinishTime(asset_transaction_expect_finish_time3 + " 00:00:00");
        transactionsBean8.setAssetTransactionFinishAt("");
        transactionsBean8.setAssetTransactionPeriod(3);
        transactionsBean8.setAssetTransactionRemark("在[2018-09-01 23:58:16]系统调用API做调整:还款日期调整为[2018-10-01 00:00:00]");
        transactionsBean8.setAssetTransactionDecreaseAmount(0);
        transactionsBean8.setAssetTransactionRepaidAmount(0);

        AssetTransactionsBean transactionsBean9 = new AssetTransactionsBean();
        transactionsBean9.setAssetTransactionType("repayservice");
        transactionsBean9.setAssetTransactionAmount(7532);
        transactionsBean9.setAssetTransactionStatus("unfinish");
        transactionsBean9.setAssetTransactionExpectFinishTime(asset_transaction_expect_finish_time3 + " 00:00:00");
        transactionsBean9.setAssetTransactionFinishAt("");
        transactionsBean9.setAssetTransactionPeriod(3);
        transactionsBean9.setAssetTransactionRemark("");
        transactionsBean9.setAssetTransactionDecreaseAmount(0);
        transactionsBean9.setAssetTransactionRepaidAmount(0);

        AssetTransactionsBean transactionsBean10 = new AssetTransactionsBean();
        transactionsBean10.setAssetTransactionType("repayprincipal");
        transactionsBean10.setAssetTransactionAmount(50203);
        transactionsBean10.setAssetTransactionStatus("unfinish");
        transactionsBean10.setAssetTransactionExpectFinishTime(asset_transaction_expect_finish_time4 + " 00:00:00");
        transactionsBean10.setAssetTransactionFinishAt("");
        transactionsBean10.setAssetTransactionPeriod(4);
        transactionsBean10.setAssetTransactionRemark("在[2018-09-01 23:58:16]系统调用API做调整:还款日期调整为[2018-10-01 00:00:00]");
        transactionsBean10.setAssetTransactionDecreaseAmount(0);
        transactionsBean10.setAssetTransactionRepaidAmount(0);

        AssetTransactionsBean transactionsBean11 = new AssetTransactionsBean();
        transactionsBean11.setAssetTransactionType("repayinterest");
        transactionsBean11.setAssetTransactionAmount(1265);
        transactionsBean11.setAssetTransactionStatus("unfinish");
        transactionsBean11.setAssetTransactionExpectFinishTime(asset_transaction_expect_finish_time4 + " 00:00:00");
        transactionsBean11.setAssetTransactionFinishAt("");
        transactionsBean11.setAssetTransactionPeriod(4);
        transactionsBean11.setAssetTransactionRemark("在[2018-09-01 23:58:16]系统调用API做调整:还款日期调整为[2018-10-01 00:00:00]");
        transactionsBean11.setAssetTransactionDecreaseAmount(0);
        transactionsBean11.setAssetTransactionRepaidAmount(0);

        AssetTransactionsBean transactionsBean12 = new AssetTransactionsBean();
        transactionsBean12.setAssetTransactionType("repayservice");
        transactionsBean12.setAssetTransactionAmount(7532);
        transactionsBean12.setAssetTransactionStatus("unfinish");
        transactionsBean12.setAssetTransactionExpectFinishTime(asset_transaction_expect_finish_time4 + " 00:00:00");
        transactionsBean12.setAssetTransactionFinishAt("");
        transactionsBean12.setAssetTransactionPeriod(4);
        transactionsBean12.setAssetTransactionRemark("");
        transactionsBean12.setAssetTransactionDecreaseAmount(0);
        transactionsBean12.setAssetTransactionRepaidAmount(0);

        AssetTransactionsBean transactionsBean13 = new AssetTransactionsBean();
        transactionsBean13.setAssetTransactionType("repayprincipal");
        transactionsBean13.setAssetTransactionAmount(50621);
        transactionsBean13.setAssetTransactionStatus("unfinish");
        transactionsBean13.setAssetTransactionExpectFinishTime(asset_transaction_expect_finish_time5 + " 00:00:00");
        transactionsBean13.setAssetTransactionFinishAt("");
        transactionsBean13.setAssetTransactionPeriod(5);
        transactionsBean13.setAssetTransactionRemark("在[2018-09-01 23:58:16]系统调用API做调整:还款日期调整为[2018-10-01 00:00:00]");
        transactionsBean13.setAssetTransactionDecreaseAmount(0);
        transactionsBean13.setAssetTransactionRepaidAmount(0);

        AssetTransactionsBean transactionsBean14 = new AssetTransactionsBean();
        transactionsBean14.setAssetTransactionType("repayinterest");
        transactionsBean14.setAssetTransactionAmount(847);
        transactionsBean14.setAssetTransactionStatus("unfinish");
        transactionsBean14.setAssetTransactionExpectFinishTime(asset_transaction_expect_finish_time5 + " 00:00:00");
        transactionsBean14.setAssetTransactionFinishAt("");
        transactionsBean14.setAssetTransactionPeriod(5);
        transactionsBean14.setAssetTransactionRemark("在[2018-09-01 23:58:16]系统调用API做调整:还款日期调整为[2018-10-01 00:00:00]");
        transactionsBean14.setAssetTransactionDecreaseAmount(0);
        transactionsBean14.setAssetTransactionRepaidAmount(0);

        AssetTransactionsBean transactionsBean15 = new AssetTransactionsBean();
        transactionsBean15.setAssetTransactionType("repayservice");
        transactionsBean15.setAssetTransactionAmount(7532);
        transactionsBean15.setAssetTransactionStatus("unfinish");
        transactionsBean15.setAssetTransactionExpectFinishTime(asset_transaction_expect_finish_time5 + " 00:00:00");
        transactionsBean15.setAssetTransactionFinishAt("");
        transactionsBean15.setAssetTransactionPeriod(5);
        transactionsBean15.setAssetTransactionRemark("");
        transactionsBean15.setAssetTransactionDecreaseAmount(0);
        transactionsBean15.setAssetTransactionRepaidAmount(0);

        AssetTransactionsBean transactionsBean16 = new AssetTransactionsBean();
        transactionsBean16.setAssetTransactionType("repayprincipal");
        transactionsBean16.setAssetTransactionAmount(51044);
        transactionsBean16.setAssetTransactionStatus("unfinish");
        transactionsBean16.setAssetTransactionExpectFinishTime(asset_transaction_expect_finish_time6 + " 00:00:00");
        transactionsBean16.setAssetTransactionFinishAt("");
        transactionsBean16.setAssetTransactionPeriod(6);
        transactionsBean16.setAssetTransactionRemark("在[2018-09-01 23:58:16]系统调用API做调整:还款日期调整为[2018-10-01 00:00:00]");
        transactionsBean16.setAssetTransactionDecreaseAmount(0);
        transactionsBean16.setAssetTransactionRepaidAmount(0);

        AssetTransactionsBean transactionsBean17 = new AssetTransactionsBean();
        transactionsBean17.setAssetTransactionType("repayinterest");
        transactionsBean17.setAssetTransactionAmount(424);
        transactionsBean17.setAssetTransactionStatus("unfinish");
        transactionsBean17.setAssetTransactionExpectFinishTime(asset_transaction_expect_finish_time6 + " 00:00:00");
        transactionsBean17.setAssetTransactionFinishAt("");
        transactionsBean17.setAssetTransactionPeriod(6);
        transactionsBean17.setAssetTransactionRemark("在[2018-09-01 23:58:16]系统调用API做调整:还款日期调整为[2018-10-01 00:00:00]");
        transactionsBean17.setAssetTransactionDecreaseAmount(0);
        transactionsBean17.setAssetTransactionRepaidAmount(0);

        AssetTransactionsBean transactionsBean18 = new AssetTransactionsBean();
        transactionsBean18.setAssetTransactionType("repayservice");
        transactionsBean18.setAssetTransactionAmount(7532);
        transactionsBean18.setAssetTransactionStatus("unfinish");
        transactionsBean18.setAssetTransactionExpectFinishTime(asset_transaction_expect_finish_time6 + " 00:00:00");
        transactionsBean18.setAssetTransactionFinishAt("");
        transactionsBean18.setAssetTransactionPeriod(6);
        transactionsBean18.setAssetTransactionRemark("");
        transactionsBean18.setAssetTransactionDecreaseAmount(0);
        transactionsBean18.setAssetTransactionRepaidAmount(0);

        AssetTransactionsBean transactionsBean19 = new AssetTransactionsBean();
        transactionsBean19.setAssetTransactionType("repaylateinterest");
        transactionsBean19.setAssetTransactionAmount(22000);
        transactionsBean19.setAssetTransactionStatus("unfinish");
        transactionsBean19.setAssetTransactionExpectFinishTime(asset_transaction_expect_finish_time1 + " 00:00:00");
        transactionsBean19.setAssetTransactionFinishAt("");
        transactionsBean19.setAssetTransactionPeriod(1);
        transactionsBean19.setAssetTransactionRemark("");
        transactionsBean19.setAssetTransactionDecreaseAmount(0);
        transactionsBean19.setAssetTransactionRepaidAmount(0);

        transactions.add(transactionsBean1);
        transactions.add(transactionsBean2);
        transactions.add(transactionsBean3);
        transactions.add(transactionsBean4);
        transactions.add(transactionsBean5);
        transactions.add(transactionsBean6);
        transactions.add(transactionsBean7);
        transactions.add(transactionsBean8);
        transactions.add(transactionsBean9);
        transactions.add(transactionsBean10);
        transactions.add(transactionsBean11);
        transactions.add(transactionsBean12);
        transactions.add(transactionsBean13);
        transactions.add(transactionsBean14);
        transactions.add(transactionsBean15);
        transactions.add(transactionsBean16);
        transactions.add(transactionsBean17);
        transactions.add(transactionsBean18);
        transactions.add(transactionsBean19);

        return transactions;
    }

    public String getAssetTransactionType() {
        return assetTransactionType;
    }

    public void setAssetTransactionType(String assetTransactionType) {
        this.assetTransactionType = assetTransactionType;
    }

    public int getAssetTransactionAmount() {
        return assetTransactionAmount;
    }

    public void setAssetTransactionAmount(int assetTransactionAmount) {
        this.assetTransactionAmount = assetTransactionAmount;
    }

    public String getAssetTransactionStatus() {
        return assetTransactionStatus;
    }

    public void setAssetTransactionStatus(String assetTransactionStatus) {
        this.assetTransactionStatus = assetTransactionStatus;
    }

    public String getAssetTransactionExpectFinishTime() {
        return assetTransactionExpectFinishTime;
    }

    public void setAssetTransactionExpectFinishTime(String assetTransactionExpectFinishTime) {
        this.assetTransactionExpectFinishTime = assetTransactionExpectFinishTime;
    }

    public String getAssetTransactionFinishAt() {
        return assetTransactionFinishAt;
    }

    public void setAssetTransactionFinishAt(String assetTransactionFinishAt) {
        this.assetTransactionFinishAt = assetTransactionFinishAt;
    }

    public int getAssetTransactionPeriod() {
        return assetTransactionPeriod;
    }

    public void setAssetTransactionPeriod(int assetTransactionPeriod) {
        this.assetTransactionPeriod = assetTransactionPeriod;
    }

    public String getAssetTransactionRemark() {
        return assetTransactionRemark;
    }

    public void setAssetTransactionRemark(String assetTransactionRemark) {
        this.assetTransactionRemark = assetTransactionRemark;
    }

    public int getAssetTransactionDecreaseAmount() {
        return assetTransactionDecreaseAmount;
    }

    public void setAssetTransactionDecreaseAmount(int assetTransactionDecreaseAmount) {
        this.assetTransactionDecreaseAmount = assetTransactionDecreaseAmount;
    }

    public int getAssetTransactionRepaidAmount() {
        return assetTransactionRepaidAmount;
    }

    public void setAssetTransactionRepaidAmount(int assetTransactionRepaidAmount) {
        this.assetTransactionRepaidAmount = assetTransactionRepaidAmount;
    }
}
