package riversidefx.organism;

import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.Node;
import javafx.scene.Parent;


public class Window extends Component<BorderPane> {

	public Window() {
		super("/fxml/window.fxml");
	}

	public void setCenter(Pane node) {
		if (this.root == null) throw new IllegalStateException("Please call load_view method first");

		node.setMaxWidth(Double.MAX_VALUE);
		node.setMaxHeight(Double.MAX_VALUE);
		this.root.setCenter( node );
	}

	public void setRight(Pane node) {
		if (this.root == null) throw new IllegalStateException("Please call load_view method first");

		node.setMaxWidth(Double.MAX_VALUE);
		node.setMaxHeight(Double.MAX_VALUE);
		this.root.setRight( node );
	}

}
