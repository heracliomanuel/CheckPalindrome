import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CheckPalindromeApp extends Application {
	
	private TextField nombreText;
	private Button saludarButton;
	private Label saludoLabel;

	
	public void start(Stage primaryStage) throws Exception {

		nombreText = new TextField();
		nombreText.setPromptText("Introduce un sentencia");
		nombreText.setMaxWidth(150);
		
		
		saludoLabel = new Label("No es palindromo / Es palindromo");
		
		saludarButton = new Button("Comprobar");
		saludarButton.setDefaultButton(true);
		saludarButton.setOnAction(e -> onSaludarButtonAction(e));
		
		VBox root = new VBox();
		root.setSpacing(5);
		root.setAlignment(Pos.CENTER);
		root.getChildren().addAll(nombreText, saludarButton,saludoLabel);
		
		
		Scene scene = new Scene(root, 320, 200);
		
		primaryStage.setTitle("CheckPalindrome");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
		
	}
	
	private void onSaludarButtonAction(ActionEvent e) {
		String nombre = nombreText.getText();
		if(EsPalindrome(nombre)) {
			saludoLabel.setText("Es Palindromo");

		saludoLabel.setStyle("-fx-text-fill: green; -fx-font: italic bold 30 consolas;");
		}else {
			saludoLabel.setText("No es Palindromo");

			saludoLabel.setStyle("-fx-text-fill: red; -fx-font: italic bold 30 consolas;");
			}
		
		
		}
	
	
	boolean EsPalindrome(String inputString) {

	    char tabla[];
	    tabla= inputString.toCharArray();
	    String respuesta = "";
	    for(int i=tabla.length-1;i>=0;i--){
	        respuesta=respuesta+tabla[i];
	    }
	    
	    if(inputString.equals(respuesta))
	        return true;
	    else
	        return false;
	    
	}

	public static void main(String[] args) {
		launch(args);
		
	}

}
