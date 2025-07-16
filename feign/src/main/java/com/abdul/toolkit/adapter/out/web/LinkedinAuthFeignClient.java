package com.abdul.toolkit.adapter.out.web;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

<<<<<<< HEAD
@FeignClient(name = "linkedinAuth",
        url = "${spring.security.oauth2.client.provider.linkedin.token-uri:http://localhost:8080}")
=======
@FeignClient(name = "linkedinAuth", url = "${spring.security.oauth2.client.provider.linkedin.token-uri:''}")
>>>>>>> master
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
