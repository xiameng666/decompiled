import j..time.Instant;

final class dtxf extends ibsl implements ibtw {
    final dtxg a;
    final String b;

    public dtxf(dtxg dtxg0, String s, ibrl ibrl0) {
        this.a = dtxg0;
        this.b = s;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dtxf)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new dtxf(this.a, this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        dtxg dtxg0 = this.a;
        String s = this.b;
        dtxg0.h(ibpo.b(s));
        Instant instant0 = Instant.ofEpochMilli(System.currentTimeMillis());
        ibuq.e(instant0, "ofEpochMilli(...)");
        Instant instant1 = dtxg0.f(s);
        if(instant1 != null && instant1.isAfter(instant0)) {
            return ibom.a;
        }
        dtxg0.i(s, instant0);
        return ibom.a;
    }
}

