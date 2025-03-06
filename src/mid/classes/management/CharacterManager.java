package mid.classes.management;

public class CharacterManager {
	private MiddleEarthCharacter[] characters;
	private int size;

    /**
	 * adds character to array
	 * @param c the character to add 
	 * @return true if successfully added, else false
	 */
	boolean addCharacter(MiddleEarthCharacter c) {
		if(c == null) {
			return false;
		}
		if (size == characters.length ) {
			resizeArray();
		}
		characters[size++] = c;
		return true;
	}

	/**
	 * gets character by name
	 * @param name the name of characters is searched for
	 * @return character if found, else null
	 */
	MiddleEarthCharacter getCharacter(String name) {
		for (int i = 0; i < size; i++) {
			if (characters[i].getName().equals(name) ) {
				return characters[i];
			}
		}
		return null;
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

	/**
	 * deletes a character from array and maintains order
	 * @param c the character to delete
	 * @return true if deleted, else false
	 */
	boolean deleteCharacter(MiddleEarthCharacter c){
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
	void displayAllCharacters(){
		System.out.println("Printing out all characters...");
		for(int i = 0; i < size; i++){
			characters[i] .displayInfo();			
		}				
	}
	
	/**
	 * Doubles character array when full 
	 */
	public void resizeArray() {
		MiddleEarthCharacter[] newArray = new MiddleEarthCharacter[characters.length * 2];
		System.arraycopy(characters, 0, newArray, 0, characters.length);
		characters = newArray;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
}

