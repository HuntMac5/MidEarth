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
		
		if(manager == null) {
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
				System.out.print("5. Wizard ");
				
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
					System.out.print("Invalid entry... Please choose a number from 1 to 5");
					break;
				}
				
				
				
			case 2:
				System.out.println("Viewing all characters...");
				//manager.displayAllCharacters();
				break;
			case 3:
				System.out.println("Update a character ");
				break;
			case 4:
				System.out.println("Delete a character ");
				break;
			case 5:
				System.out.println("Execute all character's attack options ");
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
		
		
	}
	
}

