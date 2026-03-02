import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

public final class ftuu {
    public static final void a(hfc hfc0, ftuw ftuw0, goz goz0, int v, int v1) {
        long v3;
        hfc hfc1;
        int v2;
        ibuq.f(ftuw0, "state");
        goz goz1 = goz0.ao(0x1005BDC6);
        if(v1 != 0) {
            v2 = v | 6;
            hfc1 = hfc0;
        }
        else if((v & 6) == 0) {
            hfc1 = hfc0;
            v2 = (goz1.X(hfc1) ? 4 : 2) | v;
        }
        else {
            hfc1 = hfc0;
            v2 = v;
        }
        if((v & 0x30) == 0) {
            v2 |= (goz1.Z(ftuw0) ? 0x20 : 16);
        }
        if((v2 & 19) == 18 && goz1.ac()) {
            goz1.G();
            goto label_126;
        }
        else {
            if(v1 != 0) {
                hfc1 = hfc.e;
            }
            if(ftuw0.a == null && ftuw0.b == null) {
                gsb gsb0 = goz1.af();
                if(gsb0 != null) {
                    gsb0.d = new fttw(hfc1, ftuw0, v, v1);
                }
            }
            else {
                if(hyxx.c()) {
                    goz1.M(-1318100545);
                    v3 = fpu.a(goz1).p;
                }
                else {
                    goz1.M(-1318043970);
                    v3 = fsbs.g(fpu.a(goz1), goz1);
                }
                goz1.x();
                goz1.M(630035141);
                hll hll0 = ftuw0.g == null ? null : new hll(ftuw0.g.a(((Context)goz1.h(AndroidCompositionLocals_androidKt.b))));
                goz1.x();
                hfc hfc2 = dls.t(dls.w(hfc1), 0.0f, (hyxx.c() ? 0.0f : 72.0f), 1);
                goz1.M(630042405);
                if(!ftuw0.c) {
                    if(hll0 != null) {
                        v3 = hll0.j;
                    }
                }
                else if(hyxx.c()) {
                    goz1.M(-1317672094);
                    v3 = fpu.a(goz1).G;
                    goz1.x();
                }
                else {
                    goz1.M(0xB177372E);
                    v3 = fsbs.h(fpu.a(goz1), goz1);
                    goz1.x();
                }
                goz1.x();
                hfc hfc3 = cqx.c(hfc2, v3);
                boolean z = ftuw0.h;
                hey hey0 = hfc.e;
                hfc hfc4 = fgzw.a(hfc3, z, dml.b(hey0, new dkt(dmw.f(goz1), 0x20)));
                if(hyxx.c()) {
                    goz1.M(0xB17DA915);
                    fuhp fuhp0 = ((Configuration)goz1.h(AndroidCompositionLocals_androidKt.a)).orientation == 2 ? fuhp.a : fuhp.b;
                    if(z) {
                        goz1.M(0xB1810973);
                        iau iau0 = dii.a(dho.c, hei.m, goz1, 0);
                        int v4 = fttt.a(gol.c(goz1));
                        gzk gzk0 = goz1.ak();
                        hfc hfc5 = hew.c(goz1, hfc4);
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
                        if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v4))) {
                            Integer integer0 = v4;
                            goz1.P(integer0);
                            goz1.p(integer0, ibtw0);
                        }
                        guo.a(goz1, iej.g);
                        guo.b(goz1, hfc5, iej.c);
                        ftuu.e(dla.i(hey0, 20.0f, 0.0f, 2), ftuw0, fuhp0, goz1, v2 & 0x70);
                        goz1.z();
                    }
                    else {
                        goz1.M(0xB184F5CD);
                        ftuu.e(dla.i(hfc4, 20.0f, 0.0f, 2), ftuw0, fuhp0, goz1, v2 & 0x70);
                    }
                    goz1.x();
                }
                else {
                    goz1.M(0xB1885D50);
                    switch(ftuw0.e.ordinal()) {
                        case 0: {
                            goz1.M(0xB188ED0D);
                            ftuu.f(dla.i(hfc4, 24.0f, 0.0f, 2), ftuw0, goz1, v2 & 0x70);
                            goz1.x();
                            break;
                        }
                        case 1: {
                            goz1.M(0xB18C0257);
                            if(z) {
                                goz1.M(0xB18C8E72);
                                iau iau1 = dii.a(dho.c, hei.m, goz1, 0);
                                int v5 = fttt.a(gol.c(goz1));
                                gzk gzk1 = goz1.ak();
                                hfc hfc6 = hew.c(goz1, hfc4);
                                ibth ibth1 = iej.a;
                                goz1.O();
                                if(goz1.x) {
                                    goz1.t(ibth1);
                                }
                                else {
                                    goz1.T();
                                }
                                guo.b(goz1, iau1, iej.e);
                                guo.b(goz1, gzk1, iej.d);
                                ibtw ibtw1 = iej.f;
                                if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v5))) {
                                    Integer integer1 = v5;
                                    goz1.P(integer1);
                                    goz1.p(integer1, ibtw1);
                                }
                                guo.a(goz1, iej.g);
                                guo.b(goz1, hfc6, iej.c);
                                ftuu.d(dla.i(hey0, 16.0f, 0.0f, 2), ftuw0, goz1, v2 & 0x70 | 6);
                                goz1.z();
                            }
                            else {
                                goz1.M(0xB19001F2);
                                ftuu.d(dla.i(hfc4, 16.0f, 0.0f, 2), ftuw0, goz1, v2 & 0x70);
                            }
                            goz1.x();
                            goz1.x();
                            break;
                        }
                        default: {
                            goz1.M(0xDC6FC1E4);
                            goz1.x();
                            throw new ibnq();
                        }
                    }
                }
                goz1.x();
            label_126:
                gsb gsb1 = goz1.af();
                if(gsb1 != null) {
                    gsb1.d = new fttx(hfc1, ftuw0, v, v1);
                }
            }
        }
    }

    public static final void b(hfc hfc0, ftts ftts0, fuhp fuhp0, goz goz0, int v, int v1) {
        int v2;
        goz goz1 = goz0.ao(-103541657);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (goz1.X(hfc0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x30) == 0) {
            v2 |= (goz1.Z(ftts0) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x180) == 0) {
            v2 |= (goz1.V((fuhp0 == null ? -1 : fuhp0.ordinal())) ? 0x100 : 0x80);
        }
        if((v2 & 0x93) == 0x92 && goz1.ac()) {
            goz1.G();
        }
        else {
            if((v1 & 4) != 0) {
                fuhp0 = null;
            }
            fhvp[] arr_fhvp = (fhvp[])ftts0.h.toArray(new fhvp[0]);
            gze gze0 = gzf.e(0xDC8074F5, new ftug(hfc0, ftts0, fuhp0), goz1);
            fugo.b(ftts0.g, arr_fhvp, ftts0.i, gze0, goz1, 0xC00, 0);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new fttv(hfc0, ftts0, fuhp0, v, v1);
        }
    }

    public static final void c(hfc hfc0, ftts ftts0, fuhp fuhp0, ibth ibth0, goz goz0, int v) {
        fuhq fuhq0;
        ibth ibth1;
        goz goz1 = goz0.ao(-2018101613);
        int v1 = (v & 6) == 0 ? (goz1.X(hfc0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(ftts0) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (goz1.V((fuhp0 == null ? -1 : fuhp0.ordinal())) ? 0x100 : 0x80);
        }
        if((v & 0xC00) == 0) {
            ibth1 = ibth0;
            v1 |= (goz1.Z(ibth1) ? 0x800 : 0x400);
        }
        else {
            ibth1 = ibth0;
        }
        if((v1 & 0x493) == 1170 && goz1.ac()) {
            goz1.G();
        }
        else {
            fryv fryv0 = ftts0.a;
            CharSequence charSequence0 = fryv0.a(((Context)goz1.h(AndroidCompositionLocals_androidKt.b)));
            hfc hfc1 = ftts0.d == ftvc.c ? dls.t(hfc0, 88.0f, 0.0f, 2) : hfc0;
            boolean z = ftts0.c;
            switch(ftts0.d.ordinal()) {
                case 0: {
                    fuhq0 = fuhq.b;
                    break;
                }
                case 1: {
                    fuhq0 = fuhq.c;
                    break;
                }
                case 2: {
                    fuhq0 = fuhq.a;
                    break;
                }
                default: {
                    throw new ibnq();
                }
            }
            fuhp fuhp1 = fuhp0 == null ? fuhp.b : fuhp0;
            ftva ftva0 = ftts0.f;
            fryk fryk0 = ftva0 == ftva.b ? new fryh(0x7F0805E3) : ftts0.e;  // drawable:gs_open_in_new_vd_theme_24
            fuhy fuhy0 = new fuhy(fuhq0, z, fryv0, null, ftts0.b, fryk0, null, fuhp1, null, ibth1, 840);
            goz1.M(1929600116);
            gze gze0 = ftva0 == ftva.c ? gzf.e(0xB67C9EFE, new ftui(charSequence0), goz1) : null;
            goz1.x();
            fuhx.b(hfc1, fuhy0, gze0, goz1, 0x40, 0);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new fttu(hfc0, ftts0, fuhp0, ibth0, v);
        }
    }

    public static final void d(hfc hfc0, ftuw ftuw0, goz goz0, int v) {
        goz goz1 = goz0.ao(-1175578006);
        int v1 = (v & 6) == 0 ? (goz1.X(hfc0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(ftuw0) ? 0x20 : 16);
        }
        if((v1 & 19) == 18 && goz1.ac()) {
            goz1.G();
        }
        else {
            ftvd ftvd0 = ftuw0.d;
            hfc hfc1 = ftvd0 == ftvd.a ? dls.D(hfc.e, null, 3) : hfc.e;
            gze gze0 = gzf.e(0xA3AE97AB, new ftuq(ftuw0, hfc1), goz1);
            hfc hfc2 = dla.e(hfc0, 8.0f, 16.0f);
            goz1.M(0x6E3C21FE);
            Object object0 = goz1.j();
            Object object1 = gop.a;
            if(object0 == object1) {
                object0 = new ftuc();
                goz1.P(object0);
            }
            goz1.x();
            hfc hfc3 = iuc.d(hfc2, ((ibts)object0));
            if(ftvd0 == ftvd.b) {
                goz1.M(0xE35FE32D);
                goz1.M(0x6E3C21FE);
                Object object2 = goz1.j();
                if(object2 == object1) {
                    object2 = ftuk.a;
                    goz1.P(object2);
                }
                goz1.x();
                int v2 = fttt.a(gol.c(goz1));
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
                guo.b(goz1, ((iau)object2), iej.e);
                guo.b(goz1, gzk0, iej.d);
                ibtw ibtw0 = iej.f;
                if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v2))) {
                    Integer integer0 = v2;
                    goz1.P(integer0);
                    goz1.p(integer0, ibtw0);
                }
                guo.a(goz1, iej.g);
                guo.b(goz1, hfc4, iej.c);
            }
            else {
                goz1.M(0xE37DF7A6);
                goz1.M(5004770);
                boolean z = goz1.Z(ftuw0);
                Object object3 = goz1.j();
                if(z || object3 == object1) {
                    object3 = new ftun(ftuw0);
                    goz1.P(object3);
                }
                goz1.x();
                int v3 = fttt.a(gol.c(goz1));
                gzk gzk1 = goz1.ak();
                hfc hfc5 = hew.c(goz1, hfc3);
                ibth ibth1 = iej.a;
                goz1.O();
                if(goz1.x) {
                    goz1.t(ibth1);
                }
                else {
                    goz1.T();
                }
                guo.b(goz1, ((iau)object3), iej.e);
                guo.b(goz1, gzk1, iej.d);
                ibtw ibtw1 = iej.f;
                if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v3))) {
                    Integer integer1 = v3;
                    goz1.P(integer1);
                    goz1.p(integer1, ibtw1);
                }
                guo.a(goz1, iej.g);
                guo.b(goz1, hfc5, iej.c);
            }
            gze0.a(goz1, Integer.valueOf(6));
            goz1.z();
            goz1.x();
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new ftud(hfc0, ftuw0, v);
        }
    }

    public static final void e(hfc hfc0, ftuw ftuw0, fuhp fuhp0, goz goz0, int v) {
        goz goz1 = goz0.ao(-138905302);
        int v1 = (v & 6) == 0 ? (goz1.X(hfc0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(ftuw0) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (goz1.V(fuhp0.ordinal()) ? 0x100 : 0x80);
        }
        if((v1 & 0x93) == 0x92 && goz1.ac()) {
            goz1.G();
        }
        else {
            gze gze0 = gzf.e(0xE6866DEB, new ftut(ftuw0, fuhp0), goz1);
            hfc hfc1 = dla.i(hfc0, 0.0f, 16.0f, 1);
            goz1.M(0x6E3C21FE);
            Object object0 = goz1.j();
            if(object0 == gop.a) {
                object0 = ftus.a;
                goz1.P(object0);
            }
            goz1.x();
            int v2 = fttt.a(gol.c(goz1));
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
            guo.b(goz1, ((iau)object0), iej.e);
            guo.b(goz1, gzk0, iej.d);
            ibtw ibtw0 = iej.f;
            if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v2))) {
                Integer integer0 = v2;
                goz1.P(integer0);
                goz1.p(integer0, ibtw0);
            }
            guo.a(goz1, iej.g);
            guo.b(goz1, hfc2, iej.c);
            gze0.a(goz1, Integer.valueOf(6));
            goz1.z();
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new ftue(hfc0, ftuw0, fuhp0, v);
        }
    }

    public static final void f(hfc hfc0, ftuw ftuw0, goz goz0, int v) {
        ibtw ibtw7;
        ibtw ibtw6;
        ibtw ibtw5;
        ibtw ibtw4;
        ibth ibth1;
        hfc hfc4;
        ibts ibts1;
        goz goz1 = goz0.ao(0xBB5933C0);
        int v1 = (v & 6) == 0 ? (goz1.X(hfc0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(ftuw0) ? 0x20 : 16);
        }
        if((v1 & 19) == 18 && goz1.ac()) {
            goz1.G();
        }
        else {
            hfc hfc1 = ftuw0.d == ftvd.a ? hfc.e : dls.w(hfc.e);
            goz1.M(0x6E3C21FE);
            Object object0 = goz1.j();
            Object object1 = gop.a;
            if(object0 == object1) {
                object0 = new ftty();
                goz1.P(object0);
            }
            goz1.x();
            hfc hfc2 = iuc.d(hfc0, ((ibts)object0));
            iau iau0 = dii.a(dho.c, hei.m, goz1, 0);
            int v2 = fttt.a(gol.c(goz1));
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
            if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v2))) {
                Integer integer0 = v2;
                goz1.P(integer0);
                goz1.p(integer0, ibtw2);
            }
            ibts ibts0 = iej.g;
            guo.a(goz1, ibts0);
            ibtw ibtw3 = iej.c;
            guo.b(goz1, hfc3, ibtw3);
            ftts ftts0 = ftuw0.a;
            goz1.M(-854277608);
            if(ftts0 == null) {
                ibts1 = ibts0;
                hfc4 = hfc1;
                ibth1 = ibth0;
                ibtw4 = ibtw0;
                ibtw5 = ibtw3;
                ibtw6 = ibtw1;
                ibtw7 = ibtw2;
            }
            else {
                hfc hfc5 = dls.w(dla.j(hfc.e, 0.0f, 16.0f, 0.0f, (ftuw0.b == null ? 16.0f : 4.0f), 5));
                iau iau1 = dll.b(ftuu.g(ftuw0.f), hei.j, goz1, 0);
                gzk gzk1 = goz1.ak();
                hfc hfc6 = hew.c(goz1, hfc5);
                goz1.O();
                int v3 = fttt.a(gol.c(goz1));
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
                ibtw5 = ibtw3;
                ibth1 = ibth0;
                ibtw4 = ibtw0;
                hfc hfc7 = dla.j(hfc1, 0.0f, 0.0f, 0.0f, 0.0f, 14);
                goz1.M(0x6E3C21FE);
                Object object2 = goz1.j();
                if(object2 == object1) {
                    object2 = new fttz();
                    goz1.P(object2);
                }
                goz1.x();
                ibtw6 = ibtw1;
                ibtw7 = ibtw2;
                ibts1 = ibts0;
                hfc4 = hfc1;
                ftuu.b(iuc.d(hfc7, ((ibts)object2)), ftts0, null, goz1, 0, 4);
                goz1.z();
            }
            goz1.x();
            ftts ftts1 = ftuw0.b;
            goz1.M(0xCD14FFCC);
            if(ftts1 != null) {
                hfc hfc8 = dls.w(dla.j(hfc.e, 0.0f, 4.0f, 0.0f, 16.0f, 5));
                iau iau2 = dll.b(ftuu.g(ftuw0.f), hei.j, goz1, 0);
                int v4 = fttt.a(gol.c(goz1));
                gzk gzk2 = goz1.ak();
                hfc hfc9 = hew.c(goz1, hfc8);
                goz1.O();
                if(goz1.x) {
                    goz1.t(ibth1);
                }
                else {
                    goz1.T();
                }
                guo.b(goz1, iau2, ibtw4);
                guo.b(goz1, gzk2, ibtw6);
                if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v4))) {
                    Integer integer2 = v4;
                    goz1.P(integer2);
                    goz1.p(integer2, ibtw7);
                }
                guo.a(goz1, ibts1);
                guo.b(goz1, hfc9, ibtw5);
                hfc hfc10 = dla.j(hfc4, 0.0f, 0.0f, 0.0f, 0.0f, 11);
                goz1.M(0x6E3C21FE);
                Object object3 = goz1.j();
                if(object3 == object1) {
                    object3 = new ftua();
                    goz1.P(object3);
                }
                goz1.x();
                ftuu.b(iuc.d(hfc10, ((ibts)object3)), ftts1, null, goz1, 0, 4);
                goz1.z();
            }
            goz1.x();
            goz1.z();
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new ftub(hfc0, ftuw0, v);
        }
    }

    private static final dhf g(ftvb ftvb0) {
        switch(ftvb0.ordinal()) {
            case 0: {
                return dho.a;
            }
            case 1: {
                return dho.b;
            }
            case 2: {
                return dho.e;
            }
            case 3: {
                return dho.g;
            }
            default: {
                throw new ibnq();
            }
        }
    }
}

