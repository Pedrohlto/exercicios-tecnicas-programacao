package org.example.streams;

public class User {

    private String name;
    private int age;
    private int followers;

    public User(String name, int age, int followers) {
        this.name = name;
        this.age = age;
        this.followers = followers;
    }

    public int getAge() {
        return age;
    }
}
