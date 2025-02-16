package OOP;

public class student {
    // May cai may la attribute
    String name;
    int age;

    public student() {

    }

    public student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Cai nay là method - class method
    public void learnJava() {
        System.out.println("Learn java");
    }

    public int getAge() {
        return age;
    }

}
