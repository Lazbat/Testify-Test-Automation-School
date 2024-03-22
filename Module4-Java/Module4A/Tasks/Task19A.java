package Task19;

public class Task19A {
    //FINAL:Create 3 variables of a class A, ballSize, ballColour, ballTexture.
    //and make it impossible to change the value the ballSize in any method in that class

    public static void main(String[] args) {
        //Declare ballSize as a final variable using the "final" keyword,
        //inorder to make it impossible to change the value in any method in this class
       final String ballSize = "medium";

        //Attempting to change the value of ballSize will result in a compilation error
        //ballSize = "large"; //Uncommenting this line will cause a compilation error
        System.out.println(ballSize);

        String ballColour = "white and black";
        ballColour = "yellow";
        System.out.println(ballColour);

        String ballTexture = "hard";
        ballTexture = "soft";
        System.out.println(ballTexture);
    }
}
