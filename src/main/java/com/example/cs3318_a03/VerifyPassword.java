package com.example.cs3318_a03;

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
}
