package by.dbarkova.bean;

public class Logic {
	
	public void printStarSystemDescription(StarSystem starSystem) {
		String starSystemName = starSystem.getStarSystemName();
		int starsAmount = starSystem.getStarsAmount();
		int planetsAmount = starSystem.getPlanetsAmount();
		System.out.println(starSystemName + " includes " + starsAmount + " star(s) and " + planetsAmount + " planet(s).");
	
	}
	
	public void printStarSystemStarNames(StarSystem starSystem) {
		String[] starSystemStarNames = new String[starSystem.getStarSystemStars().length];
		int c = 0;
		for (int i = 0; i < starSystem.getStarSystemStars().length; i++) {
			if (starSystem.getStarSystemStars()[i].getStarName() != " ") {
				starSystemStarNames[c] = starSystem.getStarSystemStars()[i].getStarName();
				c++;
			}else {
				continue;
			}
		}
		System.out.println("The star(s) is(are):" + starSystemStarNames.toString());
	}

}
