package com.abdul.toolkit.adapter.out.web;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

<<<<<<< HEAD
@FeignClient(name = "userService", url = "${microservices.user-admin.url:http://localhost:8080}")
=======
@FeignClient(name = "userService", url = "${microservices.user-admin.url:''}")
>>>>>>> master
public interface UserFeignClient {

    @GetMapping("/internal/users/{searchTerm}")
    dto.user.UserDetailResponse getUser(@PathVariable("searchTerm") String searchTerm);
}
