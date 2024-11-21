public class TrialClass {

    // Constructor
    public TrialClass() {
        System.out.println("Constructor called: Object of TrialClass has been created.");
    }

    // Non-static method
    public void nonStaticMethod() {
        System.out.println("This is a non-static method. It requires an object of the class to be called.");
    }

    // Static method 1
    public static void staticMethodOne() {
        System.out.println("This is the first static method. You can call it directly without an object.");
    }

    // Static method 2
    public static void staticMethodTwo() {
        System.out.println("This is the second static method. It also does not require an object to be called.");
    }

    // Main method
    public static void main(String[] args) {
        // Call static methods
        System.out.println("Calling static methods:");
        TrialClass.staticMethodOne();
        TrialClass.staticMethodTwo();

        // Create an object to invoke the constructor
        System.out.println("\nCreating an object of TrialClass:");
        TrialClass trial = new TrialClass();

        // Call the non-static method
        System.out.println("\nCalling the non-static method:");
        trial.nonStaticMethod();
    }
}
