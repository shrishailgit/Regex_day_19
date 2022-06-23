package com.birdgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UC6_Oneuppercasevalidation {

	
	public static void main(String[] args) {
		
		//String Phnonumbervalidation =  "^([a-z]{3}[-.])([a-z]+)*@([a-z]{2}[-.])([a-z]{2}[-.])([a-z]+)*$";
		
      //  String predefinedpassword =  "^(?=.*[0-9]){0,2}(?=.*[a-z]){0,2}(?=.*[A-Z]{1})(?=.*[!@#&()–[{}]:;',?/*~$^+=<>])$";
		
		String oneuppercasevalidation = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]){1}(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{0,}$";
		
		Pattern regex = Pattern.compile(oneuppercasevalidation);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter password: ");
        String Validpassword = scanner.nextLine();
        Matcher emailMatches = regex.matcher(Validpassword);
       
        if (emailMatches.matches()) {
            System.out.println(Validpassword + " is valid password");
        } else {
            System.out.println(Validpassword + " is invalid password ");
        }
    }
		
}
	
	

