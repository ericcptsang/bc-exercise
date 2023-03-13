/**
 * Expected Output:
 * Car Year=2020, Car Model=ModelY
 */
public class Exercise12 {
    // Declare instance variables carYear and carModel
    private Integer carYear;
    private String carModel;

    // Constructor with variables carYear and carModel
    public Exercise12(Integer carYear, String carModel) {
        this.carYear = carYear;
        this.carModel = carModel;
    }

    public static void main(String[] args) {
        Exercise12 myCar = new Exercise12(2020, "ModelY");
        // Create an instance of class Exercise12, with carYear 2020, and carModel
        // "ModelY"
        Exercise12 myCar2 = new Exercise12(2023, "ModelS");
        // print the expected output
        System.out.println("Car Year =" + myCar.carYear + ", Car Model =" + myCar.carModel);
    }
}
