package com.example.cs3318_a03;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SignUpController {
    @FXML
    private Label welcomeText;
    @FXML
    private TextField email;
    @FXML
    private TextField password;

    private String email_val;
    private String password_val;

    @FXML
    protected void onSubmitButtonClick() {
        email_val = email.getText();
        password_val = password.getText();


    }
}