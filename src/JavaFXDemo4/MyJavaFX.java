package JavaFXDemo4;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import javax.swing.JOptionPane;

public class MyJavaFX extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        HBox pane = new HBox(10);
        pane.setAlignment(Pos.CENTER);
        Button btOK = new Button("OK");
        Button btCancel = new Button("Cancel");
        OKHandlerCLass handler1 = new OKHandlerCLass();
        btOK.setOnAction(handler1);
        CancelHandlerClass handler2 = new CancelHandlerClass();
        btCancel.setOnAction(handler2);
        pane.getChildren().addAll(btOK, btCancel);

        Scene scene = new Scene(pane);
        primaryStage.setTitle("Event Handling Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

class OKHandlerCLass implements EventHandler<ActionEvent> {
    @Override
    public void handle(ActionEvent e) {
        JOptionPane.showMessageDialog(null,"OK Clicked.");
    }
}

class CancelHandlerClass implements EventHandler<ActionEvent> {
    @Override
    public void handle(ActionEvent e) {
        JOptionPane.showMessageDialog(null,"Cancel Clicked.");
    }
}