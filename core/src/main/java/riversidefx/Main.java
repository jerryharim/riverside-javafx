package riversidefx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import riversidefx.atome.Button;
import riversidefx.organism.*;

public class Main extends Application {

	@Override
	public void start(Stage primary_stage) throws Exception {

		Window root = new Window();
		root.load_view();

		Central central = new Central();
		central.load_view();

		RightSide rightSide = new RightSide();
		rightSide.load_view();

		root.setCenter( central.getRoot() );
		root.setRight( rightSide.getRoot() );

		primary_stage.initStyle(StageStyle.TRANSPARENT);
		primary_stage.setTitle("Riverside-JavaFx");
		primary_stage.setScene(new Scene( root.getRoot() ));
		primary_stage.getScene().setFill(Color.TRANSPARENT);
		primary_stage.show();
	}
	
}
