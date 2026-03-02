final class byjc implements ibtx {
    final ibtw a;
    final dhn b;
    final ibts c;

    public byjc(ibtw ibtw0, dhn dhn0, ibts ibts0) {
        this.a = ibtw0;
        this.b = dhn0;
        this.c = ibts0;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        ibuq.f(((dim)object0), "$this$Card");
        if((v & 17) == 16 && ((goz)object1).ac()) {
            ((goz)object1).G();
            return ibom.a;
        }
        ((goz)object1).M(0x253412B9);
        ibtw ibtw0 = this.a;
        if(ibtw0 != null) {
            ibtw0.a(((goz)object1), Integer.valueOf(0));
        }
        ((goz)object1).A();
        dnh.a(dls.B(dls.w(dla.f(hfc.e, 24.0f, (ibtw0 == null ? 24.0f : 0.0f), 24.0f, 8.0f))), null, dmk.b(dmw.c(((goz)object1)), ((goz)object1)), false, this.b, hei.n, null, false, null, this.c, ((goz)object1), 0x30000, 458);
        return ibom.a;
    }
}

