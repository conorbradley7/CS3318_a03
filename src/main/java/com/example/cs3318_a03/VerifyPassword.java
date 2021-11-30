package com.example.cs3318_a03;

import java.util.regex.Pattern;

public class VerifyPassword {
        private static String noPasswordMsg = "You Must Enter A Password!";
        public static String doTests(String password) {
            try {
                verifyInput(password);
            } catch (NoPasswordException e) {
                return noPasswordMsg;
            }
            return "Password Passed All Checks!";
        }

    public static Boolean verifyInput(String password) throws NoPasswordException {
        if(password == "") {
            throw new NoPasswordException("You Must Enter a Password Address");
        }
        return true;
    }

    public static Boolean shortPassword(String password) throws ShortPasswordException {
        if (password.length()<7){
            throw new ShortPasswordException("Password Must Be At Least 7 Characters");
        }
        return true;
    }

    public static Boolean noLetters(String password) throws NoLetterPasswordException {
        String regex = "^.*[a-zA-Z].*$";
        Pattern pattern = Pattern.compile(regex);
        if (pattern.matcher(password).matches()) {
            return true;
        } else {
            throw new NoLetterPasswordException("Password Must Contain At Least 1 Letter");
        }
    }

    public static Boolean noDigits(String password) throws NoDigitPasswordException {
        String regex = "^.*[0-9].*$";
        Pattern pattern = Pattern.compile(regex);
        if (pattern.matcher(password).matches()) {
            return true;
        } else {
            throw new NoDigitPasswordException("Password Must Contain At Least 1 Letter");
        }
    }
}
