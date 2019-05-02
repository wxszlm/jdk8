package top.yxf.jdk7;

/**
 * <p>description 数组构造器 </p>
 * @className Demo
 * @author  wuxiangsheng
 * @date 2019/5/2 12:20
 */
public class Demo {

    /**
     * 定义一个方法
     * 方法参数是数组的长度和ArrayBuilder
     * 方法内部根据传递的长度使用ArrayBuilder中的方法创建数组并返回
     */
    public static int[] createArray(int size, ArrayBuilder arrayBuilder) {
        return arrayBuilder.builderArray(size);
    }

    public static void main(String[] args) {
        int[] arr1 = createArray(3,(size)->{
            return new int[size];
        });
        System.out.println(arr1.length);

        /**
         * 使用方法引用来优化lambda表达式
         * 已知创建的是int[]数组
         * 数组长度是已知的
         * 所以我们就可以使用方法引用
         * int[]引用new，genuine传递的参数来创建数组
         */
        System.out.println(createArray(6, int[]::new).length);
    }

}
