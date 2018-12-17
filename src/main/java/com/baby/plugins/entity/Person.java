package com.baby.plugins.entity;

import lombok.Data;

@Data
public class Person {

    private String name;
    private int age;

    public String say(String name) {
        String str = "I am ";

        System.out.println(str + name);

        return str;
    }

    private String secretSay(String name) {
        String str = "I am ";

        System.out.println(str + name);

        return str;
    }

}
