package com.abdul.toolkit.adapter.out.web;

import com.abdul.admin.dto.UserResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "userService", url = "${microservices.user-admin.url}")
public interface UserFeignClient {

    @GetMapping("/internal/users/{searchTerm}")
    UserResponse getUser(@PathVariable("searchTerm") String searchTerm);
}