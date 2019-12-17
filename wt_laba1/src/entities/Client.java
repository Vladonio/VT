package entities;

public class Client extends Human {
	
	Bet bet;
	
	
	public void MakeABet(Race race, Animal animal, String amount)
	{
		bet = new Bet(race, animal, amount);
	}

}
