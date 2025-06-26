package com.example.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tbl_permission_category")
public class PermissionCategory {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "permission_category_id")
    private Long permissionCategoryId;
    
    @Column(name = "permission_category_name")
    private String permissionCategoryName;
    
    // Constructors
    public PermissionCategory() {}
    
    public PermissionCategory(String permissionCategoryName) {
        this.permissionCategoryName = permissionCategoryName;
    }
    
    // Getters and Setters
    public Long getPermissionCategoryId() {
        return permissionCategoryId;
    }
    
    public void setPermissionCategoryId(Long permissionCategoryId) {
        this.permissionCategoryId = permissionCategoryId;
    }
    
    public String getPermissionCategoryName() {
        return permissionCategoryName;
    }
    
    public void setPermissionCategoryName(String permissionCategoryName) {
        this.permissionCategoryName = permissionCategoryName;
    }
} 