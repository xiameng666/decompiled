final class ccp extends ibur implements ibts {
    public static final ccp a;

    static {
        ccp.a = new ccp();
    }

    public ccp() {
        super(1);
    }

    @Override  // ibts
    public final Object a(Object object0) {
        long v = hll.e(((hll)object0).j, hnt.x);
        return new chs(hll.a(v), hll.d(v), hll.c(v), hll.b(v));
    }
}

