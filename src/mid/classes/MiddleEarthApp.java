package mid.classes;

import mid.classes.subclasses.DwarfCharacter;
import mid.classes.subclasses.ElfCharacter;
import mid.classes.subclasses.HumanCharacter;
import mid.classes.subclasses.OrcCharacter;
import mid.classes.subclasses.WizardCharacter;

public class MiddleEarthApp {

	//creating interface options!
	/*
	 * 
	 * 
	 */
	public static void main(String[] args) {
		
		DwarfCharacter dwarf = new DwarfCharacter();
		dwarf.setName("Dilbo");
		dwarf.setHealth(100.00);
		dwarf.setPower(50.00);
		dwarf.displayInfo();
		
		ElfCharacter elf = new ElfCharacter();
		elf.setName("Ilbo");
		elf.setHealth(100.00);
		elf.setPower(50.00);
		elf.displayInfo();
		
		HumanCharacter human = new HumanCharacter();
		human.setName("Hilbo");
		human.setHealth(100.00);
		human.setPower(50.00);
		human.displayInfo();
		
		OrcCharacter orc = new OrcCharacter();
		orc.setName("Olbo");
		orc.setHealth(100.00);
		orc.setPower(50.00);
		orc.displayInfo();
		
		WizardCharacter wiz = new WizardCharacter();
		wiz.setName("Wilbo");
		wiz.setHealth(100.00);
		wiz.setPower(50.00);
		wiz.displayInfo();
		
			
		dwarf.attack(elf);
		dwarf.attack(human);
		dwarf.attack(orc);
		dwarf.attack(wiz);
		
		dwarf.displayInfo();
		elf.displayInfo();
		human.displayInfo();
		orc.displayInfo();
		wiz.displayInfo();
	}
}
