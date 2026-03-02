final class dxlk implements ibtw {
    final dxlm a;

    public dxlk(dxlm dxlm0) {
        this.a = dxlm0;
        super();
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        if((((Number)object1).intValue() & 3) == 2 && ((goz)object0).ac()) {
            ((goz)object0).G();
            return ibom.a;
        }
        gry[] arr_gry = new gry[2];
        dxlm dxlm0 = this.a;
        grx grx0 = fsdq.a;
        fhxi fhxi0 = dxlm0.aj;
        fhvw fhvw0 = null;
        if(fhxi0 == null) {
            ibuq.j("composeVisualElements");
            fhxi0 = null;
        }
        arr_gry[0] = grx0.c(fhxi0);
        grx grx1 = fsdq.b;
        fhvw fhvw1 = dxlm0.ak;
        if(fhvw1 == null) {
            ibuq.j("interactionLogger");
        }
        else {
            fhvw0 = fhvw1;
        }
        arr_gry[1] = grx1.c(fhvw0);
        gpo.b(arr_gry, gzf.e(0x90055369, new dxlj(dxlm0), ((goz)object0)), ((goz)object0), 56);
        return ibom.a;
    }
}

