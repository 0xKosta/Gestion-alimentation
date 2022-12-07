package main;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Menu {
	private User[] users;
	private int nbUsers = 6;
	
	public Menu() {
		this.users = loadSavedUsers();
	}
	
	
	public User[] getUsers() {
		return users;
	}



	public int getNbUsers() {
		return nbUsers;
	}


	private User[] loadSavedUsers() {
		User[] savedUsers = new User[10];
		int i;
		for (i = 0; i < 6; i++) {
			User tempUser = new User(64.0f, 174.0f, "TestUser " + i);
			savedUsers[i] = tempUser;
		}
		this.nbUsers = i;
		return savedUsers;
	}
	
	public void displayUsers() {
		for (int i = 0; i < nbUsers; i++) {
			System.out.println("[" + (i+1) + "] " + users[i].getName());
		}
	}
	
	public void addUserToList(User user) {
		this.users[this.nbUsers] = user;
		this.nbUsers++;
	}
	
	private User chooseUser() {
		int userChosen;
		System.out.println("Saved users: ");
		this.displayUsers();
		System.out.println("[0] Back to main menu.");
		userChosen = Integer.parseInt(inputOutput("Please choose the user you want: "));
		while (0 > userChosen || userChosen > this.nbUsers) {
			userChosen = Integer.parseInt(inputOutput("Please choose a number between 1 and " + (this.nbUsers)));
		}
		if (userChosen == 0) {
			this.mainMenu();
			return null;
		}
		return users[userChosen-1];
	}
	
	private void createUser() {
		String newUserName;
		float newUserWeight;
		float newUserHeight;
		newUserName = inputOutput("Please input your name: ");
		newUserWeight = Float.parseFloat(inputOutput("Please input your weight in kilograms: "));
		newUserHeight =	Float.parseFloat(inputOutput("Please input your height in centimeters: "));
		User newUser = new User(newUserWeight, newUserHeight, newUserName);
		System.out.println("User " + newUser.getName() + " with the following parameters: ");
		System.out.println("Weight: " + newUser.getWeight() + ", Height: " + newUser.getHeight());
		System.out.println("Object toString=" + newUser);
		System.out.println("Created succesfully!");
		this.addUserToList(newUser);
		this.mainMenu();
	}
	
	 protected String inputOutput(String message) {
		 if (message != null) {
		 	System.out.println(message);
		 }
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 String returnString = "";
		 try {
		     returnString = br.readLine();
		 }
		 catch (IOException e){
		     System.out.println("Error reading value.");
		     mainMenu();
		 }
		 return returnString;
	 }
	
	public void mainMenu() {
		User chosenUser;
		int response;
		System.out.println("Would you like to choose an existing user or create a new one?");
		System.out.println("[1] Choose existing user.");
		System.out.println("[2] Create new user.");
		do {
			response = Integer.parseInt(inputOutput(null));
		} while (response != 1 && response != 2);
		if (response == 2) {
			this.createUser();
		} else if (response == 1) {
			chosenUser = this.chooseUser();
			if (chosenUser != null) {
				ActionMenu actionMenu = new ActionMenu(chosenUser);
				actionMenu.mainMenu();
			}
		}
		
	}		
}


