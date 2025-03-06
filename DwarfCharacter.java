package mid.classes.subclasses;

import mid.classes.management.MiddleEarthCharacter;

public class DwarfCharacter extends MiddleEarthCharacter{
	/**
	 * attacks another Middle Earth Character
	 * 
	 * No effect on Wizard and DWARF.
	 * 1.5x damage vs ELF.
	 * Normal damage against HUMAN and ORC.
	 * 
	 * @param target character being attacked.	
	 * @return returns true if attack successful, else false.
	 */
	@Override
	public boolean attack(MiddleEarthCharacter target) {
		double hp = 0; 
		
		if( target instanceof ElfCharacter){
			hp = 1.5*this.getPower();
			hp = target.getHealth()-hp;
			target.setHealth(hp);
			
			System.out.println("Attack Successful! ");
			return true;}
		
		if( target instanceof WizardCharacter  | target instanceof DwarfCharacter ){
			System.out.println("Attack Unsuccessful... ");
			return false;}
		
		if( target instanceof HumanCharacter  | target instanceof OrcCharacter){
			hp = this.getPower();
			hp = target.getHealth()-hp;
			target.setHealth(hp);
			
			System.out.println("Attack Successful! ");
			return true;
			}
		
		else return false; 
	}
	/**
	 * returns character race
	 * 
	 * @return returns "Race: Dwarf"
	 */
	@Override
	public String getRace() {
		return "Race: Dwarf";
	}



}
