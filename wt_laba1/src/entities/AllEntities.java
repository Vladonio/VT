package entities;

import java.util.ArrayList;
import java.util.List;

public class AllEntities {
	
	public List<Race> races;
	
	public List<Animal> animals;
	
	public List<Bet> bets;
	
	public AllEntities(List<Race> races, List<Animal> animals, List<Bet> bets) 
	{
		this.races = races;
		this.animals = animals;
		this.bets = bets;
	}
	
	public AllEntities()
	{
		races = new ArrayList<Race>();
		animals = new ArrayList<Animal>();
		bets = new ArrayList<Bet>();
	}

}
