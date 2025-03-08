package org.app.server.web.controller;

import org.app.server.domain.model.User;
import org.app.server.domain.model.UserType;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/teste")
    public ResponseEntity<User> greeting() {
        User weltinho = new User(1, "Welton 2", "kpz", "123", "welton@gmail.com", UserType.BUYER);

        return new ResponseEntity<>(weltinho, HttpStatus.OK);
    }
}