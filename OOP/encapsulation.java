package OOP;

public class encapsulation {
    private String name;
    private int age;

    void setAge(int age) {
        this.age = age;
    }

    void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }

    public encapsulation(int age, String name) {
        this.age = age;
        this.name = name;
    }

}
