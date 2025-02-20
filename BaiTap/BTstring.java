package BaiTap;

import java.util.ArrayList;
import java.util.Scanner;

public class BTstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bai 1");
        System.out.println("Nhap vao user name");
        String userName = scanner.nextLine();
        System.out.println("Nhap vao password");
        String passWord = scanner.nextLine();
        System.out.println("UserName: " + userName + " ,password " + passWord);
        if (userName.equals("DuyNguyen")) {
            System.out.println(">>>Run me compare DuyNguyen");
        }
        if (passWord.length() > 6) {
            System.out.println("Valid input");
        }
        System.out.println("Bai 2");
        BToopOfString st1 = new BToopOfString(1, "Hoi Dan It");
        BToopOfString st2 = new BToopOfString(2, "Nguyen Van A");
        BToopOfString st3 = new BToopOfString(3, "Tran Van B");
        BToopOfString st4 = new BToopOfString(4, "Nguyen Thi C");
        BToopOfString st5 = new BToopOfString(5, "Le thi D");
        ArrayList<BToopOfString> student = new ArrayList<BToopOfString>();
        student.add(st1);
        student.add(st2);
        student.add(st3);
        student.add(st4);
        student.add(st5);

        // Dung ham startWith de lay cac ten bat dau bang Nguyen
        for (int i = 0; i < student.size(); i++) {
            if (student.get(i).getName().startsWith("Nguyen")) {
                System.out.println("Start with Nguyen: " + student.get(i));
            }
        }
        System.out.println(">>>Check array: " + student);
        scanner.close();
    }
}
