import java.util.List;

public final class bfej {
    public static final void a(List list0, goz goz0, int v) {
        goz goz1 = goz0.ao(0xAD2EED13);
        if((((v & 6) == 0 ? (goz1.Z(list0) ? 4 : 2) | v : v) & 3) == 2 && goz1.ac()) {
            goz1.G();
        }
        else {
            gaq.c(hhi.a(dls.k(hfc.e, 60.0f), eah.a), null, 0L, 0L, 0.0f, 0.0f, null, gzf.e(-398539410, new bfei(list0), goz1), goz1, 0x7E);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new bfef(list0, v);
        }
    }

    public static final void b(hfc hfc0, bffc bffc0, goz goz0, int v) {
        ibuq.f(bffc0, "recipient");
        goz goz1 = goz0.ao(1322734701);
        int v1 = (v & 6) == 0 ? (goz1.X(hfc0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(bffc0) ? 0x20 : 16);
        }
        if((v1 & 19) == 18 && goz1.ac()) {
            goz1.G();
        }
        else {
            tzl tzl0 = tzc.a(bfca.a);
            tzl tzl1 = tzc.a(bfca.b);
            tzc.b(bffc0.d, null, hfc0, null, hys.a, 0.0f, null, tzl0, tzl1, null, goz1, v1 << 6 & 0x380 | 0x6030, 616);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new bfee(hfc0, bffc0, v);
        }
    }

    public static final void c(hfc hfc0, goz goz0, int v) {
        goz goz1 = goz0.ao(-60901982);
        if(((v | 6) & 3) == 2 && goz1.ac()) {
            goz1.G();
        }
        else {
            hfc0 = hfc.e;
            hfc hfc1 = cqx.c(dls.v(hfc0), fpu.a(goz1).p);
            iau iau0 = dhw.a(hei.a, false);
            long v1 = gol.c(goz1);
            gzk gzk0 = goz1.ak();
            hfc hfc2 = hew.c(goz1, hfc1);
            ibth ibth0 = iej.a;
            goz1.O();
            if(goz1.x) {
                goz1.t(ibth0);
            }
            else {
                goz1.T();
            }
            int v2 = (int)(v1 ^ v1 >>> 0x20);
            guo.b(goz1, iau0, iej.e);
            guo.b(goz1, gzk0, iej.d);
            ibtw ibtw0 = iej.f;
            if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v2))) {
                Integer integer0 = v2;
                goz1.P(integer0);
                goz1.p(integer0, ibtw0);
            }
            guo.a(goz1, iej.g);
            guo.b(goz1, hfc2, iej.c);
            hfc hfc3 = dls.v(hfc0);
            fiso.a(ism.a(0x7F0804B6, goz1, 0), null, hfc3, fpu.a(goz1).v, goz1, 440, 0);  // drawable:gs_account_circle_full_vd_theme_24
            goz1.z();
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new bfeg(hfc0, v);
        }
    }
}

