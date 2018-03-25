package com.mkstore.mk.model;

import java.util.Date;

public class SysLog {
    private Integer logId;

    private Integer optUserId;

    private String optUserName;

    private String optType;

    private String optTable;

    private Date optTime;

    private String optPriKey;

    private String optTag;

    private String optContent;

    public Integer getLogId() {
        return logId;
    }

    public void setLogId(Integer logId) {
        this.logId = logId;
    }

    public Integer getOptUserId() {
        return optUserId;
    }

    public void setOptUserId(Integer optUserId) {
        this.optUserId = optUserId;
    }

    public String getOptUserName() {
        return optUserName;
    }

    public void setOptUserName(String optUserName) {
        this.optUserName = optUserName == null ? null : optUserName.trim();
    }

    public String getOptType() {
        return optType;
    }

    public void setOptType(String optType) {
        this.optType = optType == null ? null : optType.trim();
    }

    public String getOptTable() {
        return optTable;
    }

    public void setOptTable(String optTable) {
        this.optTable = optTable == null ? null : optTable.trim();
    }

    public Date getOptTime() {
        return optTime;
    }

    public void setOptTime(Date optTime) {
        this.optTime = optTime;
    }

    public String getOptPriKey() {
        return optPriKey;
    }

    public void setOptPriKey(String optPriKey) {
        this.optPriKey = optPriKey == null ? null : optPriKey.trim();
    }

    public String getOptTag() {
        return optTag;
    }

    public void setOptTag(String optTag) {
        this.optTag = optTag == null ? null : optTag.trim();
    }

    public String getOptContent() {
        return optContent;
    }

    public void setOptContent(String optContent) {
        this.optContent = optContent == null ? null : optContent.trim();
    }
}