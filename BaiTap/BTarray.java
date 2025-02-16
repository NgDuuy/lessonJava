package BaiTap;

import java.util.Arrays;
import java.util.Scanner;

public class BTarray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bai 1");
        System.out.println("Nhap so nguyen");
        int input = scanner.nextInt();
        int check = 0;
        for (int i = 2; i < Math.sqrt(input); i++) {
            if (input % i == 0) {
                System.out.println("So " + input + " khong phai so nguyen to");
                check = 1;
                break;
            }
        }
        if (check == 0) {
            System.out.println("So " + input + " la so nguyen to");
        }
        System.out.println("Bai 2");
        System.out.println("Nhap so de tao bang cuu chuong");
        int input2 = scanner.nextInt();
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = input2 * (i + 1);
        }
        System.out.println("Bang cuu chuong");
        for (int i = 0; i < 10; i++) {
            System.out.println(input2 + "*" + (i + 1) + "=" + array[i]);
        }
        System.out.println("Bai 3");
        int n = scanner.nextInt();
        int[] mang = new int[n];
        for (int i = 0; i < n; i++) {
            mang[i] = scanner.nextInt();
        }
        // cach tim gia tri max cach 2
        int max1 = mang[0];
        for (int i = 0; i < n; i++) {
            max1 = Math.max(max1, mang[i]);
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (mang[i] > mang[j]) {
                    int idx = mang[i];
                    mang[i] = mang[j];
                    mang[j] = idx;
                }
            }
        }
        System.out.println("Mang sau khi sap xep: " + Arrays.toString(mang));
        System.out.println("Gia tri be nhat: " + mang[0]);
        System.out.println("Gia tri lon nhat: " + mang[n - 1]);
        System.out.println("Bai 4");
        scanner.close();
    }
}
