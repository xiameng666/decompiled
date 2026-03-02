public abstract class igcy implements Comparable {
    public abstract long a(long arg1, int arg2);

    public abstract long b(long arg1, long arg2);

    public abstract long c();

    public final long d(long v, int v1) {
        return v1 == 0x80000000 ? this.b(v, 0x80000000L) : this.a(v, -v1);
    }

    public abstract igda e();

    public abstract boolean f();

    public abstract boolean g();
}

