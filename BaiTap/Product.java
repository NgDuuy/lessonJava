package BaiTap;

public class Product {
    private int price;
    private double tax;
    private String name;

    public int getPrice() {
        return this.price;
    }

    public double getTax() {
        return this.tax;
    }

    public String getName() {
        return this.name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public void setName(String name) {
        this.name = name;
    }

    double getTaxPrice() {
        return this.tax * (double) this.price;
    }

    public Product() {

    }

    public Product(String name, int price, double tax) {
        this.name = name;
        this.price = price;
        this.tax = tax;
    }

    double getTaxPrice(int price, double tax) {
        return getTax() * (double) getPrice();
    }

    // public void nhapThongTin() {
    // Scanner Scan = new Scanner(System.in).useLocale(Locale.US);
    // System.out.println("Nhap ten san pham:");
    // this.name = Scan.nextLine();
    // System.out.println("Nhap gia san pham:");
    // this.price = Scan.nextInt();
    // System.out.println("Nhap thue: ");
    // this.tax = Scan.nextDouble();
    // Scan.close();
    // }
    public Product nhapThongtin(String name, int price, double tax) {
        Product pr = new Product(name, price, tax);
        return pr;
    }

    public void xuatThongTin(Product Pr) {
        System.out.println("Ten san pham: " + Pr.getName());
        System.out.println("Gia: " + Pr.getPrice());
        System.out.println("So tien thue: " + Pr.getTaxPrice());
    }

}
