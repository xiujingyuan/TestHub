package com.jxq.reqres_website.domain;

import com.google.gson.annotations.SerializedName;

/**
 * Created by IntelliJ IDEA.
 * User: yuanxiujing
 * Date: 18/11/22
 * Time: 上午11:38
 */
public class RequestBody {
    @SerializedName("name")
    private String name;
    @SerializedName("job")
    private String job;

    public RequestBody(){
        super();
    }

    public RequestBody(String name, String job) {
        super();
        this.name = name;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
