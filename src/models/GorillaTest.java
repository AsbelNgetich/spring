package models;

public class GorillaTest {

	public static void main(String[] args) {
		
		Gorilla kingKong = new Gorilla();
		
		//Throwing something reduces energy level by 5 points
		kingKong.displayEnergyLevel();
		kingKong.throwSomething();
		kingKong.throwSomething();
		kingKong.throwSomething();
		kingKong.displayEnergyLevel();
		
		//Eating bananas increases energy level by 10 points
		kingKong.eatBananas();
		kingKong.eatBananas();
		kingKong.displayEnergyLevel();
		
		//Climbing trees reduces energy level by 10 points
		kingKong.climb();
		kingKong.climb();
		kingKong.displayEnergyLevel();
		
		
		//System.out.println(kingKong.displayEnergyLevel());

	}

}
