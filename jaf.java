final class jaf implements ibts {
    public static final jaf a;

    static {
        jaf.a = new jaf();
    }

    @Override  // ibts
    public final Object a(Object object0) {
        if(ibuq.m(object0, Boolean.valueOf(false))) {
            return new hll(hll.i);
        }
        ibuq.d(object0, "null cannot be cast to non-null type kotlin.Int");
        return new hll(hln.c(((Integer)object0).intValue()));
    }
}

