package BaiTap.BTinheritance;

public class sinhVienCoKhi extends sinhVien {
    private String skill;

    public String getSkill() {
        return this.skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public sinhVienCoKhi(String skill, int id, String name, double price, double tax) {
        super(id, name, price, tax);
        this.skill = skill;
    }

    @Override
    void tinhDiem() {

    }
}
