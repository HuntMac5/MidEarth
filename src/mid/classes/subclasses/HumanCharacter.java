package mid.classes.subclasses;

import mid.classes.management.MiddleEarthCharacter;

public class HumanCharacter extends MiddleEarthCharacter{

	@Override
	public boolean attack(MiddleEarthCharacter target) {
		// 1.5x damage against WIZARD
		// 0x damage against ORC & HUMAN
		// 1x damage against ELF & DWARF
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

	@Override
	public String getRace() {
		return "Race: Human";
	}


}
