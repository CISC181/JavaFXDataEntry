package application.controller;

import application.app;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CustomerInfoController {

	
	@FXML
	private TextField txtFirstName;
	
	private app App;

	public app getApp() {
		return App;
	}

	public void setApp(app app) {
		App = app;
	}
	
    @FXML
    public void buttonSubmit(Event e){
        System.out.println(txtFirstName.getText());
    }
}
