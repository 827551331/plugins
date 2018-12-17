package com.baby.plugins.reflect;

import com.baby.plugins.entity.Person;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectDemo {

    public static void main(String[] args) {
        try {
            Class person = Class.forName("com.baby.plugins.entity.Person");
            Method[] arr =  person.getMethods();
            Field[] array = person.getDeclaredFields();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
