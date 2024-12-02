package com.abdul.toolkit.utils.linkedin.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class LinkedinUserInfo implements Serializable {

    private Long id;
    private String state;
    private String idToken;
    private String accessToken;
    private String usedAuthCode;
    private String tokenScope;
    private String expiresIn;
    private String tokenType;
    private String picture;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
