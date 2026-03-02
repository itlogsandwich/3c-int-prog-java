public class Rock
{
  protected int numberOfSamples;
  protected double weight;
  protected String description; 

  public Rock(int numberOfSamples, double weight)
  {
    this.numberOfSamples = numberOfSamples;
    this.weight = weight;
    
    description = "Unclassified";
  }

  public int getNumberOfSamples()
  {
    return numberOfSamples;
  }

  public double getWeight()
  {
    return weight;
  }

  public void setNumberOfSamples(int numberOfSamples)
  {
    this.numberOfSamples = numberOfSamples; 
  }

  public void setWeight(double weight)
  {
    this.weight = weight;
  }

  public String toString()
  {
    return "===Rock Details===\nDescription: " + description + "\nNumber of Samples: " + numberOfSamples + "\nWeight: " + weight;
  }
}
