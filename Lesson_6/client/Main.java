package Lesson_6.client;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        FXMLLoader loader = new FXMLLoader(getClass().getResource("sample.fxml"));
        Parent root = loader.load();
        primaryStage.setTitle("Chat 2k19");
        Scene scene = new Scene(root, 310, 350);
        primaryStage.setScene(scene);
        primaryStage.show();

        Controller controller = loader.getController();

        primaryStage.setOnCloseRequest(new EventHandler<WindowEvent>() {
            @Override
            public void handle(WindowEvent windowEvent) {

                if (!controller.getSocket().isClosed())
                    controller.sendOffline();

            }
        });
    }


    public static void main(String[] args) {

        launch(args);
    }
}
