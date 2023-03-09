/**
 * Expected Output:
 * J
 * e
 * 3
 * 9
 * 10
 * ab c
 * VenturenixLAB, Coding
 * 19
 * ren
 * VENTURENIXLAB, JAVA
 * venturenixlab, java
 * V*NTUR*NIXLAB, JAVA!!!
 */
public class Exercise2 {
  public static void main(String[] args) {
    String str = "VenturenixLAB, Java";

    // Use int name.charAt()
    // prints J
    System.out.println(str.charAt(15));
    // prints e
    System.out.println(str.charAt(1));

    // Use int indexOf(int ch), or int indexOf(String ch)
    // prints 3
    System.out.println(str.indexOf("t"));
    // prints 9
    System.out.println(str.indexOf("x"));
    // prints 10
    System.out.println(str.indexOf("L"));

    // Use String trim()
    String abc = "    ab c    ";
    // prints "ab c"
    System.out.println(abc.trim());

    // Use String replace() method
    // prints VenturenixLAB, Coding
    System.out.println(str.replace("Java", "Coding"));

    // int length()
    // prints 19
    System.out.println(str.length());

    // Use String substring(int start, int end)
    // prints "ren"
    System.out.println(str.substring(5, 8));

    // String toLowerCase(), and String toUpperCase()
    // print "VENTURENIXLAB, JAVA"
    System.out.println(str.toUpperCase());
    // prints "venturenixlab, java"
    System.out.println(str.toLowerCase());

    // Method Chaining, replaceAll(), toUpperCase(), concat()
    // prints "V*NTUR*NIXLAB, JAVA!!!"
    System.out.println(str.replace("e", "*").toUpperCase().concat("!!!"));
  }

}