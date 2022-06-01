package com.nandaparbat.SaasSportClubAPI.DTOs;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class PlayerSignIn {

    private String username;

    private String password;


    public String getUsername() {
        return username;
    };

    public void setUsername(String username) {
        this.username = username;
    };

    public String getPassword() {
        return password;
    };

    public void setPassword(String password) {
        this.password = password;
    };


    @Override
    public String toString() {
        return String.format("{username=%s, password=%s}", username,
                "[PROTECTED]");
    };



};
