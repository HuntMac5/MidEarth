package mid.classes.subclasses;

import mid.classes.management.MiddleEarthCharacter;

public class HumanCharacter extends MiddleEarthCharacter{
	/**
	 * attacks another Middle Earth Character
	 * 
	 * No effect on Human and Orc.
	 * 1.5x damage vs Wizard.
	 * Normal damage against Elf and Dwarf.
	 * 
	 * @param target character being attacked.	
	 * @return returns true if attack successful, else false.
	 */
	@Override
	public boolean attack(MiddleEarthCharacter target) {
		double hp = 0; 
		
		if( target instanceof WizardCharacter){
			hp = 1.5*this.getPower();
			hp = target.getHealth()-hp;
			target.setHealth(hp);
			
			System.out.println("Attack Successful! ");
			return true;}
		
		if( target instanceof OrcCharacter  | target instanceof HumanCharacter ){
			System.out.println("Attack Unsuccessful... ");
			return false;}
		
		if( target instanceof ElfCharacter | target instanceof DwarfCharacter ){
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
	 * @return returns "Race: Human"
	 */
	@Override
	public String getRace() {
		return "Race: Human";
	}


}
