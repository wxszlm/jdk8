package top.yxf.jdk6;

public class Demo {

    public static void printName(String name , PersonBuilder personBuilder){
        Person person = personBuilder.builderPerson(name);
        System.out.println(person.getName());
    }

    public static void main(String[] args) {
        // 调用printName方法，方法参数PersonBuilder是一个函数接口 所以可以通过lambda表达式
        printName("迪丽热巴",(String name)->{
            return new Person(name);
        });

        /**
         * 使用方法引用来优化lambda表达式
         * 构造方法 new Person(name)已知
         * 创建对象new 已知
         * 所以我们可以通过引用neu优化
         */
        //使用Person带参构造方法，通过传递参数来完成
        printName("张三丰",Person::new);
    }

}
