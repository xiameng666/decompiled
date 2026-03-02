final class dxhc implements ibtw {
    final dxhl a;

    public dxhc(dxhl dxhl0) {
        this.a = dxhl0;
        super();
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        if((((Number)object1).intValue() & 3) == 2 && ((goz)object0).ac()) {
            ((goz)object0).G();
            return ibom.a;
        }
        gry[] arr_gry = new gry[2];
        dxhl dxhl0 = this.a;
        grx grx0 = fsdq.a;
        fhxi fhxi0 = dxhl0.c;
        fhvw fhvw0 = null;
        if(fhxi0 == null) {
            ibuq.j("composeVisualElements");
            fhxi0 = null;
        }
        arr_gry[0] = grx0.c(fhxi0);
        grx grx1 = fsdq.b;
        fhvw fhvw1 = dxhl0.b;
        if(fhvw1 == null) {
            ibuq.j("interactionLogger");
        }
        else {
            fhvw0 = fhvw1;
        }
        arr_gry[1] = grx1.c(fhvw0);
        gpo.b(arr_gry, gzf.e(0xF77BE6D5, new dxhb(dxhl0), ((goz)object0)), ((goz)object0), 56);
        return ibom.a;
    }
}

