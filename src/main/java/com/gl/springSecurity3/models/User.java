package com.gl.springSecurity3.models;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class User {

    private String username;
    private String name;
    private String email;
}
