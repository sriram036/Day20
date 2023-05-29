package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationTest {

    @Test
    public void givenNameShouldReturnCorrectOrNot(){
        System.out.print("\nEnter First Name : ");
        String string = "Sriram";
        Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
        Matcher matcher = pattern.matcher(string);
        System.out.println(string);
        Assertions.assertEquals(true,matcher.matches());
    }
}
