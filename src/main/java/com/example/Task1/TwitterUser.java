package com.example.Task1;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class TwitterUser {
    private String userMail;
    private String countryCode;
    private long lastAriveAt;
}