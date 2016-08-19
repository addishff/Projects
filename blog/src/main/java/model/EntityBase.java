package model;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by huangfeifeng on 8/19/16.
 */
public class EntityBase implements Serializable {
    Timestamp createTime;
    Timestamp modefiedTime;

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Timestamp getModefiedTime() {
        return modefiedTime;
    }

    public void setModefiedTime(Timestamp modefiedTime) {
        this.modefiedTime = modefiedTime;
    }
}
