package com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import entities.AllEntities;
import entities.Animal;
import entities.Bet;
import entities.Race;

public class View {
	
	public static void ShowDialog()
	{
		System.out.println();
	}
	
	
	public static void showRaces(List<Race> races)
	{
		for (Race race : races)
		{
			System.out.println(race.getId() +
					" Date: " + race.getDate() + 
					" Animal сount: " + race.getAnimalsCount() +
					" Laps Count: " + race.getLapsCount());
		}
		
	}
	
	
	public static void CreateNewRace(Race race) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the race date");
		race.setDate(br.readLine());
		System.out.println("Enter animals count");
		race.setAnimalsCount(br.readLine());
		System.out.println("Enter laps count");
		race.setLapsCount(br.readLine());
	
	}
	
	public static void CreateNewAnimal(Animal animal) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the name");
		animal.setName(br.readLine());
		System.out.println("Enter the age");
		animal.setAge(br.readLine());
		System.out.println("Enter the weight");
		animal.setWeight(br.readLine());
	
	}
	
	public static void CreateNewBet(AllEntities entities, Bet bet) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the race index");
		bet.setRace(entities.races.get(Integer.parseInt(br.readLine())));
		System.out.println("Enter the animal index");
		bet.setAnimal(entities.animals.get(Integer.parseInt(br.readLine())));
		System.out.println("Enter the amount");
		bet.setAmount(br.readLine());
		
	}
	
	
	public static void UpdateRace(Race race) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//System.out.println("Enter the race id which you want to update");
		
		System.out.println("What do you want to update?");
		System.out.println("1 - Date");
		System.out.println("2 - Animals count");
		System.out.println("3 - Laps count");
		
		
		String choice = br.readLine();
		
		switch (choice)
		{
		case "1":
			System.out.println("Enter new race date");
			race.setDate(br.readLine());
			break;
		case "2":
			System.out.println("Enter new animals count");
			race.setAnimalsCount(br.readLine());
			break;
		case "3":
			System.out.println("Enter new laps count");
			race.setLapsCount(br.readLine());
			break;
		default:
			System.out.println("Something went wrong");
			break;
		
		}
		
	}
	
	
	public static void UpdateAnimal(Animal animal) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//System.out.println("Enter the race id which you want to update");
		
		System.out.println("What do you want to update?");
		System.out.println("1 - Name");
		System.out.println("2 - Age");
		System.out.println("3 - Weight");
		
		
		String choice = br.readLine();
		
		switch (choice)
		{
		case "1":
			System.out.println("Enter a new name");
			animal.setName(br.readLine());
			break;
		case "2":
			System.out.println("Enter a new age");
			animal.setAge(br.readLine());
			break;
		case "3":
			System.out.println("Enter a new weight");
			animal.setWeight(br.readLine());
			break;
		default:
			System.out.println("Something went wrong");
			break;
		
		}
		
	}

}
