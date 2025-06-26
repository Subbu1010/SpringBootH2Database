package com.example.repository;

import com.example.entity.PermissionCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PermissionCategoryRepository extends JpaRepository<PermissionCategory, Long> {
} 