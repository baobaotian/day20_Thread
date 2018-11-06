package cn.shujia.day20_Thread;

import java.util.Scanner;

public class RunableReturnNum {
    public static void main(String[] args) {
        int a=0,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("please input a num:");
        a=sc.nextInt();
        System.out.println(a);
        for(int i=a;a<50;a++){
            sum += a;
        }

        System.out.println("sum:"+sum);

    }

}
