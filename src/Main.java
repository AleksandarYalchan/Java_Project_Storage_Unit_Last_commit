import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.StorageUnit;
import repositories.StorageUnitRepository;

import java.util.List;
import java.util.StringTokenizer;

public class Main extends Application {

    public static void main(String[] args) {
            launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("fxml/logIn.fxml"));
        primaryStage.setTitle("Storage Unit Project");
        Scene scene=new Scene(root, 422, 400);
        //scene.getStylesheets().add("/sample/style/myTheme.css");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
