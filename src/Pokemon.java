

/**
 * Represents a Pokemon 
 * @author James Medina
 */
public abstract class Pokemon {
	/** Stores Power points */
private int HP;
/** Stores Power points */
private int PP;
/** Stores Pokemon's nickname */
private String name;
/** Stores Pokemon's type */
private String type;

/**
 * Constructs the default pokemon
 */
public Pokemon()
{
	HP = 100;
	PP = 50;
	name = "???";
	type = "normal";
	
}
/**
 * constructs a pokemon with HP,PP and nickname
 * @param health pokemon's health points
 * @param power pokemon's power points
 * @param nam pokemon's nickname
 */
public Pokemon(int health,int power,String nam)
{
	HP = health;
	PP = power;
	name = nam;
	
}
/**  returns a pokemon's Health
 * @return HP health points */
public int getHP()
{ return HP;}
/**  returns a pokemon's power points
 * @return PP Power points */
public int getPP()
{ return PP; }
/**  returns a pokemon's Nickname
 * @return name Name */
public String getName()
{ return name;}
/**  returns a pokemon's type
 * @return type type */
public String getType()
{ return type;}



/** sets HP
 * @param h health points */
public void setHP(int h)
{ HP = h; }
/**
 * sets PP
 * @param p Power points
 */
public void setPP(int p)
{ PP = p; }
/**
 * sets nickname
 * @param n name
 */
public void setName(String n)
{ name = n; }
/**
 * sets type
 * @param t type
 */
public void setType(String t)
{ type = t; }



/**
 * used to attack another pokemon takes an int to select a attack which is passed in from the runner
 * @param other the pokemon being attacked
 * @param i what attack the player chose to use
 */
public abstract void attack(Pokemon other, int i);
/**
 * pokemon says it's name
 */
public abstract void speak();
/**
 * Special function that lists all available attacks for a pokemon
 */
public abstract void listAttacks();

}
