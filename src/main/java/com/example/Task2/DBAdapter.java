package com.example.Task2;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class DBAdapter {
    public final БазаДаних db;

    public String getUserData() {
        return db.отриматиДаніКористувача();
    }

    public String getStaticData() {
        return db.отриматиСтатистичніДані();
    }
}