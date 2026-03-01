public class HighSchoolBaseballGame extends BaseballGame
{
  protected final int INNINGS = 7;

  public HighSchoolBaseballGame()
  {
    super.scores = new int [2][INNINGS];
  }
}
