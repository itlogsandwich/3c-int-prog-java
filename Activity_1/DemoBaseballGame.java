import java.util.Scanner;

public class DemoBaseballGame
{
  public static void main(String[]args)
  {
    Scanner input = new Scanner(System.in);
    int choice = 0;
    String teamOne = "";
    String teamTwo = "";

    System.out.println("Gamemode:\n[1]Highschool\n[2]Little League");
    choice = input.nextInt();
    input.nextLine();

    System.out.println("Team One");
    teamOne = input.nextLine();

    System.out.println("Team Two");
    teamTwo = input.nextLine();

    int scores[][] = new int[0][0];
    int teamOneScore = 0;
    int teamTwoScore = 0;

    switch(choice)
    {
      case 1:
        HighSchoolBaseballGame hs = new HighSchoolBaseballGame();
        
        hs.setTeamOne(teamOne);
        hs.setTeamTwo(teamTwo);
        
        hs.setScores(teamOne, 6, 5);
        hs.setScores(teamTwo, 6, 2);


        scores = hs.getScores();

        for(int i = 0; i < 6; i++)
        {
          teamOneScore += scores[0][i];
          teamTwoScore += scores[1][i];
        }

        System.out.println("Total Score Tally:\n" + teamOne +": " + teamOneScore + "\n" + teamTwo + ": " + teamTwoScore);

        if(teamOneScore > teamTwoScore)
        {
          System.out.println("Team " + " wins!");
        }
        else
        {
          System.out.println("Team " + teamTwo + " wins!");
        }

      break;
      
      case 2: 
        LittleLeagueBaseballGame ll = new LittleLeagueBaseballGame();
        
        ll.setTeamOne(teamOne);
        ll.setTeamTwo(teamTwo);
        
        ll.setScores(teamOne, 5, 6);
        ll.setScores(teamTwo, 5, 7);

        scores = ll.getScores();

        teamOneScore = 0;
        teamTwoScore = 0;

        for(int i = 0; i < 5; i++)
        {
          teamOneScore += scores[0][i];
          teamTwoScore += scores[1][i];
        }

        System.out.println("Total Score Tally:\n" + teamOne +": " + teamOneScore + "\n" + teamTwo + ": " + teamTwoScore);

        if(teamOneScore > teamTwoScore)
        {
          System.out.println("Team " + teamOne + " wins!");
        }
        else
        {
          System.out.println("Team " + teamTwo + " wins!");
        }
      break;
    }
  }
}
