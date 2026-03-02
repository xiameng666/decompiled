import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

public final class fuhl {
    public static final void a(hfc hfc0, fuho fuho0, goz goz0, int v, int v1) {
        int v2;
        ibuq.f(fuho0, "state");
        goz goz1 = goz0.ao(0xB3BB2FC);
        if(v1 == 0) {
            v2 = (v & 6) == 0 ? (goz1.X(hfc0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v & 0x30) == 0) {
            v2 |= (goz1.X(fuho0) ? 0x20 : 16);
        }
        if((v2 & 19) == 18 && goz1.ac()) {
            goz1.G();
            goto label_22;
        }
        if(v1 != 0) {
            hfc0 = hfc.e;
        }
        if((fuho0 instanceof fuhm)) {
            goz1.M(0x2B1AF4FE);
            fuhl.g(hfc0, ((fuhm)fuho0), goz1, v2 & 14);
            goz1.x();
            goto label_22;
        }
        if((fuho0 instanceof fuhn)) {
            goz1.M(0x2B1AFE22);
            fuhl.h(hfc0, ((fuhn)fuho0), goz1, v2 & 14);
            goz1.x();
        label_22:
            gsb gsb0 = goz1.af();
            if(gsb0 != null) {
                gsb0.d = new fuhc(hfc0, fuho0, v, v1);
            }
            return;
        }
        goz1.M(0x2B1AEF60);
        goz1.x();
        throw new ibnq();
    }

    public static final void b(hfc hfc0, fugq fugq0, goz goz0, int v) {
        goz goz1 = goz0.ao(0x153039A3);
        int v1 = (v & 6) == 0 ? (goz1.X(hfc0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(fugq0) ? 0x20 : 16);
        }
        if((v1 & 19) == 18 && goz1.ac()) {
            goz1.G();
        }
        else {
            fujj.b(dls.o(hfc0, 64.0f), new fujl(new fryh(0), new fuhz(fugq0.a), null, new frxq(hll.h), false, null, true, 0x70), goz1, 0x40, 0);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new fuhe(hfc0, fugq0, v);
        }
    }

    public static final void c(hfc hfc0, fugs fugs0, goz goz0, int v) {
        hfc hfc1;
        goz goz1 = goz0.ao(0xF2F49A61);
        int v1 = (v & 6) == 0 ? (goz1.X(hfc0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(fugs0) ? 0x20 : 16);
        }
        if((v1 & 19) == 18 && goz1.ac()) {
            goz1.G();
            hfc1 = hfc0;
        }
        else {
            goz1.M(0x837A3BB);
            String s = null;
            CharSequence charSequence0 = fugs0.b == null ? null : fugs0.b.a(((Context)goz1.h(AndroidCompositionLocals_androidKt.b)));
            goz1.x();
            if(charSequence0 != null) {
                s = charSequence0.toString();
            }
            hfc1 = hfc0;
            ftsq.b(hfc1, s, fugs0.a, goz1, v1 & 14, 0);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new fuhd(hfc1, fugs0, v);
        }
    }

    public static final void d(hfc hfc0, fugt fugt0, goz goz0, int v) {
        hfc hfc6;
        hfc hfc4;
        hfc hfc2;
        goz goz1 = goz0.ao(0xE4EDD129);
        int v1 = (v & 6) == 0 ? (goz1.X(hfc0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(fugt0) ? 0x20 : 16);
        }
        if((v1 & 19) == 18 && goz1.ac()) {
            goz1.G();
        }
        else {
            hlm hlm0 = null;
            switch(fugt0.d.ordinal()) {
                case 0: {
                    goz1.M(0x2743FB26);
                    goz1.M(0xE87E1531);
                    if(hyya.c()) {
                        hfc hfc1 = dls.k(hfc.e, 48.0f);
                        Context context0 = (Context)goz1.h(AndroidCompositionLocals_androidKt.b);
                        hfc2 = cqx.c(hfc1, fugt0.e.a(context0)).a(hfc0);
                    }
                    else {
                        hfc2 = dls.k(hfc.e, 48.0f).a(hfc0);
                    }
                    goz1.x();
                    goz1.M(0xE87E3F28);
                    CharSequence charSequence0 = fugt0.b == null ? null : fugt0.b.a(((Context)goz1.h(AndroidCompositionLocals_androidKt.b)));
                    goz1.x();
                    String s = charSequence0 == null ? null : charSequence0.toString();
                    fryk fryk0 = fugt0.a;
                    frxs frxs0 = fugt0.c;
                    goz1.M(0xE87E4B4A);
                    if(frxs0 != null) {
                        hlm0 = frxs0.b(((Context)goz1.h(AndroidCompositionLocals_androidKt.b)));
                    }
                    goz1.x();
                    ftyy.b(fryk0, s, hfc2, null, null, 0.0f, hlm0, goz1, 0, 56);
                    goz1.x();
                    break;
                }
                case 1: {
                    goz1.M(0x274CA042);
                    goz1.M(0xE87E5C95);
                    if(hyya.c()) {
                        hfc hfc3 = dls.e(hfc.e, 40.0f);
                        Context context1 = (Context)goz1.h(AndroidCompositionLocals_androidKt.b);
                        hfc4 = cqx.c(hfc3, fugt0.e.a(context1)).a(hfc0);
                    }
                    else {
                        hfc4 = dls.e(hfc.e, 40.0f).a(hfc0);
                    }
                    goz1.x();
                    goz1.M(-394361080);
                    CharSequence charSequence1 = fugt0.b == null ? null : fugt0.b.a(((Context)goz1.h(AndroidCompositionLocals_androidKt.b)));
                    goz1.x();
                    String s1 = charSequence1 == null ? null : charSequence1.toString();
                    fryk fryk1 = fugt0.a;
                    frxs frxs1 = fugt0.c;
                    goz1.M(0xE87E932A);
                    if(frxs1 != null) {
                        hlm0 = frxs1.b(((Context)goz1.h(AndroidCompositionLocals_androidKt.b)));
                    }
                    goz1.x();
                    ftyy.b(fryk1, s1, hfc4, null, null, 0.0f, hlm0, goz1, 0, 56);
                    goz1.x();
                    break;
                }
                case 2: {
                    goz1.M(0x275574D6);
                    goz1.M(0xE87EA581);
                    if(hyya.c()) {
                        hfc hfc5 = dls.k(hfc.e, 48.0f);
                        Context context2 = (Context)goz1.h(AndroidCompositionLocals_androidKt.b);
                        hfc6 = hhi.a(cqx.a(hfc5, fugt0.e.a(context2), eah.b(48.0f)), eah.b(48.0f)).a(hfc0);
                    }
                    else {
                        hfc6 = hhi.a(dls.k(hfc.e, 48.0f), eah.b(48.0f)).a(hfc0);
                    }
                    goz1.x();
                    goz1.M(-394336088);
                    CharSequence charSequence2 = fugt0.b == null ? null : fugt0.b.a(((Context)goz1.h(AndroidCompositionLocals_androidKt.b)));
                    goz1.x();
                    String s2 = charSequence2 == null ? null : charSequence2.toString();
                    fryk fryk2 = fugt0.a;
                    frxs frxs2 = fugt0.c;
                    goz1.M(0xE87EF4CA);
                    if(frxs2 != null) {
                        hlm0 = frxs2.b(((Context)goz1.h(AndroidCompositionLocals_androidKt.b)));
                    }
                    goz1.x();
                    ftyy.b(fryk2, s2, hfc6, null, null, 0.0f, hlm0, goz1, 0, 56);
                    goz1.x();
                    break;
                }
                default: {
                    goz1.M(0xE87E0DEE);
                    goz1.x();
                    throw new ibnq();
                }
            }
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new fuhf(hfc0, fugt0, v);
        }
    }

    public static final void e(hfc hfc0, fugu fugu0, goz goz0, int v) {
        goz goz1 = goz0.ao(2069581045);
        int v1 = (v & 6) == 0 ? (goz1.X(hfc0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(fugu0) ? 0x20 : 16);
        }
        if((v1 & 19) == 18 && goz1.ac()) {
            goz1.G();
        }
        else {
            goz1.M(0x11BBFB2F);
            goz1.x();
            goz1.M(0x11BC094B);
            goz1.x();
            iau iau0 = dll.b(dho.g(16.0f), hei.k, goz1, 54);
            int v2 = fugx.a(gol.c(goz1));
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
            fuhl.f(hfc.e, fugu0, goz1, v1 & 0x70 | 6);
            hfc hfc2 = dls.k(hfc.e, 24.0f);
            cth.a(ism.a(0x7F0804D8, goz1, 0), null, hfc2, null, null, 0.0f, new hlb(fpu.a(goz1).o, 5), goz1, 440, 56);  // drawable:gs_arrow_right_alt_vd_theme_24
            hfc hfc3 = crd.c(hhi.a(dls.k(hfc.e, 64.0f), eah.b(64.0f)), 1.0f, fpu.a(goz1).B, eah.b(64.0f)).a(hfc0);
            goz1.M(0xBA745236);
            goz1.x();
            ftyy.b(fugu0.b, null, hfc3, null, null, 0.0f, null, goz1, 0x30, 56);
            goz1.z();
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new fuhb(hfc0, fugu0, v);
        }
    }

    public static final void f(hfc hfc0, fugu fugu0, goz goz0, int v) {
        ibom ibom0;
        goz goz1 = goz0.ao(0xFB95F3D4);
        int v1 = (v & 6) == 0 ? (goz1.X(hfc0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(fugu0) ? 0x20 : 16);
        }
        if((v1 & 19) == 18 && goz1.ac()) {
            goz1.G();
        }
        else {
            fryk fryk0 = fugu0.a;
            goz1.M(1843946790);
            if(fryk0 == null) {
                ibom0 = null;
            }
            else {
                hfc hfc1 = crd.c(hhi.a(dls.k(hfc.e, 64.0f), eah.b(64.0f)), 1.0f, fpu.a(goz1).B, eah.b(64.0f)).a(hfc0);
                goz1.M(0xBC7491F9);
                goz1.x();
                ftyy.b(fryk0, null, hfc1, null, null, 0.0f, null, goz1, 0x30, 56);
                ibom0 = ibom.a;
            }
            goz1.x();
            goz1.M(0x6DE8654F);
            if(ibom0 == null) {
                hey hey0 = hfc.e;
                hfc hfc2 = dla.d(crd.c(dls.k(hey0, 64.0f), 1.0f, fpu.a(goz1).B, eah.b(64.0f)), 8.0f);
                iau iau0 = dll.b(dho.a, hei.j, goz1, 0);
                int v2 = fugx.a(gol.c(goz1));
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
                hfc hfc4 = dls.k(hey0, 48.0f);
                cth.a(ism.a(0x7F080A81, goz1, 0), null, hfc4, null, null, 0.0f, null, goz1, 440, 120);
                goz1.z();
            }
            goz1.x();
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new fuhk(hfc0, fugu0, v);
        }
    }

    public static final void g(hfc hfc0, fuhm fuhm0, goz goz0, int v) {
        Object object3;
        goz goz2;
        goz goz1 = goz0.ao(-605613701);
        int v1 = (v & 6) == 0 ? (goz1.X(hfc0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(fuhm0) ? 0x20 : 16);
        }
        if((v1 & 19) == 18 && goz1.ac()) {
            goz1.G();
            goz2 = goz1;
        }
        else {
            goz1.M(0x6E3C21FE);
            Object object0 = goz1.j();
            Object object1 = gop.a;
            if(object0 == object1) {
                object0 = new fuhg();
                goz1.P(object0);
            }
            goz1.x();
            hfc hfc1 = iuc.d(hfc0, ((ibts)object0));
            iau iau0 = dii.a(dho.g(16.0f), hei.m, goz1, 6);
            int v2 = fugx.a(gol.c(goz1));
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
            if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v2))) {
                Integer integer0 = v2;
                goz1.P(integer0);
                goz1.p(integer0, ibtw0);
            }
            guo.a(goz1, iej.g);
            guo.b(goz1, hfc2, iej.c);
            fugv fugv0 = fuhm0.a;
            goz1.M(0x8829D87);
            if(fugv0 != null) {
                if((fugv0 instanceof fugp)) {
                    goz1.M(0x8C3ED4B1);
                    ftvg.a(null, ((fugp)fugv0).a, goz1, 0, 1);
                    goz1.x();
                }
                else if((fugv0 instanceof fugq)) {
                    goz1.M(0x8C3EDEE0);
                    fuhl.b(iqn.a(hfc.e, "ViewHeaderBank"), ((fugq)fugv0), goz1, 6);
                    goz1.x();
                }
                else if((fugv0 instanceof fugr)) {
                    goz1.M(0x8C3EEEFC);
                    fujj.b(iqn.a(dls.o(hfc.e, 64.0f), "ViewHeaderCard"), ((fugr)fugv0).a, goz1, 70, 0);
                    goz1.x();
                }
                else if((fugv0 instanceof fugt)) {
                    goz1.M(0x8C3F0620);
                    fuhl.d(iqn.a(hfc.e, "ViewHeaderIcon"), ((fugt)fugv0), goz1, 6);
                    goz1.x();
                }
                else if((fugv0 instanceof fugu)) {
                    goz1.M(0x8C3F152B);
                    fuhl.e(hfc.e, ((fugu)fugv0), goz1, 6);
                    goz1.x();
                }
                else {
                    if((fugv0 instanceof fugs)) {
                        goz1.M(0x8C3F23F2);
                        fuhl.c(hfc.e, ((fugs)fugv0), goz1, 6);
                        goz1.x();
                        goto label_71;
                    }
                    goz1.M(-1942040466);
                    goz1.x();
                    throw new ibnq();
                }
            }
        label_71:
            goz1.x();
            goz1.M(0x882FE5C);
            fryv fryv0 = fuhm0.b;
            if(fryw.c(fryv0, ((Context)goz1.h(AndroidCompositionLocals_androidKt.b)))) {
                jbn jbn0 = fpu.d(goz1).d;
                long v3 = fpu.a(goz1).o;
                hey hey0 = hfc.e;
                goz1.M(0x6E3C21FE);
                Object object2 = goz1.j();
                if(object2 == object1) {
                    object2 = new fuhh();
                    goz1.P(object2);
                }
                goz1.x();
                object3 = object1;
                ftzd.a(fryv0, iuc.d(hey0, ((ibts)object2)), v3, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jbn0, goz1, 0, 0, 0x1FFF8);
                goz2 = goz1;
            }
            else {
                goz2 = goz1;
                object3 = object1;
            }
            goz2.x();
            fryv fryv1 = fuhm0.c;
            goz2.M(0x8832530);
            if(fryv1 != null) {
                hey hey1 = hfc.e;
                goz2.M(0x6E3C21FE);
                Object object4 = goz2.j();
                if(object4 == object3) {
                    object4 = new fuhi();
                    goz2.P(object4);
                }
                goz2.x();
                hfc hfc3 = iuc.c(hey1, true, ((ibts)object4));
                jbn jbn1 = fpu.d(goz2).j;
                ftzd.a(fryv1, hfc3, fpu.a(goz2).o, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jbn1, goz2, 0, 0, 0x1FFF8);
                goz2 = goz2;
            }
            goz2.x();
            goz2.z();
        }
        gsb gsb0 = goz2.af();
        if(gsb0 != null) {
            gsb0.d = new fuhj(hfc0, fuhm0, v);
        }
    }

    public static final void h(hfc hfc0, fuhn fuhn0, goz goz0, int v) {
        long v4;
        fufg fufg0;
        jbn jbn2;
        goz goz2;
        goz goz1 = goz0.ao(0x45012A5B);
        int v1 = (v & 6) == 0 ? (goz1.X(hfc0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(fuhn0) ? 0x20 : 16);
        }
        if((v1 & 19) == 18 && goz1.ac()) {
            goz1.G();
            goz2 = goz1;
        }
        else {
            iau iau0 = dii.a(dho.g(16.0f), hei.m, goz1, 6);
            int v2 = fugx.a(gol.c(goz1));
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
            fryv fryv0 = fuhn0.a;
            jbn jbn0 = fpu.d(goz1).d;
            long v3 = fpu.a(goz1).o;
            hey hey0 = hfc.e;
            goz1.M(0x6E3C21FE);
            Object object0 = goz1.j();
            Object object1 = gop.a;
            if(object0 == object1) {
                object0 = new fugy();
                goz1.P(object0);
            }
            goz1.x();
            ftzd.a(fryv0, iuc.d(hey0, ((ibts)object0)), v3, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jbn0, goz1, 0, 0, 0x1FFF8);
            goz2 = goz1;
            fryv fryv1 = fuhn0.c;
            goz2.M(0x6DA29CAE);
            if(fryv1 != null) {
                goz2.M(0x6E3C21FE);
                Object object2 = goz2.j();
                if(object2 == object1) {
                    object2 = new fugz();
                    goz2.P(object2);
                }
                goz2.x();
                hfc hfc2 = iuc.c(hey0, true, ((ibts)object2));
                jbn jbn1 = fpu.d(goz2).g;
                ftzd.a(fryv1, hfc2, fpu.a(goz2).o, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jbn1, goz2, 0, 0, 0x1FFF8);
                goz2 = goz2;
            }
            goz2.x();
            fryv fryv2 = fuhn0.b;
            goz2.M(1839385022);
            if(fryv2 != null) {
                if(hyxx.c()) {
                    goz2.M(0x9FF9DF7D);
                    jbn2 = fpu.d(goz2).p;
                }
                else {
                    goz2.M(0x9FFB1FE7);
                    jbn2 = fpu.d(goz2).a;
                }
                goz2.x();
                goz2.M(-709224811);
                fufj fufj0 = fuhn0.d == null ? null : fuhn0.d.a;
                if(fuhn0.f) {
                    goz2.M(0xA24E7866);
                    if((fufj0 instanceof fufi)) {
                        goz2.M(0xA24F6B6F);
                        switch(((fufi)fufj0).a.ordinal()) {
                            case 0: 
                            case 3: 
                            case 5: {
                                fufg0 = fufg.b;
                                break;
                            }
                            case 1: 
                            case 2: 
                            case 4: 
                            case 6: 
                            case 7: 
                            case 8: {
                                fufg0 = fufg.c;
                                break;
                            }
                            default: {
                                throw new ibnq();
                            }
                        }
                        v4 = fuhl.i(fufg0, goz2);
                        goz2.x();
                        goz2.x();
                        goz2.x();
                        ftzd.a(fryv2, null, v4, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jbn2, goz2, 0, 0, 0x1FFFA);
                        goz2 = goz2;
                    }
                    else if((fufj0 instanceof fufh)) {
                        goz2.M(0x4F8F3C1E);
                        v4 = fuhl.i(((fufh)fufj0).c, goz2);
                        goz2.x();
                        goz2.x();
                        goz2.x();
                        ftzd.a(fryv2, null, v4, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jbn2, goz2, 0, 0, 0x1FFFA);
                        goz2 = goz2;
                    }
                    else {
                        if(fufj0 == null) {
                            goz2.M(0x4F8F4261);
                            v4 = fpu.a(goz2).o;
                            goz2.x();
                            goz2.x();
                            goz2.x();
                            ftzd.a(fryv2, null, v4, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jbn2, goz2, 0, 0, 0x1FFFA);
                            goz2 = goz2;
                            goto label_102;
                        }
                        goz2.M(0x4F8EEBD2);
                        goz2.x();
                        throw new ibnq();
                    }
                }
                else {
                    goz2.M(0xA24D52FD);
                    v4 = fpu.a(goz2).o;
                    goz2.x();
                    goz2.x();
                    ftzd.a(fryv2, null, v4, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jbn2, goz2, 0, 0, 0x1FFFA);
                    goz2 = goz2;
                }
            }
        label_102:
            goz2.x();
            fufu fufu0 = fuhn0.d;
            fufj fufj1 = fufu0 == null ? null : fufu0.a;
            boolean z = false;
            goz2.M(1839402042);
            goz2.M(0x6DA30D7E);
            if((fufj1 instanceof fufi)) {
                z = true;
            }
            else if((fufj1 instanceof fufh)) {
                Context context0 = (Context)goz2.h(AndroidCompositionLocals_androidKt.b);
                if(fryw.c(((fufh)fufj1).a, context0)) {
                    z = true;
                }
            }
            goz2.x();
            if(z) {
                fuft.i(null, fufu0, goz2, 0x40);
            }
            goz2.x();
            fujt fujt0 = fuhn0.e;
            goz2.M(1839410910);
            if(fujt0 != null) {
                fujs.a(null, fujt0, goz2, 0x40, 1);
            }
            goz2.x();
            goz2.M(1839412930);
            goz2.x();
            goz2.z();
        }
        gsb gsb0 = goz2.af();
        if(gsb0 != null) {
            gsb0.d = new fuha(hfc0, fuhn0, v);
        }
    }

    private static final long i(fufg fufg0, goz goz0) {
        long v;
        goz0.M(0xAA033A86);
        switch(fufg0.ordinal()) {
            case 0: {
                goz0.M(907985268);
                v = fsbs.d(fpu.a(goz0), goz0);
                goz0.x();
                break;
            }
            case 1: {
                goz0.M(907987477);
                v = fsbs.e(fpu.a(goz0), goz0);
                goz0.x();
                break;
            }
            case 2: {
                goz0.M(907989717);
                v = fsbs.c(fpu.a(goz0), goz0);
                goz0.x();
                break;
            }
            default: {
                goz0.M(907983335);
                goz0.x();
                throw new ibnq();
            }
        }
        goz0.x();
        return v;
    }
}

