package com.example.repository;

import com.example.entity.AuditLevel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuditLevelRepository extends JpaRepository<AuditLevel, Long> {
} 