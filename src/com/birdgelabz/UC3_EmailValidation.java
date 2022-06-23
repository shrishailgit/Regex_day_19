package com.birdgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UC3_EmailValidation {

	public static void main(String[] args) {
		
		
	    //	String patternname =  "^[A-Z][A-Za-z]{3}[a-z]{2,}$"; 	
	    //	String patternname = "^[a-z+_.-]{3}[a-z+_.-]{3}+@[a-z+_.+]{2}[a-z+_.+]{2}$";	
		//	String patternname =  "^(\\91[\\-\\s]?)?[0]?(91)?[789]\\d{9}$";
			
		//^1?\\d{10}$"	
		
		//(\\.[A-Za-z0-9_-]+)*
		
			String Phnonumbervalidation =  "^([a-z]{3}[-.])([a-z]+)*@([a-z]{2}[-.])([a-z]{2}[-.])([a-z]+)*$";
			
	        Pattern regex = Pattern.compile(Phnonumbervalidation);
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the mail: ");
	        String ValidPhonNumber = scanner.nextLine();
	        Matcher emailMatches = regex.matcher(ValidPhonNumber);
	       
	        if (emailMatches.matches()) {
	            System.out.println(ValidPhonNumber + " is valid phone number");
	        } else {
	            System.out.println(ValidPhonNumber + " is invalid phone number ");
	        }
	}
	
}
