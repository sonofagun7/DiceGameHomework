import javax.swing.JOptionPane;

public class MainProgram 
{
	public static void main(String[] args) 
	{
		//set up a boolean variable to break the loop so that the player can play as many times as they want
		boolean gameNotOver = true;
		
		//initiate variables outside of do loop to make sure it's not reset with every iteration
		int rollNumberStatic1 = 0,
			rollNumberStatic2 = 0,
			rollNumberStatic3 = 0,
			rollNumberRegular1 = 0,
			rollNumberRegular2 = 0,
			rollNumberRegular3 = 0;
		
		//Welcome the user
		JOptionPane.showMessageDialog( null, "Welcome to the dice game!" );
		
		//begin do loop
		do{	
			//ask how many dice they would like to roll
			JOptionPane.showMessageDialog( null, "You have 3 sets of dice." );
			String setNumber = JOptionPane.showInputDialog( null, "Which set would you like to roll?" );
			
			//instantiate class Dice
			Dice game1 = new Dice();
			Dice game2 = new Dice();
			Dice game3 = new Dice();
			
			//Dice set 1
			if (setNumber.equals("1"))
			{
				//roll the dice for the static method and give roll result
				String regularOrStatic = JOptionPane.showInputDialog( null, "Would you like to roll the static or regular dice?" +
																			"(Enter 1 for static and 2 for regular.");
							
				if (regularOrStatic.equals("1"))
				{
					//roll the die
					int rollResultStatic = Dice.Roll_1_Dice();
					
					//show the result
					JOptionPane.showMessageDialog( null, "Your roll for the static method was " + rollResultStatic + "." );
					
					//increment the roll counter
					rollNumberStatic1 = game1.RollCount(rollNumberStatic1);
				}
				else
				{
					String diceAmount = JOptionPane.showInputDialog( null, "How many dice would you like to roll?" );
					String numberOfSides = JOptionPane.showInputDialog( null, "How many sides does each die have?" );
					
					//roll the dice
					int rollResultRegular = game1.RollDice(Integer.parseInt(diceAmount),Integer.parseInt(numberOfSides));
					
					//show the result
					JOptionPane.showMessageDialog( null, "Your total roll for the regular method came to " + rollResultRegular + "." );
				
					//increment the roll counter
					rollNumberRegular1 = game1.RollCount(rollNumberRegular1);
				}
			
			}
			
			//Dice set 2
			if (setNumber.equals("2"))
			{
				//roll the dice for the static method and give roll result
				String regularOrStatic = JOptionPane.showInputDialog( null, "Would you like to roll the static or regular dice?" +
																			"(Enter 1 for static and 2 for regular.");
							
				if (regularOrStatic.equals("1"))
				{
					//roll the die
					int rollResultStatic = Dice.Roll_1_Dice();
					
					//show the result
					JOptionPane.showMessageDialog( null, "Your roll for the static method was " + rollResultStatic + "." );
					
					//increment the roll counter
					rollNumberStatic2 = game2.RollCount(rollNumberStatic2);
				}
				else
				{
					String diceAmount = JOptionPane.showInputDialog( null, "How many dice would you like to roll?" );
					String numberOfSides = JOptionPane.showInputDialog( null, "How many sides does each die have?" );
					
					//roll the dice
					int rollResultRegular = game1.RollDice(Integer.parseInt(diceAmount),Integer.parseInt(numberOfSides));
					
					//show the result
					JOptionPane.showMessageDialog( null, "Your total roll for the regular method came to " + rollResultRegular + "." );
					
					//increment the roll counter
					rollNumberRegular2 = game2.RollCount(rollNumberRegular2);
				
				}
			}
			
			//Dice set 3
			if (setNumber.equals("3"))
			{
				//roll the dice for the static method and give roll result
				String regularOrStatic = JOptionPane.showInputDialog( null, "Would you like to roll the static or regular dice?" +
																			"(Enter 1 for static and 2 for regular.");
							
				if (regularOrStatic.equals("1"))
				{
					//roll the die
					int rollResultStatic = Dice.Roll_1_Dice();
					
					//show the result
					JOptionPane.showMessageDialog( null, "Your roll for the static method was " + rollResultStatic + "." );	
					
					//increment the roll counter
					rollNumberStatic3 = game3.RollCount(rollNumberRegular3);
				}
				else
				{
					String diceAmount = JOptionPane.showInputDialog( null, "How many dice would you like to roll?" );
					String numberOfSides = JOptionPane.showInputDialog( null, "How many sides does each die have?" );
					
					//roll the dice
					int rollResultRegular = game3.RollDice(Integer.parseInt(diceAmount),Integer.parseInt(numberOfSides));
					
					//show the result
					JOptionPane.showMessageDialog( null, "Your total roll for the regular method came to " + rollResultRegular + "." );
					
					//increment the roll counter
					rollNumberRegular3 = game3.RollCount(rollNumberStatic3);
				
				}	
			}
			
			JOptionPane.showMessageDialog( null, "Here are your roll counter stats:\n" +
												 "Dice Set 1 -\nStatic Rolls:   " + rollNumberStatic1 + "\n" +
												 				 "Regular Rolls:  " + rollNumberRegular1 + "\n\n" +
												 "Dice Set 2 -\nStatic Rolls:   " + rollNumberStatic2 + "\n" +
												 				 "Regular Rolls:  " + rollNumberRegular2 + "\n\n" +
												 "Dice Set 3 -\nStatic Rolls:  " + rollNumberStatic3 + "\n" +
												 			 "Regular Rolls:   " + rollNumberRegular3 );			
			
			
			//ask the player if they'd like to play again
			String playAgain = JOptionPane.showInputDialog( null, "Would you like to play again? (Enter 1 for yes and 2 for no)" );
			
			if (playAgain.equals("2"))
			{
				gameNotOver = false;
			}
						
		} while (gameNotOver);
		
		//exit messages
		JOptionPane.showMessageDialog( null, "Thanks for playing!" );
		JOptionPane.showMessageDialog( null, "Exiting Program..." );

	}//end method main

}// end class MainProgram
