package packageOne;

public class ClassA {
    public static void main(String[] args) {
        ClassA access = new ClassA();
        access.packageOneMethod();

    }
    public void packageOneMethod(){
        System.out.println("Method can be accessed anywhere in the project.");
    }
}
