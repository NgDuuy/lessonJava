package BaiTap;

import java.util.Scanner;

public class BTifelse {
    public static void Bai1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bai tap 1");
        System.out.println("Nhap hai so nguyen a va b: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a == 0 && b == 0) {
            System.out.println("Phuong trinh vo so nghiem");
        } else if (a == 0 && b != 0) {
            System.out.println("Phuong trinh vo nghiem");
        } else if (a != 0 && b == 0) {
            System.out.println("Nghiem cua phuong trinh la: x=0");
        } else {
            float nghiem = (float) -b / a;
            System.out.printf("Phuong trinh co dang: %dx+%d\n", a, b);
            System.out.printf("Nghiem cua phuong trinh: %.2f", nghiem);
        }

        scanner.close();
    }

    public static void Bai2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bai tap 2");
        System.out.println("Nhap 3 so nguyen a, b, c");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        System.out.printf("Phuong trinh bac 2 co dang: %dx^2+%dx+%d", x, y, z);
        double denta = Math.pow(y, 2) - 4 * x * z;
        if (denta < 0) {
            System.out.println("Phuong trinh vo nghiem");
        } else if (denta == 0) {
            System.out.println("Phuong trinh co nghiem kep");
            System.out.printf("Nghiem cua phuong trinh: x = %.2f", (-y) / (2 * x));
        } else if (denta > 0) {
            System.out.println("Phuong trinh co 2 nghiem pha biet");
            System.out.printf("Nghiem dau tien: x1=%.2f", (-y + Math.sqrt(denta)) / (2 * x));
            System.out.printf("Nghiem dau tien: x2=%.2f", (-y - Math.sqrt(denta)) / (2 * x));
        }
        scanner.close();
    }

    public static void Bai3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so dien:");
        int soDien = scanner.nextInt();
        if (soDien >= 0 && soDien <= 100) {
            System.out.println("So tien dien la: " + (1000 * soDien));
        } else if (soDien > 100) {
            System.out.println("So tien dien la: " + (100 * 1000 + (soDien - 100) * 1500));
        }
        scanner.close();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bai tap 1");
        System.out.println("Nhap hai so nguyen a va b: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a == 0 && b == 0) {
            System.out.println("Phuong trinh vo so nghiem\n");
        } else if (a == 0 && b != 0) {
            System.out.println("Phuong trinh vo nghiem\n");
        } else if (a != 0 && b == 0) {
            System.out.println("\nNghiem cua phuong trinh la: x=0");
        } else {
            float nghiem = (float) -b / a;
            System.out.printf("Phuong trinh co dang: %dx+%d\n", a, b);
            System.out.printf("Nghiem cua phuong trinh: %.2f", nghiem);
        }
        System.out.println("\nBai tap 2");
        System.out.println("Nhap 3 so nguyen a, b, c");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        System.out.printf("Phuong trinh bac 2 co dang: %dx^2+%dx+%d\n", x, y, z);
        double denta = Math.pow(y, 2) - 4 * x * z;
        if (denta < 0) {
            System.out.println("Phuong trinh vo nghiem");
        } else if (denta == 0) {
            System.out.println("Phuong trinh co nghiem kep");
            System.out.printf("Nghiem cua phuong trinh: x = %.2f\n", (-y) / (2 * x));
        } else if (denta > 0) {
            System.out.println("\nPhuong trinh co 2 nghiem phan biet");
            System.out.printf("Nghiem dau tien: x1=%.2f\n", (-y + Math.sqrt(denta)) / (2 * x));
            System.out.printf("Nghiem dau tien: x2=%.2f\n", (-y - Math.sqrt(denta)) / (2 * x));
        }
        System.out.println("Bai tap 3");
        System.out.println("Nhap so dien:");
        int soDien = scanner.nextInt();
        if (soDien >= 0 && soDien <= 100) {
            System.out.println("So tien dien la: " + (1000 * soDien));
        } else if (soDien > 100) {
            System.out.println("So tien dien la: " + (100 * 1000 + (soDien - 100) * 1500));
        }

        System.out.println("Bai tap 4");
        System.out.println(">> LỰA CHỌN TÍNH NĂNG <<");
        System.out.println("++ ----------------------------------------- ++");
        System.out.println("| 1. Giải phương trình bậc nhất |");
        System.out.println("| 2. Giải phương trình bậc hai |");
        System.out.println("| 3. Tính số tiền điện |");
        System.out.println("| 4. Kết thúc |");
        System.out.println("++ ------------------ ++");
        System.out.println("Nhap lua chon");
        int choose = scanner.nextInt();
        switch (choose) {
            case 1:
                Bai1();
                break;
            case 2:
                Bai2();
                break;
            case 3:
                Bai3();
                break;
            default:
                System.out.println(">>Ban da thoat chuong trinh<<");
                System.exit(0);
        }
        scanner.close();
    }
}
