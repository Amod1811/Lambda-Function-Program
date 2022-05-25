package com.bl.lambdafunction;

public class UserRegistrationMain {
/*
 * use functional interface and Lambda function for userRegistration form to check user detail valid or invalid
 */
	public static void main(String[] args) {
		 System.out.println(" -------- Welcome to User Registration Lambda Function-------");

	        UserRegistration userRegistration = new UserRegistration();
	        userRegistration.validateFirstName();
	        System.out.println();

	        userRegistration.validateLastName();
	        System.out.println();

	        userRegistration.validateEmail();
	        System.out.println();

	        userRegistration.validatePhoneNo();
	        System.out.println();

	        userRegistration.validatePassword();
	    

	}

}
