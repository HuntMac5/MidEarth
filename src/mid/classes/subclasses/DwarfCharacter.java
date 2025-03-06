package mid.classes.subclasses;

import mid.classes.management.MiddleEarthCharacter;

public class DwarfCharacter extends MiddleEarthCharacter{
	

	public DwarfCharacter(String name, Double health, Double power) {
		super(name, health, power);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean attack(MiddleEarthCharacter target) {
		// 1.5x damage against ELF
		// 0x damage against WIZARD & DWARF
		// 1x damage against HUMAN  & ORC
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

	@Override
	public String getRace() {
		return "Race: Dwarf";
	}





}
