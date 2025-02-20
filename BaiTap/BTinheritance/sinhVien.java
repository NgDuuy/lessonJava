package BaiTap.BTinheritance;

public abstract class sinhVien {
    protected int id;
    protected String name;
    protected double price;
    protected double tax;

    abstract void tinhDiem();

    public sinhVien(int id, String name, double price, double tax) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.tax = tax;
    }

    protected double getPrice(double price, double tax) {
        return this.price * this.tax;
    }

    public void infor() {
        System.out.println("Run into from parent");
    }
}
