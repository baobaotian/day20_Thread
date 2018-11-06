package cn.shujia.day20_1;

public class MakerThread implements Runnable {

    private Student s;
    private int x = 0;

    public MakerThread(Student s) {
        this.s = s;
    }

    @Override
    public void run() {
        while (true) {
            if (x % 2 == 0) {
                s.set("周星星", 23);
            } else {
                s.set("zbf", 24);
            }
            x++;
        }

    }
}
