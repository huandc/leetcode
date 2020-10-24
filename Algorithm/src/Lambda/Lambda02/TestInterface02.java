package Lambda.Lambda02;


/*
    有一个参数,无返回值
 */
public interface TestInterface02 {
    void testMethod(int num);
}

class Demo01 {
    public static void main(String[] args) {
        TestInterface02 t = n->System.out.println("传入参数是: "+n);
        t.testMethod(10);
    }
    /*

     */

}
