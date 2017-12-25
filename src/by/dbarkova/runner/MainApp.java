package by.dbarkova.runner;

import by.dbarkova.bean.Planet;
import by.dbarkova.bean.Star;
import by.dbarkova.bean.StarSystem;
import by.dbarkova.bean.Logic;

public class MainApp {

	public static void main(String[] args) {
		
		StarSystem solarSystem = new StarSystem("Solar system");
		
		solarSystem.addStar(new Star("Sun", 4.6, 1.989E30, 1.41, 1391400));
		
		solarSystem.addPlanet(new Planet("Mercury", 3.285E23, 5.43, 4879));
		solarSystem.addPlanet(new Planet("Venus", 4.867E24, 5.24, 12104));
		solarSystem.addPlanet(new Planet("Mars", 6.39E23, 3.93, 6779));
		solarSystem.addPlanet(new Planet("Earth", 5.972E24, 5.51, 12742));
		
		Logic appFlow = new Logic();
		
		appFlow.printStarSystemDescription(solarSystem);
		
		appFlow.printStarSystemStarNames(solarSystem);

	}

}
