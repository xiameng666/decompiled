public final class ddzu {
    public static final void a(String s, goz goz0, int v) {
        goz goz2;
        ibuq.f(s, "text");
        goz goz1 = goz0.ao(0xC0BF9036);
        int v1 = (v & 6) == 0 ? v | (goz1.X(s) ? 4 : 2) : v;
        if((v1 & 3) == 2 && goz1.ac()) {
            goz1.G();
            goz2 = goz1;
        }
        else {
            ddxv.b(goz1);
            ddxv.b(goz1);
            ddxv.b(goz1);
            ddxv.b(goz1);
            hfc hfc0 = dla.f(hfc.e, 24.0f, 20.0f, 24.0f, 8.0f);
            iau iau0 = dll.b(dho.a, hei.j, goz1, 0);
            long v2 = gol.c(goz1);
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
            int v3 = (int)(v2 ^ v2 >>> 0x20);
            guo.b(goz1, iau0, iej.e);
            guo.b(goz1, gzk0, iej.d);
            ibtw ibtw0 = iej.f;
            if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v3))) {
                Integer integer0 = v3;
                goz1.P(integer0);
                goz1.p(integer0, ibtw0);
            }
            guo.a(goz1, iej.g);
            guo.b(goz1, hfc1, iej.c);
            jbn jbn0 = fpu.d(goz1).B;
            goz2 = goz1;
            gdh.b(s, null, fpu.a(goz1).f, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, jbn0, goz2, v1 & 14, 0, 0x1FFFA);
            goz2.z();
        }
        gsb gsb0 = goz2.af();
        if(gsb0 != null) {
            gsb0.d = new ddzt(s, v);
        }
    }
}

