package com.example.Task2;

public class Main {
    public static void main(String[] args) {
        DBAdapter db = new DBAdapter(new БазаДаних());
        AuthorizationAdapter auth = new AuthorizationAdapter(new Авторизація());

        if (auth.auth(db)) {
            ReportBuilder br = new ReportBuilder(db);
            System.out.println("Bibimba");
        }

    }
}