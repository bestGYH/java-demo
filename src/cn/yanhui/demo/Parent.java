package cn.yanhui.demo;

// 定义一个父类
public class Parent {
    // 成员变量
    private String name;
    private int age;
    // 构造方法 alt+insert
    public Parent() {
    }

    public Parent(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
