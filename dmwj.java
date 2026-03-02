final class dmwj implements ibtw {
    final dmwr a;

    public dmwj(dmwr dmwr0) {
        this.a = dmwr0;
        super();
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        if((((Number)object1).intValue() & 3) == 2 && ((goz)object0).ac()) {
            ((goz)object0).G();
            return ibom.a;
        }
        gry[] arr_gry = new gry[2];
        dmwr dmwr0 = this.a;
        grx grx0 = fsdq.a;
        fhxi fhxi0 = dmwr0.al;
        if(fhxi0 == null) {
            ibuq.j("composeVisualElements");
            fhxi0 = null;
        }
        arr_gry[0] = grx0.c(fhxi0);
        fhvw fhvw0 = dmwr0.D();
        arr_gry[1] = fsdq.b.c(fhvw0);
        gpo.b(arr_gry, gzf.e(480386140, new dmwi(dmwr0), ((goz)object0)), ((goz)object0), 56);
        return ibom.a;
    }
}

