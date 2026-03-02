import java.util.Map;

public final class sum implements svi {
    private final ste a;
    private final boolean b;
    private final ssg c;

    public sum(ssg ssg0, boolean z, ste ste0) {
        this.c = ssg0;
        this.b = z;
        this.a = ste0;
    }

    @Override  // svi
    public final swj a(srb srb0) {
        boolean z;
        byte[] arr_b12;
        ste ste0 = this.a;
        ssy ssy0 = sui.b;
        if(ste0.b(ssy0)) {
            if(ste0.c(ssy0).length == 0) {
                srh srh0 = new srh();
                srb0.c.c();
                srb0.c.a = new sxd(this.c);
                srb0.c.b = this.b;
                srb0.c.g = new sxd(srh0);
                srb0.c.h = sxd.a;
                srb0.c.i = sqw.d;
                return new swl(new ste(ssy0, srh0.a.b()).d());
            }
            sqx sqx0 = srb0.c;
            sxd sxd0 = sqx0.g;
            if(!sxd0.d()) {
                throw sxf.a("Reverse AKE with terminal privacy (2) received without (1)");
            }
            srh srh1 = (srh)sxd0.b();
            byte[] arr_b = ste0.c(ssy0);
            byte[] arr_b1 = sui.f(arr_b);
            byte[] arr_b2 = sui.e(srh1.a);
            srp srp0 = (srp)srh1.a(arr_b, sto.e(new byte[][]{sui.c, arr_b2, arr_b1}), new byte[]{0}).get(Byte.valueOf(((byte)0)));
            sry sry0 = sre.c(this.c);
            sul sul0 = new sul();
            byte[] arr_b3 = srp0.h(((sry)sws.a(srb0, this.c, this.b, sul0, sry0).b).h.c(), sto.i(), true);
            if(sqx0.i == sqw.d) {
                sqx0.f = new sxd(arr_b);
                sqx0.i = sqw.e;
                return new swl(new ste(sui.a, arr_b3).d());
            }
            sqx0.c();
            throw sxf.a("Reverse AKE with terminal privacy (2) received without (1)");
        }
        ssy ssy1 = sui.a;
        if(!ste0.b(ssy1)) {
            throw sxf.h("Invalid authentication template");
        }
        sxd sxd1 = srb0.c.g;
        sxd sxd2 = srb0.c.f;
        if(!sxd1.d() || !sxd2.d()) {
            throw sxf.a("Reverse AKE with terminal privacy (3) received without (2)");
        }
        srh srh2 = (srh)sxd1.b();
        byte[] arr_b4 = (byte[])sxd2.b();
        sry sry1 = sre.c(this.c);
        sul sul1 = new sul();
        swr swr0 = sws.a(srb0, this.c, this.b, sul1, sry1);
        sry sry2 = (sry)swr0.b;
        byte[] arr_b5 = ste0.c(ssy1);
        byte[] arr_b6 = sui.f(arr_b4);
        byte[] arr_b7 = sui.e(srh2.a);
        byte[] arr_b8 = sui.f(sry2.h.d());
        byte[] arr_b9 = sto.e(new byte[][]{sui.c, arr_b8, arr_b6});
        Map map0 = sry2.g.a(arr_b4, arr_b9, new byte[]{1, 2});
        byte[] arr_b10 = sto.i();
        byte[] arr_b11 = ((srp)map0.get(Byte.valueOf(((byte)1)))).g(arr_b5, arr_b10, true);
        try {
            arr_b12 = srx.b(arr_b11, sry2.i).d();
            z = true;
        }
        catch(Exception unused_ex) {
            arr_b12 = sry1.i.b();
            z = false;
        }
        byte[] arr_b13 = sui.d(sry2);
        Map map1 = srh2.a(arr_b12, sto.e(new byte[][]{sui.c, arr_b8, arr_b6, arr_b7, ((srp)map0.get(Byte.valueOf(((byte)2)))).e(new byte[]{0})}), arr_b13);
        Byte byte0 = (byte)6;
        srp srp1 = (srp)map1.get(byte0);
        byte[] arr_b14 = sts.a();
        byte[] arr_b15 = srp1.e(sto.e(new byte[][]{sui.c, arr_b8, arr_b6, arr_b7, arr_b14}));
        srp srp2 = (srp)map1.get(Byte.valueOf(((byte)4)));
        srp srp3 = (srp)map1.get(byte0);
        srp srp4 = (srp)map1.get(Byte.valueOf(((byte)5)));
        srp srp5 = (srp)map1.get(Byte.valueOf(((byte)7)));
        sxk sxk0 = new sxk();
        sxk0.d(0x80, srp2.i());
        sxk0.d(0x81, srp3.i());
        int v = 130;
        if(srp4 != null) {
            sxk0.d(130, srp4.i());
            v = 0x83;
        }
        if(srp5 != null) {
            sxk0.d(v, srp5.i());
            ++v;
        }
        sxk0.d(v, arr_b15);
        sxk sxk1 = new sxk();
        sxk sxk2 = new sxk();
        sxk2.c(0xE0, sxk0);
        sxk1.c(ste.a.a, sxk2);
        byte[] arr_b16 = sxk1.b();
        sxd sxd3 = sxd.a(srp4);
        sxd sxd4 = sxd.a(srp5);
        sui.c(srb0, swr0.a, sry2, this.b, z, srp2, srp3, sxd3, sxd4, arr_b15);
        return new swl(arr_b16);
    }
}

