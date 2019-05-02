package top.yxf.jdk2;

/**
 * <p>description 测试方法引用对象 </p>
 * @methodName
 * @author wuxiangsheng
 * @date 2019/05/02 11:13
 * @version 1.0.0
 */
public class Demo1MethodReferenceObject {
    /**
     * 通过对象引用成员方法
     * 使用前提是对象名已经存在的，成员方法也是已经存在的
     * 就可以使用对象名来引用
     */

    private static void printStringToUpperCase(Printable printable){
        printable.printString("hello");
    }

    public static void main(String[] args) {
        printStringToUpperCase(str -> {
            MethodReferenceObject methodReferenceObject = new MethodReferenceObject();
            methodReferenceObject.printStringToUppCase(str);

        });

        /**
         *  使用方法引用优化lambda
         *  对象引用是存在的 MethodReferenceObject
         *  成员方法也是存在的printStringToUppCase
         *  所以我门可以使用对象名来引用成员方法
         */
        MethodReferenceObject mro = new MethodReferenceObject();
        printStringToUpperCase(mro::printStringToUppCase);

    }

}
