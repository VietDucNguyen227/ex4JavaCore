package Ex4;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class CanBo {
    protected String name;
    protected int age;
    protected String gender;
    protected String address;

    public CanBo(String name, int age, String gender, String address) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
    }

    public CanBo()
    {

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "CanBo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    ArrayList<CanBo> canBos = new ArrayList<>();

    public void AddCanBo(CanBo canBo){
        canBos.add(canBo);
    }

    public void FindCanBo(String name){
        for (CanBo cb : canBos){
            if (name.equals(cb.getName())){
                System.out.println(cb);
            }else{
                System.err.println("Not Found");
            }
        }
    }

    public void ShowListCanBo(){
        for (CanBo canBo : canBos){
            System.out.println(canBo);
        }
    }
}
