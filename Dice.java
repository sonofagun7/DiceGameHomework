public class Dice
{
	public static int Roll_1_Dice()
	{
		int number = 1 + (int)(Math.random()* 6);
		return number;
	}

	public int RollDice(int numberOfDice, int maximumValue)
	{
		int lcv = 0,
			totalRoll = 0,
			number = 0;
		
		while (lcv < numberOfDice)
		{
			number = 1 + (int)(Math.random()* maximumValue);
			totalRoll = totalRoll + number;
			lcv++;
		}
		
		return totalRoll;
	}
	
	public int RollCount(int counter)
	{
		counter++;
		return counter;
	}

}
