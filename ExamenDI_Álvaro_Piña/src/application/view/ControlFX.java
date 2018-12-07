package application.view;

import java.io.IOException;

import application.control.Main1;
import javafx.animation.FadeTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;

public class ControlFX {
	
	public AnchorPane page;
	public Scene scene;
	public Stage sendStage;
	
	public void showSendProfile() {
		try {

			/** no funciona el métodp para abrir la otra pantalla,
			 * aunque creo que está bien creado */
            
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main1.class.getResource("../view/GetMe.fxml"));
            AnchorPane page = (AnchorPane) loader.load();
            Stage sendStage = new Stage();
            sendStage.setTitle("Send Login");
            Scene scene = new Scene(page);
            sendStage.setScene(scene);
            
            
            sendStage.show();		

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	

	private ImageView profile;
		
	/** el método para que la imágen haga un fade in no me funciona */
	
	public void initialize() {
			
	profile.setVisible(false);
			
	FadeTransition fadeTransition = new FadeTransition(Duration.seconds(1),
			profile);
	fadeTransition.setFromValue(0);
	fadeTransition.setToValue(1);
	fadeTransition.play();

	}
	
	/** método para abrir la segunda ventana */
	
	@FXML
	private void handleSend() {
		showSendProfile();
	}
	
	/** método para cerrar la segunda ventana */
	
	@FXML
	private void handleClose() {
		System.exit(0);
	}

}
