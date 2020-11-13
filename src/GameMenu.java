import java.util.Scanner; //needed for math
/**
 * Handles all menu related things for this game so the main runner looks clean
 * @author James 
 *
 */
public class GameMenu {
	/**
	 * scanner for user input
	 */
private Scanner nm = new Scanner(System.in);
/**
 * keeps track of the number of turns
 */
private int turnCount = 1;
/**
 * Into it gets the user to name themselves their pokemon and their rival 
 * @param pl1 player one the user
 * @param pl2 player two the computer
 * @param p1 player one's pokemon
 */
	public void intro(Player pl1,Player pl2,Pokemon p1)
	{
		System.out.print("Hello and welcome to the wonderful world of Pokemon! Shortly you will battle with an ADVANCED AI in a one on one pokemon battle \n");
		System.out.print("Let's not get ahead of ourselfs,What is your name: ");
		String nam = nm.nextLine();
		pl1.setName(nam);
		System.out.print("Your name is: " + pl1.getName() + " , Very cool \n");
		System.out.print("Now you have the honor of naming the ADVANCED AI, What is it's name: ");
		nam = nm.nextLine();
		pl2.setName(nam);
		System.out.print("You named it: " + pl2.getName() + " , not what I would pick but ok \n");
		System.out.print("Now since this is just a pokemon simulation I've already picked your pokemon for you, you get Eevee, a Normal-type Pokémon. Name them please:  ");
		nam = nm.nextLine();
		p1.setName(nam);
		System.out.println("You named it: " + p1.getName() + " , cool.");
		System.out.println("When a player's pokemon's HP reaches 0 the battle is over \nSome attacks use PP, PP = 0 = no attacks so be mindful of your Power points \nOkay lets begin!");
		
		
		
			
	}
	/**
	 * Handles the battle basics and declare's a winner depending on the HP of each pokemon. Displays turn count and each pokemon's PP and HP each turn as well.
	 * @param pl1 Player one
	 * @param pl2 Player two
	 * @param p1 Pokemon one, the Player's
	 * @param p2 Pokemon two, the computer's
	 * @param i1 Player's Item
	 * @param i2 Computer's item
	 */
	public void battle(Player pl1, Player pl2,Pokemon p1,Pokemon p2,Item i1,Item i2)
	{
		System.out.println(pl1.getName() + " Sent out: " + pl1.getPokemon()); //was just going to use p1.getName() but wanted to show each player did in fact have their respective pokemon.
		p1.speak();
		System.out.println(pl2.getName() + " Sent out: " + pl2.getPokemon());
		p2.speak();
		
		while(p1.getHP() > 0 && p2.getHP() > 0)
		{
			System.out.println("Turn: " + turnCount );
			System.out.println("What will you do? ");
			PlayerMenu(pl1,p1,p2,i1);
			ComputerMenu(pl2,p1,p2,i2);
			System.out.println(p1.getName() + "'s Hp = " + p1.getHP() + " PP = " + p1.getPP());
			System.out.println(p2.getName() + "'s Hp = " + p2.getHP() + " PP = " + p2.getPP());
			turnCount++;
		}
		if(p1.getHP() <= 0)
			System.out.println("The game was rigged from the start " + pl2.getName() + " Wins!");
		else
			System.out.println("You did it! " + pl1.getName() + " Wins!");
		
		System.out.println("Game Ended in " + turnCount + " Turns");
		
	}
	//?**  <---- I keep typing this I'm going insane
	/**
	 * 	Brings up a simple menu where the player can pick their action
	 * 1 attack using the abstract attack function in pokemon defined by Eevee	
	 * 2 item use the item use method implemented in Potion
	 * 3 run use the Player run function
	 * @param pl1 player one
	 * @param p1 player one's pokemon
	 * @param p2 player two's pokemon
	 * @param i1 player one's item
	 */
	public void PlayerMenu(Player pl1,Pokemon p1,Pokemon p2,Item i1)
	{
		System.out.println(" 1.Fight \n 2.Item \n 3.Run \n");
		int i = nm.nextInt();
		switch(i)
		{
		case 1:
			p1.listAttacks();
			i = nm.nextInt();
			p1.attack(p2, i);
			break;
		case 2:
			System.out.println(pl1.getName() + " used an item:");
			i1.use(p1, pl1);
			break;
		case 3:
			System.out.println(pl1.getName() + " Tried to Run:");
			pl1.run();
			break;
		default:
			System.out.println("Not a valid selection, ~skip turn haha");
            break;
            
		}
	}
	/**
	 * Everything the user can do the computer can do except the computer rely's on RNG choosing a number from 1-3 opposed to input 
	 * @param pl2 Player two
	 * @param p1 player one's pokemon
	 * @param p2 player two's pokemon
	 * @param i2 Player two's item
	 */
		public void ComputerMenu(Player pl2,Pokemon p1,Pokemon p2,Item i2)
		{
			
			int i = (int) ((Math.random() * 3) +1);
			switch(i)
			{
			case 1:
				 i = (int) ((Math.random() * 3) +0); //Uses RNG 0-3
				 System.out.println(pl2.getName() + " Orders " + p2.getName() + " to Attack:");
				p2.attack(p1, i);
				break;
			case 2:
				System.out.println(pl2.getName() + " used an item:");
				i2.use(p2, pl2);
				break;
			case 3:
				System.out.println(pl2.getName() + " Tried to Run:");
				pl2.run();
				break;
				
			}
	}
	
}
