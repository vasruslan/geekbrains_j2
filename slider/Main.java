package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("geekbrains chat");

        Scene scene = new Scene(root,   500, 450);

        Controller controller = loader.getController();
        primaryStage.setScene(scene);
        primaryStage.show();


    }


    public static void main(String[] args) {

        launch(args);
    }
}
