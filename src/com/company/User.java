package com.company;

public class User {
    public String name;
    public int age;

    public String getName() {
        return name;
    }

    public void setName(String name) throws IllegalNameLengthException {
        this.name = name;
        if (name.length() > 20) {
            throw new IllegalNameLengthException("количество символов больше двадцати", 20);
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        if (age < 1 || age > 100) {
            throw new IllegalAgeException("не коректный возраст");
        } else {
            age = age;
        }
    }
}