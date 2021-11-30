package com.example.cs3318_a03;

public class NoDigitPasswordException extends Exception{
    NoDigitPasswordException(String message){
        super(message);
    }
}