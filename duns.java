final class duns implements ibtw {
    final duoa a;

    public duns(duoa duoa0) {
        this.a = duoa0;
        super();
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        if((((Number)object1).intValue() & 3) == 2 && ((goz)object0).ac()) {
            ((goz)object0).G();
            return ibom.a;
        }
        gry[] arr_gry = new gry[2];
        duoa duoa0 = this.a;
        grx grx0 = fsdq.a;
        fhxi fhxi0 = duoa0.d;
        fhvw fhvw0 = null;
        if(fhxi0 == null) {
            ibuq.j("composeVisualElements");
            fhxi0 = null;
        }
        arr_gry[0] = grx0.c(fhxi0);
        grx grx1 = fsdq.b;
        fhvw fhvw1 = duoa0.ag;
        if(fhvw1 == null) {
            ibuq.j("interactionLogger");
        }
        else {
            fhvw0 = fhvw1;
        }
        arr_gry[1] = grx1.c(fhvw0);
        gpo.b(arr_gry, gzf.e(0x366DA2B9, new dunr(duoa0), ((goz)object0)), ((goz)object0), 56);
        return ibom.a;
    }
}

