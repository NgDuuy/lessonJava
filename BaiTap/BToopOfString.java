package BaiTap;

public class BToopOfString {
    private String name;
    private int id;

    public String getName() {
        return this.name;
    }

    public int getId() {
        return this.id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BToopOfString() {

    }

    public BToopOfString(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [name= " + name + " ,id= " + id + "]";
    }
}
