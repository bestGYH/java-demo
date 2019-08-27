package cn.yanhui.demo;

/*
* 定义一个手机类
* */
public class Phone {
    // 成员变量：定义在类型中、方法外
    // 品牌
    String brand;
    //型号
    String model;
    // 名称
     String name;
     // 成员方法：先不写static修饰符
    public  void call(String name) {
        System.out.println("给"+name+"打电话");
    }

    public  void sendMessage() {
        System.out.println("发短信");

    }

    public  void playGame() {
        System.out.println("玩游戏");

    }
}
