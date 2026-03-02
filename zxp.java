public final class zxp {
    public static final void a(zoa zoa0, hfc hfc0, goz goz0, int v) {
        goz goz1 = goz0.ao(0x374F1D0D);
        int v1 = (v & 6) == 0 ? (((v & 8) == 0 ? goz1.X(zoa0) : goz1.Z(zoa0)) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.X(hfc0) ? 0x20 : 16);
        }
        if((v1 & 19) == 18 && goz1.ac()) {
            goz1.G();
            goto label_41;
        }
        else {
            gged_interceptors gged0 = zoa0.a;
            if(gged0.isEmpty()) {
                gsb gsb0 = goz1.af();
                if(gsb0 != null) {
                    gsb0.d = new zxk(zoa0, hfc0, v);
                }
            }
            else {
                iau iau0 = dii.a(dho.g(2.0f), hei.m, goz1, 6);
                int v2 = zxh.a(gol.c(goz1));
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
                guo.b(goz1, iau0, iej.e);
                guo.b(goz1, gzk0, iej.d);
                ibtw ibtw0 = iej.f;
                if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v2))) {
                    Integer integer0 = v2;
                    goz1.P(integer0);
                    goz1.p(integer0, ibtw0);
                }
                guo.a(goz1, iej.g);
                guo.b(goz1, hfc1, iej.c);
                goz1.M(0x58574F56);
                ggqk ggqk0 = gged0.E();
                ibuq.e(ggqk0, "iterator(...)");
                while(ggqk0.hasNext()) {
                    zoc zoc0 = (zoc)ggqk0.next();
                    aaas.a(zoc0.a, zoc0.b, zoc0.c, zoc0.d, zoc0.e, null, zoc0.f, zoc0.g, zoc0.h, goz1, 0x8000, 0x20);
                }
                goz1.x();
                goz1.z();
            label_41:
                gsb gsb1 = goz1.af();
                if(gsb1 != null) {
                    gsb1.d = new zxl(zoa0, hfc0, v);
                }
            }
        }
    }

    public static final void b(zog zog0, hfc hfc0, goz goz0, int v) {
        ibtw ibtw11;
        ibts ibts2;
        ibtw ibtw10;
        ibtw ibtw9;
        ibtw ibtw8;
        ibtw ibtw7;
        ibtw ibtw6;
        ibth ibth1;
        ibtw ibtw5;
        ibts ibts1;
        ibtw ibtw4;
        hfc hfc1;
        zog zog1;
        ibuq.f(zog0, "collectionCardItem");
        goz goz1 = goz0.ao(0xDB221D94);
        if(((((v & 6) == 0 ? v | (((v & 8) == 0 ? goz1.X(zog0) : goz1.Z(zog0)) ? 4 : 2) : v) | 0x30) & 19) == 18 && goz1.ac()) {
            goz1.G();
            zog1 = zog0;
            hfc1 = hfc0;
        }
        else {
            hey hey0 = hfc.e;
            aacf aacf0 = (aacf)goz1.h(aadh.b);
            grwp grwp0 = zhz.b(zog0.d);
            hfc hfc2 = dls.w(hey0);
            ibuq.e(zog0.h, "getResourceKey(...)");
            ibuq.f(hfc2, "<this>");
            ibuq.f(zog0.h, "resourceKey");
            aaav.a();
            iau iau0 = dhw.a(hei.a, false);
            int v1 = zxh.a(gol.c(goz1));
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
            if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v1))) {
                Integer integer0 = v1;
                goz1.P(integer0);
                goz1.p(integer0, ibtw2);
            }
            ibts ibts0 = iej.g;
            guo.a(goz1, ibts0);
            ibtw ibtw3 = iej.c;
            guo.b(goz1, hfc3, ibtw3);
            dhg dhg0 = dho.g(16.0f);
            hfc hfc4 = dla.j(dls.A(hey0, 0.0f, isn.a(0x7F0701A0, goz1), 1), 0.0f, 16.0f, 0.0f, 0.0f, 13);  // dimen:as_expressive_card_max_width
            hfc hfc5 = dls.w(dic.a.a(hfc4, hei.e));
            hej hej0 = hei.m;
            iau iau1 = dii.a(dhg0, hej0, goz1, 6);
            int v2 = zxh.a(gol.c(goz1));
            gzk gzk1 = goz1.ak();
            hfc hfc6 = hew.c(goz1, hfc5);
            goz1.O();
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
            guo.b(goz1, hfc6, ibtw3);
            goz1.M(782808619);
            String s = zog0.a;
            if(s.length() <= 0 && zog0.b.length() <= 0 && zog0.c.length() <= 0) {
                zog1 = zog0;
                hfc1 = hey0;
                ibtw4 = ibtw2;
                ibts1 = ibts0;
                ibtw5 = ibtw3;
                ibth1 = ibth0;
                ibtw6 = ibtw0;
                ibtw7 = ibtw1;
            }
            else {
                dhg dhg1 = dho.g(4.0f);
                hfc hfc7 = dla.j(hey0, 24.0f, 0.0f, 24.0f, 0.0f, 10);
                goz1.M(0x6E3C21FE);
                Object object0 = goz1.j();
                Object object1 = gop.a;
                if(object0 == object1) {
                    object0 = new zxm();
                    goz1.P(object0);
                }
                goz1.x();
                hfc hfc8 = iuc.c(hfc7, true, ((ibts)object0));
                iau iau2 = dii.a(dhg1, hej0, goz1, 6);
                int v3 = zxh.a(gol.c(goz1));
                gzk gzk2 = goz1.ak();
                hfc hfc9 = hew.c(goz1, hfc8);
                goz1.O();
                if(goz1.x) {
                    goz1.t(ibth0);
                }
                else {
                    goz1.T();
                }
                guo.b(goz1, iau2, ibtw0);
                guo.b(goz1, gzk2, ibtw1);
                if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v3))) {
                    Integer integer2 = v3;
                    goz1.P(integer2);
                    goz1.p(integer2, ibtw2);
                }
                guo.a(goz1, ibts0);
                guo.b(goz1, hfc9, ibtw3);
                aabc.a.c(s, null, goz1, 0x180);
                String s1 = zog0.b;
                String s2 = zog0.c;
                goz1.M(-1633490746);
                int v4 = goz1.Z(aacf0) | goz1.X(grwp0);
                aabc aabc0 = aabc.a;
                Object object2 = goz1.j();
                if(v4 != 0 || object2 == object1) {
                    object2 = new zxn(aacf0, grwp0);
                    goz1.P(object2);
                }
                goz1.x();
                ibtw6 = ibtw0;
                ibts1 = ibts0;
                ibtw7 = ibtw1;
                ibth1 = ibth0;
                ibtw4 = ibtw2;
                zog1 = zog0;
                ibtw5 = ibtw3;
                hfc1 = hey0;
                aabc0.b(s1, s2, ((ibth)object2), null, 0L, 0L, goz1, 0x180000, 56);
                goz1.z();
            }
            goz1.x();
            goz1.M(0x2EA90953);
            ggqk ggqk0 = zog1.e.E();
            ibuq.e(ggqk0, "iterator(...)");
            while(ggqk0.hasNext()) {
                zoa zoa0 = (zoa)ggqk0.next();
                ibuq.c(zoa0);
                zxp.a(zoa0, dla.i(hfc1, 16.0f, 0.0f, 2), goz1, 56);
                goz1.M(0x2EA91ADA);
                gged_interceptors gged0 = zoa0.b;
                if(gged0.isEmpty()) {
                    ibtw11 = ibtw5;
                    ibts2 = ibts1;
                    ibtw8 = ibtw6;
                    ibtw9 = ibtw7;
                    ibtw10 = ibtw4;
                }
                else {
                    iau iau3 = dii.a(dho.g(8.0f), hej0, goz1, 6);
                    int v5 = zxh.a(gol.c(goz1));
                    gzk gzk3 = goz1.ak();
                    hfc hfc10 = hew.c(goz1, hfc1);
                    goz1.O();
                    if(goz1.x) {
                        goz1.t(ibth1);
                    }
                    else {
                        goz1.T();
                    }
                    ibtw8 = ibtw6;
                    guo.b(goz1, iau3, ibtw8);
                    ibtw9 = ibtw7;
                    guo.b(goz1, gzk3, ibtw9);
                    if(!goz1.x && ibuq.m(goz1.j(), Integer.valueOf(v5))) {
                        ibtw10 = ibtw4;
                    }
                    else {
                        Integer integer3 = v5;
                        goz1.P(integer3);
                        ibtw10 = ibtw4;
                        goz1.p(integer3, ibtw10);
                    }
                    ibts2 = ibts1;
                    guo.a(goz1, ibts2);
                    ibtw11 = ibtw5;
                    guo.b(goz1, hfc10, ibtw11);
                    goz1.M(0xEA24464);
                    ggqk ggqk1 = gged0.E();
                    ibuq.e(ggqk1, "iterator(...)");
                    while(ggqk1.hasNext()) {
                        zob zob0 = (zob)ggqk1.next();
                        ibuq.c(zob0);
                        zxp.c(zob0, null, goz1, 8);
                    }
                    goz1.x();
                    goz1.z();
                }
                goz1.x();
                ibtw6 = ibtw8;
                ibts1 = ibts2;
                ibtw7 = ibtw9;
                ibtw4 = ibtw10;
                ibtw5 = ibtw11;
            }
            goz1.x();
            goz1.z();
            goz1.z();
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new zxo(zog1, hfc1, v);
        }
    }

    public static final void c(zob zob0, hfc hfc0, goz goz0, int v) {
        ibtw ibtw11;
        ibtw ibtw10;
        ibts ibts2;
        hey hey2;
        ibtw ibtw9;
        ibtw ibtw8;
        ibtw ibtw7;
        aacf aacf1;
        ibtw ibtw6;
        grwp grwp1;
        ibtw ibtw5;
        hey hey1;
        ibtw ibtw4;
        ibts ibts1;
        dlq dlq1;
        goz goz2;
        zob zob1;
        hfc hfc1;
        goz goz1 = goz0.ao(0xC02AF54B);
        if(((((v & 6) == 0 ? v | (((v & 8) == 0 ? goz1.X(zob0) : goz1.Z(zob0)) ? 4 : 2) : v) | 0x30) & 19) == 18 && goz1.ac()) {
            goz1.G();
            hfc1 = hfc0;
            zob1 = zob0;
            goz2 = goz1;
        }
        else {
            hey hey0 = hfc.e;
            aacf aacf0 = (aacf)goz1.h(aadh.b);
            grwp grwp0 = zhz.b(zob0.d);
            iau iau0 = dll.b(dho.g, hei.k, goz1, 54);
            int v1 = zxh.a(gol.c(goz1));
            gzk gzk0 = goz1.ak();
            hfc hfc2 = hew.c(goz1, hey0);
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
            if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v1))) {
                Integer integer0 = v1;
                goz1.P(integer0);
                goz1.p(integer0, ibtw2);
            }
            ibts ibts0 = iej.g;
            guo.a(goz1, ibts0);
            ibtw ibtw3 = iej.c;
            guo.b(goz1, hfc2, ibtw3);
            zhr zhr0 = zob0.a;
            dlq dlq0 = dlq.a;
            goz1.M(0x797F3D3E);
            if(zhr0 == null) {
                aacf1 = aacf0;
                hey1 = hey0;
                ibts1 = ibts0;
                ibtw4 = ibtw3;
                dlq1 = dlq0;
                ibtw7 = ibtw1;
                ibtw5 = ibtw2;
                goz2 = goz1;
                grwp1 = grwp0;
                ibtw6 = ibtw0;
            }
            else {
                dlq1 = dlq0;
                ibts1 = ibts0;
                ibtw4 = ibtw3;
                hfc hfc3 = dla.j(hey0, 24.0f, 0.0f, 12.0f, 0.0f, 10);
                goz2 = goz1;
                hey1 = hey0;
                ibtw5 = ibtw2;
                grwp1 = grwp0;
                ibtw6 = ibtw0;
                aacf1 = aacf0;
                ibtw7 = ibtw1;
                aadq.b(zhr0, hys.a, hfc3, 0L, 0, 0, goz2, 0x1B0, 56);
            }
            goz2.x();
            dhg dhg0 = dho.g(4.0f);
            hfc hfc4 = dlo.a(dlq1, hey1, 1.0f);
            iau iau1 = dii.a(dhg0, hei.m, goz2, 6);
            int v2 = zxh.a(gol.c(goz2));
            gzk gzk1 = goz2.ak();
            hfc hfc5 = hew.c(goz2, hfc4);
            goz2.O();
            if(goz2.x) {
                goz2.t(ibth0);
            }
            else {
                goz2.T();
            }
            guo.b(goz2, iau1, ibtw6);
            guo.b(goz2, gzk1, ibtw7);
            if(goz2.x || !ibuq.m(goz2.j(), Integer.valueOf(v2))) {
                Integer integer1 = v2;
                goz2.P(integer1);
                goz2.p(integer1, ibtw5);
            }
            guo.a(goz2, ibts1);
            guo.b(goz2, hfc5, ibtw4);
            goz2.M(0xAA86FD43);
            String s = zob0.b;
            if(s.length() > 0 || zob0.c.length() > 0) {
                String s1 = zob0.c;
                aabc aabc0 = aabc.a;
                goz2.M(-1633490746);
                int v3 = goz2.Z(aacf1) | goz2.X(grwp1);
                Object object0 = goz2.j();
                if(v3 != 0 || object0 == gop.a) {
                    object0 = new zxi(aacf1, grwp1);
                    goz2.P(object0);
                }
                goz2.x();
                ibtw8 = ibtw5;
                ibtw9 = ibtw6;
                hey2 = hey1;
                ibts2 = ibts1;
                ibtw10 = ibtw4;
                zob1 = zob0;
                ibtw11 = ibtw7;
                aabc0.b(s, s1, ((ibth)object0), dla.i(hey1, 24.0f, 0.0f, 2), 0L, 0L, goz2, 0x180C00, 0x30);
                goz2 = goz2;
            }
            else {
                ibtw8 = ibtw5;
                hey2 = hey1;
                ibtw11 = ibtw7;
                ibtw10 = ibtw4;
                zob1 = zob0;
                ibts2 = ibts1;
                ibtw9 = ibtw6;
            }
            goz2.x();
            goz2.M(-1433983083);
            gged_interceptors gged0 = zob1.e;
            if(!gged0.isEmpty()) {
                zxu.a(gged0, null, goz2, 0);
            }
            goz2.x();
            goz2.z();
            goz2.M(2038409405);
            gged_interceptors gged1 = zob1.f;
            if(gged1.isEmpty()) {
                hfc1 = hey2;
            }
            else {
                hfc1 = hey2;
                hfc hfc6 = dla.j(hfc1, 12.0f, 0.0f, 24.0f, 0.0f, 10);
                iau iau2 = dll.b(dho.g(4.0f), hei.j, goz2, 6);
                int v4 = zxh.a(gol.c(goz2));
                gzk gzk2 = goz2.ak();
                hfc hfc7 = hew.c(goz2, hfc6);
                goz2.O();
                if(goz2.x) {
                    goz2.t(ibth0);
                }
                else {
                    goz2.T();
                }
                guo.b(goz2, iau2, ibtw9);
                guo.b(goz2, gzk2, ibtw11);
                if(goz2.x || !ibuq.m(goz2.j(), Integer.valueOf(v4))) {
                    Integer integer2 = v4;
                    goz2.P(integer2);
                    goz2.p(integer2, ibtw8);
                }
                guo.a(goz2, ibts2);
                guo.b(goz2, hfc7, ibtw10);
                goz2.M(0xD3E5FF32);
                ggqk ggqk0 = gged1.E();
                ibuq.e(ggqk0, "iterator(...)");
                while(ggqk0.hasNext()) {
                    zoe zoe0 = (zoe)ggqk0.next();
                    goz2.M(0xD3E6064D);
                    if((zoe0 instanceof znw)) {
                        zyr.a(((znw)zoe0), null, goz2, 0);
                    }
                    goz2.x();
                }
                goz2.x();
                goz2.z();
            }
            goz2.x();
            goz2.z();
        }
        gsb gsb0 = goz2.af();
        if(gsb0 != null) {
            gsb0.d = new zxj(zob1, hfc1, v);
        }
    }
}

