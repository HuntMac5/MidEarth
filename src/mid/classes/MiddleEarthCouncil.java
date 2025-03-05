package mid.classes;

//import mid.classes.management.CharacterManager;

public class MiddleEarthCouncil {
	private static MiddleEarthCouncil instance;
	
	private MiddleEarthCouncil() {}
	
	public static MiddleEarthCouncil getInstance() {
		if(instance == null) {
			instance = new MiddleEarthCouncil();
		}
		return instance;
	}

//		CharacterManager getCharacterManager(); //what does character manager need to do???
}
