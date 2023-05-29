package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationTest {

    @Test
    public void givenMobileNumberShouldReturnCorrectOrNot(){
        System.out.print("\nEnter Mobile Number : ");
        String mobileNumber = "911234567890";
        Pattern pattern = Pattern.compile("^91[0-9]{10}$");
        Matcher matcher = pattern.matcher(mobileNumber);
        System.out.println(mobileNumber);
        Assertions.assertEquals(true,matcher.matches());
    }
}
