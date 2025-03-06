package mid.classes.subclasses;

import mid.classes.management.MiddleEarthCharacter;

public class WizardCharacter extends MiddleEarthCharacter{
	/**
	 * attacks another Middle Earth Character
	 * 
	 * No effect on Human and Wizard.
	 * 1.5x damage vs Dwarf.
	 * Normal damage against ELF and ORC.
	 * 
	 * @param target character being attacked.	
	 * @return returns true if attack successful, else false.
	 */
	@Override
	public boolean attack(MiddleEarthCharacter target) {
		double hp = 0; 
		System.out.println(this.getName() + " is attacking...");
		
		if( target instanceof DwarfCharacter){
			hp = 1.5*this.getPower();
			hp = target.getHealth()-hp;
			target.setHealth(hp);
			
			System.out.println(this.getName() + "");
			return true;}
		
		if( target instanceof HumanCharacter  | target instanceof WizardCharacter ){
			System.out.println("The attack was unsuccessful... ");
			return false;}
		
		if( target instanceof ElfCharacter  | target instanceof OrcCharacter ){
			hp = this.getPower();
			hp = target.getHealth()-hp;
			target.setHealth(hp);
			
			System.out.println("Attack Successful! ");
			return true;}
		
		else return false;
	}
	/**
	 * returns character race
	 * 
	 * @return returns "Race: Wizard"
	 */
	@Override
	public String getRace() {
		return "Race: Wizard";
	}


}