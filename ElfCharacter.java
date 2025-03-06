package mid.classes.subclasses;

import mid.classes.management.MiddleEarthCharacter;

public class ElfCharacter extends MiddleEarthCharacter{
	/**
	 * attacks another Middle Earth Character
	 * 
	 * No effect on ELF and DWARF.
	 * 1.5x damage vs ORC.
	 * Normal damage against HUMAN and WIZARD.
	 * 
	 * @param target character being attacked.	
	 * @return returns true if attack successful, else false.
	 */
	@Override
	public boolean attack(MiddleEarthCharacter target) {
		double hp = 0; 
		
		if( target instanceof OrcCharacter){
			hp = 1.5*this.getPower();
			hp = target.getHealth()-hp;
			target.setHealth(hp);
			
			System.out.println("Attack Successful! ");
			return true;}
		
		if( target instanceof DwarfCharacter  | target instanceof ElfCharacter ){
			System.out.println("Attack Unsuccessful... ");
			return false;}
		
		if( target instanceof HumanCharacter | target instanceof WizardCharacter ){
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
	 * @return returns "Race: Elf"
	 */
	@Override
	public String getRace() {
		return "Race: Elf";
	}



}
