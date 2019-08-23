package cn.itcast.demo;

import java.util.Scanner;
public class MethodDemo2 {
    public static void main(String[] args) {

        Scanner com = new Scanner(System.in);
        System.out.println("请输入两个整数：");
        int a = com.nextInt();
        int b = com.nextInt();
        boolean c = compare(a,b);
        System.out.println(c);

    }
    public static boolean compare(int a,int b){
        boolean c = a==b;
        return c;
    }
}
