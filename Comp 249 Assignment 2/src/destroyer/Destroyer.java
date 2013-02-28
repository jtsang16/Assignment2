package destroyer;

import warship.Warship;

public class Destroyer extends Warship {
	private enum typeOfAttack{MultiRole, AntiSubmarine, AntiAircraft};
	private int numberOfGuns;
	private int numberOfMissiles;
}
