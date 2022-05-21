import javafx.application.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;
import javafx.event.*;
import java.io.*;
import java.util.*;

public class Main extends Application implements EventHandler<ActionEvent>{
	
	Label name;
	Label id;
	TextField n;
	TextField i;
	Button save;
	Button get;
	
	
	public static void main(String args[]) throws Exception{
		launch(args);
	}
	
	public void start(Stage stage) throws Exception{
		
		name = new Label("Name : ");
		id = new Label("ID : ");
		
		n = new TextField();
		i = new TextField();
		
		save = new Button("Save");
		save.setOnAction(this);
		get = new Button("Get");
		get.setOnAction(this);
		
		HBox h1 = new HBox();
		h1.setSpacing(10);
		h1.getChildren().add(name);
		h1.getChildren().add(n);
		h1.getChildren().add(id);
		h1.getChildren().add(i);
		
		HBox h2 = new HBox();
		h2.setSpacing(10);
		h2.setAlignment(Pos.CENTER);
		h2.getChildren().add(save);
		h2.getChildren().add(get);
		
		VBox v = new VBox();
		v.setPadding(new Insets(10,10,10,10));
		v.setSpacing(30);
		v.getChildren().add(h1);
		v.getChildren().add(h2);
		
		Scene s = new Scene(v,400,150);
		stage.setTitle("Title");
		stage.setScene(s);
		stage.show();
		
	}
	
	public void handle(ActionEvent event){
		if(event.getSource() == save){
			try{
				File file = new File("Test.txt");
				PrintWriter output = new PrintWriter(file);
				
				output.println(n.getText());
				output.println(i.getText());
				output.close();
			}
			catch(Exception e){
				
			}
		}
		else if(event.getSource() == get){
			try{
				File file = new File("Test.txt");
				Scanner input = new Scanner(file);
				
				while(input.hasNext()){
					String n = input.next();
					int i = input.nextInt();
				}
				System.out.println("Name: "+n+" ID: "+i);
				input.close();
				
			}
			catch(Exception e){
				
			}
		}
	}
	
	public static void save() throws Exception{
		
	}
}
