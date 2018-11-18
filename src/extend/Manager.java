package extend;

public class Manager extends Employee {

    private int bonus;

    public Manager(String name, int sex, int salary,int bonus) {
        super(name, sex, salary);

        this.bonus = (int) (bonus * Math.random());  //0-bonus的值
         System.out.println(this.bonus + "zzz");
    }

    public final  int Test(){
        return 0;
    }


    /***
     * 重写父类方法
     * @return
     */
    @Override
    public int getSalary() {
        return super.getSalary() + this.getBonus();
    }



    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
}
