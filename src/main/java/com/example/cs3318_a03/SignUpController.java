package com.example.cs3318_a03;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class SignUpController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onSubmitButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}