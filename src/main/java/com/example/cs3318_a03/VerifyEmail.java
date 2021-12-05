package com.example.cs3318_a03;

import java.util.regex.Pattern;

public class VerifyEmail {
    private static String noEmailMsg = "You Must Enter An Email Address!";
    private static String badEmailMsg = "Invalid Email, Enter A Valid Email Address!";
    public static String doTests(String email){
        try{
            verifyInput(email);
            try {
                verifyForm(email);
                return "";
            }
            catch(PoorlyFormedEmailException x){
                    return badEmailMsg;
                }
        }
        catch(NoEmailException e){
            return noEmailMsg;
        }
    }

    public static Boolean verifyInput(String email) throws NoEmailException {
        if(email == "") {
            throw new NoEmailException("You Must Enter an Email Address");
        }
        return true;
    }

    public static Boolean verifyForm(String email) throws PoorlyFormedEmailException {
        String regex = "^^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
        Pattern pattern = Pattern.compile(regex);
        if (pattern.matcher(email).matches()){
            return true;
        }
        else{
            throw new PoorlyFormedEmailException("Invalid Email Address");
        }
    }
}
