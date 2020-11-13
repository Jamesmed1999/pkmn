
/**
 * Superclass of PokemonTrainer
 * Represents a player
 * @author James Medina
 *
 */
public abstract class Player {
	/**
	 * holds player name
	 */
private String name;
/**
 * constructs default player
 */
 public Player()
 {
	 name = "Mr.Pokemon";
	
 }
 /**
  * constructs a player with a name
  * @param nam name
  */
 public Player(String nam)
 {
	 name = nam;
	 
 }
 
/**
 * gets name
 * @return name
 */
 public String getName()
 { return name; }
 
 /**
  * sets name
  * @param n name
  */
 public void setName(String n)
 { name = n; }
 /**
  * prints all player info
  * @return s string with all variable information 
  */
 public String tostring()
 {
	 String s = "";
	 s+= "Name " + name;
	 return s;
 }
 /**
  * gets a player's pokemon
  * @return pkmn pokemon
  */
 protected abstract Pokemon getPokemon();
 /**
  * 
  * @return a player's item
  */
 public abstract Item getItem();
 /**
  * the player runs
  */
 public abstract void run();

 
}
