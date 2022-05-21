package riversidefx.atome;


public class Button extends javafx.scene.control.Button {


	public Button(String text) {
		super(text);

		setType(ButtonType.NORMAL);
	}

	public void setType(ButtonType button_type) {
		if (button_type.equals(ButtonType.NORMAL)) update_style_to_normal_button();
	}

	private void update_style_to_normal_button() {
		setStyle("-fx-background-color: #252A30; -fx-text-fill: white;");
	}

}
