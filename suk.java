public final class suk implements svi {
    private final ste a;
    private final boolean b;
    private final ssg c;

    public suk(ssg ssg0, boolean z, ste ste0) {
        this.c = ssg0;
        this.b = z;
        this.a = ste0;
    }

    @Override  // svi
    public final swj a(srb srb0) {
        ste ste0 = this.a;
        ssy ssy0 = sui.b;
        if(ste0.b(ssy0)) {
            srh srh0 = new srh();
            byte[] arr_b = ste0.c(ssy0);
            srb0.c.c();
            srb0.c.a = new sxd(this.c);
            srb0.c.b = this.b;
            srb0.c.g = new sxd(srh0);
            srb0.c.f = new sxd(arr_b);
            srb0.c.h = sxd.a;
            srb0.c.i = sqw.c;
            return new swl(new ste(ssy0, srh0.a.b()).d());
        }
        ssy ssy1 = sui.a;
        if(!ste0.b(ssy1)) {
            throw sxf.h("Invalid authentication template");
        }
        sxd sxd0 = srb0.c.g;
        sxd sxd1 = srb0.c.f;
        if(!sxd0.d() || !sxd1.d()) {
            throw sxf.a("AKE with terminal privacy (2) received without (1)");
        }
        srh srh1 = (srh)sxd0.b();
        byte[] arr_b1 = (byte[])sxd1.b();
        sry sry0 = sre.c(this.c);
        suj suj0 = new suj();
        swr swr0 = sws.a(srb0, this.c, this.b, suj0, sry0);
        byte[] arr_b2 = ste0.c(ssy1);
        byte[] arr_b3 = sui.f(arr_b1);
        byte[] arr_b4 = sui.e(srh1.a);
        byte[] arr_b5 = ((srp)srh1.a(arr_b1, sto.e(new byte[][]{sui.c, arr_b3, arr_b4}), new byte[]{0}).get(Byte.valueOf(((byte)0)))).g(arr_b2, sto.i(), true);
        return sui.b(srb0, swr0.a, ((sry)swr0.b), sry0, srh1, this.b, arr_b5, arr_b1, false);
    }
}

