package com.birdgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UC1_FirstNameValidation {

	public static void main(String[] args) {
		
				//String patternname ="[a-zA-Z]{3,}";
			    //String patternname = "^[A-Z][a-zA-Z]{3,}(?: [A-Z][a-zA-Z]*){0,2}$";
				
				String patternname = "^[A-Z][a-zA-Z]{3}[a-z]{2,}$";
				Pattern regex = Pattern.compile(patternname);
				Scanner scanner = new Scanner(System.in);
				System.out.print("Enter the first name : ");
			    String Firstname = scanner.nextLine();
			    Matcher firstNameMatcher = regex.matcher(Firstname);
			    if (firstNameMatcher.matches()) {
			            System.out.println(Firstname + " is valid First name.");
			    } else {
			            System.out.println(Firstname + " is invalid First name");
			    }
				
			       
			}
	}
	

