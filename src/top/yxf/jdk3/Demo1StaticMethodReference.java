package top.yxf.jdk3;

/**
 * <p>description 通过类名引用静态成员方法 </p>
 * @methodName
 * @author wuxiangsheng
 * @date 2019/05/02 11:24
 * @version 1.0.0
 */

public class Demo1StaticMethodReference {
    /*
        通过类名引用静态成员方法
        类已经存在。静态方法也已经存在
        就可以直接通过类名直接调用静态方法
     */

    private static int numberAbs(Integer number,Calcable calcable) {
        return calcable.numberAbs(Math.abs(number));
    }

    public static void main(String[] args) {

        System.out.println(numberAbs(-10, number -> {
            return Math.abs(number);
        }));

        /**
         * 使用方法引用优化lambda
         * Math类是存在的
         * abs 计算绝对值的静态方法也是存在的也是存在的
         */
        System.out.println(numberAbs(-10, Integer::shortValue));

        System.out.println(numberAbs(10, Math::abs));
    }
}
