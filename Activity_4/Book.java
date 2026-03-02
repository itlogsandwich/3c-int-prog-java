public abstract class Book
{
  String title;
  double price;

  public Book(String title)
  {
    this.title = title;
  }

  public String getTitle()
  {
    return title;
  }

  public double getPrice()
  {
    return price;
  }

  public abstract void setPrice(double price);

  public String toString()
  {
    return "===Book Details===" + "\nTitle: " + title + "\nPrice: $" + price;
  }
}
