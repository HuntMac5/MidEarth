package mid.classes.subclasses;

import mid.classes.management.MiddleEarthCharacter;

public class ElfCharacter extends MiddleEarthCharacter{

	@Override
	public boolean attack(MiddleEarthCharacter target) {
		// 1.5x damage against ORC
		// 0x damage against DWARF & ELF
		// 1x damage against HUMAN & WIZARD
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

	@Override
	public String getRace() {
		return "Race: Elf";
	}



}
