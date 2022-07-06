package Ex4;

public class NhanVien extends CanBo{
    private String congviec;

    public NhanVien(String name, int age, String gender, String address, String congviec) {
        super(name, age, gender, address);
        this.congviec = congviec;
    }

    public NhanVien(String congviec) {
        this.congviec = congviec;
    }

    public String getCongviec() {
        return congviec;
    }

    public void setCongviec(String congviec) {
        this.congviec = congviec;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", congviec='" + congviec + '\'' +
                '}';
    }
}
