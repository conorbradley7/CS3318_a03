package com.example.cs3318_a03;

public class VerifyEmail {
    private static String noEmailMsg = "You Must Enter An Email Address!";
    public static String doTests(String email){
        try{
            verifyInput(email);
            return "Email Has been entered";
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
}
