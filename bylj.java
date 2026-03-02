public final class bylj {
    public static final void a(String s, boolean z, goz goz0, int v) {
        String s1;
        ibuq.f(s, "text");
        goz goz1 = goz0.ao(1098531027);
        int v1 = (v & 6) == 0 ? (goz1.X(s) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Y(((boolean)(((int)z)))) ? 0x20 : 16);
        }
        if((v1 & 19) == 18 && goz1.ac()) {
            goz1.G();
            s1 = s;
        }
        else {
            s1 = s;
            bylj.b(s1, fpu.a(goz1).s, ((boolean)(((int)z) ^ 1)), goz1, v1 & 14);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new bylh(s1, ((boolean)(((int)z))), v);
        }
    }

    public static final void b(String s, long v, boolean z, goz goz0, int v1) {
        int v2;
        String s1;
        goz goz1 = goz0.ao(1980094516);
        if((v1 & 6) == 0) {
            s1 = s;
            v2 = (goz1.X(s1) ? 4 : 2) | v1;
        }
        else {
            s1 = s;
            v2 = v1;
        }
        if((v1 & 0x30) == 0) {
            v2 |= (goz1.W(v) ? 0x20 : 16);
        }
        if((v1 & 0x180) == 0) {
            v2 |= (goz1.Y(z) ? 0x100 : 0x80);
        }
        if((v2 & 0x93) == 0x92 && goz1.ac()) {
            goz1.G();
        }
        else {
            hey hey0 = hfc.e;
            hfc hfc0 = dla.j(dls.B(dls.w(hey0)), 0.0f, (z ? 8.0f : 0.0f), 0.0f, 0.0f, 13);
            iau iau0 = dll.b(dho.a, hei.j, goz1, 0);
            long v3 = gol.c(goz1);
            gzk gzk0 = goz1.ak();
            hfc hfc1 = hew.c(goz1, hfc0);
            ibth ibth0 = iej.a;
            goz1.O();
            if(goz1.x) {
                goz1.t(ibth0);
            }
            else {
                goz1.T();
            }
            int v4 = (int)(v3 ^ v3 >>> 0x20);
            guo.b(goz1, iau0, iej.e);
            guo.b(goz1, gzk0, iej.d);
            ibtw ibtw0 = iej.f;
            if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v4))) {
                Integer integer0 = v4;
                goz1.P(integer0);
                goz1.p(integer0, ibtw0);
            }
            guo.a(goz1, iej.g);
            guo.b(goz1, hfc1, iej.c);
            byml.e(s1, dla.j(hey0, 0.0f, 20.0f, 0.0f, 8.0f, 5), v, goz1, v2 & 14 | 0x30 | v2 << 3 & 0x380);
            goz1.z();
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new byli(s, v, z, v1);
        }
    }
}

