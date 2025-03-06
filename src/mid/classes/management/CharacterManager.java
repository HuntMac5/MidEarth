package mid.classes.management;

public class CharacterManager {
	int size = 1;
	MiddleEarthCharacter[] characters = new MiddleEarthCharacter[size];
	
    /**
	 * adds character to array
	 * @param c the character to add 
	 * @return true if successfully added, else false
	 */
	public boolean addCharacter(MiddleEarthCharacter c) {
		System.out.println("There are " + characters.length + " many spots in characters");
		if(c == null) {
			return false;
		}
		if (size == characters.length ) {
			resizeArray();
			characters[size] = c;
			size++;
			return true;
			
		}
		characters[size] = c;
		size++;
		return true;
	}

	/**
	 * gets character by name
	 * @param name the name of characters is searched for
	 * @return character if found, else null
	 */
	public MiddleEarthCharacter getCharacter(String name) {
		for (int i = 0; i < size; i++) {
			if (characters[i].getName().equals(name) ) {
				return characters[i];
			}
		}
		return null;
	}
	
	public boolean updateCharacter(MiddleEarthCharacter c, String name, int health, int power) {
		if(c != null){
			c.setHealth((double) health);
			c.setName(name);
			c.setPower((double) power);
			return true;
		}
		
		return false;
	}

	/**
	 * deletes a character from array and maintains order
	 * @param c the character to delete
	 * @return true if deleted, else false
	 */
	public boolean deleteCharacter(MiddleEarthCharacter c){
		if (c == null) {
			return false;
		}
		for (int i = 0; i < size; i++) {
			if (characters[i] == c) {
				for (int j = i;j < size -1; j++) {
					characters[j] = characters[j + 1];
				}
				characters[size - 1 ] = null;
				size--;
				return true;
			}
		}
		return false;
	}

	/**
	 * displays characters in system
	 */
	public void displayAllCharacters(){
		System.out.println("Printing out all characters...");
		for(int i = 0; i < size; i++){
			//characters[i].displayInfo();			
		}				
	}
	
	/**
	 * Doubles character array when full 
	 */
	void resizeArray() {
		if(characters.length == 0) {
			MiddleEarthCharacter[] newArray = new MiddleEarthCharacter[characters.length+1];
			System.arraycopy(characters, 0, newArray, 0, characters.length);
			characters = newArray;
		}
		MiddleEarthCharacter[] newArray = new MiddleEarthCharacter[characters.length * 2];
		System.arraycopy(characters, 0, newArray, 0, characters.length);
		characters = newArray;
	}
}

