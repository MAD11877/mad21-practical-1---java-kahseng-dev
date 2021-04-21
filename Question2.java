import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    /**
     * Prompts user for height and weight, calculate and print out the BMI of the user
     * 
     * Hint: in.nextDouble() to read double
     */
     
    Scanner in = new Scanner(System.in);
    
    System.out.print("Input height in meters: ");
    double height = in.nextDouble();
    
    System.out.print("Input weight in kilogram: ");
    double weight = in.nextDouble();
    
    double bmi = weight / (height * height);
    System.out.println("\n Your BMI is: " + bmi + " kg/m2");
  }
}
