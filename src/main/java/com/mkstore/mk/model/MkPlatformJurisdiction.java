package com.mkstore.mk.model;

public class MkPlatformJurisdiction {
    private Integer platformJurisdictionId;

    private Integer menuId;

    private String jurisdictionName;

    private String jurisdictionUrl;

    private String itemId;

    public Integer getPlatformJurisdictionId() {
        return platformJurisdictionId;
    }

    public void setPlatformJurisdictionId(Integer platformJurisdictionId) {
        this.platformJurisdictionId = platformJurisdictionId;
    }

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public String getJurisdictionName() {
        return jurisdictionName;
    }

    public void setJurisdictionName(String jurisdictionName) {
        this.jurisdictionName = jurisdictionName == null ? null : jurisdictionName.trim();
    }

    public String getJurisdictionUrl() {
        return jurisdictionUrl;
    }

    public void setJurisdictionUrl(String jurisdictionUrl) {
        this.jurisdictionUrl = jurisdictionUrl == null ? null : jurisdictionUrl.trim();
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId == null ? null : itemId.trim();
    }
}