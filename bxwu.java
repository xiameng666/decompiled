public final class bxwu extends hmxq {
    public static final bxwu a;

    static {
        bxwu.a = new bxwu();
    }

    @Override  // hmxq
    public final Object a(hmxy hmxy0) {
        int v = hmxy0.b();
        if(v >= 0 && v <= 0xFF) {
            return new ibob(((byte)v));
        }
        throw new hmxs("Invalid UByte value: " + v);
    }

    @Override  // hmxq
    public final void b(hmyd hmyd0, Object object0) {
        hmyd0.h((((ibob)object0) == null ? null : ((int)(((ibob)object0).a & 0xFF))));
    }
}

