package com.example.repository;

import com.example.entity.Permission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PermissionRepository extends JpaRepository<Permission, Long> {
    
    @Query("SELECT p.permissionNm, p.adGroup, rp.defaultFlag " +
           "FROM Permission p " +
           "JOIN RolePermission rp ON p.permissionId = rp.permissionId " +
           "JOIN Role r ON rp.roleId = r.roleId " +
           "WHERE r.roleId = :roleId AND p.permissionCategoryId = :permissionCategoryId")
    List<Object[]> findPermissionsByRoleIdAndCategory(@Param("roleId") Long roleId, 
                                                      @Param("permissionCategoryId") Long permissionCategoryId);
} 