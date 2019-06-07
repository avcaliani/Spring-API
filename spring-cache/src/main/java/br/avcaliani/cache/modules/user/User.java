package br.avcaliani.cache.modules.user;

import lombok.Data;

@Data
public class User {

    private String name;
    private String email;

    public User() { }

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

}
