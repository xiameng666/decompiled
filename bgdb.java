final class bgdb implements ibtx {
    final bgds a;
    final ibts b;

    public bgdb(bgds bgds0, ibts ibts0) {
        this.a = bgds0;
        this.b = ibts0;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        ibuq.f(((dnj)object0), "$this$item");
        if((v & 17) == 16 && ((goz)object1).ac()) {
            ((goz)object1).G();
            return ibom.a;
        }
        bgdq.m(dla.j(hfc.e, 0.0f, 8.0f, 0.0f, 0.0f, 13), ((bgaw)this.a.b), this.b, ((goz)object1), 6);
        return ibom.a;
    }
}

