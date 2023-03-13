import java.util.Arrays;
import java.util.Scanner;

/**
 * Input a Index Position: 3
 * Input a new Value: 120
 * Original Array : [25, 14, 56, 15, 36, 56, 77, 18, 29, 49]
 * New Array: [25, 14, 56, 120, 15, 36, 56, 77, 18, 29]
 */
public class Exercise8 {

  public static void main(String[] args) {

    int[] my_array = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49 };

    Scanner input = new Scanner(System.in);

    System.out.print("Input a Index Position: ");
    int Index_position = input.nextInt();

    System.out.print("Input a new Value: ");
    int newValue = input.nextInt();

    System.out.println("Original Array : " + Arrays.toString(my_array));

    // Write a loop to find the index to insert new value
    // the array size is fixed, what happen to the last element of the array?

    for (int i = my_array.length - 1; i >= Index_position; i--) {
      if (i == Index_position) {
        my_array[i] = newValue;
        break;
      } else {
        my_array[i] = my_array[i - 1];
      }
    }
    System.out.println("New Array: " + Arrays.toString(my_array));
  }
}
