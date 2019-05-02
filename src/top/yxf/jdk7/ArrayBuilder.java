package top.yxf.jdk7;

/**
 * <p>description 创建一个数组的函数接口 </p>
 * @className ArrayBuilder
 * @author  wuxiangsheng
 * @date 2019/5/2 12:18       
 */
@FunctionalInterface
public interface ArrayBuilder {

   // 创建一个int类型的数组，参数传递数组的长度，返回创建好的数组

    int[] builderArray(int size);
}
