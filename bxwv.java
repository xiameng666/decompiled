public final class bxwv extends hmxq {
    public static final bxwv a;

    static {
        bxwv.a = new bxwv();
    }

    @Override  // hmxq
    public final Object a(hmxy hmxy0) {
        long v = hmxy0.e();
        if(v >= 0L && v <= 0xFFFFFFFFL) {
            return new ibod(((int)v));
        }
        throw new hmxs(a.u(v, "Invalid Uint value: "));
    }

    @Override  // hmxq
    public final void b(hmyd hmyd0, Object object0) {
        hmyd0.h((((ibod)object0) == null ? null : ((long)(((long)((ibod)object0).a) & 0xFFFFFFFFL))));
    }
}

