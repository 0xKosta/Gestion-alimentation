package main;

import java.util.*;
import java.text.*;

public class User {
	private float weight;
	private float height;
	private String name;
	private String creationTime;
	private int weightGoal;
	private int startWeight;
	
	//TODO Figure out how to load weightGoal and startWeight
	
	public User(float weight, float height, String name) {
		this.weight = weight;
		this.height = height;
		this.name = name;
		this.creationTime = epochToDate(System.currentTimeMillis());
	}
	
	public String epochToDate(long epoch) {
		Date date = new Date(epoch);
		DateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		format.setTimeZone(TimeZone.getTimeZone("GMT+1"));
		String formatted = format.format(date);
		return formatted;
	}

	public int getWeightGoal() {
		return weightGoal;
	}

	public void setWeightGoal(int weightGoal) {
		this.weightGoal = weightGoal;
	}

	public int getStartWeight() {
		return startWeight;
	}

	public void setStartWeight(int startWeight) {
		this.startWeight = startWeight;
	}

	public float getWeight() {
		return weight;
	}


	public void setWeight(int weight) {
		this.weight = weight;
	}


	public float getHeight() {
		return height;
	}


	public String getName() {
		return name;
	}


	public String getCreationTime() {
		return creationTime;
	}
	

	@Override
	public String toString() {
		return "User [weight=" + weight + ", height=" + height + ", name=" + name + ", creationTime=" + creationTime
				+ "]";
	}
	
	
	
}
