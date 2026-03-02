public final class gasa implements ibth {
    public final long a;
    public final garp b;

    public gasa(garp garp0, long v) {
        this.b = garp0;
        this.a = v;
    }

    @Override  // ibth
    public final Object a() {
        byi byi0;
        garp garp0 = this.b;
        if(garp0.g == null) {
            hfuo hfuo0 = garp0.b.h;
            if(hfuo0 == null) {
                byi0 = new byi();
            }
            else {
                byi byi1 = new byi(hfuo0.size());
                for(Object object0: hfuo0) {
                    garp.y(((MessageLite)(((hcrz)object0))), ((hcrz)object0).c, byi1);
                }
                byi0 = byi1;
            }
            garp0.g = byi0;
        }
        long v = this.a;
        if(garp0.x(v) != null) {
            for(Object object1: garp0.x(v)) {
                hcrz hcrz0 = (hcrz)object1;
                gasc gasc0 = garp0.a.d;
                gasc0.c = hcrz0.e;
                garp0.a.a.f("Data %d applying Resulting Action: %s", new Object[]{garp0.nz(), hcrz0});
                garp0.C(hcrz0);
                if((hcrz0.b & 4) != 0) {
                    gasc0.b((hcrz0.f == null ? hcsi.a : hcrz0.f));
                }
            }
            garp0.a.d.c = true;
        }
        return ibom.a;
    }
}

