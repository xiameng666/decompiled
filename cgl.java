public final class cgl {
    private static final ckh a;

    static {
        cgl.a = chm.b(0.0f, 0.0f, null, 7);
    }

    public static final gui a(long v, chl chl0, goz goz0, int v1, int v2) {
        if((v2 & 2) != 0) {
            chl0 = cgl.a;
        }
        boolean z = goz0.X(hll.f(v));
        Object object0 = goz0.k();
        if(z || object0 == gop.a) {
            hnl hnl0 = hll.f(v);
            object0 = ccs.a.a(hnl0);
            goz0.R(object0);
        }
        return chg.b(new hll(v), ((cmc)object0), chl0, null, goz0, v1 & 14 | v1 << 3 & 0x380 | 0xE000 & v1 << 6, 8);
    }
}

