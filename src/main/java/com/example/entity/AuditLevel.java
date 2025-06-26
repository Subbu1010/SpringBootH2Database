package com.example.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tbl_audit_level")
public class AuditLevel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "audit_level_id")
    private Long auditLevelId;
    
    @Column(name = "audit_level_nm")
    private String auditLevelNm;
    
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
    public AuditLevel() {}
    
    public AuditLevel(String auditLevelNm, String adGroup, String approverSoeid, 
                     String approverFname, String approverLname, String approverGroup, String resourceId) {
        this.auditLevelNm = auditLevelNm;
        this.adGroup = adGroup;
        this.approverSoeid = approverSoeid;
        this.approverFname = approverFname;
        this.approverLname = approverLname;
        this.approverGroup = approverGroup;
        this.resourceId = resourceId;
    }
    
    // Getters and Setters
    public Long getAuditLevelId() {
        return auditLevelId;
    }
    
    public void setAuditLevelId(Long auditLevelId) {
        this.auditLevelId = auditLevelId;
    }
    
    public String getAuditLevelNm() {
        return auditLevelNm;
    }
    
    public void setAuditLevelNm(String auditLevelNm) {
        this.auditLevelNm = auditLevelNm;
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