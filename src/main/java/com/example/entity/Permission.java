package com.example.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tbl_permission")
public class Permission {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    
    @Column(name = "permission_category_id")
    private Long permissionCategoryId;
    
    @Column(name = "permission_id")
    private String permissionId;
    
    @Column(name = "permission_nm")
    private String permissionNm;
    
    @Column(name = "ad_group")
    private String adGroup;
    
    // Constructors
    public Permission() {}
    
    public Permission(Long permissionCategoryId, String permissionId, String permissionNm, String adGroup) {
        this.permissionCategoryId = permissionCategoryId;
        this.permissionId = permissionId;
        this.permissionNm = permissionNm;
        this.adGroup = adGroup;
    }
    
    // Getters and Setters
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public Long getPermissionCategoryId() {
        return permissionCategoryId;
    }
    
    public void setPermissionCategoryId(Long permissionCategoryId) {
        this.permissionCategoryId = permissionCategoryId;
    }
    
    public String getPermissionId() {
        return permissionId;
    }
    
    public void setPermissionId(String permissionId) {
        this.permissionId = permissionId;
    }
    
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
} 