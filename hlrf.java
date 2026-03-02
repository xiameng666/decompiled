public final class hlrf {
    public static final hlrf a;
    public static final hlrf b;
    public static final hlrf c;
    public static final hlrf d;
    public final String e;
    public final int f;

    static {
        hlrf.a = hlqz.l;
        hlrf.b = hlrb.t;
        hlrf.c = hlrb.iP;
        hlrf.d = hlrc.fq;
    }

    public hlrf(String s, int v) {
        this.e = s;
        this.f = v;
    }

    public hlrf(String s, int v, byte[] arr_b) {
        this(s, v);
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof hlrf) ? this.e.equals(((hlrf)object0).e) : false;
    }

    @Override
    public final int hashCode() {
        return this.e.hashCode();
    }

    @Override
    public final String toString() {
        return "<" + this.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " name=" + this.e + '>';
    }
}

