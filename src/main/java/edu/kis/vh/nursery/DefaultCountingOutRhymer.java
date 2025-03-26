package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int INT = 12;
    public static final int INT1 = 11;
    public static final int INT2 = -1;
    private final int[] NUMBERS = new int[INT];

    public int total = INT2;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean callCheck() {
        return total == -1;
    }

    public boolean isFull() {
        return total == INT1;
    }

    protected int peekaboo() {
        if (callCheck())
            return INT2;
        return NUMBERS[total];
    }

    public int countOut() {
        if (callCheck())
            return INT2;
        return NUMBERS[total--];
    }

}
