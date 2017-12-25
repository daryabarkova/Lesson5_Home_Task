package by.dbarkova.bean;

public class Planet extends CelestialBody {
	
	private int satelliteAmount;
	
	public Planet(String name, double weight, double density, int diameter) {
		
		super.setCelestialBodyName(name);
		super.setCelestialBodyWeight(weight);
		super.setCelestialBodyDensity(density);
		super.setCelestialBodyDiameter(diameter);
		
	}
	
	public String getPlanetName() {
		return name;
	}
	
	public void setSatelliteAmount(int satelliteAmount) {
		this.satelliteAmount = satelliteAmount;
	}
	
	public int getSatelliteAmount() {
		return satelliteAmount;
	}
	
}
