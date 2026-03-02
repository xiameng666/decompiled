import java.util.Arrays;
import java.util.Map;

public final class sui implements svi {
    static final ssy a;
    static final ssy b;
    static final byte[] c;
    private static final ssy d;
    private final ste e;
    private final boolean f;
    private final ssg g;

    static {
        sui.d = new ssy(0xA0);
        sui.a = new ssy(0x80);
        sui.b = new ssy(0x81);
        sui.c = new byte[]{9, 9};
    }

    public sui(ssg ssg0, boolean z, ste ste0) {
        this.g = ssg0;
        this.f = z;
        this.e = ste0;
    }

    @Override  // svi
    public final swj a(srb srb0) {
        sry sry0 = sre.c(this.g);
        sug sug0 = new sug();
        swr swr0 = sws.a(srb0, this.g, this.f, sug0, sry0);
        sry sry1 = (sry)swr0.b;
        ste ste0 = this.e;
        ssy ssy0 = sui.d;
        if(ste0.b(ssy0)) {
            ssy ssy1 = sui.b;
            if(ste0.b(ssy1)) {
                byte[] arr_b = ste0.c(ssy0);
                byte[] arr_b1 = ste0.c(ssy1);
                try {
                    srx.a(arr_b);
                }
                catch(Exception unused_ex) {
                    throw sxf.h("Certificate structure invalid");
                }
                srh srh0 = new srh();
                return sui.b(srb0, swr0.a, sry1, sry0, srh0, this.f, arr_b, arr_b1, true);
            }
        }
        throw sxf.h("Authentication template malformed");
    }

    static swj b(srb srb0, svt svt0, sry sry0, sry sry1, srh srh0, boolean z, byte[] arr_b, byte[] arr_b1, boolean z1) {
        srj srj0;
        boolean z2;
        byte[] arr_b2;
        try {
            arr_b2 = srx.b(arr_b, sry0.i).d();
            z2 = true;
        }
        catch(Exception unused_ex) {
            arr_b2 = sry1.i.b();
            z2 = false;
        }
        try {
            srj0 = new srj(arr_b1);
        }
        catch(Exception unused_ex) {
            srj0 = sry1.i;
            z2 = false;
        }
        byte[] arr_b3 = sui.f(arr_b2);
        srj srj1 = srh0.a;
        byte[] arr_b4 = sui.e(srj1);
        Map map0 = srh0.a(arr_b2, sto.e(new byte[][]{sui.c, arr_b3, arr_b4}), new byte[]{1, 2});
        byte[] arr_b5 = sry0.h.c();
        byte[] arr_b6 = sui.d(sry0);
        byte[] arr_b7 = sui.e(srj0);
        Map map1 = sry0.g.a(arr_b1, sto.e(new byte[][]{sui.c, arr_b3, arr_b4, arr_b7, ((srp)map0.get(Byte.valueOf(((byte)2)))).e(new byte[]{0})}), arr_b6);
        Byte byte0 = (byte)6;
        srp srp0 = (srp)map1.get(byte0);
        byte[] arr_b8 = sts.a();
        byte[] arr_b9 = srp0.e(sto.e(new byte[][]{sui.c, arr_b3, arr_b4, arr_b7, arr_b8}));
        sxk sxk0 = new sxk();
        sxk0.d(0x80, ((srp)map0.get(Byte.valueOf(((byte)1)))).h(arr_b5, new byte[16], true));
        if(z1) {
            sxk0.d(0x81, srj1.b());
        }
        sxk sxk1 = new sxk();
        sxk1.c(ste.a.a, sxk0);
        byte[] arr_b10 = sxk1.b();
        srp srp1 = (srp)map1.get(byte0);
        sui.c(srb0, svt0, sry0, z, z2, ((srp)map1.get(Byte.valueOf(((byte)4)))), srp1, sxd.a(((srp)map1.get(Byte.valueOf(((byte)5))))), sxd.a(((srp)map1.get(Byte.valueOf(((byte)7))))), arr_b9);
        return new swl(arr_b10);
    }

    static void c(srb srb0, svt svt0, ssj ssj0, boolean z, boolean z1, srp srp0, srp srp1, sxd sxd0, sxd sxd1, byte[] arr_b) {
        swh swh0 = new swh();
        sws.b(srb0, swh0, svt0, ssj0, z, z1);
        srb0.c(swh0);
        sqv sqv0 = new sqv(new ssh(ssj0.l, z, ((ssc)ssj0.m).d()), ((ssc)ssj0.m));
        sqx sqx0 = srb0.c;
        if(sqx0.i.f) {
            srn srn0 = new srn(srp0, srp1, ((srp)sxd0.b), ((srp)sxd1.b));
            sqx0.b(new sro(srk.b, srn0, arr_b).a(), new sxd(sqv0));
            return;
        }
        sqx0.c();
        throw sxf.a("AKE finalization attempted without necessary previous steps");
    }

    static byte[] d(sry sry0) {
        return ((ssc)sry0.m).c() ? new byte[]{4, 6, 5, 7} : new byte[]{4, 6};
    }

    static byte[] e(srj srj0) {
        return Arrays.copyOfRange(srj0.a(), 0, 8);
    }

    static byte[] f(byte[] arr_b) {
        return Arrays.copyOfRange(arr_b, 1, 9);
    }
}

