package com.example.service;

import com.example.dto.RoleResponse;
import com.example.entity.Role;
import com.example.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RoleService {
    
    @Autowired
    private RoleRepository roleRepository;
    
    public List<RoleResponse> getAllRoles() {
        List<Role> roles = roleRepository.findAll();
        return roles.stream()
                .map(role -> new RoleResponse(
                        role.getRoleId(),
                        role.getRoleNm(),
                        role.getAdGroup(),
                        role.getApproverSoeid(),
                        role.getApproverFname(),
                        role.getApproverLname(),
                        role.getApproverGroup(),
                        role.getResourceId(),
                        null // default_flag is null as per requirement
                ))
                .collect(Collectors.toList());
    }
} 