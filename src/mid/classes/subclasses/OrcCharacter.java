package mid.classes.subclasses;

import mid.classes.management.MiddleEarthCharacter;

public class OrcCharacter extends MiddleEarthCharacter{

	public OrcCharacter(String name, Double health, Double power) {
		super(name, health, power);
		// TODO Auto-generated constructor stub
	}

	/**
	 * attacks another Middle Earth Character
	 * 
	 * No effect on Orc and Elf.
	 * 1.5x damage vs Human.
	 * Normal damage against Dwarf and WIZARD.
	 * 
	 * @param target character being attacked.	
	 * @return returns true if attack successful, else false.
	 */
	@Override
	public boolean attack(MiddleEarthCharacter target) {
		// 1.5x damage against HUMAN
		// 0x damage against ELF & ORC
		// 1x damage against DWARF & WIZARD
		double hp = 0; 
		
		if( target instanceof HumanCharacter){
			hp = 1.5*this.getPower();
			hp = target.getHealth()-hp;
			target.setHealth(hp);
			
			System.out.println("Attack Successful! ");
			return true;}
		
		if( target instanceof ElfCharacter  | target instanceof OrcCharacter ){
			System.out.println("Attack Unsuccessful... ");
			return false;}
		
		if( target instanceof DwarfCharacter  | target instanceof WizardCharacter ){
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
	 * @return returns "Race: Orc"
	 */
	public String getRace() {
		return "Race: Orc";
	}



}
