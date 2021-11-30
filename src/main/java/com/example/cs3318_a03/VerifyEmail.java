package com.example.cs3318_a03;

public class VerifyEmail {
    public static String verify(String email){
        if(email == ""){
            return "Email Entry Required!";
        }
        return "Success! Email Passed All Tests!";
    }
}
