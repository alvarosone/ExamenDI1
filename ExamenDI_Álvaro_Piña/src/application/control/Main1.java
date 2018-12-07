package application.control;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 * 
 * @author 21745694 : �lvaro Pi�a Mart�n
 *
 */


public class Main1 extends Application {
	
	/** se deber�a abrir la aplicaci�n con este m�todo pero no se abre,
	 * no se que clase de error habr�, pero ten�a la clase principal exactamente igual 
	 * y se me abr�a la aplicaci�n */
	
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
