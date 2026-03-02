import java.util.Iterator;
import java.util.List;

public final class dulc {
    public static final void a(fryv fryv0, goz goz0, int v) {
        goz goz2;
        goz goz1 = goz0.ao(0x8AF18722);
        int v1 = (v & 6) == 0 ? v | (goz1.Z(fryv0) ? 4 : 2) : v;
        if((v1 & 3) == 2 && goz1.ac()) {
            goz1.G();
            goz2 = goz1;
        }
        else {
            jbn jbn0 = fpu.d(goz1).k;
            goz2 = goz1;
            ftzd.a(fryv0, null, fpu.a(goz1).q, 0L, null, 0L, new jjy(5), 0L, 0, false, 0, 0, null, null, jbn0, goz2, v1 & 14, 0, 0x1FDFA);
        }
        gsb gsb0 = goz2.af();
        if(gsb0 != null) {
            gsb0.d = new dulb(fryv0, v);
        }
    }

    public static final void b(hfc hfc0, dujb dujb0, goz goz0, int v) {
        goz goz1 = goz0.ao(0x559377D7);
        int v1 = (v & 6) == 0 ? (goz1.X(hfc0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(dujb0) ? 0x20 : 16);
        }
        if((v1 & 19) == 18 && goz1.ac()) {
            goz1.G();
        }
        else {
            iau iau0 = dll.b(dho.g(6.0f), hei.j, goz1, 6);
            int v2 = dukv.a(gol.c(goz1));
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
            ibtw ibtw0 = iej.e;
            guo.b(goz1, iau0, ibtw0);
            ibtw ibtw1 = iej.d;
            guo.b(goz1, gzk0, ibtw1);
            ibtw ibtw2 = iej.f;
            if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v2))) {
                Integer integer0 = v2;
                goz1.P(integer0);
                goz1.p(integer0, ibtw2);
            }
            ibts ibts0 = iej.g;
            guo.a(goz1, ibts0);
            ibtw ibtw3 = iej.c;
            guo.b(goz1, hfc1, ibtw3);
            jbn jbn0 = fpu.d(goz1).k;
            goz1.M(0x2EB49053);
            float f = ((jks)goz1.h(ipa.d)).ea(jbn0.i());
            hey hey0 = hfc.e;
            hfc hfc2 = dls.m(hey0, 16.0f, f);
            iau iau1 = dhw.a(hei.e, false);
            int v3 = dukv.a(gol.c(goz1));
            gzk gzk1 = goz1.ak();
            hfc hfc3 = hew.c(goz1, hfc2);
            goz1.O();
            hel hel0 = hei.e;
            if(goz1.x) {
                goz1.t(ibth0);
            }
            else {
                goz1.T();
            }
            guo.b(goz1, iau1, ibtw0);
            guo.b(goz1, gzk1, ibtw1);
            if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v3))) {
                Integer integer1 = v3;
                goz1.P(integer1);
                goz1.p(integer1, ibtw2);
            }
            guo.a(goz1, ibts0);
            guo.b(goz1, hfc3, ibtw3);
            fryh fryh0 = new fryh(dujb0.b);
            hfc hfc4 = dls.k(hey0, 16.0f);
            hlb hlb0 = new hlb(fpu.a(goz1).q, 5);
            ftyy.b(fryh0, null, hfc4, hel0, hys.d, 1.0f, hlb0, goz1, 0x36DB0, 0);
            goz1.z();
            long v4 = fpu.a(goz1).q;
            jjy jjy0 = new jjy(5);
            ftzd.a(dujb0.a, null, v4, 0L, null, 0L, jjy0, 0L, 0, false, 0, 0, null, null, jbn0, goz1, 0, 0, 0x1FDFA);
            goz1 = goz1;
            goz1.x();
            goz1.z();
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new dula(hfc0, dujb0, v);
        }
    }

    public static final void c(hfc hfc0, List list0, goz goz0, int v) {
        goz goz1 = goz0.ao(0xF5CE87F6);
        if((((v & 0x30) == 0 ? v | 6 | (goz1.Z(list0) ? 0x20 : 16) : v | 6) & 19) == 18 && goz1.ac()) {
            goz1.G();
        }
        else {
            hfc0 = hfc.e;
            iau iau0 = dii.a(dho.c, hei.m, goz1, 0);
            int v1 = dukv.a(gol.c(goz1));
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
            if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v1))) {
                Integer integer0 = v1;
                goz1.P(integer0);
                goz1.p(integer0, ibtw0);
            }
            guo.a(goz1, iej.g);
            guo.b(goz1, hfc1, iej.c);
            goz1.M(-1600402171);
            ggqk ggqk0 = ((gged_interceptors)list0).E();
            for(int v2 = 0; ggqk0.hasNext(); ++v2) {
                Object object0 = ggqk0.next();
                goz1.M(-1600400223);
                if(v2 > 0) {
                    firy.a(dla.i(hfc0, 0.0f, 16.0f, 1), 0.0f, 0L, goz1, 6, 6);
                }
                goz1.x();
                dulc.d(null, ((dujc)object0).a, ((dujc)object0).b, goz1, 0);
            }
            goz1.x();
            goz1.z();
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new dukz(hfc0, list0, v);
        }
    }

    public static final void d(hfc hfc0, fryv fryv0, List list0, goz goz0, int v) {
        hfc hfc1;
        goz goz1 = goz0.ao(0x44B88E9A);
        int v1 = (v & 0x30) == 0 ? v | 6 | (goz1.Z(fryv0) ? 0x20 : 16) : v | 6;
        if((v & 0x180) == 0) {
            v1 |= (goz1.Z(list0) ? 0x100 : 0x80);
        }
        if((v1 & 0x93) == 0x92 && goz1.ac()) {
            goz1.G();
            hfc1 = hfc0;
        }
        else {
            hey hey0 = hfc.e;
            iau iau0 = dii.a(dho.g(8.0f), hei.m, goz1, 6);
            int v2 = dukv.a(gol.c(goz1));
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
            if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v2))) {
                Integer integer0 = v2;
                goz1.P(integer0);
                goz1.p(integer0, ibtw2);
            }
            ibts ibts0 = iej.g;
            guo.a(goz1, ibts0);
            ibtw ibtw3 = iej.c;
            guo.b(goz1, hfc2, ibtw3);
            goz1.M(0xE9364FF1);
            dulc.a(fryv0, goz1, v1 >> 3 & 14);
            goz1.x();
            hfc hfc3 = dls.w(hey0);
            hfc hfc4 = dil.a(dim.a, hfc3);
            List list1 = ibpo.ad(list0, 2);
            goz1.M(-382310356);
            for(Iterator iterator0 = list1.iterator(); iterator0.hasNext(); iterator0 = iterator0) {
                Object object0 = iterator0.next();
                List list2 = (List)object0;
                hfc hfc5 = dls.w(hey0);
                iau iau1 = dll.b(dho.g(8.0f), hei.j, goz1, 6);
                gzk gzk1 = goz1.ak();
                hfc hfc6 = hew.c(goz1, hfc5);
                goz1.O();
                int v3 = dukv.a(gol.c(goz1));
                if(goz1.x) {
                    goz1.t(ibth0);
                }
                else {
                    goz1.T();
                }
                guo.b(goz1, iau1, ibtw0);
                guo.b(goz1, gzk1, ibtw1);
                if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v3))) {
                    Integer integer1 = v3;
                    goz1.P(integer1);
                    goz1.p(integer1, ibtw2);
                }
                guo.a(goz1, ibts0);
                guo.b(goz1, hfc6, ibtw3);
                dulc.b(hfc4, ((dujb)list2.get(0)), goz1, 0);
                goz1.M(0xD9705149);
                if(list2.size() == 2) {
                    dulc.b(hfc4, ((dujb)list2.get(1)), goz1, 0);
                }
                goz1.x();
                goz1.z();
                hey0 = hey0;
            }
            goz1.x();
            goz1.z();
            hfc1 = hey0;
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new dukx(hfc1, fryv0, list0, v);
        }
    }

    public static final void e(hfc hfc0, fryv fryv0, goz goz0, int v) {
        goz goz2;
        hfc hfc1;
        goz goz1 = goz0.ao(447440824);
        int v1 = (v & 0x30) == 0 ? v | (goz1.Z(fryv0) ? 0x20 : 16) : v;
        if((v1 & 17) == 16 && goz1.ac()) {
            goz1.G();
            hfc1 = hfc0;
            goz2 = goz1;
        }
        else {
            jbn jbn0 = fpu.d(goz1).w;
            goz2 = goz1;
            ftzd.a(fryv0, null, fpu.a(goz1).q, 0L, null, 0L, new jjy(5), 0L, 0, false, 0, 0, null, null, jbn0, goz2, v1 >> 3 & 14, 0, 0x1FDFA);
            hfc1 = hfc.e;
        }
        gsb gsb0 = goz2.af();
        if(gsb0 != null) {
            gsb0.d = new dukw(hfc1, fryv0, v);
        }
    }

    public static final void f(hfc hfc0, duld duld0, goz goz0, int v) {
        goz goz1 = goz0.ao(0xEB444137);
        if((((v & 0x30) == 0 ? v | 6 | (goz1.Z(duld0) ? 0x20 : 16) : v | 6) & 19) == 18 && goz1.ac()) {
            goz1.G();
        }
        else {
            hfc0 = hfc.e;
            hfc hfc1 = duiy.a(hfc0, duld0.c, goz1);
            iau iau0 = dii.a(dho.c, hei.m, goz1, 0);
            int v1 = dukv.a(gol.c(goz1));
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
            dulc.e(null, duld0.a, goz1, 0);
            goz1.M(0xCBA33020);
            List list0 = duld0.b;
            if(list0 != null) {
                dlv.a(dls.e(hfc0, 4.0f), goz1);
                dulc.c(null, list0, goz1, 0);
            }
            goz1.x();
            goz1.z();
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new duky(hfc0, duld0, v);
        }
    }
}

