public final class zyo {
    public static final void a(zon zon0, hfc hfc0, goz goz0, int v) {
        hfc hfc1;
        ibuq.f(zon0, "footerListItem");
        goz goz1 = goz0.ao(0xA3290807);
        if(((((v & 6) == 0 ? (goz1.Z(zon0) ? 4 : 2) | v : v) | 0x30) & 19) == 18 && goz1.ac()) {
            goz1.G();
            hfc1 = hfc0;
        }
        else {
            hfc1 = hfc.e;
            aacf aacf0 = (aacf)goz1.h(aadh.b);
            hfc hfc2 = dls.w(hfc1);
            iau iau0 = dhw.a(hei.a, false);
            long v1 = gol.c(goz1);
            gzk gzk0 = goz1.ak();
            hfc hfc3 = hew.c(goz1, hfc2);
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
            guo.b(goz1, hfc3, iej.c);
            hfc hfc4 = dla.j(dls.A(hfc1, 0.0f, isn.a(0x7F0701A0, goz1), 1), 16.0f, 16.0f, 16.0f, 0.0f, 8);  // dimen:as_expressive_card_max_width
            hfc hfc5 = dls.w(dic.a.a(hfc4, hei.e));
            gze gze0 = gzf.e(1207130226, new zyn(zon0, aacf0), goz1);
            djr.e(hfc5, dho.e, null, null, 0, 0, gze0, goz1, 0x180030, 60);
            goz1.z();
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new zyk(zon0, hfc1, v);
        }
    }
}

