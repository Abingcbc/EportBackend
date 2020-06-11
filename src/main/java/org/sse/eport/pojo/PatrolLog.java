package org.sse.eport.pojo;

import java.util.Date;

public class PatrolLog {
    private Integer id;

    private Integer patrolId;

    private Integer eqId;

    private Date patrolTime;

    private String patrolResult;

    private String patrolPicture;

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

    public Integer getPatrolId() {
        return patrolId;
    }

    public void setPatrolId(Integer patrolId) {
        this.patrolId = patrolId;
    }

    public Integer getEqId() {
        return eqId;
    }

    public void setEqId(Integer eqId) {
        this.eqId = eqId;
    }

    public Date getPatrolTime() {
        return patrolTime;
    }

    public void setPatrolTime(Date patrolTime) {
        this.patrolTime = patrolTime;
    }

    public String getPatrolResult() {
        return patrolResult;
    }

    public void setPatrolResult(String patrolResult) {
        this.patrolResult = patrolResult == null ? null : patrolResult.trim();
    }

    public String getPatrolPicture() {
        return patrolPicture;
    }

    public void setPatrolPicture(String patrolPicture) {
        this.patrolPicture = patrolPicture == null ? null : patrolPicture.trim();
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