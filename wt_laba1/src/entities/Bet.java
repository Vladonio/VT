package entities;

public class Bet {
	
	private String amount;
	
	private Animal animal;
	
	private Race race;
	
	public double possibleWin;
	
	
	public Bet(Race race, Animal animal, String amount)
	{
		this.setRace(race);
		this.setAnimal(animal);
		this.setAmount(amount);
		
		//int index = race.animals.lastIndexOf(animal);
		
		//possibleWin = Double.parseDouble(amount) * Double.parseDouble(race.coefficients.get(index));

	}
	
	public Bet()
	{
		this.animal = new Animal();
		this.race = new Race();
	}


	public String getAmount() {
		return amount;
	}


	public void setAmount(String amount) {
		this.amount = amount;
	}


	public Animal getAnimal() {
		return animal;
	}


	public void setAnimal(Animal animal) {
		this.animal = animal;
	}


	public Race getRace() {
		return race;
	}


	public void setRace(Race race) {
		this.race = race;
	}
	
	

}
