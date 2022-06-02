package riversidefx.organism;

import javafx.fxml.FXMLLoader;


public abstract class Component<T> {

	protected T root; 
	private final String view_path;

	public Component(String view_path) {
		this.view_path = view_path;
	}

	public void load_view() {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource( view_path ));
			this.root = loader.load();
			System.out.println("ROOT : " + this.root);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public T getRoot() {
		return root;
	}

}

