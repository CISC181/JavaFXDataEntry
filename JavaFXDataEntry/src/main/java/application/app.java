package application;

import application.controller.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class app extends Application{

	 public static void main(String[] args) {
	        launch(args);
	    }

	    @Override
	    public void start(Stage primaryStage) throws Exception {
	        FXMLLoader loader = new FXMLLoader();
	    	loader = new FXMLLoader(getClass().getResource("/assets/fxml/CustomerInfoView.fxml"));
	    	
	    	CustomerInfoController controller = new CustomerInfoController();
	    	controller.setApp(this);
	        loader.setController(controller);

	        
	        BorderPane bp = loader.<BorderPane>load();
	        

	        //VBox vbox = loader.<VBox>load();


	        Scene scene = new Scene(bp);
	        primaryStage.setScene(scene);
	        
	        
	        primaryStage.show();
	    }
}
