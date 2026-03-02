public final class cram {
    public static final gged_interceptors a;
    public static final gged_interceptors b;
    @Deprecated
    public static final cram c;
    @Deprecated
    public static final cram d;
    @Deprecated
    public static final cram e;
    public static final cram f;
    public static final cram g;
    public static final cram h;
    public static final cram i;
    public final String j;
    public final String k;
    public final gged_interceptors l;
    public final int m;

    static {
        gged_interceptors gged0 = gged_interceptors.m("org.iso.18013.5.1", "org.iso.18013.5.1.aamva");
        cram.a = gged0;
        gged_interceptors gged1 = gged_interceptors.m("org.iso.23220.1.riker", "org.iso.18013.5.1");
        cram.b = gged1;
        cram.c = new cram("org.iso.18013.5.1", "org.iso.18013.5.1.mDL");
        cram.d = new cram("org.iso.18013.5.1.aamva", "org.iso.18013.5.1.mDL");
        new cram(gged0, "org.iso.18013.5.1.mDL", 0);
        cram.e = new cram("org.iso.23220.1.riker", "org.iso.23220.1.riker");
        cram.f = new cram(gged0, "org.iso.18013.5.1.mDL", 1);
        cram.g = new cram(gged0, "org.iso.18013.5.1.mDL", 4);
        cram.h = new cram(gged0, "com.google.wallet.idcard.1", 2);
        cram.i = new cram(gged1, "org.iso.23220.1.riker", 3);
    }

    public cram(Iterable iterable0, String s, int v) {
        gged_interceptors gged0 = (gged_interceptors)iterable0;
        gftb.checkTrue(gged0.E().hasNext());
        if(!(iterable0 instanceof gged_interceptors)) {
            iterable0 = gged_interceptors.h(iterable0);
        }
        this.l = (gged_interceptors)iterable0;
        Object object0 = gged0.E().next();
        this.j = (String)object0;
        this.k = s;
        this.m = v;
    }

    @Deprecated
    public cram(String s, String s1) {
        this.j = s;
        this.k = s1;
        this.m = 0;
        this.l = gged_interceptors.l(s);
    }
}

