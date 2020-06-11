package org.sse.eport.pojo;

import java.util.Date;

public class Patrol {
    private Integer id;

    private String patrolStart;

    private String patrolStop;

    private String insertBy;

    private String updateBy;

    private Date updateTime;

    private Date insertTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPatrolStart() {
        return patrolStart;
    }

    public void setPatrolStart(String patrolStart) {
        this.patrolStart = patrolStart == null ? null : patrolStart.trim();
    }

    public String getPatrolStop() {
        return patrolStop;
    }

    public void setPatrolStop(String patrolStop) {
        this.patrolStop = patrolStop == null ? null : patrolStop.trim();
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

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
}