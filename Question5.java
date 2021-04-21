import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    // User input for number of integers
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[] array = new int[n];

    for (int i=0; i < n; i++) {
      int num = in.nextInt();
      array[i] = num;
    }

    // Find mode
    int maxNumber = -1;
    int maxAppearances = -1;

    for(int j=0; j < array.length; j++) {
      int count = 0;

      for(int k=0; k < array.length; k++) {
        if (array[j] == array[k])
          count++;
      }

      if (count > maxAppearances) {
        maxNumber = array[j];
        maxAppearances = count;
      }
    }

    System.out.println(maxNumber); // Mode of array
  }
}
