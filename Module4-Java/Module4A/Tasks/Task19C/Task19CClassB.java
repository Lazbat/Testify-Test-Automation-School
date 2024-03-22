package Task19;

public class Task19CClassB extends Task19CClassA {
    String name = "Anderson";

    public static void main(String[] args) {
        Task19CClassB data = new Task19CClassB();
        data.printName();
    }

    public void printName(){
        System.out.println("My ClassA name is "+ super.name);
        System.out.println("My ClassB name is "+ name);

    }
}
