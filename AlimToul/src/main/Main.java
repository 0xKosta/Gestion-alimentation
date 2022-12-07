package main;

public class Main {

	public static void main(String[] args) {
		User user = new User(64f, 174f, "TestUser");
		System.out.println(user.getCreationTime());
		System.out.println(user.getName());
		System.out.println(user.getWeight());
		System.out.println(user.getHeight());
		System.out.println(user);
		
		Menu menu = new Menu();
		menu.mainMenu();
	}

}
