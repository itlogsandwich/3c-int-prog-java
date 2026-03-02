import java.util.Scanner;

public class DemoRocks
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    char choice = ' ';
    int numberOfSamples = 0;
    double weight = 0;

    IO.println("""
        What kind of rock do you have my brotha?
        [U]Unclassified
        [I]Ignenous
        [M]Metamorphic
        [S]Sedimentery
        """);
    
    choice = input.next().charAt(0);
    input.nextLine();
    choice = Character.toUpperCase(choice);
    switch(choice)
    {
      case 'U':    
        IO.println("How many samples?");
        numberOfSamples = input.nextInt();
        input.nextLine();

        IO.println("How much does it weigh?");
        weight = input.nextDouble();
        input.nextLine();

        Rock rock = new Rock(numberOfSamples, weight); 

        IO.println(rock.toString());
      break;

      case 'I':

        IO.println("How many samples?");
        numberOfSamples = input.nextInt();
        input.nextLine();

        IO.println("How much does it weigh?");
        weight = input.nextDouble();
        input.nextLine();

        IgneousRock iRock = new IgneousRock(numberOfSamples, weight); 

        IO.println(iRock.toString());
      break;
      case 'S':

        IO.println("How many samples?");
        numberOfSamples = input.nextInt();
        input.nextLine();

        IO.println("How much does it weigh?");
        weight = input.nextDouble();
        input.nextLine();

        SedimenteryRock sRock = new SedimenteryRock(numberOfSamples, weight); 

        IO.println(sRock.toString());
      break;
      case 'M':
        IO.println("How many samples?");
        numberOfSamples = input.nextInt();
        input.nextLine();

        IO.println("How much does it weigh?");
        weight = input.nextDouble();
        input.nextLine();

        MetamorphicRock mRock = new MetamorphicRock(numberOfSamples, weight); 

        IO.println(mRock.toString());
      break;
      
      default:
        rock = new Rock(0, 0);

        IO.println(rock.toString());
      break;
    }
  }
}
