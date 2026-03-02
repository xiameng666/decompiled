final class desq implements ibtx {
    final icck a;
    final ibth b;
    final gei c;

    public desq(icck icck0, gei gei0, ibth ibth0) {
        this.a = icck0;
        this.c = gei0;
        this.b = ibth0;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        ibuq.f(((dkd)object0), "$this$EduTooltip");
        if((v & 17) == 16 && ((goz)object1).ac()) {
            ((goz)object1).G();
            return ibom.a;
        }
        ((goz)object1).M(-1633490746);
        icck icck0 = this.a;
        int v1 = ((goz)object1).Z(icck0);
        gei gei0 = this.c;
        int v2 = v1 | ((goz)object1).Z(gei0);
        Object object3 = ((goz)object1).k();
        if(v2 != 0 || object3 == gop.a) {
            object3 = new desm(icck0, gei0);
            ((goz)object1).R(object3);
        }
        ((goz)object1).A();
        fiqv.c(((ibth)object3), null, false, null, null, null, null, degg.d, ((goz)object1), 0x30000000, 510);
        ((goz)object1).M(0x97EA02AA);
        int v3 = ((goz)object1).Z(icck0);
        ibth ibth0 = this.b;
        int v4 = v3 | ((goz)object1).X(ibth0) | ((goz)object1).Z(gei0);
        Object object4 = ((goz)object1).k();
        if(v4 != 0 || object4 == gop.a) {
            object4 = new desn(icck0, ibth0, gei0);
            ((goz)object1).R(object4);
        }
        ((goz)object1).A();
        fiqv.c(((ibth)object4), null, false, null, null, null, null, degg.e, ((goz)object1), 0x30000000, 510);
        return ibom.a;
    }
}

