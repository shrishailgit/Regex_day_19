package com.birdgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UC4_PhoneNumberValidation {

	public static void main(String[] args) {
		
		
    //	String patternname =  "^[A-Z][A-Za-z]{3}[a-z]{2,}$"; 	
    //	String patternname = "^[a-z+_.-]{3}[a-z+_.-]{3}+@[a-z+_.+]{2}[a-z+_.+]{2}$";	
	//	String patternname =  "^(\\91[\\-\\s]?)?[0]?(91)?[789]\\d{9}$";
		
		String Phnonumbervalidation =  "^([0-9]{2}[- ])[0-9]{10}$";
		
        Pattern regex = Pattern.compile(Phnonumbervalidation);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter phone number: ");
        String ValidPhonNumber = scanner.nextLine();
        Matcher phnoeMatches = regex.matcher(ValidPhonNumber);
       
        if (phnoeMatches.matches()) {
            System.out.println(ValidPhonNumber + " is valid phone number");
        } else {
            System.out.println(ValidPhonNumber + " is invalid phone number ");
        }
    }
		
	}
	

