final class azfj implements Comparable {
    public final long a;
    private final long b;

    public azfj(long v, long v1) {
        this.a = v;
        this.b = v1;
    }

    public final int a(azfj azfj0) {
        return this.a == azfj0.a ? Long.compare(this.b, azfj0.b) : Long.compare(this.a, azfj0.a);
    }

    @Override
    public final int compareTo(Object object0) {
        return this.a(((azfj)object0));
    }
}

