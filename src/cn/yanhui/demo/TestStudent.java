package cn.yanhui.demo;

public class TestStudent {
    public static void main(String[] args) {
        Student s = new Student();
        s.show();
        s.setAge(50);
        System.out.println(s.getAge());
    }
}
