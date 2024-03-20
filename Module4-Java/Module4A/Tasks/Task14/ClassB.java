package task14;

public class ClassB {
    public static void main(String[] args) {
        ClassA square = new ClassA();
        int shapeSides = square.getShapeSides();

        //set values for the length and breadth
        square.setShapeLength(7);
        square.setShapeBreadth(7);

        //get the values of the length and breadth
        double shapeLength = square.getShapeLength();
        double shapeBreadth = square.getShapeBreadth();

        //calculate the area
        double area = square.getShapeLength() * square.getShapeBreadth();

        //print out your final calculation
        System.out.println("The area of a square of length:" + square.getShapeLength() + " and breadth " + square.getShapeBreadth() +  " is " + area);

    }
}
