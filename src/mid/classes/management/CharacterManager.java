package mid.classes.management;

import mid.classes.subclasses.HumanCharacter;

public class CharacterManager {
	MiddleEarthCharacter[] characters;
	int size;

	boolean addCharacter(MiddleEarthCharacter c) {
		//adds character, doubles if array size if full
		if(c != null)
		{
			return true;
		}
		else return false;
	}

	MiddleEarthCharacter getCharacter(String name) {
		MiddleEarthCharacter c = new HumanCharacter();
		return c;
	}
	
	boolean updateCharacter(MiddleEarthCharacter c, String name, int health, int power) {
		if(c != null){
			c.setHealth((double) health);
			c.setName(name);
			c.setPower((double) power);
			return true;
		}
		
		return false;
	}

	boolean deleteCharacter(MiddleEarthCharacter c){
		return false;
	}

	void displayAllCharacters(){
		System.out.println("Printing out all characters...");
		
		for(MiddleEarthCharacter c: characters){
			c.displayInfo();
		}
		
		
	}
}

