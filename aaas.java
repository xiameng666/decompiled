public final class aaas {
    public static final void a(String s, String s1, zhr zhr0, zoh zoh0, zht zht0, hfc hfc0, boolean z, gged_interceptors gged0, gged_interceptors gged1, goz goz0, int v, int v1) {
        hfc hfc6;
        hfc hfc5;
        eag eag0;
        int v9;
        gged_interceptors gged7;
        int v6;
        gged_interceptors gged6;
        int v5;
        gged_interceptors gged5;
        hfc hfc2;
        gged_interceptors gged4;
        boolean z1;
        gged_interceptors gged3;
        gged_interceptors gged2;
        hfc hfc1;
        int v2;
        ibuq.f(s, "title");
        ibuq.f(s1, "description");
        ibuq.f(zoh0, "position");
        goz goz1 = goz0.ao(0x41C6019B);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (goz1.X(s) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x30) == 0) {
            v2 |= (goz1.X(s1) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x180) == 0) {
            v2 |= (((v & 0x200) == 0 ? goz1.X(zhr0) : goz1.Z(zhr0)) ? 0x100 : 0x80);
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0xC00) == 0) {
            v2 |= (goz1.V(zoh0.ordinal()) ? 0x800 : 0x400);
        }
        if((v1 & 16) != 0) {
            v2 |= 0x6000;
        }
        else if((v & 0x6000) == 0) {
            v2 |= (((0x8000 & v) == 0 ? goz1.X(zht0) : goz1.Z(zht0)) ? 0x4000 : 0x2000);
        }
        if((v1 & 0x20) != 0) {
            v2 |= 0x30000;
            hfc1 = hfc0;
        }
        else if((0x30000 & v) == 0) {
            hfc1 = hfc0;
            v2 |= (goz1.X(hfc1) ? 0x20000 : 0x10000);
        }
        else {
            hfc1 = hfc0;
        }
        if((v1 & 0x40) != 0) {
            v2 |= 0x180000;
        }
        else if((v & 0x180000) == 0) {
            v2 |= (goz1.Y(z) ? 0x100000 : 0x80000);
        }
        int v3 = 0x400000;
        if((0xC00000 & v) == 0) {
            if((v1 & 0x80) == 0) {
                gged2 = gged0;
                if(goz1.Z(gged2)) {
                    v3 = 0x800000;
                }
            }
            else {
                gged2 = gged0;
            }
            v2 |= v3;
        }
        else {
            gged2 = gged0;
        }
        int v4 = 0x2000000;
        if((v & 0x6000000) == 0) {
            if((v1 & 0x100) == 0) {
                gged3 = gged1;
                if(goz1.Z(gged3)) {
                    v4 = 0x4000000;
                }
            }
            else {
                gged3 = gged1;
            }
            v2 |= v4;
        }
        else {
            gged3 = gged1;
        }
        if((v2 & 0x2492493) == 0x2492492 && goz1.ac()) {
            goz1.G();
            z1 = z;
            gged4 = gged2;
        }
        else {
            goz1.I();
            if((v & 1) != 0 && !goz1.aa()) {
                goz1.G();
                if((v1 & 0x80) != 0) {
                    v2 &= 0xFE3FFFFF;
                }
                if((v1 & 0x100) != 0) {
                    v2 &= 0xF1FFFFFF;
                }
                hfc2 = hfc1;
                gged5 = gged3;
                v5 = z;
                gged6 = gged2;
                v6 = v2;
            }
            else {
                hfc2 = (v1 & 0x20) == 0 ? hfc1 : hfc.e;
                int v7 = ((v1 & 0x40) == 0 ? 1 : 0) & z;
                if((v1 & 0x80) == 0) {
                    gged7 = gged2;
                }
                else {
                    v2 &= 0xFE3FFFFF;
                    gged7 = ggna.a;
                }
                if((v1 & 0x100) == 0) {
                    v5 = v7;
                    gged6 = gged7;
                    gged5 = gged3;
                    v6 = v2;
                }
                else {
                    v5 = v7;
                    v6 = v2 & 0xF1FFFFFF;
                    gged6 = gged7;
                    gged5 = ggna.a;
                }
            }
            goz1.w();
            aacf aacf0 = (aacf)goz1.h(aadh.b);
            grwp grwp0 = zhz.b(zht0);
            hfc hfc3 = dls.w(hfc2);
            iau iau0 = dhw.a(hei.a, false);
            int v8 = aaam.a(gol.c(goz1));
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
            ibtw ibtw0 = iej.e;
            guo.b(goz1, iau0, ibtw0);
            ibtw ibtw1 = iej.d;
            guo.b(goz1, gzk0, ibtw1);
            ibtw ibtw2 = iej.f;
            if(goz1.x) {
                v9 = v5;
            label_126:
                Integer integer0 = v8;
                goz1.P(integer0);
                goz1.p(integer0, ibtw2);
            }
            else {
                v9 = v5;
                if(!ibuq.m(goz1.j(), Integer.valueOf(v8))) {
                    goto label_126;
                }
            }
            ibts ibts0 = iej.g;
            guo.a(goz1, ibts0);
            ibtw ibtw3 = iej.c;
            guo.b(goz1, hfc4, ibtw3);
            goz1.M(1697958930);
            if(v9 == 0) {
                hey hey0 = hfc.e;
                switch(zoh0.ordinal()) {
                    case 0: {
                        eag0 = aacp.b;
                        break;
                    }
                    case 1: {
                        eag0 = aacp.d;
                        break;
                    }
                    case 2: {
                        eag0 = aacp.c;
                        break;
                    }
                    case 3: {
                        eag0 = aacp.a;
                        break;
                    }
                    default: {
                        throw new ibnq();
                    }
                }
                hfc6 = hfc2;
                hfc hfc7 = cqx.c(hhi.a(hey0, eag0), fpu.a(goz1).D);
                goz1.M(-1633490746);
                int v10 = goz1.Z(aacf0) | goz1.X(grwp0);
                Object object0 = goz1.j();
                if(v10 != 0 || object0 == gop.a) {
                    object0 = new aaap(aacf0, grwp0);
                    goz1.P(object0);
                }
                goz1.x();
                hfc5 = dla.e(hhc.a(dls.x(cru.d(hfc7, grwp0 != null, null, null, null, ((ibth)object0), 14), 56.0f, 0.0f, 2), (grwp0 == null ? 0.38f : 1.0f)), 16.0f, 12.0f);
            }
            else {
                hfc5 = dla.f(dls.x(hfc.e, 56.0f, 0.0f, 2), 8.0f, 12.0f, 16.0f, 12.0f);
                hfc6 = hfc2;
            }
            goz1.x();
            iau iau1 = dll.b(dho.g, hei.k, goz1, 54);
            int v11 = aaam.a(gol.c(goz1));
            gzk gzk1 = goz1.ak();
            hfc hfc8 = hew.c(goz1, hfc5);
            goz1.O();
            if(goz1.x) {
                goz1.t(ibth0);
            }
            else {
                goz1.T();
            }
            guo.b(goz1, iau1, ibtw0);
            guo.b(goz1, gzk1, ibtw1);
            if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v11))) {
                Integer integer1 = v11;
                goz1.P(integer1);
                goz1.p(integer1, ibtw2);
            }
            guo.a(goz1, ibts0);
            guo.b(goz1, hfc8, ibtw3);
            aaas.c(zhr0, null, goz1, v6 >> 6 & 14);
            aaas.b(s, s1, gged6, dlo.a(dlq.a, hfc.e, 1.0f), goz1, v6 & 0x7E | v6 >> 15 & 0x380);
            aaas.d(gged5, null, goz1, v6 >> 24 & 14);
            goz1.z();
            goz1.z();
            z1 = v9;
            gged4 = gged6;
            gged3 = gged5;
            hfc1 = hfc6;
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new aaaq(s, s1, zhr0, zoh0, zht0, hfc1, z1, gged4, gged3, v, v1);
        }
    }

    public static final void b(String s, String s1, gged_interceptors gged0, hfc hfc0, goz goz0, int v) {
        int v1;
        String s2;
        goz goz1 = goz0.ao(-1239567047);
        if((v & 6) == 0) {
            s2 = s;
            v1 = (goz1.X(s2) ? 4 : 2) | v;
        }
        else {
            s2 = s;
            v1 = v;
        }
        if((v & 0x30) == 0) {
            v1 |= (goz1.X(s1) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (goz1.Z(gged0) ? 0x100 : 0x80);
        }
        if((v & 0xC00) == 0) {
            v1 |= (goz1.X(hfc0) ? 0x800 : 0x400);
        }
        if((v1 & 0x493) == 1170 && goz1.ac()) {
            goz1.G();
        }
        else {
            iau iau0 = dii.a(dho.c, hei.m, goz1, 0);
            int v2 = aaam.a(gol.c(goz1));
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
            goz1.M(0x343BD6DD);
            if(s2.length() > 0) {
                jbn jbn0 = fpu.d(goz1).h;
                fiuk.b(s2, null, fpu.a(goz1).q, 0L, jeu.b, 0L, null, 0L, 0, false, 0, 0, null, jbn0, goz1, v1 & 14 | 0x180000, 0, 0x1FFBA);
            }
            goz1.x();
            goz1.M(0x343BF2CF);
            if(s1.length() > 0) {
                jbn jbn1 = fpu.d(goz1).k;
                fiuk.b(s1, null, fpu.a(goz1).s, 0L, jeu.a, 0L, null, 0L, 0, false, 0, 0, null, jbn1, goz1, v1 >> 3 & 14 | 0x180000, 0, 0x1FFBA);
            }
            goz1.x();
            goz1.M(0x343C104D);
            if(!gged0.isEmpty()) {
                zxu.a(gged0, null, goz1, v1 >> 6 & 14);
            }
            goz1.x();
            goz1.z();
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new aaan(s, s1, gged0, hfc0, v);
        }
    }

    public static final void c(zhr zhr0, hfc hfc0, goz goz0, int v) {
        hey hey1;
        zhr zhr1;
        goz goz1 = goz0.ao(-330064136);
        int v1 = (v & 6) == 0 ? (((v & 8) == 0 ? goz1.X(zhr0) : goz1.Z(zhr0)) ? 4 : 2) | v : v;
        if(((v1 | 0x30) & 19) == 18 && goz1.ac()) {
            goz1.G();
            zhr1 = zhr0;
        }
        else {
            hey hey0 = hfc.e;
            if(zhr0 == null) {
                hey1 = hey0;
                zhr1 = null;
            }
            else {
                hey1 = hey0;
                hfc hfc1 = dls.m(dla.j(hey0, 0.0f, 0.0f, 12.0f, 0.0f, 11), 40.0f, 40.0f);
                zhr1 = zhr0;
                aadq.b(zhr1, hys.b, hfc1, 0L, 0, 0, goz1, (v1 | 0x30) & 14 | 0x30, 56);
            }
            hfc0 = hey1;
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new aaao(zhr1, hfc0, v);
        }
    }

    public static final void d(gged_interceptors gged0, hfc hfc0, goz goz0, int v) {
        goz goz1 = goz0.ao(0x204755F);
        if(((((v & 6) == 0 ? (goz1.Z(gged0) ? 4 : 2) | v : v) | 0x30) & 19) == 18 && goz1.ac()) {
            goz1.G();
        }
        else {
            hey hey0 = hfc.e;
            if(!gged0.isEmpty()) {
                hfc hfc1 = dla.j(hey0, 12.0f, 0.0f, 0.0f, 0.0f, 14);
                iau iau0 = dll.b(dho.g(4.0f), hei.j, goz1, 6);
                int v1 = aaam.a(gol.c(goz1));
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
                guo.b(goz1, iau0, iej.e);
                guo.b(goz1, gzk0, iej.d);
                ibtw ibtw0 = iej.f;
                if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v1))) {
                    Integer integer0 = v1;
                    goz1.P(integer0);
                    goz1.p(integer0, ibtw0);
                }
                guo.a(goz1, iej.g);
                guo.b(goz1, hfc2, iej.c);
                goz1.M(0xEADF0334);
                ggqk ggqk0 = gged0.E();
                ibuq.e(ggqk0, "iterator(...)");
                while(ggqk0.hasNext()) {
                    zoe zoe0 = (zoe)ggqk0.next();
                    if((zoe0 instanceof znw)) {
                        goz1.M(0xEADF0DEB);
                        zyr.a(((znw)zoe0), null, goz1, 0);
                    }
                    else if((zoe0 instanceof zod)) {
                        goz1.M(0xEADF16C8);
                        aaau.a(((zod)zoe0), null, goz1, 0, 2);
                    }
                    else if((zoe0 instanceof znv)) {
                        goz1.M(0xEADF1F27);
                        zyj.b(((znv)zoe0), null, goz1, 0);
                    }
                    else if((zoe0 instanceof zny)) {
                        goz1.M(0xEADF2811);
                        zzo.a(((zny)zoe0), null, goz1, 0);
                    }
                    else {
                        goz1.M(0x7106B8C2);
                    }
                    goz1.x();
                }
                goz1.x();
                goz1.z();
            }
            hfc0 = hey0;
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new aaar(gged0, hfc0, v);
        }
    }
}

