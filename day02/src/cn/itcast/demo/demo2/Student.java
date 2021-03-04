package cn.itcast.demo.demo2;


public class Student extends Person {
    private int scorte;

    public Student() {
        super();
    }

    public Student(String name, int age, int scorte) {
        super(name, age);
        this.scorte = scorte;
    }

/*    public Student(){
        super();
        System.out.println("子类空参构造执行");
    }

    public Student(int scorte) {
        super();
        System.out.println("子类带参构造执行");
        this.scorte = scorte;
    }*/


    public int getScorte() {
        return scorte;
    }

    public void setScorte(int scorte) {
        this.scorte = scorte;
    }
}
