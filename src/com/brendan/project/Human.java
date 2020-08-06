package com.brendan.project;

public class Human {

	private static int numberOfHumans = 0;
	public String name;
	protected int health = 100;
	private int strength = 3;
	private int intellince = 3;
	private int stealth = 3;
	
	public Human(String name) {
		this.setName(name);
		numberOfHumans++;
	}

	public static int totalHumans() {
		return numberOfHumans;
	}
	
	
	
	public void takeAttack(Human attacker) {
		this.health -= 10 * attacker.strength;
	}
	
	public Human showHealth() {
		System.out.println("This Human has " + this.getHealth() + " Health");
		return this;
	}
	
	public Human sayName() {
		System.out.println("This is " + this.getName());
		return this;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public int getStrength() {
		return strength;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	public int getIntellince() {
		return intellince;
	}
	public void setIntellince(int intellince) {
		this.intellince = intellince;
	}
	public int getStealth() {
		return stealth;
	}
	public void setStealth(int stealth) {
		this.stealth = stealth;
	}	
	
}
