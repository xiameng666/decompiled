final class dlrj implements ibtw {
    final dlrl a;

    public dlrj(dlrl dlrl0) {
        this.a = dlrl0;
        super();
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        if((((Number)object1).intValue() & 3) == 2 && ((goz)object0).ac()) {
            ((goz)object0).G();
            return ibom.a;
        }
        gry[] arr_gry = new gry[2];
        dlrl dlrl0 = this.a;
        grx grx0 = fsdq.a;
        fhxi fhxi0 = dlrl0.ag;
        if(fhxi0 == null) {
            ibuq.j("composeVisualElements");
            fhxi0 = null;
        }
        arr_gry[0] = grx0.c(fhxi0);
        fhvw fhvw0 = dlrl0.z();
        arr_gry[1] = fsdq.b.c(fhvw0);
        gpo.b(arr_gry, gzf.e(0x5B317036, new dlri(dlrl0), ((goz)object0)), ((goz)object0), 56);
        return ibom.a;
    }
}

