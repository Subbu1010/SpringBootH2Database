package com.example.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tbl_role")
public class Role {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id")
    private Long roleId;
    
    @Column(name = "role_nm")
    private String roleNm;
    
    @Column(name = "role_desc")
    private String roleDesc;
    
    @Column(name = "ad_group")
    private String adGroup;
    
    @Column(name = "approver_soeid")
    private String approverSoeid;
    
    @Column(name = "approver_fname")
    private String approverFname;
    
    @Column(name = "approver_lname")
    private String approverLname;
    
    @Column(name = "approver_group")
    private String approverGroup;
    
    @Column(name = "resource_id")
    private String resourceId;
    
    // Constructors
    public Role() {}
    
    public Role(String roleNm, String roleDesc, String adGroup, String approverSoeid, 
                String approverFname, String approverLname, String approverGroup, String resourceId) {
        this.roleNm = roleNm;
        this.roleDesc = roleDesc;
        this.adGroup = adGroup;
        this.approverSoeid = approverSoeid;
        this.approverFname = approverFname;
        this.approverLname = approverLname;
        this.approverGroup = approverGroup;
        this.resourceId = resourceId;
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
    
    public String getRoleDesc() {
        return roleDesc;
    }
    
    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc;
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
} 