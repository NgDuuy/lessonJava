package BaiTap;

import java.util.Scanner;

public class BT2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so tien: ");
        int money = scanner.nextInt();
        System.out.printf("So tien la: %d dong\n", money);
        if (money < 10) {
            System.out.println("Khong dong thue");
        } else if (money >= 10 && money < 15) {
            System.out.println("So tien dong thue la: 10%");
        } else if (15 <= money && money < 30) {
            System.out.println("So tien dong thue la 20%");
        } else if (money > 30) {
            System.out.println("So tien phai dong thue la: 50%");
        }
        scanner.close();
    }
}
