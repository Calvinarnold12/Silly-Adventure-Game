public abstract class Item
{
    protected int value;
    protected String name;
    protected String description;
    protected boolean isEquipped;
    public Item(String name, String description, int value)
    {
        this.name = name;
        this.description = description;
        this.value = value;
    }
    public int getValue()
    {
        return value;
    }
    public String getName()
    {
        return name;
    }
    public String getDesc()
    {
        return description;
    }
    public void equipItem()
    {
        isEquipped = true;
    }
    public void dequipItem()
    {
        isEquipped = false;
    }
    @Override
    public String toString()
    {
        String item = "";
        item = item + name +"\n";
        item = item + description +"\n";
        item = item + "Worth " + value + "GP"; 
        return item;
    }
    
}
