package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        User user = new User();
        while (true){
            try {
                user.setName(scanner.nextLine());
            } catch (IllegalNameLengthException e) {
                e.printStackTrace();
            }
            user.setAge(scanner.nextInt());
        }
    }
}
