package analyse;

public class Poids {
	private float targetWeight; 
	private float currentWeight;
	private float startWeight;
	private long startEpoch;
	private boolean targetReached = false;
	
	public Poids(float targetWeight, float currentWeight, float startWeight) {
		this.targetWeight = targetWeight;
		this.currentWeight = currentWeight;
		this.startWeight = startWeight;
		this.startEpoch = System.currentTimeMillis();
	}

	//Donne le temps en secondes depuis le debut du tracking
	public long timeTrack() {
		long time = (System.currentTimeMillis() - this.getStartEpoch())/1000; 
		long timeDays = time/86400;
		return timeDays;
	}
	
	// Permet de suivre le changement du poids.
	public void poidsChangement() {
		long timeSpent = timeTrack();
		float weightLost = (float) (Math.floor((this.startWeight - this.currentWeight) * 100) / 100);
		if (this.currentWeight <= this.targetWeight) {
			this.setTargetReached(true);
			System.out.println("Target weight reached after " + timeSpent + " days.");
		} else if (this.currentWeight < this.startWeight) {
			System.out.println("You've done well! You've lost " + weightLost + "kg in " + timeSpent + "days.");
		}
	}

	public long getStartEpoch() {
		return startEpoch;
	}


	public boolean isTargetReached() {
		return targetReached;
	}

	public void setTargetReached(boolean targetReached) {
		this.targetReached = targetReached;
	}

}
