package models;

public class Gorilla extends Mammal {
	
	
	public Gorilla() {
	
	
	}

	
	public void throwSomething() {
		this.energyLevel -= 5;
		System.out.println("Swoooshh!! Gotchya!");
		
	}
	
	public void eatBananas() {
		this.energyLevel +=10;
		System.out.println("Mmmm! This is a tasty banana!");
	}
	
	public void climb() {
		this.energyLevel -=10;
		System.out.println("Climbing trees is easy peasy lemon squizy. But, maan i'm tired!");	
	}
	
}
