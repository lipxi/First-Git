package cn.itcast.demo.demo3;

public abstract class Animal {     //抽象类，含有抽象方法吃
    public void drink(){
        System.out.println("喝水");
    }

    public abstract void eat();   //抽象方法吃
}
