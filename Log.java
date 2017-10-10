/** Author:Javier Bonilla
 *  Applicaton: Login interface that reads users inputs
 *  license: All public
 */

//Import all the imports necessary for javafx
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextInputDialog;
import java.util.Optional;
import java.lang.String;

//Extend the public class to application, so javafx functions correctly
public class Log extends Application {
	@Override
	//after overriding, set up the main argument
	public void start(Stage primaryStage){
	
	//set up TextInputDialog so it reads the users input for "username"
	TextInputDialog one = new TextInputDialog();
	one.setTitle("Snapchat");
	one.setHeaderText("Welcome to Snapchat");
	one.setContentText("Enter Username");
	Optional<String> user = one.showAndWait();
	
	//set up TextInputDialog so it reads the users input for "Password"
	TextInputDialog two = new TextInputDialog();
	two.setTitle("Snapchat");
	two.setHeaderText("Welcome to Snapchat");
	two.setContentText("Enter Password");
	Optional<String> pass = two.showAndWait();
	
	//set up the actual username and password in string variables
	String username = new String("Javiiiee");
	String password = new String("csc200");
	
	//Start of the IfElse statement, create a conditional statement that will read and compare usernames and password
	if(user.get().equals(username)&&(pass.get().equals(password))){
		//Output
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Snapchat");
		alert.setHeaderText("Welcome back Javiiiee");
		alert.show();
	
	//End of the IfElse statemnt if condiotional statement not true
	}else {
		Alert alert = new Alert(AlertType.ERROR);
		alert.setTitle("snapchat");
		alert.setHeaderText("Incorrect username or password, please try again");
		alert.show();
	}
	
	}

}

