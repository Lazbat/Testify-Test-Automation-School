package packageTwo;

public class ClassB {
    public static void main(String[] args) {
        ClassB access = new ClassB();
        access.packageTwoMethod();

    }
    private void packageTwoMethod(){
        System.out.println("Method can only be accessed within this class.");
    }
}
