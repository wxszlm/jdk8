package top.yxf.jdk5;

/**
 * <p>description 通过this引用本类的方法 </p>
 * @className Husband
 * @author  wuxiangsheng
 * @date 2019/5/2 11:57
 */
public class Husband {

    // 定义一个买房子的方法
     public void buyHouse(){
         System.out.println("我买房子了");
     }
     //定义一个结婚的方法
    public void marry(Richable richable) {
         richable.buy();
    }
    //定义一个非常开心方法
    public void soHappy(){
         // 调用就结婚的方法，参数是函数式接口，传递lambda表达式
         marry(()->{
            this.buyHouse();
         });

         /**
          * 使用方法引用优化lambda表达式
          * this是已经存在的
          * 本类的方法是buyHouse是存在的
          * 我们可以直接通过this引用本类的成员方法
          */
         marry(this::buyHouse);
    }

    public static void main(String[] args) {
        new Husband().soHappy();
    }

}
