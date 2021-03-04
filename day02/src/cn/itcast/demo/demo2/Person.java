package cn.itcast.demo.demo2;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    /*public Person() {
        super();
        System.out.println("父类空参构造执行！");
    }

    public Person(String name, int age) {
        super();
        this.name = name;
        this.age = age;
        System.out.println("父类带参构造执行！");
    }*/

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
}
