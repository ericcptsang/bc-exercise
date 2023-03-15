// Please complete ClassA.java
public class Exercise16 {
    // 1
    public static final int SOME_NUMBER = initSomeNum();
    public static int someOtherNumber = 99;
    // 2
    public final String someString = initSomeString();

    // 1.2
    // one static initialization block to print Something here
    static {
        System.out.println("1.2: do sth in static initialization block");
        // someOtherNumber = 100;
    }

    // 2.2
    // initialization block to print Something here
    {
        System.out.println("2.2: do sth in non static initialization block");
    }

    // 1.1
    // one static Method initSomeNum() return int 0, print Something here
    private static int initSomeNum() {
        System.out.println("1.1: declare private static");
        return 0;
    }

    // 2.1
    // Instance Method initSomeString() return String and print something here
    private String initSomeString() {
        System.out.println("2.1: declare non static/attributes");
        return "String 2.1";
    }

    // A Constructor for ClassA to print something here
    public Exercise16() {
        System.out.println("do sth in Constructor");

    }

    /*
     * ------ Output ------
     * [Class A] Beginning of object creation
     * [Class A] Calling private static method
     * [Class A] Calling static initialization block
     * [Class A] Calling private method
     * [Class A] Calling initialization block
     * [Class A] Calling constructor
     * [Class A] End of object creation
     */

    public static void main(String[] args) {
        System.out.println("[Class A] Beginning of object creation : enter the main");
        Exercise16 objectA = new Exercise16();
        System.out.println("[Class A] End of object creation");

    }
}
