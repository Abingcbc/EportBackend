package org.sse.eport.pojo;

import java.util.Date;

public class Dispatcher {
    private Integer id;

    private String dispatchStart;

    private String dispatchStop;

    private String insertBy;

    private String updateBy;

    private Date insertTime;

    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDispatchStart() {
        return dispatchStart;
    }

    public void setDispatchStart(String dispatchStart) {
        this.dispatchStart = dispatchStart == null ? null : dispatchStart.trim();
    }

    public String getDispatchStop() {
        return dispatchStop;
    }

    public void setDispatchStop(String dispatchStop) {
        this.dispatchStop = dispatchStop == null ? null : dispatchStop.trim();
    }

    public String getInsertBy() {
        return insertBy;
    }

    public void setInsertBy(String insertBy) {
        this.insertBy = insertBy == null ? null : insertBy.trim();
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }

    public Date getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}