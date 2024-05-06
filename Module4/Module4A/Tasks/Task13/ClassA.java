package task13;

public class ClassA {
    String name;
    int age;
    boolean female;

    public ClassA(String name) {
        this.name = name;
    }

    public ClassA(int age) {
        this.age = age;
    }

    public ClassA(boolean female) {
        this.female = female;
    }

    public ClassA(String name, int age){
        this.name = name;
        this.age = age;
    }

    public ClassA(String name, int age, boolean female){
        this.name = name;
        this.age = age;
        this.female = female;
    }

}
