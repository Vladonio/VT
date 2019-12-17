package entities;

import java.util.List;
import java.util.UUID;

public class Race {
	
	private String id;
	
	private String date;
	
	private String animalsCount;
	
	private String lapsCount;
	
	//List<Animal> animals;
	
	//List<String> coefficients;
	
	
	public Race(String id, String date, String animalsCount, String lapsCount, List<Animal> animals)
	{
		this.id = id;
		this.date = date;
		this.animalsCount = animalsCount;
		this.lapsCount = lapsCount;
		//this.animals = animals;
		
		
	}
	
	public Race(String id, String date, String animalsCount, String lapsCount)
	{
		this.id = id;
		this.date = date;
		this.animalsCount = animalsCount;
		this.lapsCount = lapsCount;
	}
	
	public Race()
	{
		this.id = String.valueOf(Math.round(Math.random() * 1000));
	}
	

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getAnimalsCount() {
		return animalsCount;
	}

	public void setAnimalsCount(String animalsCount) {
		this.animalsCount = animalsCount;
	}

	public String getLapsCount() {
		return lapsCount;
	}

	public void setLapsCount(String lapsCount) {
		this.lapsCount = lapsCount;
	}
	
	

}
