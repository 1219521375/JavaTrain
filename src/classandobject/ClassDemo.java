package classandobject;

public class ClassDemo {

    /**
     * 面向对象
     * 1、成员变量
     * 2、成员方法
     * 3、类成员（static）
     *
     * 对象（实例） instance
     *
     */

    /**
     * 成员变量
     * 局部变量
     */

    String name;
    int age;

    ClassDemo(){

    }

    ClassDemo(String name,int age){
        this.name = name;
        this.age = age;
    }

    void show(){
        System.out.println("姓名：" + name + " 年龄：" + age);

    }

    public static void main(String[] args) {
        //new ClassDemo("鲍骞月",20).show();
        ClassDemo person = new ClassDemo("鲍骞月",20);
        ClassDemo p1 = person;

    }

}
