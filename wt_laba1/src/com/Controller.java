package com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import entities.AllEntities;
import entities.Animal;
import entities.Bet;
import entities.Race;

public class Controller {
	
	public static void showDialog()
	{
		View.ShowDialog();
	}
	
	public static void showNewRaceDialog(Race race) throws IOException
	{
		View.CreateNewRace(race);
	}
	
	public static void showNewAnimalDialog(Animal animal) throws IOException
	{
		View.CreateNewAnimal(animal);
	}
	
	public static void showNewBetDialog(AllEntities entities, Bet bet) throws IOException
	{
		View.CreateNewBet(entities, bet);
	}
	
	
	public static void main(String[] args) throws IOException
	{
		 AllEntities entities = new AllEntities();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		boolean appCycle = true;
		
		while(appCycle)
		{
			System.out.println("Enter smthin (0 - show, 1 - add, 2 - delete, 3 - update)");
			String decision = br.readLine();
			
			switch (decision)
			{
			case "0":
				
				Service.ShowAllRaces(entities);
				break;
			case "AddRace":
				Service.AddNewRace(entities);
				break;
			case "DeleteRace":
				Service.DeleteRace(entities);
				break;
			case "UpdateRace":
				Service.UpdateRace(entities);
				break;
			case "AddAnimal":
				Service.AddNewAnimal(entities);
				break;
			case "DeleteAnimal":
				Service.DeleteAnimal(entities);
				break;
			case "UpdateAnimal":
				Service.UpdateAnimal(entities);
				break;
			case "AddBet":
				Service.AddNewBet(entities);
				break;
			case "DeleteBet":
				Service.DeleteBet(entities);
				break;
			case "Exit":
				appCycle = false;
				break;
			default:
				System.out.println("Enter correct number");
				break;
			}
		}
	}

}
