package com.abdul.toolkit.domain.google.model;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class GoogleUserInfo {

    private Long id;
    private String authUserId;
    private String googleId;
    private String picture;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
