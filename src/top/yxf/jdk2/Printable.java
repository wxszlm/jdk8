package top.yxf.jdk2;

/**
 * <p>description 打印一句话 </p>
 * @className Printable
 * @author  wuxiangsheng
 * @date 2019/5/2 10:47
 */
@FunctionalInterface
public interface Printable {

    /**
     * 打印一句话
     * @author wuxiangsheng
     * @methodName printString
     * @description
     * @param str  打印一句话，将字符串已大写输出
     * @return void
     * @version V1.0.0
     * @date 2019/5/2 10:54
     *
     * @Throw
     */
    void printString(String str);

}
