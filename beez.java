public final class beez implements ibts {
    public final befy a;

    public beez(befy befy0) {
        this.a = befy0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        befy befy0 = this.a;
        byte[] arr_b = (byte[])object0;
        try {
            ibuq.c(arr_b);
            Boolean boolean0 = Boolean.valueOf(befy0.f(arr_b));
            bedv bedv0 = new bedv(bedu.a, boolean0, null);
            befy0.f.l(bedv0);
        }
        catch(hfur hfur0) {
            bedv bedv1 = new bedv(bedu.c, null, hfur0);
            befy0.f.l(bedv1);
        }
        return ibom.a;
    }
}

