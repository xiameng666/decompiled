final class fcvs implements ibtx {
    final fcvm a;

    public fcvs(fcvm fcvm0) {
        this.a = fcvm0;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        ibuq.f(((dib)object0), "$this$IconButton");
        if((v & 17) == 16 && ((goz)object1).ac()) {
            ((goz)object1).G();
            return ibom.a;
        }
        hpw hpw0 = ism.a(this.a.d, ((goz)object1), 0);
        long v1 = pqq.a(((goz)object1)).l;
        hfc hfc0 = dls.k(hfc.e, pmb.a);
        pqo.a(hpw0, this.a.c, hfc0, v1, ((goz)object1), 8, 0);
        return ibom.a;
    }
}

