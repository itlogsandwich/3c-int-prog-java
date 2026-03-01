import java.util.Scanner;

public class DemoPizza
{
  static final int MAX_TOPPINGS = 10;

  public static void main(String[]args)
  {

    Scanner input = new Scanner(System.in);
    String[] toppings = new String[MAX_TOPPINGS];
    IO.println("Apply Toppings to your pizza fr");
    IO.println("Say STOP to stop.");
    String topping = "";

    int count = 0;
    while(count < MAX_TOPPINGS)
    {
      IO.println("Topping: " + (count + 1));
      topping = input.nextLine(); 

      if(topping.equalsIgnoreCase("STOP"))
      {
        break;
      }

      toppings[count] = topping;
      count += 1; 
    }

    int amountOfToppings = count;
    IO.println("Do you want this delivered or not?\n[1]Yes (to be delivered)\n[2]No (don't deliver)");
    int choice = 0;

    choice = input.nextInt();
    input.nextLine();

    if(choice == 1)
    {
      String address = "";
      IO.println("Enter your address to be delivered to");

      address = input.nextLine();
      DeliveryPizza dz = new DeliveryPizza(toppings, address, amountOfToppings);
      
      IO.println(dz.toString());
    }
    else
    {
      Pizza pizza = new Pizza(toppings, amountOfToppings);
      IO.println(pizza.toString());
    }
  }
}
