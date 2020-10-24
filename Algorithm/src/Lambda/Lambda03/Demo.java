package Lambda.Lambda03;

import java.io.PrintStream;
import java.util.Comparator;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

/**
 *
 * 方法引用:
 *
 * 三种使用情况:
 *  1. 对象::实例方法名 (非静态方法)
 *  2. 类::静态方法名
 *  3. 类::实例方法名
 *
 *
 */
public class Demo {
    public static void main(String[] args) {
        //1. 对象::实例方法名 (非静态方法)
        //消费接口
//        Consumer<String> con = x -> System.out.println("输出x: "+x);
//        con.accept("1054aasasxax");

        /*
        Consumer : 方法 :    void accept(T t);
        方法体中用的方法    void println(String x)
        如果满足上面的要求: 前面的 函数式接口的 参数和返回值
        和 具体的方法体实现中的 方法的 参数和返回值 如果一直,那么可以使用方法引用
         */

//        PrintStream ps = System.out;
//        Consumer<String> con2 = ps::println;
//        con2.accept("传参数二");


        /*
        ###################################################################
        ###################################################################
        ###################################################################
         */


        //2. 类::静态方法名
//        Comparator<Integer> com = (x,y) -> Integer.compare(x,y);
//        System.out.println(com.compare(12, 80));

        /*
        compare(int x, int y)
        int compare(T o1, T o2)
         */

//        Comparator<Integer> com2 = Integer::compare;
//        System.out.println(com2.compare(12, 60));

        /*
        ###################################################################
        ###################################################################
        ###################################################################
         */


        //3. 类::实例方法名

        //使用这个方法引用的嵌套 x作为方法的调用者 , y作为方法的实际参数
        BiPredicate<String,String> bp = (x,y)->x.equals(y);
        System.out.println(bp.test("abc", "abc"));


        BiPredicate<String,String> bp2 = String::equals;
        System.out.println(bp.test("123", "123"));
    }
}
