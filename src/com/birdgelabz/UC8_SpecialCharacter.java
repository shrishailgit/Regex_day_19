package com.birdgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UC8_SpecialCharacter {

	public static void main(String[] args) {
		
		
		
		String specialcharactervalidation = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]){1}.{0,}$";
		
		Pattern regex = Pattern.compile(specialcharactervalidation);
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

