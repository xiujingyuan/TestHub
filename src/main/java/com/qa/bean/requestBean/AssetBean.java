package com.qa.bean.requestBean;

import com.google.gson.annotations.SerializedName;
import com.qa.common.getBeforeDate;

import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: yuanxiujing
 * Date: 18/11/26
 * Time: 下午7:55
 */
public class AssetBean {
    /**
     * asset_item_number : 2018{{timestamp}}
     * asset_from_system : dsq
     * asset_from_system_name : 贷上钱
     * asset_type : 现金贷
     * asset_sub_type : multiple
     * asset_name : 2018{{timestamp}}
     * asset_sign_at : 2018-09-01 23:55:45
     * asset_grant_at : 2018-09-01 23:55:45
     * asset_due_at : 2019-03-01 00:00:00
     * asset_interest_amount : 8808
     * asset_repaid_interest_amount : 0
     * asset_principal_amount : 300000
     * asset_repaid_principal_amount : 0
     * asset_penalty_amount : 22000
     * asset_repaid_penalty_amount : 0
     * asset_decrease_penalty_amount : 0
     * asset_fee_amount : 45192
     * asset_repaid_fee_amount : 0
     * asset_channel : Paydayloan
     * asset_city_code : 371300
     * asset_status : repay
     * asset_loan_channel : hengfeng
     * asset_repaid_amount : 0
     * asset_period_type : month
     * asset_period_count : 6
     * asset_period_days : 0
     * asset_ref_order_no :
     * asset_ref_order_type : game_combo
     * asset_risk_level : 7
     * asset_sub_order_type : consumer
     * asset_product_name :
     * asset_actual_grant_at : 2018-09-01 23:57:45
     */

    @SerializedName("asset_item_number")
    private String assetItemNumber;
    @SerializedName("asset_from_system")
    private String assetFromSystem;
    @SerializedName("asset_from_system_name")
    private String assetFromSystemName;
    @SerializedName("asset_type")
    private String assetType;
    @SerializedName("asset_sub_type")
    private String assetSubType;
    @SerializedName("asset_name")
    private String assetName;
    @SerializedName("asset_sign_at")
    private String assetSignAt;
    @SerializedName("asset_grant_at")
    private String assetGrantAt;
    @SerializedName("asset_due_at")
    private String assetDueAt;
    @SerializedName("asset_interest_amount")
    private int assetInterestAmount;
    @SerializedName("asset_repaid_interest_amount")
    private int assetRepaidInterestAmount;
    @SerializedName("asset_principal_amount")
    private int assetPrincipalAmount;
    @SerializedName("asset_repaid_principal_amount")
    private int assetRepaidPrincipalAmount;
    @SerializedName("asset_penalty_amount")
    private int assetPenaltyAmount;
    @SerializedName("asset_repaid_penalty_amount")
    private int assetRepaidPenaltyAmount;
    @SerializedName("asset_decrease_penalty_amount")
    private int assetDecreasePenaltyAmount;
    @SerializedName("asset_fee_amount")
    private int assetFeeAmount;
    @SerializedName("asset_repaid_fee_amount")
    private int assetRepaidFeeAmount;
    @SerializedName("asset_channel")
    private String assetChannel;
    @SerializedName("asset_city_code")
    private int assetCityCode;
    @SerializedName("asset_status")
    private String assetStatus;
    @SerializedName("asset_loan_channel")
    private String assetLoanChannel;
    @SerializedName("asset_repaid_amount")
    private int assetRepaidAmount;
    @SerializedName("asset_period_type")
    private String assetPeriodType;
    @SerializedName("asset_period_count")
    private int assetPeriodCount;
    @SerializedName("asset_period_days")
    private int assetPeriodDays;
    @SerializedName("asset_ref_order_no")
    private String assetRefOrderNo;
    @SerializedName("asset_ref_order_type")
    private String assetRefOrderType;
    @SerializedName("asset_risk_level")
    private String assetRiskLevel;
    @SerializedName("asset_sub_order_type")
    private String assetSubOrderType;
    @SerializedName("asset_product_name")
    private String assetProductName;
    @SerializedName("asset_actual_grant_at")
    private String assetActualGrantAt;
    @SerializedName("asset_owner")
    private String assetOwner;
    @SerializedName("asset_version")
    private Long assetVersion;

    public static AssetBean get1MonthAssetBean(int overdue_days) {
        AssetBean asset = new AssetBean();
        String asset_item_no = "combo_order2019" + (new Date().getTime());

        getBeforeDate n = new getBeforeDate();

        String asset_sign_at = n.getBeforeDate(overdue_days + 30 * 1);
        String asset_grant_at = n.getBeforeDate(overdue_days + 30 * 1);
        String asset_actual_grant_at = n.getBeforeDate(overdue_days + 30 * 1);
        String asset_due_at = n.getBeforeDate(overdue_days);

        asset.setAssetItemNumber(asset_item_no);
        asset.setAssetFromSystem("dsq");
        asset.setAssetFromSystemName("贷上钱");
        asset.setAssetType("现金贷");
        asset.setAssetSubType("multiple");
        asset.setAssetName("期缴-趸交第三单");
        asset.setAssetSignAt(asset_sign_at + " 23:55:45");
        asset.setAssetGrantAt(asset_grant_at + " 23:55:45");
        asset.setAssetDueAt(asset_due_at + " 00:00:00");
        asset.setAssetInterestAmount(0);
        asset.setAssetRepaidInterestAmount(0);
        asset.setAssetPrincipalAmount(62500);
        asset.setAssetRepaidPrincipalAmount(0);
        asset.setAssetPenaltyAmount(12500);
        asset.setAssetRepaidPenaltyAmount(0);
        asset.setAssetDecreasePenaltyAmount(0);
        asset.setAssetFeeAmount(0);
        asset.setAssetRepaidFeeAmount(0);

        asset.setAssetChannel("Paydayloan");
        asset.setAssetCityCode(370400);
        asset.setAssetStatus("repay");
        asset.setAssetLoanChannel("noloan");
        asset.setAssetRepaidAmount(0);
        asset.setAssetPeriodType("month");
        asset.setAssetPeriodCount(1);
        asset.setAssetPeriodDays(0);
        asset.setAssetRefOrderNo("");
        asset.setAssetRefOrderType("game_combo");
        asset.setAssetRiskLevel("7");
        asset.setAssetSubOrderType("consumer");
        asset.setAssetProductName("清风钱包");
        asset.setAssetActualGrantAt(asset_actual_grant_at + " 23:57:45");
        asset.setAssetOwner("KN");
        asset.setAssetVersion(new Date().getTime());

        return asset;
    }

    public static AssetBean get3MonthsAssetBean(int overdue_days) {
        AssetBean asset = new AssetBean();
        String asset_item_no = "combo_order2018" + (new Date().getTime());

        getBeforeDate n = new getBeforeDate();

        String asset_sign_at = n.getBeforeDate(overdue_days + 30 * 2);
        String asset_grant_at = n.getBeforeDate(overdue_days + 30 * 2);
        String asset_actual_grant_at = n.getBeforeDate(overdue_days + 30 * 2);
        String asset_due_at = n.getBeforeDate(overdue_days - 30 * 1);

        asset.setAssetItemNumber(asset_item_no);
        asset.setAssetFromSystem("dsq");
        asset.setAssetFromSystemName("贷上钱");
        asset.setAssetType("现金贷");
        asset.setAssetSubType("multiple");
        asset.setAssetName("期缴-趸交第三单");
        asset.setAssetSignAt(asset_sign_at + " 23:55:45");
        asset.setAssetGrantAt(asset_grant_at + " 23:55:45");
        asset.setAssetDueAt(asset_due_at + " 00:00:00");
        asset.setAssetInterestAmount(0);
        asset.setAssetRepaidInterestAmount(0);
        asset.setAssetPrincipalAmount(80000);
        asset.setAssetRepaidPrincipalAmount(26667);
        asset.setAssetPenaltyAmount(1332);
        asset.setAssetRepaidPenaltyAmount(666);
        asset.setAssetDecreasePenaltyAmount(0);
        asset.setAssetFeeAmount(0);
        asset.setAssetRepaidFeeAmount(0);

        asset.setAssetChannel("Paydayloan");
        asset.setAssetCityCode(371200);
        asset.setAssetStatus("repay");
        asset.setAssetLoanChannel("noloan");
        asset.setAssetRepaidAmount(27333);
        asset.setAssetPeriodType("month");
        asset.setAssetPeriodCount(3);
        asset.setAssetPeriodDays(0);
        asset.setAssetRefOrderNo("");
        asset.setAssetRefOrderType("game_combo");
        asset.setAssetRiskLevel("1");
        asset.setAssetSubOrderType("consumer");
        asset.setAssetProductName("元宝钱包");
        asset.setAssetActualGrantAt(asset_actual_grant_at + " 23:57:45");
        asset.setAssetOwner("KN");
        asset.setAssetVersion(new Date().getTime());

        return asset;
    }

    public static AssetBean get6MonthsAssetBean(int overdue_days) {
        AssetBean asset = new AssetBean();
        String asset_item_no = "2018" + (new Date().getTime());

        getBeforeDate n = new getBeforeDate();

        String asset_sign_at = n.getBeforeDate(overdue_days + 30 * 6);
        String asset_grant_at = n.getBeforeDate(overdue_days + 30 * 6);
        String asset_actual_grant_at = n.getBeforeDate(overdue_days + 30 * 6);
        String asset_due_at = n.getBeforeDate(overdue_days);

        asset.setAssetItemNumber(asset_item_no);
        asset.setAssetFromSystem("dsq");
        asset.setAssetFromSystemName("贷上钱");
        asset.setAssetType("现金贷");
        asset.setAssetSubType("multiple");
        asset.setAssetName(asset_item_no);
        asset.setAssetSignAt(asset_sign_at + " 23:55:45");
        asset.setAssetGrantAt(asset_grant_at + " 23:55:45");
        asset.setAssetDueAt(asset_due_at + " 00:00:00");
        asset.setAssetInterestAmount(8808);
        asset.setAssetRepaidInterestAmount(0);
        asset.setAssetPrincipalAmount(300000);
        asset.setAssetRepaidPrincipalAmount(0);
        asset.setAssetPenaltyAmount(22000);
        asset.setAssetRepaidPenaltyAmount(0);
        asset.setAssetDecreasePenaltyAmount(0);
        asset.setAssetFeeAmount(45192);
        asset.setAssetRepaidFeeAmount(0);

        asset.setAssetChannel("Paydayloan");
        asset.setAssetCityCode(371300);
        asset.setAssetStatus("repay");
        asset.setAssetLoanChannel("noloan");
        asset.setAssetRepaidAmount(0);
        asset.setAssetPeriodType("month");
        asset.setAssetPeriodCount(6);
        asset.setAssetPeriodDays(0);
        asset.setAssetRefOrderNo("");
        asset.setAssetRefOrderType("game_combo");
        asset.setAssetRiskLevel("7");
        asset.setAssetSubOrderType("consumer");
        asset.setAssetProductName("清风钱包");
        asset.setAssetActualGrantAt(asset_actual_grant_at + " 23:57:45");
        asset.setAssetOwner("KN");
        asset.setAssetVersion(new Date().getTime());

        return asset;
    }

    public static AssetBean get7DaysAssetBean(int overdue_days) {
        AssetBean asset = new AssetBean();
        String asset_item_no = "72019" + (new Date().getTime());

        getBeforeDate n = new getBeforeDate();

        String asset_sign_at = n.getBeforeDate(overdue_days + 7 * 1);
        String asset_grant_at = n.getBeforeDate(overdue_days + 7 * 1);
        String asset_actual_grant_at = n.getBeforeDate(overdue_days + 7 * 1);
        String asset_due_at = n.getBeforeDate(overdue_days);

        asset.setAssetItemNumber(asset_item_no);
        asset.setAssetFromSystem("dsq");
        asset.setAssetFromSystemName("贷上钱");
        asset.setAssetType("现金贷");
        asset.setAssetSubType("multiple");
        asset.setAssetName(asset_item_no);
        asset.setAssetSignAt(asset_sign_at + " 23:55:45");
        asset.setAssetGrantAt(asset_grant_at + " 23:55:45");
        asset.setAssetDueAt(asset_due_at + " 00:00:00");
        asset.setAssetInterestAmount(0);
        asset.setAssetRepaidInterestAmount(0);
        asset.setAssetPrincipalAmount(40000);
        asset.setAssetRepaidPrincipalAmount(0);
        asset.setAssetPenaltyAmount(0);
        asset.setAssetRepaidPenaltyAmount(0);
        asset.setAssetDecreasePenaltyAmount(0);
        asset.setAssetFeeAmount(0);
        asset.setAssetRepaidFeeAmount(0);

        asset.setAssetChannel("Paydayloan");
        asset.setAssetCityCode(441900);
        asset.setAssetStatus("repay");
        asset.setAssetLoanChannel("noloan");
        asset.setAssetRepaidAmount(0);
        asset.setAssetPeriodType("day");
        asset.setAssetPeriodCount(1);
        asset.setAssetPeriodDays(7);
        asset.setAssetRefOrderNo("");
        asset.setAssetRefOrderType("stb_bill_split");
        asset.setAssetRiskLevel("7");
        asset.setAssetSubOrderType("");
        asset.setAssetProductName("你来借");
        asset.setAssetActualGrantAt(asset_actual_grant_at + " 23:57:45");
        asset.setAssetOwner("STB_NILAIJIE");
        asset.setAssetVersion(new Date().getTime());

        return asset;
    }

    public static AssetBean get14DaysAssetBean(int overdue_days) {
        AssetBean asset = new AssetBean();
        String asset_item_no = "2018" + (new Date().getTime());

        getBeforeDate n = new getBeforeDate();

        String asset_sign_at = n.getBeforeDate(overdue_days + 14 * 1);
        String asset_grant_at = n.getBeforeDate(overdue_days + 14 * 1);
        String asset_actual_grant_at = n.getBeforeDate(overdue_days + 14 * 1);
        String asset_due_at = n.getBeforeDate(overdue_days);

        asset.setAssetItemNumber(asset_item_no);
        asset.setAssetFromSystem("dsq");
        asset.setAssetFromSystemName("贷上钱");
        asset.setAssetType("现金贷");
        asset.setAssetSubType("multiple");
        asset.setAssetName(asset_item_no);
        asset.setAssetSignAt(asset_sign_at + " 23:55:45");
        asset.setAssetGrantAt(asset_grant_at + " 23:55:45");
        asset.setAssetDueAt(asset_due_at + " 00:00:00");
        asset.setAssetInterestAmount(778);
        asset.setAssetRepaidInterestAmount(0);
        asset.setAssetPrincipalAmount(200000);
        asset.setAssetRepaidPrincipalAmount(0);
        asset.setAssetPenaltyAmount(266);
        asset.setAssetRepaidPenaltyAmount(0);
        asset.setAssetDecreasePenaltyAmount(0);
        asset.setAssetFeeAmount(2022);
        asset.setAssetRepaidFeeAmount(0);

        asset.setAssetChannel("Paydayloan");
        asset.setAssetCityCode(320900);
        asset.setAssetStatus("repay");
        asset.setAssetLoanChannel("noloan");
        asset.setAssetRepaidAmount(0);
        asset.setAssetPeriodType("day");
        asset.setAssetPeriodCount(1);
        asset.setAssetPeriodDays(14);
        asset.setAssetRefOrderNo("");
        asset.setAssetRefOrderType("game_bill");
        asset.setAssetRiskLevel("8");
        asset.setAssetSubOrderType("");
        asset.setAssetProductName("蜜蜂借款");
        asset.setAssetActualGrantAt(asset_actual_grant_at + " 23:57:45");
        asset.setAssetOwner("KN");
        asset.setAssetVersion(new Date().getTime());

        return asset;
    }

    public static AssetBean get30DaysAssetBean(int overdue_days) {
        AssetBean asset = new AssetBean();
        String asset_item_no = "user_level_" + (new Date().getTime());

        getBeforeDate n = new getBeforeDate();

        String asset_sign_at = n.getBeforeDate(overdue_days + 30 * 1);
        String asset_grant_at = n.getBeforeDate(overdue_days + 30 * 1);
        String asset_actual_grant_at = n.getBeforeDate(overdue_days + 30 * 1);
        String asset_due_at = n.getBeforeDate(overdue_days);

        asset.setAssetItemNumber(asset_item_no);
        asset.setAssetFromSystem("dsq");
        asset.setAssetFromSystemName("贷上钱");
        asset.setAssetType("现金贷");
        asset.setAssetSubType("multiple");
        asset.setAssetName(asset_item_no);
        asset.setAssetSignAt(asset_sign_at + " 23:55:45");
        asset.setAssetGrantAt(asset_grant_at + " 23:55:45");
        asset.setAssetDueAt(asset_due_at + " 00:00:00");
        asset.setAssetInterestAmount(917);
        asset.setAssetRepaidInterestAmount(0);
        asset.setAssetPrincipalAmount(200000);
        asset.setAssetRepaidPrincipalAmount(0);
        asset.setAssetPenaltyAmount(266);
        asset.setAssetRepaidPenaltyAmount(0);
        asset.setAssetDecreasePenaltyAmount(0);
        asset.setAssetFeeAmount(5083);
        asset.setAssetRepaidFeeAmount(0);

        asset.setAssetChannel("Paydayloan");
        asset.setAssetCityCode(441800);
        asset.setAssetStatus("repay");
        asset.setAssetLoanChannel("noloan");
        asset.setAssetRepaidAmount(0);
        asset.setAssetPeriodType("day");
        asset.setAssetPeriodCount(1);
        asset.setAssetPeriodDays(30);
        asset.setAssetRefOrderNo("");
        asset.setAssetRefOrderType("game_bill");
        asset.setAssetRiskLevel("99");
        asset.setAssetSubOrderType("");
        asset.setAssetProductName("清风钱包");
        asset.setAssetActualGrantAt(asset_actual_grant_at + " 23:57:45");
        asset.setAssetOwner("KN");
        asset.setAssetVersion(new Date().getTime());

        return asset;
    }

    public String getAssetItemNumber() {
        return assetItemNumber;
    }

    public void setAssetItemNumber(String assetItemNumber) {
        this.assetItemNumber = assetItemNumber;
    }

    public String getAssetFromSystem() {
        return assetFromSystem;
    }

    public void setAssetFromSystem(String assetFromSystem) {
        this.assetFromSystem = assetFromSystem;
    }

    public String getAssetFromSystemName() {
        return assetFromSystemName;
    }

    public void setAssetFromSystemName(String assetFromSystemName) {
        this.assetFromSystemName = assetFromSystemName;
    }

    public String getAssetType() {
        return assetType;
    }

    public void setAssetType(String assetType) {
        this.assetType = assetType;
    }

    public String getAssetSubType() {
        return assetSubType;
    }

    public void setAssetSubType(String assetSubType) {
        this.assetSubType = assetSubType;
    }

    public String getAssetName() {
        return assetName;
    }

    public void setAssetName(String assetName) {
        this.assetName = assetName;
    }

    public String getAssetSignAt() {
        return assetSignAt;
    }

    public void setAssetSignAt(String assetSignAt) {
        this.assetSignAt = assetSignAt;
    }

    public String getAssetGrantAt() {
        return assetGrantAt;
    }

    public void setAssetGrantAt(String assetGrantAt) {
        this.assetGrantAt = assetGrantAt;
    }

    public String getAssetDueAt() {
        return assetDueAt;
    }

    public void setAssetDueAt(String assetDueAt) {
        this.assetDueAt = assetDueAt;
    }

    public int getAssetInterestAmount() {
        return assetInterestAmount;
    }

    public void setAssetInterestAmount(int assetInterestAmount) {
        this.assetInterestAmount = assetInterestAmount;
    }

    public int getAssetRepaidInterestAmount() {
        return assetRepaidInterestAmount;
    }

    public void setAssetRepaidInterestAmount(int assetRepaidInterestAmount) {
        this.assetRepaidInterestAmount = assetRepaidInterestAmount;
    }

    public int getAssetPrincipalAmount() {
        return assetPrincipalAmount;
    }

    public void setAssetPrincipalAmount(int assetPrincipalAmount) {
        this.assetPrincipalAmount = assetPrincipalAmount;
    }

    public int getAssetRepaidPrincipalAmount() {
        return assetRepaidPrincipalAmount;
    }

    public void setAssetRepaidPrincipalAmount(int assetRepaidPrincipalAmount) {
        this.assetRepaidPrincipalAmount = assetRepaidPrincipalAmount;
    }

    public int getAssetPenaltyAmount() {
        return assetPenaltyAmount;
    }

    public void setAssetPenaltyAmount(int assetPenaltyAmount) {
        this.assetPenaltyAmount = assetPenaltyAmount;
    }

    public int getAssetRepaidPenaltyAmount() {
        return assetRepaidPenaltyAmount;
    }

    public void setAssetRepaidPenaltyAmount(int assetRepaidPenaltyAmount) {
        this.assetRepaidPenaltyAmount = assetRepaidPenaltyAmount;
    }

    public int getAssetDecreasePenaltyAmount() {
        return assetDecreasePenaltyAmount;
    }

    public void setAssetDecreasePenaltyAmount(int assetDecreasePenaltyAmount) {
        this.assetDecreasePenaltyAmount = assetDecreasePenaltyAmount;
    }

    public int getAssetFeeAmount() {
        return assetFeeAmount;
    }

    public void setAssetFeeAmount(int assetFeeAmount) {
        this.assetFeeAmount = assetFeeAmount;
    }

    public int getAssetRepaidFeeAmount() {
        return assetRepaidFeeAmount;
    }

    public void setAssetRepaidFeeAmount(int assetRepaidFeeAmount) {
        this.assetRepaidFeeAmount = assetRepaidFeeAmount;
    }

    public String getAssetChannel() {
        return assetChannel;
    }

    public void setAssetChannel(String assetChannel) {
        this.assetChannel = assetChannel;
    }

    public int getAssetCityCode() {
        return assetCityCode;
    }

    public void setAssetCityCode(int assetCityCode) {
        this.assetCityCode = assetCityCode;
    }

    public String getAssetStatus() {
        return assetStatus;
    }

    public void setAssetStatus(String assetStatus) {
        this.assetStatus = assetStatus;
    }

    public String getAssetLoanChannel() {
        return assetLoanChannel;
    }

    public void setAssetLoanChannel(String assetLoanChannel) {
        this.assetLoanChannel = assetLoanChannel;
    }

    public int getAssetRepaidAmount() {
        return assetRepaidAmount;
    }

    public void setAssetRepaidAmount(int assetRepaidAmount) {
        this.assetRepaidAmount = assetRepaidAmount;
    }

    public String getAssetPeriodType() {
        return assetPeriodType;
    }

    public void setAssetPeriodType(String assetPeriodType) {
        this.assetPeriodType = assetPeriodType;
    }

    public int getAssetPeriodCount() {
        return assetPeriodCount;
    }

    public void setAssetPeriodCount(int assetPeriodCount) {
        this.assetPeriodCount = assetPeriodCount;
    }

    public int getAssetPeriodDays() {
        return assetPeriodDays;
    }

    public void setAssetPeriodDays(int assetPeriodDays) {
        this.assetPeriodDays = assetPeriodDays;
    }

    public String getAssetRefOrderNo() {
        return assetRefOrderNo;
    }

    public void setAssetRefOrderNo(String assetRefOrderNo) {
        this.assetRefOrderNo = assetRefOrderNo;
    }

    public String getAssetRefOrderType() {
        return assetRefOrderType;
    }

    public void setAssetRefOrderType(String assetRefOrderType) {
        this.assetRefOrderType = assetRefOrderType;
    }

    public String getAssetRiskLevel() {
        return assetRiskLevel;
    }

    public void setAssetRiskLevel(String assetRiskLevel) {
        this.assetRiskLevel = assetRiskLevel;
    }

    public String getAssetSubOrderType() {
        return assetSubOrderType;
    }

    public void setAssetSubOrderType(String assetSubOrderType) {
        this.assetSubOrderType = assetSubOrderType;
    }

    public String getAssetProductName() {
        return assetProductName;
    }

    public void setAssetProductName(String assetProductName) {
        this.assetProductName = assetProductName;
    }

    public String getAssetActualGrantAt() {
        return assetActualGrantAt;
    }

    public void setAssetActualGrantAt(String assetActualGrantAt) {
        this.assetActualGrantAt = assetActualGrantAt;
    }

    public String getAssetOwner() {
        return assetOwner;
    }

    public void setAssetOwner(String assetVerison) {
        this.assetOwner = assetOwner;
    }

    public Long getAssetVersion() {
        return assetVersion;
    }

    public void setAssetVersion(Long assetVersion) {
        this.assetVersion = assetVersion;
    }
}
