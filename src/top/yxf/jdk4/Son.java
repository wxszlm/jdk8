package top.yxf.jdk4;

/**
 * <p>description 子类 </p>
 * @className Son
 * @author  wuxiangsheng
 * @date 2019/5/2 11:44
 */
public class Son extends Father {

    @Override
    public void sayHello() {
        System.out.println("hello 我是Son");
    }

    // 定义一个方法参数传递Greetable接口
    public void method(Greetable greetable) {
        greetable.sayHello();
    }

    public void show(){
        // 调用method方法，方法参数是Greetable函数式接口 所以可以采用lambda
        method(()->{
            Father father = new Father();
            // 调用父类的sayHello方法
            father.sayHello();
        });

        /**
         * 因为有父子类关系，所以存在一个关键子super ，我们可以直接使用super调用父类的方法
         */

        method(() -> {
            super.sayHello();
        });

        /**
         * super调用父类的方法
         * super是存在的
         * 父类的sayHello也是存在的
         * 所以我们可以优化lambda表达式
         */
        method(super::sayHello);
    }

    public static void main(String[] args) {
        new Son().show();
    }
}
