package com.birdgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UC5_PreDefinedPassword {

	public static void main(String[] args) {
		
        String predefinedpassword =  "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8}$";
		
        Pattern regex = Pattern.compile(predefinedpassword);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter password: ");
        String Validpredefinedpassword = scanner.nextLine();
        Matcher emailMatches = regex.matcher(Validpredefinedpassword);
       
        if (emailMatches.matches()) {
            System.out.println(Validpredefinedpassword + " is valid password");
        } else {
            System.out.println(Validpredefinedpassword + " is invalid password ");
        }
      }
		
	}
	

