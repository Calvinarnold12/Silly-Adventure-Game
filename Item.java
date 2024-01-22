public abstract class Item
{
    protected int value;
    protected String name;
    protected String description;
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
