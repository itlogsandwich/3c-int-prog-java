import java.util.Scanner;

public class UseBook
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    String title = "";
    double price = 0.00;

    IO.println("Tell me about this Fictional Book");

    IO.print("Title: ");
    title = input.nextLine();

    Fiction fiction = new Fiction(title);
    IO.println();   
    IO.println(fiction.toString());
 
    IO.println("\n==========\n");
    IO.println("Tell me about this Non-Fictional Book");

    IO.print("Title: ");
    title = input.nextLine();

    NonFiction nonFiction = new NonFiction(title); 
    IO.println();   
    IO.println(nonFiction.toString());
  }
}
