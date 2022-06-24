package com.birdgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UC9_SampleEmails {

	public static void main(String[] args) {
		
		// all Sample Emails to Test
		
				//1st one	
				String sampleemailtest =  "^([a-z]){3}@([a-z]{5}[-.])([a-z]{3}[-,])*$";
				 
				//2nd  is done
				String sampleemailtest =  "^([a-z]){3}([-])([0-9]){3}@([a-z]{5}[-.])([a-z]{3}[-,])*$";
				
				//3rd is done
				String sampleemailtest =  "^([a-z]){3}([-.])([0-9]){3}@([a-z]{5}[-.])([a-z]{3}[-,])*$";
				
				//4th one
				
				 String sampleemailtest =  "^([a-z]){3}([0-9]){3}@([a-z]{3}[-.])([a-z]{3}[-,])*$";
				
				//5th one
				
				String sampleemailtest =  "^([a-z]){3}([-.])([0-9]){3}@([a-z]{3}[-.])([a-z]{2}[-,])*$";
				
				// 6th one
				
				String sampleemailtest =  "^([a-z]){3}([-.])([0-9]){3}@([a-z]{3}[-.])([a-z]{3})*$";
				
				// 7th one
				
				String sampleemailtest =  "^([a-z]){3}@([0-9]){1}([-.])([a-z]{3}[-,])*$";
				
				//8th one
				
				String sampleemailtest =  "^([a-z]){3}([+])([0-9]){1}([-.])([a-z]{3})*$";
				
				Pattern regex = Pattern.compile(sampleemailtest);
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter email: ");
		        String Validemail = scanner.nextLine();
		        Matcher emailMatches = regex.matcher(Validemail);
		       
		        if (emailMatches.matches()) {
		            System.out.println(Validemail + " is valid password");
		        } else {
		            System.out.println(Validemail + " is invalid password ");
		        }
		    }
		

		
	}
	

