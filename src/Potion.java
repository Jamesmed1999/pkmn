/**
 * Implements Item heals a pokemon with use method 
 * @author James Medina
 *
 */
public class Potion implements Item {
	/**
	 * Potion's name is always potion
	 */
	private String Iname = "Potion";
	/**
	 * count tracks how many uses the item has left
	 */
	private int count = 2;
	@Override
	/**
	 * Heals HP
	 * {@link Item}
	 */
	public void use(Pokemon p,Player other) {
		
			
			if(count != 0)
			{
			System.out.println(other.getName() + " used the potion ");
			p.setHP(p.getHP() + 10);
			count--;
			System.out.println( "Restored 10 HP!");
			System.out.println(count + " potions left.");
			}
			else
				System.out.println("Outta Items dummmmmmmmmy."); //rip
	}
	/**
	 * Made for use in runner
	 * @return the item's name
	 */
	public String getIname()
	{
		return Iname;
	}
}
