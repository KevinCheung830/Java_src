package ex2;

public class TestCircle2 {

    /** Main method */
    public static void main(String[] args) {
        // Create c1
        Circle2 c1 = new Circle2();

        // Display c1 BEFORE c2 is created
        System.out.println("Before creating c2");
        System.out.println("c1 is : radius (" + c1.radius +
                ") and number of Circle objects (" + c1.numberOfObjects + ")");

        // Create c2
        Circle2 c2 = new Circle2(5);

        // Change the radius in c1
        c1.radius = 9;

        // Display c1 and c2 AFTER c2 was created
        System.out.println("\nAfter creating c2 and modifying c1's radius to 9");
        System.out.println("c1 is : radius (" + c1.radius +
                ") and number of Circle objects (" + c1.numberOfObjects + ")");
        System.out.println("c2 is : radius (" + c2.radius +
                ") and number of Circle objects (" + c2.numberOfObjects + ")");
    }
}
