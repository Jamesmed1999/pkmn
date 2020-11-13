/**
 * runner for the whole project
 * @author James Media
 *
 */
public class PokemonRunner {

	public static void main(String[] args) 
	
	{
		
	Pokemon pk1 = new Eevee(100,50,""); //Eevee is a pokemon
	Pokemon pk2 = new Pikachu(100,50,"Zap Master"); //Pikachu is a pokemon
	Item p = new Potion(); //potion is a item
	Item e = new Ether(); //Ether is a item
	Player Human = new PokemonTrainer("",pk1,p); //Player is a Pokemon trainer
	Player Comp = new PokemonTrainer("",pk2,e);

	GameMenu gm = new GameMenu(); 
	gm.intro(Human,Comp,pk1);
	gm.battle(Human, Comp, pk1, pk2, p, e);
	  
	}
 
}
