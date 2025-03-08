package org.app.server.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class User {
    private Integer id;
    private String name;
    private String username;
    private String password;
    private String email;
    private UserType userType;
}

