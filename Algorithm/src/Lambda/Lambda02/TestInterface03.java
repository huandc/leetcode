package Lambda.Lambda02;

import Lambda.TestInterface;

/*
    多个参数 有返回值
 */
@FunctionalInterface
public interface TestInterface03 {
    int testMethod(int num1, int num2);
}

class Demo03 {
    public static void main(String[] args) {
//        TestInterface03 t = (x, y) -> {
//            System.out.println("两个参数 +返回值" + x + " " + y);
//            return 666;
//        };
//        System.out.println(t.testMethod(10, 20));
        TestInterface03 t = (x,y)-> x+y;
        System.out.println(t.testMethod(10,20));

    }
}
