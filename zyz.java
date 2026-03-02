final class zyz implements ibty {
    final gged_interceptors a;

    public zyz(gged_interceptors gged0) {
        this.a = gged0;
        super();
    }

    @Override  // ibty
    public final Object a(Object object0, Object object1, Object object2, Object object3) {
        int v = ((Number)object1).intValue();
        int v1 = ((Number)object3).intValue();
        ibuq.f(((dnj)object0), "$this$items");
        int v2 = (v1 & 6) == 0 ? (((goz)object2).X(((dnj)object0)) ? 4 : 2) | v1 : v1;
        if((v1 & 0x30) == 0) {
            v2 |= (((goz)object2).V(v) ? 0x20 : 16);
        }
        if((v2 & 0x93) == 0x92 && ((goz)object2).ac()) {
            ((goz)object2).G();
            return ibom.a;
        }
        Object object4 = this.a.get(v);
        ibuq.e(object4, "get(...)");
        if((((aaem)object4) instanceof zol)) {
            ((goz)object2).M(1032607003);
            zyf.c(((zol)(((aaem)object4))), dni.a(), ((goz)object2), 0);
            ((goz)object2).A();
            return ibom.a;
        }
        if((((aaem)object4) instanceof zop)) {
            ((goz)object2).M(1032609670);
            zza.b(((zop)(((aaem)object4))), dni.a(), ((goz)object2), 0);
            ((goz)object2).A();
            return ibom.a;
        }
        if((((aaem)object4) instanceof zoo)) {
            ((goz)object2).M(1032612480);
            zza.a(((zoo)(((aaem)object4))), dni.a(), ((goz)object2), 0);
            ((goz)object2).A();
            return ibom.a;
        }
        ((goz)object2).M(0x7401B130);
        ((goz)object2).A();
        return ibom.a;
    }
}

