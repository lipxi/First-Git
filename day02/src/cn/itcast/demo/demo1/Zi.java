package cn.itcast.demo.demo1;

public class Zi extends Fu {
    @Override
    public void show() {
        System.out.println("子类show方法！");
    }

    public void show1() {
        this.show();
        super.show();
    }
}
