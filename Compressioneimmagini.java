package it.edu.iisgubbio.tpsit;
import java.util.Hashtable;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Compressioneimmagini extends Application {
	char matrice[][]= new char [3][3];
	TextField tCompresso = new TextField();
	TextField tNonCompresso = new TextField();
	TextField tPercentuale = new TextField();
	Label eCompresso = new Label("Compresso");
	Label eNonCompresso = new Label("Non compresso");
	Label ePercentuale = new Label("percentuale compress.");
	Button calcola= new Button("calcola");
	GridPane griglia = new GridPane();
	Hashtable<Integer,String> my_dict = new Hashtable<Integer,String>();
	Hashtable<Character,Integer> dict_decimale = new Hashtable<Character,Integer>();
	public void start(Stage primaryStage) {
		griglia.setPadding(new Insets(5, 5, 5, 5));
		griglia.setHgap(15); 
		griglia.setVgap(15);
		
		matrice[0][0]='v';
		matrice[0][1]='b';
		matrice[0][2]='b';
		matrice[1][0]='g';
		matrice[1][1]='g';
		matrice[1][2]='g';
		matrice[2][0]='b';
		matrice[2][1]='v';
		matrice[2][2]='n';

		griglia.add(eCompresso, 0, 0);
		griglia.add(eNonCompresso, 0, 1);
		griglia.add(ePercentuale, 0, 2);
		griglia.add(tCompresso, 1, 0);
		griglia.add(tNonCompresso, 1, 1);
		griglia.add(tPercentuale, 1, 2);
		griglia.add(calcola, 0, 4);

		calcola.setOnAction(e -> controlla());
		
		Scene scena = new Scene(griglia, 400, 270);
		primaryStage.setTitle("Compressione");
		primaryStage.setScene(scena);
		primaryStage.show();
	}

	public void controlla() {
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}
