package com.birdgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UC2_LastNameValidation {
    public static void main(String[] args) {
    
    	//^[A-Z][a-zA-Z]{3,}(?: [A-Z][a-zA-Z]*){0,2}$
    	
        // String namePattern = "^[a-zA-Z]{3,}(?: [a-zA-Z]+){0,2}$";
        // String patternname=   ("^[A-Z]{1}[a-z]{2,}$ ");
	
    	//String patternname = "^[A-Z][a-zA-Z]{3,}(?: [A-Z][a-zA-Z]*){0,2}$";
    
    	
    	String patternname = "^[a-z][a-zA-Z]{2,}[A-Z]{3}$";
        Pattern regex = Pattern.compile(patternname);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the last name : ");
        String lastnameStr = sc.nextLine();
        Matcher lastNameMatches = regex.matcher(lastnameStr);
       
        if (lastNameMatches.matches()) {
            System.out.println(lastnameStr + " is valid Last Name");
        } else {
            System.out.println(lastnameStr + " is invalid Last Name ");
        }
    }
}
