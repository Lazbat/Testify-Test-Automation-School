package task15;

public class ClassB extends ClassA{
    //Create a child class "B" with 2 methods and add a print statement in all the methods.
    //Method 4
    public void myPets() {
        System.out.println("I have two pet cats.");
    }
    //Method 5
    public void myFaveColors() {
        System.out.println("My favorite colors are pink and white.");
    }
    //Invoke all 5 methods in a main method in the child class "B"
    public static void main(String[] args) {
        //Create an object of ClassB
        ClassB data = new ClassB();

        // Call methods from both ClassA and ClassB
        data.readBooks();
        data.watchFootball();
        data.myCareer();
        data.myPets();
        data.myFaveColors();
    }
}