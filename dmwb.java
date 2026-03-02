final class dmwb implements ibtx {
    final gep a;
    final hkhr b;
    final dmwr c;
    final ibvd d;

    public dmwb(gep gep0, hkhr hkhr0, dmwr dmwr0, ibvd ibvd0) {
        this.a = gep0;
        this.b = hkhr0;
        this.c = dmwr0;
        this.d = ibvd0;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        ibuq.f(((dld)object0), "contentPadding");
        if((v & 6) == 0) {
            v |= (((goz)object1).X(((dld)object0)) ? 4 : 2);
        }
        if((v & 19) == 18 && ((goz)object1).ac()) {
            ((goz)object1).G();
            return ibom.a;
        }
        dnh.a(huw.b(dla.i(dla.c(dls.v(hfc.e), ((dld)object0)), 24.0f, 0.0f, 2), ((fwe)this.a).c), null, null, false, null, null, null, false, null, new dmvo(this.b, this.c, this.d), ((goz)object1), 0, 510);
        return ibom.a;
    }
}

