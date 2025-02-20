package BaiTap.BTinheritance;

public class bk {
    public static void main(String[] args) {
        sinhVienIT it1 = new sinhVienIT("java", 1, "Duy", 100, 2000);
        System.out.println(it1.id + " It1: " + it1.getLanguage());

        sinhVienCoKhi cokhi1 = new sinhVienCoKhi("Che tao may", 1, "Ende", 100, 2000);
        System.out.println(cokhi1.id + " Cokhi1: " + cokhi1.getSkill());
    }
}
