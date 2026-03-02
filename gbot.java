public final class gbot {
    private long a;
    private long b;
    private long c;
    private int d;
    private int e;

    public gbot() {
        this.a = -1L;
        this.b = -1L;
        this.c = -1L;
        this.d = -1;
        this.e = -1;
    }

    public final int a() {
        int v = this.e;
        this.e = v - 1;
        return v;
    }

    public final int b() {
        int v = this.d;
        this.d = v - 1;
        return v;
    }

    public final long c() {
        long v = this.b;
        this.b = -1L + v;
        return v;
    }

    public final long d() {
        long v = this.c;
        this.c = -1L + v;
        return v;
    }

    public final long e() {
        long v = this.a;
        this.a = -1L + v;
        return v;
    }
}

