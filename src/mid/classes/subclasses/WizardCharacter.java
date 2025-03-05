package mid.classes.subclasses;

import mid.classes.management.MiddleEarthCharacter;

public class WizardCharacter extends MiddleEarthCharacter{

	@Override
	public boolean attack(MiddleEarthCharacter target) {
		// 1.5x damage against DWARF
		// 0x damage against HUMAN & WIZARD
		// 1x damage against ELF & ORC
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

	@Override
	public String getRace() {
		return "Race: Wizard";
	}


}