package mid.classes;

import mid.classes.subclasses.DwarfCharacter;
import mid.classes.subclasses.ElfCharacter;
import mid.classes.subclasses.HumanCharacter;
import mid.classes.subclasses.OrcCharacter;
import mid.classes.subclasses.WizardCharacter;
import java.util.Scanner;

public class MiddleEarthApp {

	//creating interface options!
	
	public static void main(String[] args){
		MiddleEarthCouncil.getInstance();

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
				System.out.println("One");
				break;
			case 2:
				System.out.println("Two");
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
				System.out.println("Invalid entry... Please choose a number from 1 to 5");
			}
		}
		System.out.println("Program has closed.");
		
		
	}
	/*{
		
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
	*/
}

