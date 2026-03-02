public final class iai implements hzk {
    private final igm a;

    public iai(igm igm0) {
        this.a = igm0;
    }

    public final ihy a() {
        return this.a.g;
    }

    private final long b() {
        igm igm0 = iaj.a(this.a);
        return hjz.c(this.h(igm0.p, 0L), this.a().h(igm0.g, 0L));
    }

    @Override  // hzk
    public final hzk ef() {
        if(!this.t()) {
            hxt.d("LayoutCoordinate operations are only valid when isAttached is true");
        }
        ihy ihy0 = this.a().t.s().x;
        if(ihy0 != null) {
            igm igm0 = ihy0.C();
            if(igm0 != null) {
                return igm0.p;
            }
        }
        return null;
    }

    @Override  // hzk
    public final long g() {
        return ((long)this.a.a) << 0x20 | ((long)this.a.b) & 0xFFFFFFFFL;
    }

    @Override  // hzk
    public final long h(hzk hzk0, long v) {
        return this.i(hzk0, v, true);
    }

    @Override  // hzk
    public final long i(hzk hzk0, long v, boolean z) {
        if((hzk0 instanceof iai)) {
            igm igm0 = ((iai)hzk0).a;
            igm0.g.ao();
            igm igm1 = this.a().ah(igm0.g).C();
            if(igm1 != null) {
                long v1 = jlf.c(jlf.d(igm0.B(igm1, ((boolean)(((int)z) ^ 1))), jlg.b(v)), this.a.B(igm1, ((boolean)(((int)z) ^ 1))));
                return ((long)Float.floatToRawIntBits(jlf.b(v1))) & 0xFFFFFFFFL | ((long)Float.floatToRawIntBits(jlf.a(v1))) << 0x20;
            }
            igm igm2 = iaj.a(igm0);
            long v2 = jlf.d(jlf.d(igm0.B(igm2, ((boolean)(((int)z) ^ 1))), igm2.h), jlg.b(v));
            igm igm3 = iaj.a(this.a);
            long v3 = jlf.c(v2, jlf.d(this.a.B(igm3, ((boolean)(((int)z) ^ 1))), igm3.h));
            ihy ihy0 = igm3.g.x;
            ibuq.c(ihy0);
            ihy ihy1 = igm2.g.x;
            ibuq.c(ihy1);
            return ihy0.i(ihy1, ((long)Float.floatToRawIntBits(jlf.b(v3))) & 0xFFFFFFFFL | ((long)Float.floatToRawIntBits(jlf.a(v3))) << 0x20, ((boolean)(((int)z))));
        }
        igm igm4 = iaj.a(this.a);
        long v4 = hjz.c(this.i(igm4.p, v, ((boolean)(((int)z)))), 0xFFFFFFFFL & ((long)Float.floatToRawIntBits(jlf.b(igm4.h))) | ((long)Float.floatToRawIntBits(jlf.a(igm4.h))) << 0x20);
        ihy ihy2 = igm4.g;
        if(!ihy2.t()) {
            hxt.d("LayoutCoordinate operations are only valid when isAttached is true");
        }
        ihy2.ao();
        ihy ihy3 = ihy2.x;
        if(ihy3 != null) {
            ihy2 = ihy3;
        }
        return hjz.d(v4, ihy2.i(hzk0, 0L, ((boolean)(((int)z)))));
    }

    @Override  // hzk
    public final long j(long v) {
        return this.a().j(hjz.d(v, this.b()));
    }

    @Override  // hzk
    public final long k(long v) {
        return this.a().k(hjz.d(0L, this.b()));
    }

    @Override  // hzk
    public final long l(long v) {
        return this.a().l(hjz.d(v, this.b()));
    }

    @Override  // hzk
    public final long m(long v) {
        return hjz.d(this.a().m(v), this.b());
    }

    @Override  // hzk
    public final long n(long v) {
        long v1 = this.b();
        return hjz.d(this.a().n(v), v1);
    }

    @Override  // hzk
    public final hka o(hzk hzk0, boolean z) {
        return this.a().o(hzk0, z);
    }

    @Override  // hzk
    public final void r(hzk hzk0, float[] arr_f) {
        this.a().r(hzk0, arr_f);
    }

    @Override  // hzk
    public final void s(float[] arr_f) {
        this.a().s(arr_f);
    }

    @Override  // hzk
    public final boolean t() {
        return this.a().t();
    }
}

