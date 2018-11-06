package cn.shujia.day21_IO;

import java.io.File;
import java.util.Scanner;

/*
*   A.读入file地址，封装进File对象
*   B.调用打印函数
*   C.判断是文件还是文件夹
*           文件：打印文件名
*           文件夹，返回B
*
* */
public class PrintFiles {
    public static void main(String[] args) {
        String fileNmae="";
        System.out .println("输入文件地址：");
        Scanner sc=new Scanner(System.in);
        fileNmae=sc.nextLine();

        System.out.println("canExcute:"+new File(fileNmae).canExecute());

       //调用
       // printFileName(new File(fileNmae));

    }

    private static void printFileName(File fileNmae) {
        if (fileNmae.isFile()) {
            System.out.println(fileNmae.getAbsolutePath());

        }else{
            File[] files=fileNmae.listFiles();
            for (File f:files){
                printFileName(f);
            }
        }

    }
}
