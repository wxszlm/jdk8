package top.yxf.jdk6;

/**
 * <p>description 定义一个person </p>
 * @className Person
 * @author  wuxiangsheng
 * @date 2019/5/2 12:05
 */
public class Person {
    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
