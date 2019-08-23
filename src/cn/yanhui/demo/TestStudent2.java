package cn.yanhui.demo;

public class TestStudent2 {
    public static void main(String[] args) {
        //通过无参构造实现
        Student stu = new Student();
        stu.setAge(20);

        // 通过构造方法实现快速初始化
        Student stu2 = new Student("哈哈",80);
        System.out.println(stu2.getAge());
    }
}
