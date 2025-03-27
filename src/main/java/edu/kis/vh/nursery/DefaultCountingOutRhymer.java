package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int max_size = 12;
    private final int[] NUMBERS = new int[max_size];

    public int total = -1;
    final public int stack_size = -1;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean callCheck() {
        return total == stack_size;
    }

    public boolean isFull() {
        return total == max_size-1;
    }

    protected int peekaboo() {
        if (callCheck())
            return stack_size;
        return NUMBERS[total];
    }

    public int countOut() {
        if (callCheck())
            return stack_size;
        return NUMBERS[total--];
    }

}
