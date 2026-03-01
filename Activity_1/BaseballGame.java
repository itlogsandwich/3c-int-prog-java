public class BaseballGame
{
  protected String teamOne;
  protected String teamTwo;
  protected final int INNINGS = 9;
  protected int[][] scores;

  public BaseballGame()
  {
    scores = new int [2][INNINGS];
  }

  public String getTeamOne()
  {
      return teamOne;
  }

  public String getTeamTwo()
  {
    return teamTwo;
  }

  public void setTeamOne(String teamOne)
  {
    this.teamOne = teamOne;
  }

  public void setTeamTwo(String teamTwo)
  {
    this.teamTwo = teamTwo;
  }

  public int[][] getScores()
  {
    return scores;
  }

  public void setScores(String team, int inning, int score)
  {
    for(int i = 0; i < inning; i++)
    {
      if(team.equals(getTeamOne()))
      {
        scores[0][i] = score;
      }
      else
      {
        scores[1][i] = score;
      }
    }
  }
}
