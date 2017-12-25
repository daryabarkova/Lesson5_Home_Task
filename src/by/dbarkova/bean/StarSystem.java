package by.dbarkova.bean;

public class StarSystem {
	
	private String name;
	private Star[] stars;
	private Planet[] planets;
	
	private int starCounter = 0;
	private int planetCounter = 0;
	
    public StarSystem(String name) {
    	
    	this.name = name;
    	stars = new Star[5];
    	planets = new Planet[20];
    	
    }
    
    public void addStar(Star star) {
    	stars[starCounter] = star;
    	starCounter++;
    }
    
    public void addPlanet(Planet planet) {
    	planets[planetCounter] = planet;
    	planetCounter++;
    }
    
    public String getStarSystemName() {
    	return name;
    }
    
    public int getStarsAmount() {
    	return starCounter;
    }
    
    public int getPlanetsAmount() {
    	return planetCounter;
    }
    
    
    public void setStarSystemStars(Star[] stars) {
    	this.stars = stars;
    }
    
    public Star[] getStarSystemStars() {
    	return stars;
    }
    
    public void setStarSystemPlanets(Planet[] planets) {
    	this.planets = planets;
    }
    
    public Planet[] getStarSystemPlanets() {
    	return planets;
    }
    		
}


