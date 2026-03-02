import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

public final class fujj {
    public static final void a(fuig fuig0, fryk fryk0, goz goz0, int v) {
        fryk fryk1;
        goz goz1 = goz0.ao(224606045);
        int v1 = (v & 6) == 0 ? (goz1.X(fuig0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (((v & 0x40) == 0 ? goz1.X(fryk0) : goz1.Z(fryk0)) ? 0x20 : 16);
        }
        if((v1 & 19) == 18 && goz1.ac()) {
            goz1.G();
            fryk1 = fryk0;
        }
        else {
            int v2 = v1 >> 3 & 14 | 25008;
            if((fuig0 instanceof fuie)) {
                goz1.M(-320223458);
                hey hey0 = hfc.e;
                hfc hfc0 = dls.v(hey0);
                iau iau0 = dhw.a(hei.e, false);
                int v3 = fuiq.a(gol.c(goz1));
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
                if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v3))) {
                    Integer integer0 = v3;
                    goz1.P(integer0);
                    goz1.p(integer0, ibtw0);
                }
                guo.a(goz1, iej.g);
                guo.b(goz1, hfc1, iej.c);
                fryk1 = fryk0;
                ftyy.b(fryk1, null, dls.b(dls.w(hey0), 0.46f), null, hys.d, 0.0f, null, goz1, v2, 104);
                goz1.z();
            }
            else {
                fryk1 = fryk0;
                goz1.M(-319928803);
                ftyy.b(fryk1, null, dls.v(hfc.e), null, hys.a, 0.0f, null, goz1, v2, 104);
            }
            goz1.x();
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new fuiw(fuig0, fryk1, v);
        }
    }

    public static final void b(hfc hfc0, fujl fujl0, goz goz0, int v, int v1) {
        hfc hfc2;
        hfc hfc1;
        int v2;
        ibuq.f(fujl0, "state");
        goz goz1 = goz0.ao(-100209604);
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
            v2 |= (goz1.Z(fujl0) ? 0x20 : 16);
        }
        if((v2 & 19) == 18 && goz1.ac()) {
            goz1.G();
            hfc2 = hfc1;
        }
        else {
            hfc2 = v1 == 0 ? hfc1 : hfc.e;
            goz1.M(0x93FCDF36);
            hfc hfc3 = null;
            CharSequence charSequence0 = fujl0.c == null ? null : fujl0.c.a(((Context)goz1.h(AndroidCompositionLocals_androidKt.b)));
            goz1.x();
            String s = charSequence0 == null ? null : charSequence0.toString();
            goz1.M(5004770);
            boolean z = goz1.X(s);
            Object object0 = goz1.j();
            if(z || object0 == gop.a) {
                object0 = new fuiz(s);
                goz1.P(object0);
            }
            goz1.x();
            hfc hfc4 = iuc.d(hfc2, ((ibts)object0));
            ibth ibth0 = fujl0.g;
            goz1.M(0x93FD049C);
            if(ibth0 != null) {
                goz1.M(5004770);
                boolean z1 = goz1.X(ibth0);
                Object object1 = goz1.j();
                if(z1 || object1 == gop.a) {
                    object1 = new fuja(ibth0);
                    goz1.P(object1);
                }
                goz1.x();
                hfc3 = cru.d(hfc4, false, null, null, null, ((ibth)object1), 15);
            }
            goz1.x();
            if(hfc3 != null) {
                hfc4 = hfc3;
            }
            hfc hfc5 = dhp.c(hfc4, 1.589f);
            hfc hfc6 = fujl0.f ? hhc.a(hfc.e, 0.5f) : hfc.e;
            dig.a(hfc5.a(hfc6), null, false, gzf.e(0x5479E98, new fuji(fujl0), goz1), goz1, 0xC00, 6);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new fujb(hfc2, fujl0, v, v1);
        }
    }

    public static final void c(dih dih0, fuhz fuhz0, boolean z, goz goz0, int v) {
        goz goz1 = goz0.ao(1903573072);
        int v1 = (v & 6) == 0 ? (goz1.X(dih0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (((v & 0x40) == 0 ? goz1.X(fuhz0) : goz1.Z(fuhz0)) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (goz1.Y(z) ? 0x100 : 0x80);
        }
        if((v1 & 0x93) == 0x92 && goz1.ac()) {
            goz1.G();
        }
        else {
            float f = fujj.j(dih0, 160.0f, goz1);
            hey hey0 = hfc.e;
            hfc hfc0 = dls.v(hey0);
            iau iau0 = dll.b(dho.e, hei.k, goz1, 54);
            int v2 = fuiq.a(gol.c(goz1));
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
            hfc hfc2 = dls.k(hey0, f);
            ftyy.b(fuhz0.a, null, hfc2, null, null, (z ? 0.5f : 1.0f), null, goz1, 0x30, 88);
            goz1.z();
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new fuir(dih0, fuhz0, z, v);
        }
    }

    public static final void d(dih dih0, fuia fuia0, goz goz0, int v) {
        goz goz1 = goz0.ao(0xF4C990E);
        int v1 = (v & 6) == 0 ? (goz1.X(dih0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(fuia0) ? 0x20 : 16);
        }
        if((v1 & 19) == 18 && goz1.ac()) {
            goz1.G();
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new fuit(dih0, fuia0, v);
        }
    }

    public static final void e(dih dih0, fuib fuib0, goz goz0, int v) {
        goz goz2;
        goz goz1 = goz0.ao(0x7FCE6A92);
        int v1 = (v & 6) == 0 ? (goz1.X(dih0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(fuib0) ? 0x20 : 16);
        }
        if((v1 & 19) == 18 && goz1.ac()) {
            goz1.G();
            goz2 = goz1;
        }
        else {
            fryv fryv0 = fuib0.a;
            if(fryv0 == null) {
                goz2 = goz1;
            }
            else {
                hfc hfc0 = dla.d(dih0.a(hfc.e, hei.g), fujj.j(dih0, 16.0f, goz1));
                float f = dih0.c();
                jbn jbn0 = fpu.d(goz1).h;
                Context context0 = (Context)goz1.h(AndroidCompositionLocals_androidKt.b);
                goz2 = goz1;
                ftzd.b(fryv0, hfc0, fuib0.b.a(context0), 0L, 0, false, 2, 0, null, null, jbn0, jlq.e(16), 229.0f, f, goz2, 0, 0xD80030, 0x77F8);
            }
        }
        gsb gsb0 = goz2.af();
        if(gsb0 != null) {
            gsb0.d = new fuiy(dih0, fuib0, v);
        }
    }

    public static final void f(dih dih0, fuic fuic0, boolean z, goz goz0, int v) {
        long v2;
        goz goz1 = goz0.ao(0xAFE62EB2);
        int v1 = (v & 6) == 0 ? (goz1.X(dih0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(fuic0) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (goz1.Y(z) ? 0x100 : 0x80);
        }
        if((v1 & 0x93) == 0x92 && goz1.ac()) {
            goz1.G();
        }
        else {
            float f = fujj.j(dih0, 76.0f, goz1);
            goz1.M(0x4F1568BD);
            hyxx.c();
            goz1.x();
            fryk fryk0 = fuic0.d;
            goz1.M(0x4F15A792);
            if(fryk0 != null) {
                float f1 = 1.0f;
                hfc hfc0 = iqn.a(hfk.a(hhi.a(dls.k(dla.j(dih0.a(hfc.e, hei.c), 0.0f, fujj.j(dih0, 48.0f, goz1), fujj.j(dih0, 24.0f, goz1), 0.0f, 9), fujj.j(dih0, 112.0f, goz1)), eah.a), 1.0f), "IDCardPhoto");
                if(z) {
                    f1 = 0.5f;
                }
                ftyy.b(fryk0, null, hfc0, null, hys.b, f1, null, goz1, 0x6030, 72);
            }
            goz1.x();
            hfc hfc1 = hyxx.c() ? dls.w(dih0.a(hfc.e, hei.d)) : dls.w(dls.e(dih0.a(hfc.e, hei.g), f));
            goz1.M(0x4F1602A0);
            if(hyxx.c()) {
                v2 = hll.h;
            }
            else {
                Context context0 = (Context)goz1.h(AndroidCompositionLocals_androidKt.b);
                v2 = fujj.k(fuic0.c.a(context0), z, goz1);
            }
            goz1.x();
            gaq.c(hfc1, null, v2, 0L, 0.0f, 0.0f, null, gzf.e(206421284, new fujc(dih0, fuic0, f), goz1), goz1, 0x7A);
            goz1 = goz1;
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new fuis(dih0, fuic0, z, v);
        }
    }

    public static final void g(dih dih0, fuid fuid0, goz goz0, int v) {
        goz goz2;
        goz goz1 = goz0.ao(0xDA90F551);
        int v1 = (v & 6) == 0 ? (goz1.X(dih0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(fuid0) ? 0x20 : 16);
        }
        if((v1 & 19) == 18 && goz1.ac()) {
            goz1.G();
            goz2 = goz1;
        }
        else {
            fryv fryv0 = fuid0.a;
            if(fryv0 == null) {
                goz2 = goz1;
            }
            else {
                hfc hfc0 = dla.e(dih0.a(hfc.e, hei.a), fujj.j(dih0, 24.0f, goz1), fujj.j(dih0, 56.0f, goz1));
                float f = dih0.c();
                jbn jbn0 = fpu.d(goz1).h;
                Context context0 = (Context)goz1.h(AndroidCompositionLocals_androidKt.b);
                goz2 = goz1;
                ftzd.b(fryv0, hfc0, fuid0.b.a(context0), 0L, 0, false, 2, 0, null, null, jbn0, jlq.e(16), 229.0f, f, goz2, 0, 0xD80030, 0x77F8);
            }
        }
        gsb gsb0 = goz2.af();
        if(gsb0 != null) {
            gsb0.d = new fuiu(dih0, fuid0, v);
        }
    }

    public static final void h(dih dih0, fuie fuie0, boolean z, goz goz0, int v) {
        goz goz2;
        goz goz1 = goz0.ao(-243230250);
        int v1 = (v & 6) == 0 ? (goz1.X(dih0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(fuie0) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (goz1.Y(z) ? 0x100 : 0x80);
        }
        if((v1 & 0x93) == 0x92 && goz1.ac()) {
            goz1.G();
            goz2 = goz1;
        }
        else {
            float f = fujj.j(dih0, 61.830002f, goz1);
            hfc hfc0 = dls.w(dls.e(dih0.a(hfc.e, hei.a), f));
            Context context0 = (Context)goz1.h(AndroidCompositionLocals_androidKt.b);
            long v2 = fujj.k(fuie0.e.a(context0), z, goz1);
            gze gze0 = gzf.e(0x1D038F4D, new fujd(fuie0, dih0, z), goz1);
            hey hey0 = hfc.e;
            grx grx0 = AndroidCompositionLocals_androidKt.b;
            gaq.c(hfc0, null, v2, 0L, 0.0f, 0.0f, null, gze0, goz1, 0x7A);
            fryk fryk0 = fuie0.i;
            goz1.M(0x93C20D0A);
            if(fryk0 != null) {
                hfc hfc1 = dla.j(dih0.a(hey0, hei.c), 0.0f, fujj.j(dih0, 48.0f, goz1), fujj.j(dih0, 24.0f, goz1), 0.0f, 9);
                float f1 = fujj.j(dih0, 12.0f, goz1);
                Context context1 = (Context)goz1.h(grx0);
                long v3 = fuie0.g.a(context1);
                ibuq.f(hfc1, "$this$borderIf");
                hfc hfc2 = ibog.c(v3, hll.h) ? hey0 : crd.b(hey0, crl.a(f1, hll.h(v3, 0.5f)), eah.a);
                ftyy.b(fryk0, null, iqn.a(hhi.a(hfk.a(dls.k(dla.d(hfc1.a(hfc2), fujj.j(dih0, 12.0f, goz1)), fujj.j(dih0, 112.0f, goz1)), 1.0f), eah.a), "StudentIDPhoto"), null, hys.b, (z ? 0.5f : 1.0f), null, goz1, 0x6030, 72);
            }
            goz1.x();
            hfc hfc3 = dls.w(dls.e(dih0.a(hey0, hei.g), f));
            Context context2 = (Context)goz1.h(grx0);
            goz2 = goz1;
            gaq.c(hfc3, null, fujj.k(fuie0.f.a(context2), z, goz1), 0L, 0.0f, 0.0f, null, gzf.e(-1009811068, new fuje(dih0, fuie0, f), goz1), goz2, 0x7A);
        }
        gsb gsb0 = goz2.af();
        if(gsb0 != null) {
            gsb0.d = new fuiv(dih0, fuie0, z, v);
        }
    }

    public static final void i(dih dih0, fuif fuif0, boolean z, goz goz0, int v) {
        goz goz2;
        goz goz1 = goz0.ao(0xB32D9BDA);
        int v1 = (v & 6) == 0 ? (goz1.X(dih0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(fuif0) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (goz1.Y(z) ? 0x100 : 0x80);
        }
        if((v1 & 0x93) == 0x92 && goz1.ac()) {
            goz1.G();
            goz2 = goz1;
        }
        else {
            float f = dih0.c();
            float f1 = fujj.j(dih0, 8.0f, goz1);
            hey hey0 = hfc.e;
            hfc hfc0 = dls.e(dla.j(dls.w(dih0.a(hey0, hei.g)), fujj.j(dih0, 24.0f, goz1), 0.0f, fujj.j(dih0, 24.0f, goz1), fujj.j(dih0, 16.0f, goz1), 2), fujj.j(dih0, 48.0f, goz1));
            iau iau0 = dll.b(dho.g, hei.l, goz1, 54);
            int v2 = fuiq.a(gol.c(goz1));
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
            guo.a(goz1, iej.g);
            guo.b(goz1, hfc1, iej.c);
            hfc hfc2 = dlq.a.c(hey0, 1.0f, false);
            ibtw ibtw3 = iej.c;
            ibts ibts0 = iej.g;
            hfc hfc3 = dla.j(hfc2, 0.0f, 0.0f, f1, 0.0f, 11);
            iau iau1 = dii.a(dho.c, hei.m, goz1, 0);
            int v3 = fuiq.a(gol.c(goz1));
            gzk gzk1 = goz1.ak();
            hfc hfc4 = hew.c(goz1, hfc3);
            goz1.O();
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
            guo.b(goz1, hfc4, ibtw3);
            fryv fryv0 = fuif0.a;
            goz1.M(0xEA1AF46E);
            if(fryv0 != null) {
                jbn jbn0 = fpu.d(goz1).h;
                Context context0 = (Context)goz1.h(AndroidCompositionLocals_androidKt.b);
                ftzd.b(fryv0, null, fuif0.b.a(context0), 0L, 2, false, 1, 0, null, null, jbn0, jlq.e(16), 229.0f, f, goz1, 0x30000000, 0xD80030, 30202);
                goz1 = goz1;
            }
            goz1.x();
            fryv fryv1 = fuif0.c;
            goz1.M(0xEA1B2D71);
            if(fryv1 != null) {
                jbn jbn1 = fpu.d(goz1).h;
                Context context1 = (Context)goz1.h(AndroidCompositionLocals_androidKt.b);
                ftzd.b(fryv1, null, fuif0.d.a(context1), 0L, 2, false, 1, 0, null, null, jbn1, jlq.e(16), 229.0f, f, goz1, 0x30000000, 0xD80030, 30202);
                goz1 = goz1;
            }
            goz1.x();
            goz1.z();
            fryk fryk0 = fuif0.e;
            goz1.M(1790030879);
            if(fryk0 != null) {
                ftyy.b(fryk0, null, iqn.a(dls.u(hey0), "UntokenizedFOPLogo"), hei.f, hys.c, (z ? 0.5f : 1.0f), null, goz1, 28080, 0x40);
            }
            goz2 = goz1;
            goz2.x();
            goz2.z();
        }
        gsb gsb0 = goz2.af();
        if(gsb0 != null) {
            gsb0.d = new fuix(dih0, fuif0, z, v);
        }
    }

    public static final float j(dih dih0, float f, goz goz0) {
        goz0.M(0xE4BC3BB3);
        jks jks0 = (jks)goz0.h(ipa.d);
        float f1 = jks0.eb(jks0.eg(dih0.c()) / jks0.eg(229.0f) * jks0.eg(f));
        goz0.A();
        return f1;
    }

    private static final long k(long v, boolean z, goz goz0) {
        goz0.M(1507685702);
        if(z && (hll.a(v) > 0.5f)) {
            v = hll.h(v, 0.5f);
        }
        goz0.x();
        return v;
    }
}

