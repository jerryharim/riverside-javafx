package riversidefx.window;

import javafx.scene.Parent;
import javafx.fxml.FXMLLoader;


public class Window {

	public Parent load() {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/riverside.fxml"));
			return loader.load();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
