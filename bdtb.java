final class bdtb implements ibtx {
    final ibth a;

    public bdtb(ibth ibth0) {
        this.a = ibth0;
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
        bdtp.g(dla.j(hfc.e, 0.0f, 0.0f, 0.0f, 24.0f, 7), this.a, ((goz)object1), 6);
        return ibom.a;
    }
}

