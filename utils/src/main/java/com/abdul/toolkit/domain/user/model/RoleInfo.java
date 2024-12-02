package com.abdul.toolkit.domain.user.model;

import java.time.LocalDateTime;
import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RoleInfo {

    private Long id;

    private String name;

    private Set<PermissionInfo> permissions;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}
