final class bylf implements ibtx {
    final ibth a;
    final ibth b;

    public bylf(ibth ibth0, ibth ibth1) {
        this.a = ibth0;
        this.b = ibth1;
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
        hfc hfc0 = dls.w(hfc.e);
        gze gze0 = gzf.e(0x496A01F8, new byld(this.b), ((goz)object1));
        ((goz)object1).M(0xFF63F30C);
        gze gze1 = this.a == null ? null : gzf.e(0x83A1C059, new byle(this.a), ((goz)object1));
        ((goz)object1).A();
        bykp.b(hfc0, gze0, gze1, ((goz)object1), 54, 0);
        fkx.b(null, 8.0f, hll.h, ((goz)object1), 0x1B0, 1);
        return ibom.a;
    }
}

