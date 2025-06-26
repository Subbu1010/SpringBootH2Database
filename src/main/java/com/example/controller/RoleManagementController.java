package com.example.controller;

import com.example.dto.*;
import com.example.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RoleManagementController {

    @Autowired
    private RoleService roleService;

    @Autowired
    private ChannelService channelService;

    @Autowired
    private AuditLevelService auditLevelService;

    @Autowired
    private PermissionService permissionService;

    @GetMapping("/getRoles")
    public List<RoleResponse> getRoles() {
        return roleService.getAllRoles();
    }

    @GetMapping("/getChannels")
    public List<ChannelResponse> getChannels() {
        return channelService.getAllChannels();
    }

    @GetMapping("/getAuditLevels")
    public List<AuditLevelResponse> getAuditLevels() {
        return auditLevelService.getAllAuditLevels();
    }

    @GetMapping("/getPermission")
    public List<PermissionResponse> getPermission(@RequestParam Long role_id, @RequestParam String permission_category) {
        return permissionService.getPermissionsByRoleIdAndCategory(role_id, permission_category);
    }
} 