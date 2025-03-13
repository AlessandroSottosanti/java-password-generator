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

        System.out.println("Insert name: " );
        firstName = scan.next();

        System.out.println("Insert last name: " );
        lastName = scan.next();

        System.out.println("Insert favourite color: " );
        fevColor = scan.next();

        System.out.println("Insert day of birth: " );
        dayOfBirth = scan.nextInt();

        System.out.println("Insert mounth of birth: " );
        mounthOfBirth = scan.nextInt();

        System.out.println("Insert year of birth: " );
        yearOfBirth = scan.nextInt();

        String generatedPassword = firstName + "-" + lastName + "-" + fevColor + "-" + (dayOfBirth + mounthOfBirth + yearOfBirth);
        System.out.println("generated password: " + generatedPassword);
    }
}
