package com.example.dto;

public class PermissionResponse {
    private String permissionNm;
    private String adGroup;
    private String defaultFlag;
    
    // Constructors
    public PermissionResponse() {}
    
    public PermissionResponse(String permissionNm, String adGroup, String defaultFlag) {
        this.permissionNm = permissionNm;
        this.adGroup = adGroup;
        this.defaultFlag = defaultFlag;
    }
    
    // Getters and Setters
    public String getPermissionNm() {
        return permissionNm;
    }
    
    public void setPermissionNm(String permissionNm) {
        this.permissionNm = permissionNm;
    }
    
    public String getAdGroup() {
        return adGroup;
    }
    
    public void setAdGroup(String adGroup) {
        this.adGroup = adGroup;
    }
    
    public String getDefaultFlag() {
        return defaultFlag;
    }
    
    public void setDefaultFlag(String defaultFlag) {
        this.defaultFlag = defaultFlag;
    }
} 