package com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import entities.AllEntities;
import entities.Animal;
import entities.Bet;
import entities.Race;

public class Service {
	
	
	public static void ShowAllRaces(AllEntities entities) throws IOException
	{
		entities = DAO.DeSerialize();
		
		System.out.println("@@@_ANIMALS_@@@");
		for (Animal animal : entities.animals)
		{
			System.out.println(animal.getName() +
					" Age: " + animal.getAge() + 
					" Weight " + animal.getWeight());
		}
		System.out.println("@@@_RACES_@@@");
		for (Race race : entities.races)
		{
			System.out.println(race.getId() +
					" Date: " + race.getDate() + 
					" Animals count: " + race.getAnimalsCount() +
					" Laps Count: " + race.getLapsCount());
		}
		System.out.println("@@@_BETS_@@@");
		for (Bet bet : entities.bets)
		{
			System.out.println(bet.getRace().getId() +
					" Animal: " + bet.getAnimal().getName() + 
					" Amount " + bet.getAmount());
		}
		
	}
	
	
	public static void AddNewRace(AllEntities entities) throws IOException
	{
			
		entities = DAO.DeSerialize();
		
		Race newRace = new Race();
		
		Controller.showNewRaceDialog(newRace);;
		entities.races.add(newRace);
		
		DAO.UpdateFile(entities);
		
	}
	
	public static void AddNewAnimal(AllEntities entities) throws IOException
	{
			
		entities = DAO.DeSerialize();
		
		Animal newAnimal = new Animal();
		
		Controller.showNewAnimalDialog(newAnimal);;
		entities.animals.add(newAnimal);
		
		DAO.UpdateFile(entities);
		
	}
	
	public static void AddNewBet(AllEntities entities) throws IOException
	{
			
		entities = DAO.DeSerialize();
		
		Bet newBet = new Bet();
		
		Controller.showNewBetDialog(entities, newBet);;
		entities.bets.add(newBet);
		
		DAO.UpdateFile(entities);
		
	}
	
	
	public static void DeleteRace(AllEntities entities) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		entities = DAO.DeSerialize();
		
		System.out.println("Enter index of race you want to delete");
		String index = br.readLine();
		
		entities.races.remove(Integer.parseInt(index));
		DAO.UpdateFile(entities);
		
	}
	
	public static void DeleteAnimal(AllEntities entities) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		entities = DAO.DeSerialize();
		
		System.out.println("Enter the index of the animal you want to delete");
		String index = br.readLine();
		
		entities.animals.remove(Integer.parseInt(index));
		DAO.UpdateFile(entities);
		
	}
	
	public static void DeleteBet(AllEntities entities) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		entities = DAO.DeSerialize();
		
		System.out.println("Enter the index of the bet you want to delete");
		String index = br.readLine();
		
		entities.bets.remove(Integer.parseInt(index));
		DAO.UpdateFile(entities);
		
	}
	
	
	public static void UpdateRace(AllEntities entities) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		entities = DAO.DeSerialize();
		
		System.out.println("Enter the  index of the race you want to update");
		String index = br.readLine();
		
		Race raceToUpdate = entities.races.get(Integer.parseInt(index));
		
		View.UpdateRace(raceToUpdate);
		
		DAO.UpdateFile(entities);
		
	}
	
	public static void UpdateAnimal(AllEntities entities) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		entities = DAO.DeSerialize();
		
		System.out.println("Enter the index of the animal you want to update");
		String index = br.readLine();
		
		Animal animalToUpdate = entities.animals.get(Integer.parseInt(index));
		
		View.UpdateAnimal(animalToUpdate);
		
		DAO.UpdateFile(entities);
		
	}
	
	
	

}
