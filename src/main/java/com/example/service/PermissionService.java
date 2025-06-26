package com.example.service;

import com.example.dto.PermissionResponse;
import com.example.repository.PermissionRepository;
import com.example.repository.PermissionCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PermissionService {
    
    @Autowired
    private PermissionRepository permissionRepository;
    
    @Autowired
    private PermissionCategoryRepository permissionCategoryRepository;
    
    public List<PermissionResponse> getPermissionsByRoleIdAndCategory(Long roleId, String permissionCategory) {
        // First, find the permission category ID by name
        Long permissionCategoryId = permissionCategoryRepository.findAll().stream()
                .filter(category -> category.getPermissionCategoryName().equals(permissionCategory))
                .findFirst()
                .map(category -> category.getPermissionCategoryId())
                .orElse(null);
        
        if (permissionCategoryId == null) {
            return List.of(); // Return empty list if category not found
        }
        
        List<Object[]> results = permissionRepository.findPermissionsByRoleIdAndCategory(roleId, permissionCategoryId);
        
        return results.stream()
                .map(result -> new PermissionResponse(
                        (String) result[0], // permissionNm
                        (String) result[1], // adGroup
                        (String) result[2]  // defaultFlag
                ))
                .collect(Collectors.toList());
    }
} 