package com.example.Task1;

public class Main {
    public static void main(String[] args) {
        TwitterAdapter user1 = new TwitterAdapter(new TwitterUser("b@b.b", "11", 19));
        FacebookAdapter user2 = new FacebookAdapter(new FacebookUser("bibi@bibi.bibiba", "189", 11324));

        MessageSender sender = new MessageSender();
        sender.send("Bemba", user1, "69");
        sender.send("Bebemba", user2, "6969");

    }
}