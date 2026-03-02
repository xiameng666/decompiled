public final class zyr {
    public static final void a(znw znw0, hfc hfc0, goz goz0, int v) {
        ibuq.f(znw0, "imageHolder");
        goz goz1 = goz0.ao(0xD89420BC);
        int v1 = (v & 6) == 0 ? (((v & 8) == 0 ? goz1.X(znw0) : goz1.Z(znw0)) ? 4 : 2) | v : v;
        if(((v1 | 0x30) & 19) == 18 && goz1.ac()) {
            goz1.G();
        }
        else {
            hey hey0 = hfc.e;
            zhr zhr0 = znw0.a;
            if(zhr0 != null) {
                aadq.b(zhr0, hys.a, hey0, 0L, 0, 0, goz1, (v1 | 0x30) << 3 & 0x380 | 0x30, 56);
            }
            hfc0 = hey0;
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new zyq(znw0, hfc0, v);
        }
    }
}

