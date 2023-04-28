package pa_303_10_1;

public class Monster {
	protected String name;
	
	public Monster() {};
	
	public Monster(String name) {
		this.name = name;
	}
	
	public String attack() {
		return "!^_&^$@+%$* I don't know how to attack!";
	}
	
}

class FireMonster extends Monster {
	public FireMonster(String name) {
		this.name = name;
	}

	@Override
	public String attack() {
		return "Attack with fire!";		
	}	
}

class WaterMonster extends Monster{
	public WaterMonster(String string) {
		this.name = string;
	}

	@Override
	public String attack() {
		return "Attack with water!";	
	}
}

class StoneMonster extends Monster{
	public StoneMonster(String string) {
		this.name = string;
	}

	@Override
	public String attack() {
		return "Attack with stones!";
	}
}
