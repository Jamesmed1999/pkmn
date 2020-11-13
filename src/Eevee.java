/**
 * Represents the pokemon eevee child of Pokemon 
 * @author James Medina
 *
 */
public class Eevee extends Pokemon {
	/**
	 * Predefined array of attacks for every Eevee
	 */
	private String[] Attacks = {"Full power headbutt","Double Edge","OMEGA BEAM","Tail Whip" };
	/**
	 * Constructs the default Eevee. Eevee is a normal type pokemon thus always normal and their names are always Eevee until a player gives them a nickname
	 */
	public Eevee() {
		super();
		setName("Eevee");
		setType("Normal");
	}
	/**
	 * constructs an Eevee with HP,PP and name type is always normal
	 * @param health Pokemon's HP
	 * @param power Pokemon's PP
	 * @param nam Pokemon's Nickname
	 */
	public Eevee(int health, int power, String nam) {
		super(health, power, nam);
		setType("Normal");
	}

	@Override
	/**
	 * see {@link Pokemon }
	 */
	public void attack(Pokemon other, int i) {
		/**
		 * HPbeforeAttcakEV = Health before attack Eevee. Helps with calculation of damage the attacker is doing
		 */
		int HPbeforeAttcakEV = other.getHP();
		if(getPP() <= 0)
			System.out.println("No power points left!");
			else
			{
				
						
					 if(other.getType().equalsIgnoreCase("ghost"))
					{
						System.out.println(getName() + " Used: " + Attacks[i] + ", It had no effect!"); //normal is afraid of no ghost 
						if(Attacks[i] == "Full power headbutt")
							setPP(getPP() - 10);
						else if(Attacks[i] == "Double Edge")
							setPP(getPP() - 5);	
					}
					else
					{
						System.out.println(getName() + " Used: " + Attacks[i] + ", A decicive hit!"); //no advantage neutral 
						other.setHP((other.getHP() - 10));
						if(Attacks[i] == "Full power headbutt")
						{
							setPP(getPP() - 10);
							
							other.setHP((other.getHP() - 5));
							
						}
						else if(Attacks[i] == "Double Edge")
						{
							setPP(getPP() - 5);
							
							other.setHP((other.getHP() - 10));
							
						}
					}	
					}
			System.out.println(getName() +" Did " + (HPbeforeAttcakEV  - other.getHP()) + " Damage!" );
		
			}



	@Override
	/**
	 * see {@link Pokemon }
	 */
	public void speak() {
		System.out.println(" " + getName() + " Speaks - Eevee! ");

	}

	@Override
	/**
	 * see {@link Pokemon }
	 */
	public void listAttacks() {
		System.out.println("Attacks: ");
		for(int i = 0; i < Attacks.length; i++)
		{
			System.out.print(i + "." + Attacks[i] + "\n" );
		}

	}

}
