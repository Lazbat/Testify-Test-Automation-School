package task16B;

public class ChildClass extends ParentClass{
    //Override the 2 methods in the child class,
    // and write a different print statement in the body of the overriding method

    public static void main(String[] args) {
        ChildClass lazbat = new ChildClass();
        lazbat.readBooks("Nora Roberts", "True Betrayals");
        lazbat.watchFootball("Manchester United", false);

    }
    public void readBooks(String author, String title){
        System.out.println("I love to read anything readable but my favorite genre is romance.");
    }

    public void watchFootball(String club, boolean condition){
        System.out.println("I am not happy with Manchester United's current performance.");
    }
}
