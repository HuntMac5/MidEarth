package mid.classes;

import mid.classes.management.CharacterManager;

public class MiddleEarthCouncil {
	private static MiddleEarthCouncil instance;
	public CharacterManager manager = new CharacterManager();
	
	private MiddleEarthCouncil() {}
	
	public static MiddleEarthCouncil getInstance() {
		if(instance == null) {
			instance = new MiddleEarthCouncil();
		}
		return instance;
	}
	
		public CharacterManager getCharacterManager() { //what does character manager need to do???
			return manager;
		}
}
