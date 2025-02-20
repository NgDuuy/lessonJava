package OOP.inheritance;

public class car extends vehicle {
    private String modeName = "Murstang";

    public static void main(String[] args) {
        car myCar = new car();
        myCar.honk();
        System.out.println(myCar.brand + " " + myCar.modeName);
    }

}
