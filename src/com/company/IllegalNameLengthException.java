package com.company;

public class IllegalNameLengthException extends Exception{
    private int chars;


    public IllegalNameLengthException(String message,int chars) {
        super(message);
        this.chars=chars;
    }

    public int getName() {
        return chars;
    }

    public void setName(int name) {
        this.chars = name;
    }
}