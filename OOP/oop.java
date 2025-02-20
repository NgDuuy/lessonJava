package OOP;

public class oop {
    int sum(int a, int b) {
        return (a + b);
    }

    public static void main(String[] args) {
        System.out.println("OOP");
        oop test = new oop();
        int result = test.sum(5, 10);
        System.out.println("Check sum: " + result);
        student st1 = new student();
        st1.age = 21;
        st1.name = "Duy";
        System.out.println("Student 1 name: " + st1.name + " age " + st1.age);
        student st2 = new student("A", 20);
        System.out.println("Student 2 name: " + st2.name + " age " + st2.age);
        encapsulation st3 = new encapsulation(21, "Duy");
        st3.setName("Nguyen Duc Duy");
        System.out.println("Student 3 name: " + st3.getName() + " age " + st3.getAge());
    }
    // Khi su dung object sử dụng equals thay vì dùng == để so sánh
}
