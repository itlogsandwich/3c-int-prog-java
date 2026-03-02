public class NonFiction extends Book
{
  private final double NON_FICTION_PRICE = 37.99;

  public NonFiction(String title)
  {
    super(title);
    setPrice(NON_FICTION_PRICE);
  }
  
  @Override
  public void setPrice(double price)
  {
    super.price = price;
  }
}
