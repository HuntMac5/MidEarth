package mid.classes;

import mid.classes.management.CharacterManager;
import mid.classes.management.MiddleEarthCharacter;
import mid.classes.subclasses.DwarfCharacter;
import mid.classes.subclasses.ElfCharacter;
import mid.classes.subclasses.HumanCharacter;
import mid.classes.subclasses.OrcCharacter;
import mid.classes.subclasses.WizardCharacter;
import java.util.Scanner;

public class MiddleEarthApp {

	//creating interface options!
	
	public static void main(String[] args){
		MiddleEarthCouncil middleEarthCouncil = MiddleEarthCouncil.getInstance();
		CharacterManager manager = middleEarthCouncil.getCharacterManager();
	/*	
		if(manager. == null) {
			System.out.println("This thing is null btw");
		}
		
		boolean loop = true;
		while(loop) {
			
			Scanner input = new Scanner(System.in);
			System.out.println("Choose an option from 1 to 6: ");
			System.out.println("1. Add a new character. ");
			System.out.println("2. View all characters. ");
			System.out.println("3. Update a character.  ");
			System.out.println("4. Delete a character. ");
			System.out.println("5. Execute all characters’ attack actions. ");
			System.out.println("6. Exit the program ");
			
			int answer = input.nextInt();
			System.out.println("You have selected " + answer);
			
		switch(answer) {
			case 1:
				System.out.println("Choose a character class from 1 to 5: ");
				
				System.out.println("1. Elf ");
				System.out.println("2. Dwarf ");
				System.out.println("3. Human  ");
				System.out.println("4. Orc ");
				System.out.println("5. Wizard. ");
				
				int answer1 = input.nextInt();
				
				switch(answer1) {
				case 1: 
					ElfCharacter elf = new ElfCharacter("N/A", null, null);
					manager.addCharacter(elf);
					break;
				case 2: 
					DwarfCharacter dwarf = new DwarfCharacter("N/A", null, null);
					manager.addCharacter(dwarf);
					break;
				case 3: 
					HumanCharacter human = new HumanCharacter("N/A", null, null);
					manager.addCharacter(human);
					break;
				case 4: 
					OrcCharacter orc = new OrcCharacter("N/A", null, null);
					manager.addCharacter(orc);
					break;
				case 5: 
					WizardCharacter wiz = new WizardCharacter("N/A", null, null);
					manager.addCharacter(wiz);
					break;
				default:
					System.out.println("Invalid entry... Please choose a number from 1 to 5");
					break;
				}
				
				
				
			case 2:
				System.out.println("Viewing all characters...");
				manager.displayAllCharacters();
				break;
			case 3:
				System.out.println("Three");
				break;
			case 4:
				System.out.println("Four");
				break;
			case 5:
				System.out.println("Five");
				break;
			case 6:
				System.out.println("Closing program...");
				loop = false;
				break;
			default:
				System.out.println("Invalid entry... Please choose a number from 1 to 6");
				break;
			}
		}
		System.out.println("Program has closed.");
		//input = new Scanner(System.out);		
}
	*/

		
		DwarfCharacter dwarf = new DwarfCharacter(null, null, null);
		dwarf.setName("Dilbo");
		dwarf.setHealth(100.00);
		dwarf.setPower(50.00);
		dwarf.displayInfo();
		
		ElfCharacter elf = new ElfCharacter(null, null, null);
		elf.setName("Ilbo");
		elf.setHealth(100.00);
		elf.setPower(50.00);
		elf.displayInfo();
		
		HumanCharacter human = new HumanCharacter(null, null, null);
		human.setName("Hilbo");
		human.setHealth(100.00);
		human.setPower(50.00);
		human.displayInfo();
		
		OrcCharacter orc = new OrcCharacter(null, null, null);
		orc.setName("Olbo");
		orc.setHealth(100.00);
		orc.setPower(50.00);
		orc.displayInfo();
		
		WizardCharacter wiz = new WizardCharacter(null, null, null);
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
		
		manager.addCharacter(dwarf);
		manager.addCharacter(elf);
		manager.addCharacter(human);
		manager.addCharacter(orc);
		manager.addCharacter(wiz);
		
		manager.displayAllCharacters();
	}
	
}

