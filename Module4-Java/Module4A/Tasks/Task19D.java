package Task19;

public class Task19D {
    //THIS:https://i.imgur.com/aRkRDPa.png You have a class with a method printName.
    //Write a code in the printName method that will print the instance member which is "Delta" and whatever name the user enter when invoking the method

    String name = "Delta";

    public static void main(String[] args) {
        Task19D name = new Task19D();
        name.printName("Lazbat");
    }

    public void printName(String name){
        System.out.println("This is your name: "+ this.name);
        System.out.println("My name is: "+ name);

    }

}
