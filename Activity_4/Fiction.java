public class Fiction extends Book
{
  private final double FICTION_PRICE = 24.99;

  public Fiction(String title)
  {
    super(title);
    setPrice(FICTION_PRICE);
  }

  @Override
  public void setPrice(double price)
  {
    super.price = price;
  }
}
