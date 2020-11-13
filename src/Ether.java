/**
 * Implements Item restores a pokemon's PP with use method 
 * @author James Medina?
 *
 */
public class Ether implements Item {
	/**
	 * Ether's name is always Ether
	 */
private String Iname = "Ether";
/**
 * count tracks how many uses the item has
 */
private int  count = 2;	
	@Override
	/**
	 * restores PP
	 * {@link Item}
	 */
	public void use(Pokemon p,Player other) {
		
			
			if(count > 0)
			{
			System.out.println(other.getName() + " used the " + getIname());
			p.setPP(p.getPP() + 10);
			System.out.println( "Restored 10 PP!");
			count--;
			System.out.println( count + " " + getIname() + " left.");
			}
			else
				System.out.println("Outta Items dummmmmmmmmy.");
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
