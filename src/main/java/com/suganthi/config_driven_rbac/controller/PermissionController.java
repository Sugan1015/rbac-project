package com.suganthi.config_driven_rbac.controller;

import com.suganthi.config_driven_rbac.service.PermissionService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/check")
public class PermissionController {

    private final PermissionService permissionService;

    public PermissionController(PermissionService permissionService) {
        this.permissionService = permissionService;
    }

    @GetMapping
    public String check(
            @RequestParam Long roleId,
            @RequestParam String table,
            @RequestParam String column
    ) {
        permissionService.checkView(roleId, table, column);
        return "Access Allowed ✅";
    }
}





