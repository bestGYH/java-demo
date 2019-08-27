public class ConversionDemo {
    public static void main(String[] args) {
        // 定义两个int类型变量
        int a = 10;
        int b = 20;
        System.out.println(a + b);
        int c = a + b;
        System.out.println(c);
        System.out.println("---------------------------");
        int aa = 10;
        byte bb = 20;
        System.out.println(aa + bb);

        int cc = aa + bb;
        System.out.println(cc);
        // byte cc = aa + bb; 报错  byte和int类型计算，会先提升为int类型再计算
        System.out.println("---------------------------");
        byte dd = (byte)(aa + bb); // 强制类型转换
        System.out.println(dd);


    }
}
