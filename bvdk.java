final class bvdk implements ibtx {
    final bvge a;

    public bvdk(bvge bvge0) {
        this.a = bvge0;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        ibuq.f(((dlp)object0), "$this$Button");
        if((v & 17) == 16 && ((goz)object1).ac()) {
            ((goz)object1).G();
            return ibom.a;
        }
        jbn jbn0 = fpu.d(((goz)object1)).k;
        gdh.b(this.a.a, null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, jbn0, ((goz)object1), 0, 0, 0x1FFFE);
        return ibom.a;
    }
}

