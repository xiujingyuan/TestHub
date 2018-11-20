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

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public List<String> getMsg() {
        return msg;
    }
}
