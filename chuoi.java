import java.util.Arrays;

public class chuoi {
    public static void main(String[] args) {
        String[] clubs = { "MU", "MC", "LV" };

        clubs[0] = "Arsenal";
        System.out.println("Run away: First element " + clubs[0]);
        System.out.println("Run away: " + Arrays.toString(clubs));// In ra toàn bộ mảng
        System.out.println("Chieu dai cua chuoi: " + clubs.length);

        // Khoi tao 1 mang nhung chua muon gan gia tri cho no
        String[] a = new String[5];
        a[0] = "1";
        System.out.println("Run here array: First element " + a[1]);

        String[] cars = { "Volvo", "BMW", "Ford", "Lambogini" };
        for (int i = 0; i < cars.length; i++) {
            System.out.println("Car: " + cars[i]);
        }
    }

}
