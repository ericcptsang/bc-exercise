/**
 * Expected Output:
 * Static methods can be called without creating objects
 * Public methods must be called by creating objects
 */
public class Exercise14 {
    // Static method
    static void myMethod() {
        System.out.println("Static methods can be called without creating objects");
    }

    // instance method
    public void anotherMethod() {
        System.out.println("Public methods must be called by creating objects");
    }

    // Main method
    public static void main(String[] args) {
        // 1. Static method
        // Call the static method
        myMethod();

        // 2. Instance Method
        // myPublicMethod(); This would compile an error, why?
        // myAns: need an object to call it


        Exercise14 exercise = new Exercise14();
        exercise.anotherMethod();
        // Create an object of Exercise14
        // Call the public method on the object
    }
}
