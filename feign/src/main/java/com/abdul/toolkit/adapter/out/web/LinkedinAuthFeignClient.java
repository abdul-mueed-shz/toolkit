package com.abdul.toolkit.adapter.out.web;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "linkedinAuth", url = "${spring.security.oauth2.client.provider.linkedin.token-uri}")
public interface LinkedinAuthFeignClient {

    @PostMapping
    dto.user.AccessToken getAccessToken(
            @RequestParam("grant_type") String grantType,
            @RequestParam("code") String code,
            @RequestParam("redirect_uri") String redirectUri,
            @RequestParam("client_id") String clientId,
            @RequestParam("client_secret") String clientSecret
    );
}
