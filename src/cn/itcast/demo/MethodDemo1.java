package cn.itcast.demo;
/*
*
* */
public class MethodDemo1 {
    public static void main(String[] args) {
        int s = sum(3,4);
        System.out.println(s);

    }
    /*
    * 方法和方法之间是平级，不能嵌套定义
    * */
    public static int sum(int a, int b){
        int c = a + b;
        return c;
    }
}
