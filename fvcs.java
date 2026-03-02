import j..util.Objects;

public final class fvcs {
    public final int a;
    public final int b;
    public final int c;
    private final fvcu d;
    private final int e;

    public fvcs(fvcu fvcu0, int v, int v1, int v2, int v3) {
        this.d = fvcu0;
        this.a = v;
        this.b = v1;
        this.e = v2;
        this.c = v3;
    }

    public final double a() {
        return fvcs.b(this.e);
    }

    public static double b(int v) {
        return v <= 0 || v >= 29 ? 0.0 : 2097152.0 / ((double)(2 << v));
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof fvcs) && this.d.equals(((fvcs)object0).d) && this.a == ((fvcs)object0).a && this.b == ((fvcs)object0).b && this.e == ((fvcs)object0).e && this.c == ((fvcs)object0).c;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{this.d, ((int)this.a), ((int)this.b), ((int)this.e), ((int)this.c)});
    }

    @Override
    public final String toString() {
        return String.format("%s%s:%s:%s:%s:%s", ((int)this.d.f), this.d.g, ((int)this.e), ((int)this.c), ((int)this.a), ((int)this.b));
    }
}

