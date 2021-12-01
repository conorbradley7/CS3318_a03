package com.example.cs3318_a03;

import java.util.regex.Pattern;

public class VerifyPassword {
        private static String noPasswordMsg = "You Must Enter A Password!";
        private static String badPasswordMsg = "Invalid Password! Password Must Contain At Least 1 Letter, 1 Number " +
                "And One Of The Following Special Characters (*^&@!.). ";
    private static String shortPasswordMessage = "Password Too Short! Password Must Be At Least 7 Characters Long. ";
        public static String doTests(String password) {
            try {
                verifyInput(password);
                try {
                    shortPassword(password);
                    try {
                        noDigits(password);

                        try {
                            noLetters(password);
                            try {
                                noSpecials(password);
                                return "";
                            } catch (NoSpecialPasswordException a) {
                                return badPasswordMsg;
                            }
                        } catch (NoLetterPasswordException z) {
                            return badPasswordMsg;
                        }

                    } catch (NoDigitPasswordException y) {
                        return badPasswordMsg;
                    }
                } catch (ShortPasswordException x) {
                    return shortPasswordMessage;
                }
            } catch (NoPasswordException e) {
                return noPasswordMsg;
            }
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

    public static Boolean noSpecials(String password) throws NoSpecialPasswordException {
        String regex = "^.*[*^&@!.].*$";
        Pattern pattern = Pattern.compile(regex);
        if (pattern.matcher(password).matches()) {
            return true;
        } else {
            throw new NoSpecialPasswordException("Password Must Contain At Least 1 Special Character (*^&@!.)");
        }
    }
}
