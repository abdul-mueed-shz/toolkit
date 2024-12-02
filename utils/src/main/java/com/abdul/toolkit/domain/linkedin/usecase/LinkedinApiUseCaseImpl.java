package com.abdul.toolkit.domain.linkedin.usecase;

import com.abdul.toolkit.adapter.out.web.LinkedinAuthFeignClient;
import com.abdul.toolkit.adapter.out.web.LinkedinUserInfoFeignClient;
import com.abdul.toolkit.domain.auth.model.AccessToken;
import com.abdul.toolkit.domain.linkedin.mapper.LinkedinMapper;
import com.abdul.toolkit.domain.linkedin.model.LinkedinUserResponse;
import com.abdul.toolkit.domain.linkedin.port.in.LinkedinApiUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LinkedinApiUseCaseImpl implements LinkedinApiUseCase {

    private final LinkedinUserInfoFeignClient linkedinUserInfoFeignClient;
    private final LinkedinAuthFeignClient linkedinAuthFeignClient;
    private final LinkedinMapper linkedinMapper;

    public LinkedinUserResponse getUserResponse(String accessToken) {
        return linkedinMapper.map(linkedinUserInfoFeignClient.getUserInfo(accessToken));
    }

    public AccessToken getAccessToken(
            String grantType,
            String code,
            String redirectUri,
            String clientId,
            String clientSecret
    ) {
        return linkedinMapper.map(linkedinAuthFeignClient.getAccessToken(
                grantType,
                code,
                redirectUri,
                clientId,
                clientSecret
        ));
    }
}
