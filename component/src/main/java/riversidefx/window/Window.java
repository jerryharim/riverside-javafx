package riversidefx.window;

import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;


public class Window {

	private BorderPane root; 


	public void load_view() {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/window.fxml"));
			this.root = loader.load();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	public void setCenter(Node node) {
		if (this.root == null) throw new IllegalStateException("Please call load_view method first");
		this.root.setCenter( node );
	}


	public BorderPane getRoot() {
		return root;
	}


}
