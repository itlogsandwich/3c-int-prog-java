import java.util.*;
import java.io.*;

class FileHandling 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        String outputPath = "output.txt";
        String resultPath = "result.txt";

        System.out.println("Enter numbers separated by commas (e.g., 10,abc,20,30):");
        String inputLine = scan.nextLine();

        try (PrintWriter writer = new PrintWriter(new FileWriter(outputPath))) 
        {
            writer.println(inputLine);
        }
        catch (IOException e) 
        {
            System.out.println("Error writing to output.txt");
        }

        double sum = 0;
        int count = 0;
        
        try (Scanner fileReader = new Scanner(new File(outputPath));
             PrintWriter resultWriter = new PrintWriter(new FileWriter(resultPath))) 
        {
            
            if (fileReader.hasNextLine()) 
            {
                String[] values = fileReader.nextLine().split(",");

                for (String val : values) 
                {
                    val = val.trim();
                    try 
                    {
                        double num = Double.parseDouble(val);
                        sum += num;
                        count++;
                    }
                    catch (NumberFormatException e) 
                    {
                        System.out.println("Skipped invalid value: " + val);
                    }
                }
            }

            if (count > 0) 
            {
                double average = sum / count;
                String output = String.format("Sum : %.0f\nCount: %d\nAverage: %.1f", sum, count, average);
                
                System.out.println(output);
                resultWriter.println(output);
            }

        }
        catch (IOException e) 
        {
            System.out.println("Error processing files.");
        }
    }
}
