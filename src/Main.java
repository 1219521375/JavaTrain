import extend.Employee;
import extend.Manager;

public class Main {
    public static void main(String[] args) {
        Employee e = new Employee("wang",1,7000);
        e.setSalary(10000);
        e.setSalary(10000,1000);
        Employee e1 = new Manager("wang3",1,8000,1000);

        Manager m = new Manager("wang2",1,8000,1000);
        System.out.println(e.getSalary());
        System.out.println(m.getSalary());
        System.out.println(((Manager) e1).getBonus());
    }
}
