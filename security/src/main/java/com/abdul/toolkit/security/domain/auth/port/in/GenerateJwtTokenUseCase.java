package com.abdul.toolkit.security.domain.auth.port.in;

import com.abdul.toolkit.utils.user.model.UserInfo;
import java.util.Map;

public interface GenerateJwtTokenUseCase {

    String generateAccessToken(UserInfo userInfo);

    String generateRefreshToken(UserInfo userInfo);

    String generateToken(
            UserInfo userInfo,
            Map<String, Object> claims,
            Map<String, Object> headers,
            Integer tokenValidity);
}
