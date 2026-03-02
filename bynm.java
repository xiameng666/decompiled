final class bynm implements ibtx {
    final boolean a;
    final ibth b;
    final ibts c;
    final bynx d;

    public bynm(boolean z, ibth ibth0, ibts ibts0, bynx bynx0) {
        this.a = z;
        this.b = ibth0;
        this.c = ibts0;
        this.d = bynx0;
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
        ((goz)object1).M(-1705104150);
        gze gze0 = this.a ? gzf.e(-308926332, new bynj(this.b), ((goz)object1)) : null;
        ((goz)object1).A();
        bykp.b(hfc0, gze0, gzf.e(0x919752EA, new bynl(this.c, this.d), ((goz)object1)), ((goz)object1), 390, 0);
        return ibom.a;
    }
}

