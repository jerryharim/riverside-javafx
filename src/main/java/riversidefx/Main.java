package riversidefx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {

	@Override
	public void start(Stage primary_stage) throws Exception {
		Pane root = FXMLLoader.load(getClass().getResource("/riverside.fxml"));

		primary_stage.initStyle(StageStyle.TRANSPARENT);
		primary_stage.setTitle("Riverside-JavaFx");
		primary_stage.setScene(new Scene(root));
		primary_stage.getScene().setFill(Color.TRANSPARENT);
		primary_stage.show();
	}
	
}
