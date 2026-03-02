final class dmyj implements ibtw {
    final dmyx a;

    public dmyj(dmyx dmyx0) {
        this.a = dmyx0;
        super();
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        if((((Number)object1).intValue() & 3) == 2 && ((goz)object0).ac()) {
            ((goz)object0).G();
            return ibom.a;
        }
        gry[] arr_gry = new gry[2];
        dmyx dmyx0 = this.a;
        grx grx0 = fsdq.a;
        fhxi fhxi0 = dmyx0.ak;
        fhvw fhvw0 = null;
        if(fhxi0 == null) {
            ibuq.j("composeVisualElements");
            fhxi0 = null;
        }
        arr_gry[0] = grx0.c(fhxi0);
        grx grx1 = fsdq.b;
        fhvw fhvw1 = dmyx0.al;
        if(fhvw1 == null) {
            ibuq.j("interactionLogger");
        }
        else {
            fhvw0 = fhvw1;
        }
        arr_gry[1] = grx1.c(fhvw0);
        gpo.b(arr_gry, gzf.e(1028936700, new dmyi(dmyx0), ((goz)object0)), ((goz)object0), 56);
        return ibom.a;
    }
}

