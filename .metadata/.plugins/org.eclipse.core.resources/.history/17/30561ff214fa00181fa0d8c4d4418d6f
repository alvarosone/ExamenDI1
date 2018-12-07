package application.control;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 * 
 * @author 21745694 : Álvaro Piña Martín
 *
 */


public class Main1 extends Application {
	
	/** se debería abrir la aplicación con este método pero no se abre,
	 * no se que clase de error habrá, pero tenía la clase principal exactamente igual 
	 * y se me abría la aplicación */
	
    public void start(Stage primaryStage) throws Exception{

        FXMLLoader loader =new FXMLLoader(getClass().getResource("../view/MyProfile.fxml"));
        AnchorPane pane=loader.load();
        Scene scene=new Scene(pane);
        scene.getStylesheets().addAll(getClass().getResource("../view/application.css").toExternalForm());
        primaryStage.setTitle("My profile");
                Font.loadFont(getClass().getResourceAsStream("../view/assets/PoiretOne-Regular.ttf"), 20);
                scene.getStylesheets().add("http://fonts.googleapis.com/css?family=Shadows+Into+Light");
        primaryStage.setScene(scene);
        primaryStage.show();

	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
