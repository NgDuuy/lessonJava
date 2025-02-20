package BaiTap;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class BTarrayList {
    public static void main(String[] args) {
        ArrayList<Double> newArray = new ArrayList<Double>();
        // Scanner scanner = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Nhap so phan tu cua mang ban muon tinh tong");
        int count = scanner.nextInt();
        System.out.println("Nhap cac phan tu:");
        for (int i = 0; i < count; i++) {
            newArray.add(scanner.nextDouble());
        }
        int sum = 0;
        for (int i = 0; i < newArray.size(); i++) {
            sum += newArray.get(i);
        }
        System.out.println("ArrayList: " + newArray.toString());
        System.out.println("Total of all number in this ArrayList is: " + sum);
        ArrayList<Double> newArray2 = new ArrayList<Double>();
        System.out.println("Enter array 2");
        while (true) {
            System.out.println("Put a number:");
            double input = scanner.nextDouble();
            newArray2.add(input);
            scanner.nextLine();
            System.out.println("Do you want to continue? Yes (Y) or Not (N)");
            String option = scanner.nextLine();
            if (option.equals("N") || option.equals("n")) {
                break;
            }
        }
        int total = 0;
        for (int i = 0; i < newArray2.size(); i++) {
            total += newArray2.get(i);
        }
        System.out.println("ArrayList2: " + newArray2.toString());
        System.out.println("Total array2: " + total);
        scanner.close();
    }
}
