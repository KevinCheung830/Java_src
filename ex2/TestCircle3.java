package ex2;

// TestCircle3.java: Demonstrate private modifier
public class TestCircle3 {

    /** Main method */
    public static void main(String[] args) {       
        // Create a Circle with radius 5.0
        Circle3 myCircle = new Circle3(5.0);
        System.out.println("The area of the circle of radius " +
                myCircle.getRadius() + " is " + String.format("%.2f", myCircle.getArea()));

        // Increase myCircle's radius by 10%
        myCircle.setRadius(myCircle.getRadius() * 1.1);
        System.out.println("The area of the circle of radius " +
                myCircle.getRadius() + " is " + String.format("%.2f", myCircle.getArea()));
    }
}
