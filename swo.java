import java.util.Arrays;

public final class swo implements swj {
    private final srz a;
    private final byte[] b;
    private final sxd c;
    private final boolean d;

    public swo(srz srz0, ssr ssr0, ssd ssd0, sxd sxd0, boolean z) {
        byte[] arr_b;
        this.a = srz0;
        boolean z1 = sxd0.d() && stn.e(((svy)sxd0.b()).m.a[0], ((byte)7));
        this.d = z1;
        if(!sxd0.d() && z) {
            arr_b = swv.b;
        }
        else {
            sxk sxk0 = new sxk();
            sxk0.g(ssr.b(ssr0).e());
            sxk0.g(ssd0.e());
            if(z1) {
                sxk0.g(swx.a(0x30 - sxk0.a()));
            }
            arr_b = sxk0.b();
        }
        this.b = arr_b;
        this.c = sxd0;
    }

    @Override  // swj
    public final swk a(srb srb0, boolean z) {
        byte[] arr_b4;
        sxk sxk0 = new sxk();
        sxk sxk1 = new sxk();
        sxk1.e(this.a.a.c);
        sxk1.e(this.a.b.d);
        sxk0.c(205, sxk1);
        if(this.d) {
            svy svy0 = (svy)this.c.b();
            byte[] arr_b = swx.a(srk.b.d >> 1);
            srp srp0 = sxe.a(svy0.d, svy0.a, svy0.c);
            byte[] arr_b1 = sto.e(new byte[][]{arr_b, Arrays.copyOf(srp0.e(arr_b), srk.b.d >> 1)});
            byte[] arr_b2 = sxe.a(svy0.d, svy0.a, svy0.b).h(this.b, arr_b1, false);
            sxk sxk2 = new sxk();
            sxk2.f(sxk0);
            sxk sxk3 = new sxk();
            sxk3.g(arr_b1);
            sxk3.g(arr_b2);
            sxk2.c(0x85, sxk3);
            byte[] arr_b3 = sxk2.b();
            sxk sxk4 = new sxk();
            sxk4.g(arr_b3);
            sxk4.d(0x8E, stf.b(srp0.e(arr_b3)));
            arr_b4 = sxk4.b();
            return new swk(srg.a, arr_b4);
        }
        sxk sxk5 = new sxk();
        sxk5.f(sxk0);
        sxk5.g(this.b);
        arr_b4 = sxk5.b();
        return new swk(srg.a, arr_b4);
    }
}

