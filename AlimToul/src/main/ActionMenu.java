package main;

public class ActionMenu extends Menu {
	private User chosenUser;
	

	public ActionMenu(User chosenUser) {
		super();
		this.chosenUser = chosenUser;
	}
	
	
	@Override
	public void mainMenu() {
		int response;
		System.out.println("Welcome " + this.chosenUser.getName() + "!");
		System.out.println("What would you like to do?");
		System.out.println("[1] Diet options");
		System.out.println("[2] Weight management");
		response = Integer.parseInt(this.inputOutput(null));
		while (response != 2 && response != 1) {
			response = Integer.parseInt(this.inputOutput("Please choose between the possible options!"));
		}
		if (response == 1) {
			System.out.println("TO BE COMPLETED");
		} else if (response == 2) {
			WeightManagementMenu weightMenu = new WeightManagementMenu();
			weightMenu.mainMenu();
		}
	}

	public User getChosenUser() {
		return chosenUser;
	}

	
}
