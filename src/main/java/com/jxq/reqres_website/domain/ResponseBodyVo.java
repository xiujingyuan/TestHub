package com.jxq.reqres_website.domain;

/**
 * Created by IntelliJ IDEA.
 * User: yuanxiujing
 * Date: 18/11/21
 * Time: 上午10:33
 * <p>
 * name : morpheus
 * job : leader
 */
public class ResponseBodyVo {
    private String name;
    private String job;
    private String id;
    private String createdAt;

    public ResponseBodyVo() {
        super();
    }

    public ResponseBodyVo(String name, String job) {
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
