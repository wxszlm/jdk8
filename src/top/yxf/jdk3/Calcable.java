package top.yxf.jdk3;

/**
 * <p>description 函数接口 </p>
 * @className Calcable
 * @author  wuxiangsheng
 * @date 2019/5/2 11:28
 */
@FunctionalInterface
public interface Calcable {

    /**
     * 定义一个方法，传递一个整数，返回这个数的绝对值
     * @author wuxiangsheng
     * @methodName numberAbs
     * @description
     * @param number
     * @return int
     * @version V1.0.0
     * @date 2019/5/2 11:30
     *
     * @Throw
     */
    int numberAbs(Integer number);

}
