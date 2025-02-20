package BaiTap.BTinheritance;

public class sinhVienIT extends sinhVien {
    private String language;

    // public sinhVienIT() {

    // }
    public String getLanguage() {
        return this.language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public sinhVienIT(String language, int id, String name, double price, double tax) {
        super(id, name, price, tax);
        this.language = language;
    }

    public void getMoney() {
        System.out.println("Run get money");
        super.infor();
    }

    public void infor() {
        System.out.println("Run into from sinhVienIT");
    }

    @Override
    void tinhDiem() {

    }
}
