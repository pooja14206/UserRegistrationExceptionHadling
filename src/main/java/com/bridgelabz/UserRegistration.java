package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
    final String namePattern = "^[A-Z]{1}[a-z]{2,}$";
    //final String lastNamePattern = "^[A-Z]{1}[a-z]{2,}$";
    final String emailIdPattern = "^[a-zA-Z0-9]{1,}[.a-zA-Z0-9]*@[a-zA-Z0-9]{1,}((.){1}+)([a-z]{1,3}+)(.[a-z]{2})*$";
    final String phoneNumberPattern = "[0-9]{2}[\\s][0-9]{10}$";
    final String passwordPattern = "^(?=.*\\d)([a-z])*(?=.*[A-Z])(?=.*[@#$%^&+=]).{8,}$";
    /**
     * This method is used validating userinput firstname.
     *
     * @param firstNamePattern hold the correct pattern to match with the userinput.
     */

    public void checkPatternFirstName() {

        try {
            Scanner userInput = new Scanner(System.in);
            System.out.println("enter the First Name: ");
            String checkPattern = userInput.nextLine();

            if (Pattern.matches(namePattern, checkPattern))
                System.out.println("Pattern match. Correct Input.");
            else
                throw new UserDefineException("Please Follow the pattern And Enter a valid Frist name");
            System.out.println("First name:- " + checkPattern);
        }

        catch (UserDefineException e) {
            System.out.println(e.errorMessage);
            checkPatternFirstName();
        }
    }
    /**
     * This method is used validating userinput lastname.
     *
     * @param lasttNamePattern hold the correct pattern to match with the userinput.
     */

    public void checkPatternLastName() {

        try {
            Scanner userInput = new Scanner(System.in);
            System.out.println("enter the Last Name: ");
            String checkPattern = userInput.next();

            if (Pattern.matches(namePattern, checkPattern))
                System.out.println("Pattern match.");
            else
                throw new UserDefineException("Please follow the pattern and enter a valid LastName");
            System.out.println("Last name:- " + checkPattern);
        }
        catch (UserDefineException e) {
            System.out.println(e.errorMessage);
            checkPatternLastName();
        }
    }

    /**
     * This method is used validating userinput email.
     *
     * @param emailIdPattern hold the correct pattern to match with the userinput.
     */

    public void checkPatternEmailId() {

        try {
            Scanner userInput = new Scanner(System.in);
            System.out.println("enter the Email address: ");
            String checkPattern = userInput.next();

            if (Pattern.matches(emailIdPattern, checkPattern))
                System.out.println("Pattern match.");
            else
               throw new UserDefineException("Please follow the pattern and enter a valid Email");
            System.out.println("Email:- " + checkPattern);
        }
        catch (UserDefineException e) {
        System.out.println(e.errorMessage);
        checkPatternEmailId();
    }
    }

    /**
     * This method is used validating userinput phoneNo.
     *
     * @param phoneNumberPattern hold the correct pattern to match with the userinput.
     */

    public void checkPatternPhoneNumber() {

        try {
            Scanner userInput = new Scanner(System.in);
            System.out.println("enter the PhoneNo: ");
            String checkPattern = userInput.nextLine();

            if (Pattern.matches(phoneNumberPattern, checkPattern))
                System.out.println("Pattern match.");
            else
                throw new UserDefineException("Please follow the pattern and enter a valid PhoneNumber");
            System.out.println("Phone Number:- " + checkPattern);
        }
        catch (UserDefineException e) {
            System.out.println(e.errorMessage);
            checkPatternPhoneNumber();
        }
    }

    /**
     * This method is used validating userinput password.
     * Rule-1 Minimum 8 character
     * Rule-2 At least one Upper case
     * Rule-3  At least one Numeric value
     * Rule-4 at least one Special character
     * @param passwordPattern hold the correct pattern to match with the userinput.
     */


    public void checkPatternPassword() {

        try {
            Scanner userInput = new Scanner(System.in);
            System.out.println("enter the Password: ");
            String checkPattern = userInput.next();

            if (Pattern.matches(passwordPattern, checkPattern))
                System.out.println("Pattern match.");
            else
                throw new UserDefineException("Please follow the pattern and enter a valid Password");
            System.out.println("Password:- " + checkPattern);
        }
        catch (UserDefineException e) {
            System.out.println(e.errorMessage);
            checkPatternPassword();
        }
    }
}
