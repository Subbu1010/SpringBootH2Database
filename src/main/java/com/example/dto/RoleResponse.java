package com.example.dto;

public class RoleResponse {
    private Long roleId;
    private String roleNm;
    private String adGroup;
    private String approverSoeid;
    private String approverFname;
    private String approverLname;
    private String approverGroup;
    private String resourceId;
    private String defaultFlag;
    
    // Constructors
    public RoleResponse() {}
    
    public RoleResponse(Long roleId, String roleNm, String adGroup, String approverSoeid, 
                       String approverFname, String approverLname, String approverGroup, 
                       String resourceId, String defaultFlag) {
        this.roleId = roleId;
        this.roleNm = roleNm;
        this.adGroup = adGroup;
        this.approverSoeid = approverSoeid;
        this.approverFname = approverFname;
        this.approverLname = approverLname;
        this.approverGroup = approverGroup;
        this.resourceId = resourceId;
        this.defaultFlag = defaultFlag;
    }
    
    // Getters and Setters
    public Long getRoleId() {
        return roleId;
    }
    
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }
    
    public String getRoleNm() {
        return roleNm;
    }
    
    public void setRoleNm(String roleNm) {
        this.roleNm = roleNm;
    }
    
    public String getAdGroup() {
        return adGroup;
    }
    
    public void setAdGroup(String adGroup) {
        this.adGroup = adGroup;
    }
    
    public String getApproverSoeid() {
        return approverSoeid;
    }
    
    public void setApproverSoeid(String approverSoeid) {
        this.approverSoeid = approverSoeid;
    }
    
    public String getApproverFname() {
        return approverFname;
    }
    
    public void setApproverFname(String approverFname) {
        this.approverFname = approverFname;
    }
    
    public String getApproverLname() {
        return approverLname;
    }
    
    public void setApproverLname(String approverLname) {
        this.approverLname = approverLname;
    }
    
    public String getApproverGroup() {
        return approverGroup;
    }
    
    public void setApproverGroup(String approverGroup) {
        this.approverGroup = approverGroup;
    }
    
    public String getResourceId() {
        return resourceId;
    }
    
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }
    
    public String getDefaultFlag() {
        return defaultFlag;
    }
    
    public void setDefaultFlag(String defaultFlag) {
        this.defaultFlag = defaultFlag;
    }
} 