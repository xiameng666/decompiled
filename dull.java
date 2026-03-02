public final class dull {
    public static final void a(hfc hfc0, goz goz0, int v) {
        goz goz1 = goz0.ao(0xAF605950);
        if(((v | 6) & 3) == 2 && goz1.ac()) {
            goz1.G();
        }
        else {
            hpw hpw0 = ism.a(0x7F0809DD, goz1, 0);  // drawable:pay_id_card
            String s = isq.c(0x7F152286, goz1);  // string:pay_transactions_status_icon_description "Status icon"
            hlb hlb0 = new hlb(fpu.a(goz1).a, 5);
            cth.a(hpw0, s, hfc.e, null, null, 0.0f, hlb0, goz1, (v | 6) << 6 & 0x380 | 8, 56);
            hfc0 = hfc.e;
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new dulh(hfc0, v);
        }
    }

    public static final void b(hfc hfc0, dule dule0, goz goz0, int v) {
        dule dule2;
        dule dule1;
        hfc hfc1;
        goz goz1 = goz0.ao(-1580678552);
        if((((v & 0x30) == 0 ? v | 22 : v | 6) & 19) == 18 && goz1.ac()) {
            goz1.G();
            hfc1 = hfc0;
            dule1 = dule0;
        }
        else {
            goz1.I();
            if((v & 1) != 0 && !goz1.aa()) {
                goz1.G();
                hfc1 = hfc0;
                dule2 = dule0;
            }
            else {
                hfc1 = hfc.e;
                dule2 = new dule(null);
            }
            goz1.w();
            fxw.a(null, null, null, null, null, 0, 0L, 0L, null, gzf.e(0xB1C024FE, new dulk(hfc1, dule2), goz1), goz1, 0x30000000, 0x1FF);
            dule1 = dule2;
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new duli(hfc1, dule1, v);
        }
    }

    public static final void c(hfc hfc0, goz goz0, int v) {
        goz goz1 = goz0.ao(0x8C06254E);
        if(((v | 6) & 3) == 2 && goz1.ac()) {
            goz1.G();
        }
        else {
            hfc0 = hfc.e;
            fwy.g(dls.k(hfc0, 104.0f), fpu.a(goz1).a, 4.0f, 0L, 0, 0.0f, goz1, 0x180, 56);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new dulg(hfc0, v);
        }
    }

    public static final void d(hfc hfc0, dule dule0, goz goz0, int v) {
        goz goz1 = goz0.ao(0x811E5D13);
        if((((v & 0x30) == 0 ? v | 6 | (goz1.X(dule0) ? 0x20 : 16) : v | 6) & 19) == 18 && goz1.ac()) {
            goz1.G();
        }
        else {
            goz1.I();
            if((v & 1) != 0 && !goz1.aa()) {
                goz1.G();
            }
            else {
                hfc0 = hfc.e;
            }
            goz1.w();
            hfc hfc1 = dla.d(hfc0, 16.0f);
            iau iau0 = dii.a(dho.e, hei.n, goz1, 54);
            int v1 = dulf.a(gol.c(goz1));
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
            iau iau1 = dhw.a(hei.e, false);
            int v2 = dulf.a(gol.c(goz1));
            gzk gzk1 = goz1.ak();
            hfc hfc3 = hew.c(goz1, hfc.e);
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
            guo.b(goz1, hfc3, ibtw3);
            goz1.M(0xADE46B92);
            dull.c(null, goz1, 0);
            goz1.x();
            goz1.M(-1377537074);
            dull.a(null, goz1, 0);
            goz1.x();
            goz1.z();
            goz1.M(0x259DF2A3);
            goz1.x();
            goz1.M(0x259DFE3B);
            goz1.x();
            goz1.z();
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new dulj(hfc0, dule0, v);
        }
    }
}

