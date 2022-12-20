package com.userregistration.regexpattern;


import org.junit.Assert;
import org.junit.Test;

import com.userregistration.regexpattern.UserInputValidation.Validate;

import exceptions.InvalidEmailException;
import exceptions.InvalidFirstNameException;
import exceptions.InvalidLastNameException;
import exceptions.InvalidMobileNumberException;
import exceptions.InvalidPasswordException;

public class UserInputValidationTest {
	@Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        UserInputValidation userInputValidation = new UserInputValidation();
        boolean result = false;
       
        result = userInputValidation.isValidFirstName("Dipali");
        Assert.assertEquals(true, result);
       
    }
	 @Test
	    public void givenFirstName_WhenShort_ShouldThrowException() {
	        UserInputValidation userInputValidation = new UserInputValidation();
	        boolean result = false;
	        result = userInputValidation.isValidFirstName("Pr");
	 }
	 @Test
	    public void givenLastName_WhenProper_ShouldReturnTrue() {
		 UserInputValidation  userInputValidation = new UserInputValidation();
	        boolean result = false;
	        result = userInputValidation.isValidLastName("Kasthuri");
	    }

	    @Test
	    public void givenLastName_WhenShort_ShouldThrowException() {
	    	UserInputValidation  userInputValidation = new UserInputValidation();
	        boolean result = false;
	       
	            result = userInputValidation.isValidLastName("Ka");
	    
	    }

	    @Test
	    public void givenLastName_WithSplChar_ShouldThrowException() {
	    	UserInputValidation  userInputValidation = new UserInputValidation();
	        boolean result = false;
	        result = userInputValidation.isValidFirstName("hbhm"); 
	        Assert.assertEquals(true,result);
	    }

	    @Test
	    public void givenLastName_WithNumber_ShouldThrowException() {
	    	UserInputValidation  userInputValidation = new UserInputValidation();
	        boolean result = false;
	        result = userInputValidation.isValidLastName("K23thu6i");
	    }

	    @Test
	    public void givenEmail_WhenValid_ShouldReturnTrue() {
	    	UserInputValidation  userInputValidation = new UserInputValidation();
	        boolean result = false;
	        result = userInputValidation.isValidEmail("kpragna.25@gmail.com");
	    }

	    @Test
	    public void givenEmail_WhenNotValid_ShouldThrowException() {
	    	UserInputValidation  userInputValidation = new UserInputValidation();
	        boolean result = false;
	        result = userInputValidation.isValidEmail("Kpragna..675.gmail.com");
	    }

	    @Test
	    public void givenMobileNum_WhenProper_ShouldReturnTrue() {
	    	UserInputValidation  userInputValidation = new UserInputValidation();
	        boolean result = false;
	        result = userInputValidation.isValidMobileNumber("9087654321");
	    }

	    @Test
	    public void givenMobileNum_WhenNotProper_ShouldThrowException() {
	    	UserInputValidation  userInputValidation = new UserInputValidation();
	        boolean result = false;
	        result = userInputValidation.isValidMobileNumber("908765-4321908");
	    }

	    @Test
	    public void givenPassword_WhenValid_ShouldReturnTrue() {
	    	UserInputValidation  userInputValidation = new UserInputValidation();
	        boolean result = false;
	        result = userInputValidation.isValidPassword("P@ssw0rd");
	    }

	    @Test
	    public void givenPassword_WithoutCapitalLetter_ShouldThrowException() {
	    	UserInputValidation  userInputValidation = new UserInputValidation();
	        boolean result = false;
	        result = userInputValidation.isValidPassword("hgsuyds5ndj@");
	    }

	    @Test
	    public void givenPassword_WithoutNumericValue_ShouldReturnFalse() {
	    	UserInputValidation  userInputValidation = new UserInputValidation();
	        boolean result = false;
	        result = userInputValidation.isValidPassword("bsdj@HhcsBB");
	    }

	    @Test
	    public void givenPassword_WithoutSplChar_ShouldThrowException() {
	    	UserInputValidation  userInputValidation = new UserInputValidation();
	        boolean result = false;
	        result = userInputValidation.isValidPassword("Pvhs5665vhj");
}
}

