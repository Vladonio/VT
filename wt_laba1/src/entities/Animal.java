package entities;

public class Animal {
	
	private String name;

	private String age;
	
	private String weight;
	
	
	public void Feed(String foodWeight)
	{
		weight += foodWeight;
	}
	
	
	public Animal()
	{
		name = "NoName";
		age = "10";
		weight = "100kg"; 
	}
	
	public Animal(String name, String age, String weight)
	{
		this.name = name;
		this.age = age;
		this.weight = weight;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAge() {
		return age;
	}


	public void setAge(String age) {
		this.age = age;
	}


	public String getWeight() {
		return weight;
	}


	public void setWeight(String weight) {
		this.weight = weight;
	}
	
	

}
