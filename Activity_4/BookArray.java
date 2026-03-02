import java.util.Scanner;

public class BookArray
{
  public static void main(String[] args)
  {
    Book[] books = new Book[10];

    Scanner input = new Scanner(System.in);
    String title = "";

    IO.println("Good sire, compile ten books, and I shall grant them to you.");

    int i = 0;
    do{ 
      char type = ' ';
      IO.print("Give me a title: ");
      title = input.nextLine();

      IO.println("What kind of book is this?\n[F]Fiction\n[N]Non-Fiction");
      type = input.next().charAt(0);
      type = Character.toUpperCase(type);
      
      input.nextLine();
      switch(type)
      {
        case 'F':
          Fiction fiction = new Fiction(title);
          books[i] = fiction;
          i++;
        break;
        
        case 'N':
          NonFiction NonFiction = new NonFiction(title);
          books[i] = NonFiction;
          i++;
        break;

        default:
          IO.println("You must tell me the category");
      }
    }
    while(i < 10);

    for(int j = 0; j < books.length; j++)
    {
      IO.println(books[j].toString());
      IO.println();
    }
  }
}
