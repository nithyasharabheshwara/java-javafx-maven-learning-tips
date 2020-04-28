package application;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;

import java.io.IOException;

import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

public class LogInController {

	@FXML
	private TextField nameInput;
	@FXML
	private AnchorPane logInWindow_1;
	public Main main;
	public User user;

	@FXML
	public void getUserNameInput() throws IOException {
		String text = nameInput.getText();
		if (text.isBlank()) {
			nameInput.getStyleClass().add("missing");
			return;
		} else {
			nameInput.getStyleClass().remove("missing");
			this.user = new User();
			user.setName(nameInput.getText());
			Animation anim = new Animation();
			anim.fadeInTransition(main, 1);
		}
	}
}
