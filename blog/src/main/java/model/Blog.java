package model;

import com.alibaba.fastjson.JSONObject;

/**
 * Created by huangfeifeng on 8/19/16.
 */
public class Blog extends EntityBase {
    Long id;
    String title;
    String abstractStr;
    String content;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAbstractStr() {
        return abstractStr;
    }

    public void setAbstractStr(String abstractStr) {
        this.abstractStr = abstractStr;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public static Blog buildFromStr(String blogStr) {
        return JSONObject.parseObject(blogStr, Blog.class);
    }
}
