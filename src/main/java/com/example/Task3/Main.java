package com.example.Task3;


public class Main {
  public static void main(String[] args) {
    WebScrapper scrapper = new WebScrapper("https://brandfetch.com/");
    System.out.println(scrapper.scrape("Ford"));
  }
}