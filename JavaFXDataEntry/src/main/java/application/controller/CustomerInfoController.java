package application.controller;

import application.app;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class CustomerInfoController {

	private app App;

	public app getApp() {
		return App;
	}

	public void setApp(app app) {
		App = app;
	}
	
    @FXML
    public void buttonClicked(Event e){
        System.out.println("Button clicked");
    }
}
