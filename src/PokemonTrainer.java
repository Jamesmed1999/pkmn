/**
 * A player is a pokemon trainer but not all players are a pokemon trainer
 * Represents a pokemon trainer
 * child of player {@link Player}
 * @author James Medina
 *
 */
public class PokemonTrainer extends Player {
	/**
	 * holds a pokemon
	 */
	private Pokemon pkmn;
	/**
	 * holds a Item 
	 */
	private Item item;
	/**
	 * PokemonTrainer's default constructor
	 */
	public PokemonTrainer()
	{
		super();
		pkmn = null;
		item = null;
	}
	/**
	 * constructs a Trainer with name,pokemon and item
	 * @param nam the name 
	 * @param po the pokemon
	 * @param it the item
	 */
	public PokemonTrainer(String nam,Pokemon po,Item it)
	{
		super(nam);
		pkmn = po;
		item = it;
	}
	@Override
	/**
	 * see {@link Player}
	 */
	protected Pokemon getPokemon() {
		
		return pkmn;
	}
	@Override
	/**
	 * see {@link Player}
	 */
	public Item getItem() {
		
		return item;
	}
	
	@Override
	/**
	 * see {@link Player}
	 */
	public void run() {
		System.out.println("And " + getName() + " ran you ran so far away but you couldn't get away from a POKEMON battle!!!!!");
		
	}
	/**
	 * prints all of PokemonTrainer's data
	 */
	public String tostring()
	 {
		 String s = super.tostring() + "\n";
		 s+= "Pokemon: " + pkmn.getName() + " Item: " + ((Potion) item).getIname() + "\n";
		 return s;
	 }
	

}
