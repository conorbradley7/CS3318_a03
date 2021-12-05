package com.example.cs3318_a03;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SignUpController {
    @FXML
    private Label emailError;
    @FXML
    private Label passwordError;
    @FXML
    private Label successMsg;
    @FXML
    private TextField email;
    @FXML
    private TextField password;

    private String email_val;
    private String password_val;

    @FXML
    protected void onSubmitButtonClick() throws NoEmailException {
        successMsg.setText("");
        email_val = email.getText();
        String emailMsg = VerifyEmail.doTests(email_val);
        password_val = password.getText();
        String passwordMsg = VerifyPassword.doTests(password_val);
        emailError.setText(emailMsg);
        passwordError.setText(passwordMsg);
        if(emailMsg == "" && passwordMsg == ""){
            successMsg.setText("Congratulations! You have successfully signed up!");
        }

    }
}