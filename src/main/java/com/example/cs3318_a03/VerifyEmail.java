package com.example.cs3318_a03;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VerifyEmail {
    private static String noEmailMsg = "You Must Enter An Email Address!";
    private static String badEmailMsg = "Invalid Email, Enter A Valid Email Address!";
    public static String doTests(String email){
        try{
            verifyInput(email);
            try {
                verifyForm(email);
                return "Valid Email Entered";
            }
            catch(poorlyFormedEmailException x){
                    return badEmailMsg;
                }
        }
        catch(noEmailException e){
            return noEmailMsg;
        }
    }

    public static Boolean verifyInput(String email) throws noEmailException{
        if(email == "") {
            throw new noEmailException("You Must Enter an Email Address");
        }
        return true;
    }

    public static Boolean verifyForm(String email) throws poorlyFormedEmailException{
        String regex = "^(.+)@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        if (pattern.matcher(email).matches()){
            return true;
        }
        else{
            throw new poorlyFormedEmailException("Invalid Email Address");
        }
    }
}
