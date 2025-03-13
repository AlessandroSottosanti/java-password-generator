package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        
        String firstName;
        String lastName;
        String fevColor;
        int dayOfBirth;
        int mounthOfBirth;
        int yearOfBirth;

        Scanner scan = new Scanner(System.in);

        firstName = scan.next();
        lastName = scan.next();
        fevColor = scan.next();
        dayOfBirth = scan.nextInt();
        mounthOfBirth = scan.nextInt();
        yearOfBirth = scan.nextInt();

        String generatedPassword = firstName + "-" + lastName + "-" + fevColor + "-" + (dayOfBirth + mounthOfBirth + yearOfBirth);
        System.out.println("generated password: " + generatedPassword);
    }
}
