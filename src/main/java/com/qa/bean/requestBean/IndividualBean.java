package com.qa.bean.requestBean;

import com.google.gson.annotations.SerializedName;
import com.qa.common.IdCardGenerator;
import com.qa.common.RandomValue;

/**
 * Created by IntelliJ IDEA.
 * User: yuanxiujing
 * Date: 18/11/26
 * Time: 下午7:57
 */
public class IndividualBean {
    /**
     * individual_name : 李静
     * individual_idnum : 371322199012191765
     * individual_gender : f
     * individual_residence : 山东省临沂市罗庄区罗庄办事处沈泉庄村B区2号楼1001室
     * individual_workplace : 山东省临沂市罗庄区韦姜屯康桥丽都宝莱饭店东临专业减肥店
     * individual_permanent : 山东省临沂市罗庄区罗庄办事处
     * individual_company : 瘦典专业减肥店
     * individual_tel : 14768340456
     * individual_work_tel : 0539-2411966
     * individual_residence_tel : 15255535671
     * individual_mate_name : 章伞
     * individual_mate_tel : 18909201111
     * individual_relative_name : 翟宝献
     * individual_relative_relation : 4
     * individual_relative_tel : 13792999065
     * individual_workmate_name : 李有为
     * individual_workmate_tel : 18354440345
     * individual_remark : test1
     * individual_nation : 汉
     * individual_email : 14768340456@139.com
     */

    @SerializedName("individual_name")
    private String individualName;
    @SerializedName("individual_idnum")
    private String individualIdnum;
    @SerializedName("individual_gender")
    private String individualGender;
    @SerializedName("individual_residence")
    private String individualResidence;
    @SerializedName("individual_workplace")
    private String individualWorkplace;
    @SerializedName("individual_permanent")
    private String individualPermanent;
    @SerializedName("individual_company")
    private String individualCompany;
    @SerializedName("individual_tel")
    private String individualTel;
    @SerializedName("individual_work_tel")
    private String individualWorkTel;
    @SerializedName("individual_residence_tel")
    private String individualResidenceTel;
    @SerializedName("individual_mate_name")
    private String individualMateName;
    @SerializedName("individual_mate_tel")
    private String individualMateTel;
    @SerializedName("individual_relative_name")
    private String individualRelativeName;
    @SerializedName("individual_relative_relation")
    private String individualRelativeRelation;
    @SerializedName("individual_relative_tel")
    private String individualRelativeTel;
    @SerializedName("individual_workmate_name")
    private String individualWorkmateName;
    @SerializedName("individual_workmate_tel")
    private String individualWorkmateTel;
    @SerializedName("individual_remark")
    private String individualRemark;
    @SerializedName("individual_nation")
    private String individualNation;
    @SerializedName("individual_email")
    private String individualEmail;

    public static IndividualBean getIndividualBean() {
        IndividualBean borrower = new IndividualBean();
        RandomValue randomValue = new RandomValue();
        IdCardGenerator g = new IdCardGenerator();

        borrower.setIndividualGender(randomValue.getSex());
        borrower.setIndividualName(randomValue.getChineseName());
        borrower.setIndividualIdnum(g.generate());
        borrower.setIndividualResidence(randomValue.getRoad());
        borrower.setIndividualWorkplace(randomValue.getRoad());
        borrower.setIndividualPermanent(randomValue.getRoad());
        borrower.setIndividualCompany(randomValue.getCompany());
        borrower.setIndividualTel(randomValue.getTel());
        borrower.setIndividualWorkTel(randomValue.getWorkTel());
        borrower.setIndividualResidenceTel(randomValue.getTel());
        borrower.setIndividualMateName(randomValue.getChineseName());
        borrower.setIndividualMateTel(randomValue.getTel());
        borrower.setIndividualRelativeName(randomValue.getChineseName());
        borrower.setIndividualRelativeRelation(randomValue.getRelativeRelation());
        borrower.setIndividualRelativeTel(randomValue.getTel());
        borrower.setIndividualWorkmateName(randomValue.getChineseName());
        borrower.setIndividualWorkmateTel(randomValue.getTel());
        borrower.setIndividualRemark("test1xxxxxxx");
        borrower.setIndividualNation(randomValue.getNation());
        borrower.setIndividualEmail(randomValue.getEmail(6, 9));

        return borrower;
    }


    public String getIndividualName() {
        return individualName;
    }

    public void setIndividualName(String individualName) {
        this.individualName = individualName;
    }

    public String getIndividualIdnum() {
        return individualIdnum;
    }

    public void setIndividualIdnum(String individualIdnum) {
        this.individualIdnum = individualIdnum;
    }

    public String getIndividualGender() {
        return individualGender;
    }

    public void setIndividualGender(String individualGender) {
        this.individualGender = individualGender;
    }

    public String getIndividualResidence() {
        return individualResidence;
    }

    public void setIndividualResidence(String individualResidence) {
        this.individualResidence = individualResidence;
    }

    public String getIndividualWorkplace() {
        return individualWorkplace;
    }

    public void setIndividualWorkplace(String individualWorkplace) {
        this.individualWorkplace = individualWorkplace;
    }

    public String getIndividualPermanent() {
        return individualPermanent;
    }

    public void setIndividualPermanent(String individualPermanent) {
        this.individualPermanent = individualPermanent;
    }

    public String getIndividualCompany() {
        return individualCompany;
    }

    public void setIndividualCompany(String individualCompany) {
        this.individualCompany = individualCompany;
    }

    public String getIndividualTel() {
        return individualTel;
    }

    public void setIndividualTel(String individualTel) {
        this.individualTel = individualTel;
    }

    public String getIndividualWorkTel() {
        return individualWorkTel;
    }

    public void setIndividualWorkTel(String individualWorkTel) {
        this.individualWorkTel = individualWorkTel;
    }

    public String getIndividualResidenceTel() {
        return individualResidenceTel;
    }

    public void setIndividualResidenceTel(String individualResidenceTel) {
        this.individualResidenceTel = individualResidenceTel;
    }

    public String getIndividualMateName() {
        return individualMateName;
    }

    public void setIndividualMateName(String individualMateName) {
        this.individualMateName = individualMateName;
    }

    public String getIndividualMateTel() {
        return individualMateTel;
    }

    public void setIndividualMateTel(String individualMateTel) {
        this.individualMateTel = individualMateTel;
    }

    public String getIndividualRelativeName() {
        return individualRelativeName;
    }

    public void setIndividualRelativeName(String individualRelativeName) {
        this.individualRelativeName = individualRelativeName;
    }

    public String getIndividualRelativeRelation() {
        return individualRelativeRelation;
    }

    public void setIndividualRelativeRelation(String individualRelativeRelation) {
        this.individualRelativeRelation = individualRelativeRelation;
    }

    public String getIndividualRelativeTel() {
        return individualRelativeTel;
    }

    public void setIndividualRelativeTel(String individualRelativeTel) {
        this.individualRelativeTel = individualRelativeTel;
    }

    public String getIndividualWorkmateName() {
        return individualWorkmateName;
    }

    public void setIndividualWorkmateName(String individualWorkmateName) {
        this.individualWorkmateName = individualWorkmateName;
    }

    public String getIndividualWorkmateTel() {
        return individualWorkmateTel;
    }

    public void setIndividualWorkmateTel(String individualWorkmateTel) {
        this.individualWorkmateTel = individualWorkmateTel;
    }

    public String getIndividualRemark() {
        return individualRemark;
    }

    public void setIndividualRemark(String individualRemark) {
        this.individualRemark = individualRemark;
    }

    public String getIndividualNation() {
        return individualNation;
    }

    public void setIndividualNation(String individualNation) {
        this.individualNation = individualNation;
    }

    public String getIndividualEmail() {
        return individualEmail;
    }

    public void setIndividualEmail(String individualEmail) {
        this.individualEmail = individualEmail;
    }
}
