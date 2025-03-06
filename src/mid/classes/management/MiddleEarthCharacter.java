package mid.classes.management;

public abstract class MiddleEarthCharacter {

	private String name;
	private Double health;
	private Double power;
	
	public  MiddleEarthCharacter (String name, Double health, Double power)	{
		this.setName(name);
		this.setHealth(health);
		this.setPower(power);
		
		return;
	}
	
	public abstract boolean attack(MiddleEarthCharacter target);
	//a standard attack should be whatever the character's power is
	public abstract String getRace();
	
	
	public void displayInfo() {
		System.out.println("Character [Name: " + name + ", " + this.getRace() + ", Health: " + health + ", Power: " + power + "]");
	}

	//creating getters and setters for making a middle earth character!
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getHealth() {
		return health;
	}
	public void setHealth(Double health) {
		this.health = health;
	}
	public Double getPower() {
		return power;
	}
	public void setPower(Double power) {
		this.power = power;
	}

}
