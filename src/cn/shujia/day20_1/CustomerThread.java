package cn.shujia.day20_1;

public class CustomerThread implements Runnable {

    private Student s;

    public CustomerThread(Student s) {
        this.s = s;
    }

    @Override
    public void run() {
        while(true) {
            s.get();
        }
    }
}
