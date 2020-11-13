/**
 * Represents the pokemon Pikachu child of Pokemon 
 * @author James Medina
 *
 */
public class Pikachu extends Pokemon {
	/**
	 * Predefined array of attacks for every Pikachu
	 */
private String[] Attacks = {"Thunder","Quick Attack","Volt Smash Ultra plus Alpha EX","Tail Whip" };
/**
 * Constructs the default Pikachu. Pikachu is a electric type pokemon thus always electric and their names are always Pikachu until a player gives them a nickname
 */
public Pikachu()
{ super();
setName("Pikachu");
setType("electric");
}
/**
 * constructs an Pikachu with HP,PP and name type is always electric
	 * @param h Pokemon's HP
	 * @param p Pokemon's PP
	 * @param nam Pokemon's Nickname
 */
public Pikachu(int h,int p, String nam)
{
	super(h,p,nam);
	setType("electric");
}

	@Override
	/**
	 * see {@link Pokemon }
	 */
	public void attack(Pokemon other, int i) {
		/**
		 * HPbeforeAttcakPK = Health before attack Pikachu. Helps with calculation of damage the attacker is doing
		 */
		int HPbeforeAttcakPK = other.getHP();
		
		if(getPP() <= 0) //no power no attack
		System.out.println("No power points left!");
		
		else
		{
			
			
		if(other.getType().equalsIgnoreCase("water") || other.getType().equalsIgnoreCase("flying")) //Electric > water and flying
		{
			System.out.println(getName() + " Used: " + Attacks[i] + ", It's super effective!");
			other.setHP((other.getHP() - 10 * 2));
			if(Attacks[i] == "Volt Smash Ultra plus Alpha EX")
			{
				setPP(getPP() - 10);
				other.setHP((other.getHP() - 5 ));
			}
			else if(Attacks[i] == "Thunder")
			{
				setPP(getPP() - 5);
				other.setHP((other.getHP() - 10 ));
			}
			
		}
		else if(other.getType().equalsIgnoreCase("electric") || other.getType().equalsIgnoreCase("grass")) //Electric bad vs itself and grass
		{
			System.out.println(getName() + " Used: " + Attacks[i] + ", It's not very effective");
			other.setHP((other.getHP() - 10 / 2));
			if(Attacks[i] == "Volt Smash Ultra plus Alpha EX")
			{
				setPP(getPP() - 10);
				other.setHP((other.getHP() - 5));
			}
			else if(Attacks[i] == "Thunder")
			{
				setPP(getPP() - 5);
				other.setHP((other.getHP() - 10));
			}
		}
		else if(other.getType().equalsIgnoreCase("ground"))
		{
			System.out.println(getName() + " Used: " + Attacks[i] + ", It had no effect!"); //Electric < ground
			if(Attacks[i] == "Volt Smash Ultra plus Alpha EX")
				setPP(getPP() - 10);
			else if(Attacks[i] == "Thunder")
				setPP(getPP() - 5);
		}
		else
		{
			System.out.println(getName() + " Used: " + Attacks[i] + ", A decicive hit!"); //No type advantage
			other.setHP((other.getHP() - 10));
			if(Attacks[i] == "Volt Smash Ultra plus Alpha EX")
			{
				setPP(getPP() - 10);
				
				other.setHP((other.getHP() - 5));
			}
			else if(Attacks[i] == "Thunder")
			{
				setPP(getPP() - 5);
				
				other.setHP((other.getHP() - 10));
			}
		}	
		}
		System.out.println(getName() + " Did " + (HPbeforeAttcakPK  - other.getHP()) + " Damage!" );
	}
	@Override
	/**
	 * see {@link Pokemon }
	 */
	public void listAttacks()
	{
		System.out.println("Attacks: ");
		for(int i = 0; i < Attacks.length; i++)
		{
			System.out.print(i + "." + Attacks[i] + "\n" );
		}
	}
	
	@Override
	/**
	 * see {@link Pokemon }
	 */
	public void speak() 
	{
		System.out.println(" " + getName() + " Speaks - Pikachu! ");
		

	}

}
