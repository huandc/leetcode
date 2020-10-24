package Lambda.Lambda02;

import Lambda.TestInterface;

/*
 无参 无返回值
 */
public interface TestINterface {
    void testMethod();
}

class Test01{
    public static void main(String[] args) {
        TestInterface t = ()->{
            System.out.println("这是一个无参的,无返回值的方法");
        };
        t.testMerhod();
    }
}