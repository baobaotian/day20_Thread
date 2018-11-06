package cn.shujia.day20_1;

public class MakerCustomerDemo {
    public static void main(String[] args) {

        Student s = new Student();

        Thread t1 = new Thread(new MakerThread(s));
        Thread t2 = new Thread(new CustomerThread(s));

        t1.start();
        t2.start();


    }

}
