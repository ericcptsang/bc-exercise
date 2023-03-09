import java.util.Scanner;

/*
Expected Output: (When input = 4)
   *
  ***
 *****
*******
 *****
  ***
   *
Expected Output: (When input = 7)
      *
     ***
    *****
   *******
  *********
 ***********
*************
 ***********
  *********
   *******
    *****
     ***
      *
 */
public class Exercise6 {

  public static void main(String[] args) {
    int i, j, r;

    System.out.print("Input number of rows (half of the diamond) : ");
    Scanner in = new Scanner(System.in);
    r = in.nextInt();

    for (i = 1; i <= r; i++) {
      for (j = i; j < r; j++) {
        System.out.print(" ");
      }
      for (int x = i; x >= 1; x--) {
        System.out.print("*");
      }
      for (int y = i; y > 1; y--) {
        System.out.print("*");
      }
      System.out.println();
    }
    for (i = 1; i <= r; i++) {
      for (int z = i; z >= 1; z--) {
        System.out.print(" ");
      }
      for (int v = i; v < r; v++) {
        System.out.print("*");
      }
      for (int w = i; w < (r - 1); w++) {
        System.out.print("*");
      }
      System.out.println();
    }

    // Upper Part: increasing parttern
    // Think about how to print " " and "*"
    // and when to new line 

    // Lower Part: decreasing parttern
    // Think about how to print " " and "*"
    // and when to new line

  }
}
