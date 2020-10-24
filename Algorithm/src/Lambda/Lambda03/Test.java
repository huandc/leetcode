package Lambda.Lambda03;

import java.util.function.Consumer;
import java.util.zip.DeflaterOutputStream;

/*
    内置四个函数式接口
    1. 消费式接口
        Consumer<T> -> void accept(T t)
    2.供给型接口
        Supplier<T> - T get()
    3. 函数式接口
        Function<T,R> - R apply(T t)
    4.断雁行接口
        Predicate<T> - boolean test(T t)

 */
public class Test {
    public static void bath(double money,Consumer<Double> sm){
        sm.accept(money);
    }

    public static void main(String[] args) {
//        bath(2990, new SpendMoney() {
//            @Override
//            public void buy(double money) {
//                System.out.println("我去洗澡了,"+money);
//            }
//        });


//        bath(2990, new Consumer<Double>() {
//            @Override
//            public void accept(Double money) {
//                System.out.println("我去洗澡了,"+money);
//            }
//        });

        bath(2999,x-> System.out.println("我去洗澡了,花费了"+x));



    }

}

//interface SpendMoney {
//    void buy(double money);
//}



