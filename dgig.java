public final class dgig {
    static final dgig a;
    public static final byte[] b;
    public static final byte[] c;

    static {
        dgig.a = new dgig();
        byte[] arr_b = "sender".getBytes(ibyo.a);
        ibuq.e(arr_b, "getBytes(...)");
        dgig.b = arr_b;
        byte[] arr_b1 = "receiver".getBytes(ibyo.a);
        ibuq.e(arr_b1, "getBytes(...)");
        dgig.c = arr_b1;
    }

    public final gmnh a(byte[] arr_b) {
        gnca.a();
        gndp.a();
        byte[] arr_b1 = djbl.a(arr_b);
        gnez gnez0 = new gnez();
        gnez0.b(arr_b1.length);
        gnez0.a = gnfa.c;
        gnfb gnfb0 = gnez0.a();
        gneu gneu0 = gnet.a(gnfb0, gnsl.c(arr_b1));
        gndl gndl0 = new gndl();
        gndl0.b(16);
        gndl0.a = gndm.c;
        gndl0.c(16);
        gncd gncd0 = gncd.c(new gnce(gnfb0, gndl0.a()), gneu0, null);
        gmmx gmmx0 = new gmmx();
        gmmv gmmv0 = gmnb.b(gncd0);
        gmmv0.a();
        gmmv0.b(1);
        gmmx0.c(gmmv0);
        gncc gncc0 = (gncc)gmmx0.a().o(gnbr.a, gncc.class);
        byte[] arr_b2 = "authKey".getBytes(ibyo.a);
        ibuq.e(arr_b2, "getBytes(...)");
        return (gmnh)gncc0.a(arr_b2).o(gnbr.a, gmnh.class);
    }

    public final gnjj b() {
        return gnje.a(gnjh.a, gnjf.a, gnjg.a, gnji.d);
    }
}

