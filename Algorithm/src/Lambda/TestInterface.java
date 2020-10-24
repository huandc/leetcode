package Lambda;

public interface TestInterface {
    void testMerhod();
}
class MyClass implements  TestInterface{

    @Override
    public void testMerhod() {
        System.out.println("我重写了TestMethod");
    }
}
class Demo{
    public static void main(String[] args) {
        //创建接口对应的实现类的对象
//        TestInterface t = new MyClass();
//        t.testMerhod();
        //匿名内部类

//        TestInterface t = new TestInterface() {
//            @Override
//            public void testMerhod() {
//                System.out.println("匿名内部类 实现testMethod方法");
//            }
//        };
//        t.testMerhod();

        TestInterface t = () -> System.out.println("Lambda表达式的实现方式");
        t.testMerhod();


        /*
            1. Lambda 是一个新的语法结构
            2. 语法简洁了
            3.
         */

    }
}
