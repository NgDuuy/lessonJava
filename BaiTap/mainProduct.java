package BaiTap;

public class mainProduct {
    public static void main(String[] args) {
        System.out.println("Bai 1");
        Product test = new Product();
        Product sanpham2 = test.nhapThongtin("Nuoc", 5000, 0.05);
        test.xuatThongTin(sanpham2);
        test.getTaxPrice(sanpham2.getPrice(), sanpham2.getTax());
    }
}
