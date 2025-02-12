package BaiTap;

import java.util.Scanner;

public class BT1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bai 1");
        System.out.println("Nhap diem cua ban:");
        String score = scanner.nextLine();
        System.out.println("Diem cua ban la: " + score);
        System.out.println("Bai 2");
        System.out.println("Nhap chieu dai: ");
        int lenght = scanner.nextInt();
        System.out.println("Nhap chieu rong: ");
        int width = scanner.nextInt();
        System.out.println("Chu vi: " + 2 * (width + lenght));
        System.out.printf("Dien tich hinh chu nhat la: " + (width * lenght) + "\n");
        System.out.println("Canh be nhat la:" + Math.min(width, lenght));
        System.out.println("Bai 3");
        System.out.println("Nhap canh cua hinh lap phuong: ");
        int canh = scanner.nextInt();
        System.out.println("The tich: " + Math.pow(canh, 3));
        scanner.close();
    }
}
