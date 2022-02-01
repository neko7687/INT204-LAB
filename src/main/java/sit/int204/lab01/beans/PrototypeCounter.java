package sit.int204.lab01.beans;

public class PrototypeCounter implements Counter {
    private int count;
    @Override
    public int getCount() {
        return this.count;
    }
    @Override
    public void increment() {
        this.count++;
    }
}
