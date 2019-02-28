import java.io.FileNotFoundException;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class GUI extends Application {

	static AccountBag ab = new AccountBag();

	public static void main(String[] args) throws FileNotFoundException {
		// NameWarehouse contructor loads all usernames
		// & passwords from the text files and randomizes them
		NameWarehouse nw = new NameWarehouse(ab);

		launch(args);
	}

	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("User Login System");

		Scene openingScene;

		Label greeting = new Label("Hello! Please Login:");
		Label usernameLabel = new Label("Username: ");
		Label passwordLabel = new Label("Password: ");

		TextField usernameTF = new TextField();
		usernameTF.setPromptText("username");
		PasswordField passwordTF = new PasswordField();
		passwordTF.setPromptText("password");

		Button registerButton = new Button("Register");
		Button loginButton = new Button("Login");
		Button closeButton = new Button("Exit");

		VBox mainBox = new VBox(30);
		mainBox.setAlignment(Pos.CENTER);
		HBox greetingBox = new HBox(10);
		greetingBox.setAlignment(Pos.CENTER);
		HBox usernameBox = new HBox(10);
		usernameBox.setAlignment(Pos.CENTER);
		HBox passwordBox = new HBox(10);
		passwordBox.setAlignment(Pos.CENTER);
		HBox buttonBox = new HBox(50);
		buttonBox.setAlignment(Pos.CENTER);

		greetingBox.getChildren().add(greeting);
		usernameBox.getChildren().addAll(usernameLabel, usernameTF);
		passwordBox.getChildren().addAll(passwordLabel, passwordTF);
		buttonBox.getChildren().addAll(closeButton, registerButton, loginButton);
		mainBox.getChildren().addAll(greetingBox, usernameBox, passwordBox, buttonBox);

		openingScene = new Scene(mainBox, 650, 425);
		primaryStage.setScene(openingScene);
		primaryStage.show();

		registerButton.setOnAction(e -> {
			if (passwordTF.getLength() < 8) {
				System.out.println("Password too short, pleas try again.");
			} else {
				if (!(ab.hasUsername(usernameTF.toString()))) {
					User user = new User(usernameTF.toString(), passwordTF.toString());
					ab.addUser(user);
					System.out.println("New user created with ID #" + user.getId());

				} else {
					System.out.println("Username exists, please pick a new one!");
				}
			}
			usernameTF.clear();
			usernameTF.setPromptText("username");
			passwordTF.clear();
			passwordTF.setPromptText("password");
		});
		loginButton.setOnAction(e -> {
			if (ab.checkPassword(usernameTF.toString(), passwordTF.toString())) {
				System.out.println("Successful Login!");
			} else {
				System.out.println("Login Unsuccessful. Please try again.");
			}
			usernameTF.clear();
			usernameTF.setPromptText("username");
			passwordTF.clear();
			passwordTF.setPromptText("password");
		});
		closeButton.setOnAction(e -> {
			System.exit(0);
		});
	}

}
