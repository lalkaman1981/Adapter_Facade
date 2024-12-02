package com.example.Task2;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class AuthorizationAdapter {
    private final Авторизація auth;

    public boolean auth(DBAdapter db) {
        db.getUserData();
        return true;
    }

}