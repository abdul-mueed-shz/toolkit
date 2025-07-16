package com.abdul.toolkit.adapter.out.web;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

<<<<<<< HEAD
@FeignClient(name = "linkedinApi",
        url = "${spring.security.oauth2.client.provider.linkedin.user-info-uri:http://localhost:8080}")
=======
@FeignClient(name = "linkedinApi", url = "${spring.security.oauth2.client.provider.linkedin.user-info-uri:''}")
>>>>>>> master
public interface LinkedinUserInfoFeignClient {

    @GetMapping
    dto.user.LinkedinUserResponse getUserInfo(@RequestParam("oauth2_access_token") String token);
}
