package com.mkstore.mk.model;

import java.util.Date;

public class MkPlatformRole {
    private Integer platformRoleId;

    private String roleName;

    private String roleDescribe;

    private String roleStatus;

    private Date addTime;

    private String isAdmin;

    public Integer getPlatformRoleId() {
        return platformRoleId;
    }

    public void setPlatformRoleId(Integer platformRoleId) {
        this.platformRoleId = platformRoleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public String getRoleDescribe() {
        return roleDescribe;
    }

    public void setRoleDescribe(String roleDescribe) {
        this.roleDescribe = roleDescribe == null ? null : roleDescribe.trim();
    }

    public String getRoleStatus() {
        return roleStatus;
    }

    public void setRoleStatus(String roleStatus) {
        this.roleStatus = roleStatus == null ? null : roleStatus.trim();
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public String getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(String isAdmin) {
        this.isAdmin = isAdmin == null ? null : isAdmin.trim();
    }
}