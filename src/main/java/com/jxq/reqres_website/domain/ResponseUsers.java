package com.jxq.reqres_website.domain;

import com.google.gson.annotations.SerializedName;

/**
 * Created by IntelliJ IDEA.
 * User: yuanxiujing
 * Date: 18/11/21
 * Time: 上午11:33
 */
public class ResponseUsers {
    @SerializedName("name")
    private String name;
    @SerializedName("job")
    private String job;
    @SerializedName("id")
    private String id;
    @SerializedName("createdAt")
    private String createdAt;

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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }
}
