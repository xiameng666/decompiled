final class dest implements ibtx {
    final icck a;
    final gei b;

    public dest(icck icck0, gei gei0) {
        this.a = icck0;
        this.b = gei0;
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
        gei gei0 = this.b;
        int v2 = v1 | ((goz)object1).Z(gei0);
        Object object3 = ((goz)object1).k();
        if(v2 != 0 || object3 == gop.a) {
            object3 = new desr(icck0, gei0);
            ((goz)object1).R(object3);
        }
        ((goz)object1).A();
        fiqv.c(((ibth)object3), null, false, null, null, null, null, degg.f, ((goz)object1), 0x30000000, 510);
        return ibom.a;
    }
}

