package test;

public class Shape {

    double pi = 3.14;

    public int calculateRectangularArea (int dimension1, int dimension2){

        return dimension1*dimension2;
    }

    public double calculateSquareArea ( int edge){
        return edge*edge;
    }

    public double calculateCircleArea(int radius){

        return pi*radius*radius;

    }

    public double calculateSphareArea( int radius){

        return 4*pi*radius*radius;
    }

    public double calculateSphareVolume(int radius){

        return (4/3)*pi*radius*radius*radius;
    }

    public double calculateCubeVolume(int edge){
        return edge*edge*edge;
    }

}

// CIrcle Circumference   =   2 • π • radius   =   π • diameter

//Circle Area   =       π • r²     =     ¼ • π • d²


//    Sphere Surface Area     =     4 • π • r²     =     π • d²
//    Sphere Volume   =   4/3 • π • r³     =     ( π •d³)/6

//Cube   V=a3, a = edge

//Square A=a2  a = edge

//Rectangular A=wl   l = length, w = width


  /*  Create a class of Shape which can help to instantiate objects.
        The objects will be square, rectangle, circle, cube, sphere
        each object will need to have color and dimensions
        you need to be able to evaluate area for 2 dimension objects
        you need to be able to evaluate volume for 3 dimensional objects
        1)Execute the program separately
        2)Use test ng to test the same
        arulkumart@zeta.tech
check in git hub and share it with me*/