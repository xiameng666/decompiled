public final class aaal {
    public static final void a(zoq zoq0, hfc hfc0, goz goz0, int v) {
        String s3;
        hfc hfc1;
        ibuq.f(zoq0, "segmentHeaderListItem");
        goz goz1 = goz0.ao(400081436);
        if(((((v & 6) == 0 ? v | (goz1.Z(zoq0) ? 4 : 2) : v) | 0x30) & 19) == 18 && goz1.ac()) {
            goz1.G();
            hfc1 = hfc0;
        }
        else {
            hey hey0 = hfc.e;
            aacf aacf0 = (aacf)goz1.h(aadh.b);
            String s = zoq0.b;
            String s1 = zoq0.c;
            String s2 = zoq0.d;
            grwp grwp0 = zhz.b(zoq0.e);
            hfc hfc2 = dls.w(hey0);
            iau iau0 = dhw.a(hei.a, false);
            int v1 = aaah.a(gol.c(goz1));
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
            ibtw ibtw0 = iej.e;
            guo.b(goz1, iau0, ibtw0);
            ibtw ibtw1 = iej.d;
            guo.b(goz1, gzk0, ibtw1);
            ibtw ibtw2 = iej.f;
            if(goz1.x) {
                s3 = s1;
            label_33:
                Integer integer0 = v1;
                goz1.P(integer0);
                goz1.p(integer0, ibtw2);
            }
            else {
                s3 = s1;
                if(!ibuq.m(goz1.j(), Integer.valueOf(v1))) {
                    goto label_33;
                }
            }
            ibts ibts0 = iej.g;
            guo.a(goz1, ibts0);
            ibtw ibtw3 = iej.c;
            guo.b(goz1, hfc3, ibtw3);
            hfc hfc4 = dla.f(dls.A(hey0, 0.0f, isn.a(0x7F0701A0, goz1), 1), 24.0f, 16.0f, 24.0f, 0.0f);  // dimen:as_expressive_card_max_width
            hfc hfc5 = dls.w(dic.a.a(hfc4, hei.e));
            ibuq.f(hfc5, "<this>");
            aaav.a();
            goz1.M(0x6E3C21FE);
            Object object0 = goz1.j();
            Object object1 = gop.a;
            if(object0 == object1) {
                object0 = new aaai();
                goz1.P(object0);
            }
            goz1.x();
            hfc hfc6 = iuc.c(hfc5, true, ((ibts)object0));
            iau iau1 = dii.a(dho.g(8.0f), hei.m, goz1, 6);
            gzk gzk1 = goz1.ak();
            hfc hfc7 = hew.c(goz1, hfc6);
            goz1.O();
            int v2 = aaah.a(gol.c(goz1));
            if(goz1.x) {
                goz1.t(ibth0);
            }
            else {
                goz1.T();
            }
            guo.b(goz1, iau1, ibtw0);
            guo.b(goz1, gzk1, ibtw1);
            if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v2))) {
                Integer integer1 = v2;
                goz1.P(integer1);
                goz1.p(integer1, ibtw2);
            }
            guo.a(goz1, ibts0);
            guo.b(goz1, hfc7, ibtw3);
            aabc aabc0 = aabc.a;
            aabc0.a(s, goz1, 0x30);
            goz1.M(-1633490746);
            int v3 = goz1.Z(aacf0) | goz1.X(grwp0);
            Object object2 = goz1.j();
            if(v3 != 0 || object2 == object1) {
                object2 = new aaaj(aacf0, grwp0);
                goz1.P(object2);
            }
            goz1.x();
            aabc0.b(s3, s2, ((ibth)object2), null, 0L, 0L, goz1, 0x180000, 56);
            goz1.z();
            goz1.z();
            hfc1 = hey0;
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new aaak(zoq0, hfc1, v);
        }
    }
}

