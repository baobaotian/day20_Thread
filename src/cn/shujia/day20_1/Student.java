package cn.shujia.day20_1;

import javax.naming.Name;

public class Student {
    private String name;
    private int age;
    private boolean flag = false;

    public Student() {
    }

    public synchronized void set(String aname, int aage) {
        if (this.flag) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.name = aname;
        this.age = aage;
        this.flag = true;
        this.notify();
    }

    public synchronized void get() {
        if (!this.flag) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        //输出信息
        System.out.println(this.name + "  " + this.age);

        //启动生产者
        this.flag=false;
        this.notify();
    }
}
