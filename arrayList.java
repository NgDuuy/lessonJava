import java.util.ArrayList;

import OOP.student;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<String> a1 = new ArrayList<String>();// generic
        ArrayList<student> students = new ArrayList<student>();// generic
        a1.add("error");
        a1.add("Hoi dan it");
        System.out.println(a1.toString() + " " + a1.size() + " " + a1.get(1));
        // Truy cập phần tử dùng .get
        // lấy chiều dài của arraylist dùng .size
        // Them phan tu dung .add()
        // xoa tat ca dung .clear()
        // xoa 1 phan tu dung .remove()
        // Dung arrayList nho de y den viec su dung loai du lieu khong phai nguyen thuy.
        // VD: Du lieu nguyen thuy la:int char double,
        // nhung du lieu khong nguyen thuy la String, Double
    }
}
