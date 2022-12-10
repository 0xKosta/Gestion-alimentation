package main;

public class DietOptionsMenu extends Menu{
	private User chosenUser;

	public DietOptionsMenu(User chosenUser) {
		this.chosenUser = chosenUser;
	}

	public User getChosenUser() {
		return chosenUser;
	}
	
	//TODO Finish Diet options Menu
	@Override
	public void mainMenu() {
		System.out.println("[DIET OPTIONS MENU]");
		System.out.println("What would you like to do?");
		System.out.println("[1] Nutritional value lookup");
		System.out.println("[2] Current diet");
		System.out.println("[3] ");
	}

}
