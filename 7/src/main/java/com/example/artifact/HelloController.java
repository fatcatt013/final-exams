package com.example.artifact;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label output;
    @FXML
    private TextField retezecInput;
    @FXML
    private TextField nasobitelInput;
    @FXML
    private TextField submitBtn;

    @FXML
    public void submit(){
        int nasobitelNum = Integer.parseInt(nasobitelInput.getText());
        String text = retezecInput.getText();
        for (int i = 0; i < nasobitelNum - 1; i ++){
            text += retezecInput.getText();
        }

        output.setText(text);
    }
}