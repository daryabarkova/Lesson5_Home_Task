package by.dbarkova.bean;

public class CelestialBody {
	
	protected String name;
	private double age;
	private double weight;
	private double density;
	private  int diameter;
	
	public void setCelestialBodyName(String name) {
		this.name = name;
	}
	
	public String getCelestialBodyName() {
		return name;
	}
	
	public void setCelestialBodyAge(double age) {
		this.age = age;
	}
	
	public double getCelestialBodyAge() {
		return age;
	}
	
	public void setCelestialBodyWeight(double weight) {
		this.weight = weight;
	}
	
	public double getCelestialBodyWeight() {
		return weight;
	}
	
	public void setCelestialBodyDensity(double density) {
		this.density = density;
	}
	
	public double getCelestialBodyDensity() {
		return density;
	}
	
	public void setCelestialBodyDiameter(int diameter) {
		this.diameter = diameter;
	}
	
	public int getCelestialBodyDiameter() {
		return diameter;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
}
