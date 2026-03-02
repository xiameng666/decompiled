final class ddzp implements ibtx {
    final ibts a;

    public ddzp(ibts ibts0) {
        this.a = ibts0;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        ibuq.f(((dib)object0), "$this$BaseScaffold");
        if((v & 17) == 16 && ((goz)object1).ac()) {
            ((goz)object1).G();
            return ibom.a;
        }
        dnh.a(null, null, null, false, null, null, null, false, null, this.a, ((goz)object1), 0, 0x1FF);
        return ibom.a;
    }
}

