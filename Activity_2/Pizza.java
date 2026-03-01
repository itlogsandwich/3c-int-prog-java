public class Pizza
{
  protected String[] toppings;
  protected double price;
  protected String description;

  public Pizza(String[] toppings, int amountOfToppings)
  {
    if(amountOfToppings > 10)
    {
      System.out.println("We only serve up to 10 toppings");
      return;
    }

    this.toppings = toppings;
    price = 14;
    description = "";

    for(int i = 0; i < amountOfToppings; i++)
    {
      if(i + 1 == amountOfToppings)
      { 
        description += toppings[i];
      }
      else
      {
        description += toppings[i] + ", ";
      }

      price += 2; 
    }
  }

  public String toString()
  {
    return description + " $"  + price;
  }
}
