package management;

import main.User;

//TODO Rework WeightManagement.
public class WeightManagement {
	private User chosenUser;
	private float weightGoal;
	
	public WeightManagement(User chosenUser) {
		this.chosenUser = chosenUser;
	}
		
	public void weightManagementMenu() {
		
	}

	public float getWeightGoal() {
		return weightGoal;
	}

	public void setWeightGoal(float weightGoal) {
		this.weightGoal = weightGoal;
	}
	
	
}
