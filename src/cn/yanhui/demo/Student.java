package cn.yanhui.demo;

public class Student {

// 无参构造

    public Student(){}

    // 带参构造
    public  Student(String name,int age){
        this.name = name;
        this.age = age;
    }
    private int age = 20;
    private String name;

    public void setAge(int age){
//        age = age;
        this.age = age;
    }

    public  int getAge(){
        return  age;
    }
    public void show(){
        int age = 10;
        System.out.println(age);
        System.out.println(this.age);

    }
}
