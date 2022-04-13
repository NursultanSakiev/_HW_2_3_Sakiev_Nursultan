package com.company;

public class IllegalAgeException extends RuntimeException{
    private int ageOfMan;


    public IllegalAgeException(String message) {
        super(message);
    }
}