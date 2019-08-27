package cn.yanhui.demo;

/*手机里得测试类
* */
public class TestPhone {
    // main 方法是程序得主入口，所有代码都从这里开始
    public static void main(String[] args) {
        // 创建对象
        Phone p = new Phone();

        //调用成员变量，并打印

        // 给成员变量赋值
            p.brand = "苹果";
        // 打印成员变量得值
        System.out.println(p.brand);
        System.out.println(p.model);
        System.out.println(p.model);

        p.call("哈哈哈");
        p.sendMessage();
        p.playGame();

    }
}
