package com.abdul.toolkit.domain.linkedin.port.in;

import com.abdul.toolkit.domain.auth.model.AccessToken;
import com.abdul.toolkit.domain.linkedin.model.LinkedinUserResponse;

public interface LinkedinApiUseCase {

    LinkedinUserResponse getUserResponse(String accessToken);

    AccessToken getAccessToken(
            String grantType,
            String code,
            String redirectUri,
            String clientId,
            String clientSecret
    );

}
