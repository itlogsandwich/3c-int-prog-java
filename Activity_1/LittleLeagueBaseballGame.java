public class LittleLeagueBaseballGame extends BaseballGame
{
  protected final int INNINGS = 6;

  public LittleLeagueBaseballGame()
  {
    super.scores = new int [2][INNINGS];
  }
}
