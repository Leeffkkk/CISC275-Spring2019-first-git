package main;

public class Dog implements Animal{
	String name;
	int numLegs;
	
	public Dog(String name, int numLegs) {
		this.name = name;
		this.numLegs = numLegs;
	}
	
	public int getLegs() {
		return numLegs;
	}
	@Override
	public String toString() {
		return name + " has " + numLegs + " legs";
	}
}
