final class ftxy implements ibtx {
    final ftyl a;

    public ftxy(ftyl ftyl0) {
        this.a = ftyl0;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        ibuq.f(((dlp)object0), "$this$Badge");
        if((v & 17) == 16 && ((goz)object1).ac()) {
            ((goz)object1).G();
            return ibom.a;
        }
        ftyl ftyl0 = this.a;
        if((ftyl0 instanceof ftyk)) {
            ((goz)object1).M(-396224068);
            jbn jbn0 = fpu.d(((goz)object1)).m;
            ftzd.a(((ftyk)ftyl0).a, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jbn0, ((goz)object1), 0, 0, 0x1FFFE);
            ((goz)object1).A();
            return ibom.a;
        }
        if((ftyl0 instanceof ftyj)) {
            ((goz)object1).M(602092802);
            hfc hfc0 = iqn.a(hfc.e, "BadgeIcon");
            hyxx.c();
            ftyy.c(((ftyj)ftyl0).a, hfc0, null, null, ((goz)object1), 0x1B0, 0);
            ((goz)object1).A();
            return ibom.a;
        }
        ((goz)object1).M(0xE8621312);
        ((goz)object1).A();
        throw new ibnq();
    }
}

