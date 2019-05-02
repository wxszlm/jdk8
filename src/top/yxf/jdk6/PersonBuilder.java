package top.yxf.jdk6;

/**
 * <p>description 定义一个创建一个person函数接口 </p>
 * @className PersonBuilder
 * @author  wuxiangsheng
 * @date 2019/5/2 12:06
 */
@FunctionalInterface
public interface PersonBuilder {

    /**
     * 定义一个方法，根据传递姓名创建一个person
     * @author wuxiangsheng
     * @methodName builderPerson
     * @description
     * @param name
     * @return top.yxf.jdk6.Person
     * @version V1.0.0
     * @date 2019/5/2 12:08
     *
     * @Throw
     */
    Person builderPerson(String name);
}
