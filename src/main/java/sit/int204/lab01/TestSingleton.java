package sit.int204.lab01;

import sit.int204.lab01.beans.*;

public class TestSingleton {
    public static void main(String[] args) {
        String x = new String("A");
        String y = new String("A");
        System.out.println(x.hashCode());
        System.out.println(y.hashCode());
        System.out.println("----------------");
        System.out.println(System.identityHashCode(x));
        System.out.println(System.identityHashCode(y));

        Counter counter = SingletonCounter.getInstance();
        counter.increment();
        f1();
        f2();
        System.out.println(counter.getCount());
    }
    private static void f1() {
        Counter counter = SingletonCounter.getInstance();
        counter.increment();
    }
    private static void f2() {
        Counter counter = SingletonCounter.getInstance();
        counter.increment();
    }
}
