public final class aaau {
    public static final void a(zod zod0, hfc hfc0, goz goz0, int v, int v1) {
        String s1;
        hfc hfc2;
        hfc hfc1;
        int v2;
        ibuq.f(zod0, "stateChips");
        goz goz1 = goz0.ao(0xCEFC17AB);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (((v & 8) == 0 ? goz1.X(zod0) : goz1.Z(zod0)) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
            hfc1 = hfc0;
        }
        else if((v & 0x30) == 0) {
            hfc1 = hfc0;
            v2 |= (goz1.X(hfc1) ? 0x20 : 16);
        }
        else {
            hfc1 = hfc0;
        }
        if((v2 & 19) == 18 && goz1.ac()) {
            goz1.G();
            hfc2 = hfc1;
        }
        else {
            hfc2 = (v1 & 2) == 0 ? hfc1 : hfc.e;
            long v3 = aaau.b(zod0.d, hll.h);
            long v4 = fpu.a(goz1).q;
            long v5 = aaau.b(zod0.c, v4);
            zhr zhr0 = zod0.b;
            String s = zod0.a;
            hfc hfc3 = dla.d(cqx.c(hhi.a(hfc2, aacp.a), v3), 2.0f);
            iau iau0 = dll.b(dho.a, hei.k, goz1, 0x30);
            long v6 = gol.c(goz1);
            gzk gzk0 = goz1.ak();
            hfc hfc4 = hew.c(goz1, hfc3);
            ibth ibth0 = iej.a;
            goz1.O();
            if(goz1.x) {
                goz1.t(ibth0);
            }
            else {
                goz1.T();
            }
            int v7 = (int)(v6 ^ v6 >>> 0x20);
            guo.b(goz1, iau0, iej.e);
            guo.b(goz1, gzk0, iej.d);
            ibtw ibtw0 = iej.f;
            if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v7))) {
                Integer integer0 = v7;
                goz1.P(integer0);
                goz1.p(integer0, ibtw0);
            }
            guo.a(goz1, iej.g);
            guo.b(goz1, hfc4, iej.c);
            goz1.M(0xFFCA3010);
            if(zhr0 == null) {
                s1 = s;
            }
            else {
                hfc hfc5 = dla.d(hfc.e, 2.0f);
                s1 = s;
                aadq.b(zhr0, hys.a, hfc5, 0L, 20, 20, goz1, 0x361B0, 8);
            }
            goz1.x();
            goz1.M(0xFFCA50C5);
            if(s1.length() > 0) {
                jbn jbn0 = fpu.d(goz1).m;
                fiuk.b(s1, dla.i(hfc.e, 6.0f, 0.0f, 2), v5, 0L, jeu.b, 0L, null, 0L, 0, false, 0, 0, null, jbn0, goz1, 0x180030, 0, 131000);
                goz1 = goz1;
            }
            goz1.x();
            goz1.z();
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new aaat(zod0, hfc2, v, v1);
        }
    }

    private static final long b(zhx zhx0, long v) {
        if(zhx0 != null) {
            return cchl.d() ? hln.i(zhx0.b.b, zhx0.b.c, zhx0.b.d, zhx0.b.a, null, 16) : hln.i(zhx0.a.b, zhx0.a.c, zhx0.a.d, zhx0.a.a, null, 16);
        }
        return v;
    }
}

