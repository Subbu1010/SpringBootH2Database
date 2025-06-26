package com.example.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tbl_role_permission")
public class RolePermission {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    
    @Column(name = "role_id")
    private Long roleId;
    
    @Column(name = "permission_id")
    private String permissionId;
    
    @Column(name = "default_flag")
    private String defaultFlag;
    
    // Constructors
    public RolePermission() {}
    
    public RolePermission(Long roleId, String permissionId, String defaultFlag) {
        this.roleId = roleId;
        this.permissionId = permissionId;
        this.defaultFlag = defaultFlag;
    }
    
    // Getters and Setters
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public Long getRoleId() {
        return roleId;
    }
    
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }
    
    public String getPermissionId() {
        return permissionId;
    }
    
    public void setPermissionId(String permissionId) {
        this.permissionId = permissionId;
    }
    
    public String getDefaultFlag() {
        return defaultFlag;
    }
    
    public void setDefaultFlag(String defaultFlag) {
        this.defaultFlag = defaultFlag;
    }
} 