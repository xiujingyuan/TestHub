package com.jxq.douban.domain;

import java.util.List;

/**
 * @Auther: jx
 * @Date: 2018/7/13 18:01
 * @Description:
 */
public class MovieResponseVO {

    private List<String> tags;
    private List<String> msg;
    private List<String> name;
    private List<String> job;
    private List<String> id;
    private List<String> createdAt;

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public List<String> getMsg() {
        return msg;
    }

    public void setMsg(List<String> msg) {
        this.msg = msg;
    }

    public List<String> getName() {
        return name;
    }

    public void setName(List<String> name) {
        this.name = name;
    }

    public List<String> getJob() {
        return job;
    }

    public void setJob(List<String> job) {
        this.job = job;
    }

    public List<String> getId() {
        return id;
    }

    public void setId(List<String> id) {
        this.id = id;
    }

    public List<String> getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(List<String> createdAt) {
        this.createdAt = createdAt;
    }
}
