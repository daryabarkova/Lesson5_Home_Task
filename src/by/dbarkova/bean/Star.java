package by.dbarkova.bean;

public class Star extends CelestialBody {
	
	public Star(String name, double age, double weight, double density, int diameter) {
		
		super.setCelestialBodyName(name);
		super.setCelestialBodyAge(age);
		super.setCelestialBodyWeight(weight);
		super.setCelestialBodyDensity(density);
		super.setCelestialBodyDiameter(diameter);
		
	}

	public String getStarName() {
		return name;
	}
	
}
