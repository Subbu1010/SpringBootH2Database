package com.example.service;

import com.example.dto.AuditLevelResponse;
import com.example.entity.AuditLevel;
import com.example.repository.AuditLevelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AuditLevelService {
    
    @Autowired
    private AuditLevelRepository auditLevelRepository;
    
    public List<AuditLevelResponse> getAllAuditLevels() {
        List<AuditLevel> auditLevels = auditLevelRepository.findAll();
        return auditLevels.stream()
                .map(auditLevel -> new AuditLevelResponse(
                        auditLevel.getAuditLevelId(),
                        auditLevel.getAuditLevelNm(),
                        auditLevel.getAdGroup(),
                        auditLevel.getApproverSoeid(),
                        auditLevel.getApproverFname(),
                        auditLevel.getApproverLname(),
                        auditLevel.getApproverGroup(),
                        auditLevel.getResourceId(),
                        null // default_flag is null as per requirement
                ))
                .collect(Collectors.toList());
    }
} 