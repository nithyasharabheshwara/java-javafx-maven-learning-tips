package application;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;

public class Main extends Application {

    public Stage primaryStage;
    public FXMLLoader loader;
    public static AnchorPane pane;
    public static List<AnchorPane> grid = new ArrayList<AnchorPane>();
    static int idx_cur = 0;

    @Override
    public void start(Stage primaryStage) throws IOException {
        this.primaryStage = primaryStage;
        primaryStart();
    }

    public void primaryStart() throws IOException {
        pane = (AnchorPane) FXMLLoader.load(getClass().getResource("LogInAnchor.fxml"));
        grid.add((AnchorPane) FXMLLoader.load(getClass().getResource("LogIn.fxml")));
        grid.add((AnchorPane) FXMLLoader.load(getClass().getResource("LogIn2.fxml")));
        pane.getChildren().add(grid.get(0));
        Scene scene = new Scene(pane);
        scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.setTitle("Test");
        primaryStage.show();
    }

    public static void set_pane(int idx) {
        pane.getChildren().remove(grid.get(idx_cur));
        pane.getChildren().add(grid.get(idx));
        idx_cur = idx;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
