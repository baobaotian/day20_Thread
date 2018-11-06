package cn.shujia.day20_Thread;

public class MyRunnable implements Runnable {
    private int anInt;
    private int sum=0;

    public MyRunnable(int anInt) {
        this.anInt = anInt;
    }

    @Override
    public void run() {
        for (int i=anInt;i<1000;i++){
            sum +=i;
        }
        System.out.println(Thread.currentThread().getName()+"---"+sum);
    }
}
