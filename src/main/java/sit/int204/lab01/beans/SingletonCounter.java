package sit.int204.lab01.beans;

public class SingletonCounter implements Counter {
    private static final SingletonCounter INSTANT =
            new SingletonCounter();
    private int count;

    private SingletonCounter() {}
    public static SingletonCounter getInstance() {
        return INSTANT;
    }
        @Override
    public int getCount() {
        return this.count;
    }
    @Override
    public void increment() {
        this.count++;
    }
}
