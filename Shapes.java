package test;

public class Shapes {

    public static void main(String args[]){


        Shape square = new Shape();
        Shape rectangle = new Shape();
        Shape circle = new Shape();
        Shape sphere = new Shape();
        Shape cube = new Shape();


        System.out.println("Area of Square :" + square.calculateSquareArea(5));
        System.out.println("Area of rectangle :"+ rectangle.calculateRectangularArea(5, 10));
        System.out.println("Volume of cube :"+cube.calculateCubeVolume(7));
        System.out.print("Volume of Sphare :"+sphere.calculateSphareVolume(5));
        System.out.print("Area of Sphare :"+sphere.calculateSphareArea(5));
        System.out.println("Volume of Circle :"+circle.calculateCircleArea(8));

    }
}


   /* Create a class of Shape which can help to instantiate objects.
        The objects will be square, rectangle, circle, cube, sphere
        each object will need to have color and dimensions
        you need to be able to evaluate area for 2 dimension objects
        you need to be able to evaluate volume for 3 dimensional objects
        1)Execute the program separately
        2)Use test ng to test the same
        arulkumart@zeta.tech*/

//Task 1:
//Check it in Github and Share

//Task 2:
    /*Write Test Scenario, cases
        for API,Feature Tests, E2E/End user Tests

        Will look at traceability and how you organise the tests */
