package com.leyou.user.controller;

import com.leyou.user.service.UserService;
import org.apache.commons.lang.BooleanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 验证用户
     * @param data
     * @param type
     * @return
     */
    @GetMapping("/check/{data}/{type}")
    public ResponseEntity<Boolean> checkUser(@PathVariable("data") String data, @PathVariable("type") Integer type) {
        Boolean bool = this.userService.checkUser(data, type);
        if (bool == null) {
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(bool);
    }
}
