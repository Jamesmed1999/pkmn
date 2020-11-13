/**
 * Interface Item represents an the frame work of item a player might have
 * @author James Medina
 *
 */
public interface Item {
	/**
	 * The item is used on the player's pokemon. Function depends on the class that implments the interface
	 * @param p the pokemon the item is used on
	 * @param other the player using said item
	 */
public void use(Pokemon p, Player other);
}
