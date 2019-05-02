package top.yxf.jdk1;

/**
 * <p>description 打印一句话 </p>
 * @methodName
 * @author wuxiangsheng
 * @date 2019/05/02 10:50
 * @version 1.0.0
 */
public class Demo1PrintString {

    private static void printString (Printable printable) {
        printable.printString("Hello World");
    }

    public static void main(String[] args) {

        // 调用printString方法，方法参数是一个函数式接口，所以可以引用Lambda表达式
        printString(str -> System.out.println(str));

        /**
         * 分析
         *      lambda表达式 目的，打印参数的字符串
         *      注意:
         *          System.out对象是存在的
         *          println方法也是存在在的
         *          所以我们可以使用方法引用 来简化lambda表达式
         */
        printString(System.out::println);
    }
}
