final class aaiy implements ibtw {
    final aajq a;

    public aaiy(aajq aajq0) {
        this.a = aajq0;
        super();
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        if((((Number)object1).intValue() & 3) == 2 && ((goz)object0).ac()) {
            ((goz)object0).G();
            return ibom.a;
        }
        gry[] arr_gry = new gry[3];
        aajq aajq0 = this.a;
        grx grx0 = aadh.a;
        zem zem0 = aajq0.d;
        if(zem0 == null) {
            ibuq.j("imageFetcher");
            zem0 = null;
        }
        arr_gry[0] = grx0.c(zem0);
        arr_gry[1] = aadh.b.c(aajq0.a);
        arr_gry[2] = aadh.f.c(aajq0.b);
        gpo.b(arr_gry, gzf.e(1486400607, new aaix(aajq0), ((goz)object0)), ((goz)object0), 56);
        return ibom.a;
    }
}

