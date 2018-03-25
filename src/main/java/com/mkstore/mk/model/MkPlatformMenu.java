package com.mkstore.mk.model;

public class MkPlatformMenu {
    private Integer platformMenuId;

    private Integer parentPlatformMenuId;

    private String menuName;

    private String menuUrl;

    private String menuGrade;

    public Integer getPlatformMenuId() {
        return platformMenuId;
    }

    public void setPlatformMenuId(Integer platformMenuId) {
        this.platformMenuId = platformMenuId;
    }

    public Integer getParentPlatformMenuId() {
        return parentPlatformMenuId;
    }

    public void setParentPlatformMenuId(Integer parentPlatformMenuId) {
        this.parentPlatformMenuId = parentPlatformMenuId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName == null ? null : menuName.trim();
    }

    public String getMenuUrl() {
        return menuUrl;
    }

    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl == null ? null : menuUrl.trim();
    }

    public String getMenuGrade() {
        return menuGrade;
    }

    public void setMenuGrade(String menuGrade) {
        this.menuGrade = menuGrade == null ? null : menuGrade.trim();
    }
}