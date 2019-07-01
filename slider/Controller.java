package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Slider;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller {

    @FXML
    TextArea textArea;

    @FXML
    TextField textField;

    @FXML
    Slider slider;

    public void sendMsg() {
        textArea.appendText(textField.getText() + "\n");
        textField.clear();
        textField.requestFocus();
    }

    public float setTransparent() {
        System.out.println(slider.getValue());
        return (float) slider.getValue();
    }

}
