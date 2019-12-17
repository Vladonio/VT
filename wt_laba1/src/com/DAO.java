package com;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import entities.AllEntities;
import entities.Animal;
import entities.Bet;
import entities.Race;

public class DAO {
	
	
	public static void UpdateFile(AllEntities entities) throws IOException
	{
		List<String> rows = new ArrayList<String>();
		
		rows.add("Animals");
		for (Animal animal : entities.animals)
		{
			rows.add(animal.getName() + ";" + animal.getAge() + ";" + animal.getWeight());
		}
		rows.add("Races");
		for (Race race : entities.races)
		{
			rows.add(race.getId() + ";" + race.getDate() + ";" + race.getAnimalsCount() + ";" + race.getLapsCount());
		}
		rows.add("Bets");
		for (Bet bet : entities.bets)
		{
			rows.add(bet.getRace().getId() + ";" + bet.getAnimal().getName() + ";" + bet.getAmount());
		}
		
		FileWriter txtWriter = new FileWriter("entities.txt");
		for (String str : rows)
		{
			txtWriter.write(str + System.lineSeparator());
		}
		txtWriter.close();
	}
	
	
	
	public static AllEntities DeSerialize() throws IOException
	{
		BufferedReader br = new BufferedReader(new FileReader("entities.txt"));
		AllEntities entities = new AllEntities();
		String row;
		row = br.readLine();
		try
		{
		while ((row = br.readLine()) != "Races" )
		{
			String[] data = row.split(";");
			entities.animals.add(new Animal(data[0], data[1], data[2]));
		}
		} catch (Exception e) {}
		
		try
		{
		while ((row = br.readLine()) != "Bets")
		{
			String[] data = row.split(";");
			entities.races.add(new Race(data[0], data[1], data[2], data[3]));
		}
		} catch (Exception e) {}
		
		try
		{
		while ( (row = br.readLine()) != null )
		{
			String[] data = row.split(";");
			Bet bet = new Bet();
			
			for (Race race : entities.races)
			{
				if (race.getId().equals(data[0]))
				{
					bet.setRace(race);
					break;
				}
			}
			
			for (Animal animal : entities.animals)
			{
				if (animal.getName().equals(data[1]))
				{
					bet.setAnimal(animal);
					break;
				}
			}
			bet.setAmount(data[2]);
			entities.bets.add(bet);
		}
		} catch (Exception e) {}
		br.close();
		
		return entities;
	}
	
	
}
