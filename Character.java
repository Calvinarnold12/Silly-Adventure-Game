import java.util.ArrayList;

public abstract class Character 
{
   protected String name;
   protected int health; 
   protected int armorValue;
   protected String description;
   protected ArrayList<Item> equipment = new ArrayList<Item>();
   public Character(String name,String description,int health,int armorValue)
   {
    this.name = name;
    this.health = health;
    this.armorValue = armorValue;
    this.description = description;
   }

}
