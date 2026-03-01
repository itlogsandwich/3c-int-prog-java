public class DeliveryPizza extends Pizza
{
  protected double deliveryFee;
  protected String deliveryAddress;
 
  public DeliveryPizza(String[] toppings, String deliveryAddress, int amountOfToppings) 
  {
    super(toppings, amountOfToppings);

    this.deliveryAddress = deliveryAddress;

    if(super.price > 18)
    {
      deliveryFee = 3;
    }
    else
    {
      deliveryFee = 5;
    }
  }
}
