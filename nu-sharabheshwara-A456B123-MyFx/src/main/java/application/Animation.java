package application;

import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.util.Duration;

public class Animation {
	
	public Animation() {}
	
	private void fadeOutTransition(Main main, int goToPage) {
		FadeTransition fadeTransition = new FadeTransition();
		fadeTransition.setDuration(Duration.millis(200));
		fadeTransition.setNode(main.pane);
		fadeTransition.setFromValue(1);
		fadeTransition.setToValue(0);
		fadeTransition.play();
		fadeTransition.setOnFinished(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				fadeInTransition(main, goToPage);
			}
		});
	}
	
	public void fadeInTransition(Main main, int goToPage) {
		main.set_pane(goToPage);
		FadeTransition fadeTransition = new FadeTransition();
		fadeTransition.setDuration(Duration.millis(200));
		fadeTransition.setNode(main.pane);
		fadeTransition.setFromValue(0);
		fadeTransition.setToValue(1);
		fadeTransition.play();
	}

}
