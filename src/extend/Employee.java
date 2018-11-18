package extend;

public class Employee extends Person {
    private String name;
    private int sex; //0 nv 1 nan
    private int salary;

    public Employee(String name, int sex, int salary) {
        this.name = name;
        this.sex = sex;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    /**
     * 同名方法重载
     * @param salary
     * @param pyDeal
     */

    public void setSalary(int salary,int pyDeal) {
        this.salary = salary + pyDeal;
    }









}
