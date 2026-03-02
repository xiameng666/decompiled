import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

public final class fubp {
    public static final void a(hfc hfc0, fubr fubr0, goz goz0, int v) {
        goz goz2;
        goz goz1 = goz0.ao(0x6991E0B5);
        int v1 = (v & 6) == 0 ? (goz1.X(hfc0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(fubr0) ? 0x20 : 16);
        }
        if((v1 & 19) == 18 && goz1.ac()) {
            goz1.G();
            goz2 = goz1;
        }
        else {
            goz1.M(1285330612);
            goz1.x();
            goz1.M(1285330248);
            long v2 = fpu.a(goz1).q;
            goz1.x();
            iau iau0 = dii.a(dho.c, hei.o, goz1, 0x30);
            int v3 = fube.a(gol.c(goz1));
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
            jbn jbn0 = fsbt.b(fpu.d(goz1));
            ftzd.a(fubr0.a, null, v2, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jbn0, goz1, 0, 0, 0x1FFFA);
            fryv fryv0 = fubr0.b;
            goz1.M(0x1496CEB9);
            if(fryv0 == null) {
                goz2 = goz1;
            }
            else {
                goz2 = goz1;
                ftzd.a(fryv0, null, v2, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, fpu.d(goz1).l, goz2, 0, 0, 0x1FFFA);
            }
            goz2.x();
            goz2.z();
        }
        gsb gsb0 = goz2.af();
        if(gsb0 != null) {
            gsb0.d = new fubo(hfc0, fubr0, v);
        }
    }

    public static final void b(hfc hfc0, boolean z, goz goz0, int v) {
        boolean z1;
        goz goz1 = goz0.ao(-1760696500);
        int v1 = (v & 6) == 0 ? (goz1.X(hfc0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Y(z) ? 0x20 : 16);
        }
        if((v1 & 19) == 18 && goz1.ac()) {
            goz1.G();
            z1 = z;
        }
        else {
            z1 = z;
            fdm.c(z1, null, dls.k(hfc0, 24.0f), false, null, goz1, v1 >> 3 & 14 | 0x30, 56);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new fubm(hfc0, z1, v);
        }
    }

    public static final void c(hfc hfc0, fuba fuba0, goz goz0, int v) {
        hlm hlm1;
        long v4;
        String s1;
        long v2;
        goz goz1 = goz0.ao(0xCDA6235F);
        int v1 = (v & 6) == 0 ? (goz1.X(hfc0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(fuba0) ? 0x20 : 16);
        }
        if((v1 & 19) == 18 && goz1.ac()) {
            goz1.G();
        }
        else {
            hfc hfc1 = dls.k(hfc0, 48.0f);
            if(hyxx.c()) {
                goz1.M(0x98B1A49B);
                goz1.M(-55908329);
                goz1.x();
                v2 = fpu.a(goz1).h;
            }
            else {
                goz1.M(-1733018821);
                v2 = fpu.a(goz1).c;
            }
            goz1.x();
            hfc hfc2 = cqx.a(hfc1, v2, eah.b(48.0f));
            boolean z = fuba0.d;
            hfc hfc3 = dla.d(hfc2, (z ? 8.0f : 12.0f));
            iau iau0 = dll.b(dho.e, hei.k, goz1, 54);
            int v3 = fube.a(gol.c(goz1));
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
            guo.b(goz1, iau0, iej.e);
            guo.b(goz1, gzk0, iej.d);
            ibtw ibtw0 = iej.f;
            if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v3))) {
                Integer integer0 = v3;
                goz1.P(integer0);
                goz1.p(integer0, ibtw0);
            }
            guo.a(goz1, iej.g);
            guo.b(goz1, hfc4, iej.c);
            hfc hfc5 = iqn.a(dls.k(hfc.e, (z ? 32.0f : 24.0f)), "IconInCircleImage");
            fryk fryk0 = fuba0.a;
            goz1.M(1149906141);
            hlm hlm0 = null;
            CharSequence charSequence0 = fuba0.c == null ? null : fuba0.c.a(((Context)goz1.h(AndroidCompositionLocals_androidKt.b)));
            goz1.x();
            if(charSequence0 == null) {
                s1 = null;
            }
            else {
                String s = charSequence0.toString();
                s1 = s.length() == 0 ? null : s;
            }
            frxs frxs0 = fuba0.b;
            goz1.M(0x448A391F);
            if(frxs0 != null) {
                hlm0 = frxs0.b(((Context)goz1.h(AndroidCompositionLocals_androidKt.b)));
            }
            goz1.x();
            goz1.M(1149909139);
            if(hlm0 == null) {
                if(hyxx.c()) {
                    goz1.M(1287542035);
                    v4 = fpu.a(goz1).i;
                }
                else {
                    goz1.M(0x4CBF9295);
                    v4 = fpu.a(goz1).d;
                }
                goz1.x();
                hlm1 = new hlb(v4, 5);
            }
            else {
                hlm1 = hlm0;
            }
            goz1.x();
            ftyy.b(fryk0, s1, hfc5, null, null, 0.0f, hlm1, goz1, 0, 56);
            goz1.z();
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new fubl(hfc0, fuba0, v);
        }
    }

    public static final void d(hfc hfc0, fubd fubd0, goz goz0, int v, int v1) {
        goz goz2;
        int v2;
        ibuq.f(fubd0, "state");
        goz goz1 = goz0.ao(-71228209);
        if(v1 == 0) {
            v2 = (v & 6) == 0 ? (goz1.X(hfc0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v & 0x30) == 0) {
            v2 |= (goz1.X(fubd0) ? 0x20 : 16);
        }
        if((v2 & 19) == 18 && goz1.ac()) {
            goz1.G();
            goz2 = goz1;
            goto label_53;
        }
        if(v1 != 0) {
            hfc0 = hfc.e;
        }
        if((fubd0 instanceof fuax)) {
            goz1.M(0x100B3ED9);
            fujj.b(iqn.a(hfc0, "LeadingCard"), ((fuax)fubd0).a, goz1, 0x40, 0);
            goz1.x();
            hfc0 = hfc0;
            goz2 = goz1;
            goto label_53;
        }
        if((fubd0 instanceof fuaz)) {
            goz1.M(0x100B4D50);
            hlm hlm0 = null;
            fryk fryk0 = ((fuaz)fubd0).a;
            frxs frxs0 = ((fuaz)fubd0).b;
            goz1.M(0x100B550B);
            if(frxs0 != null) {
                hlm0 = frxs0.b(((Context)goz1.h(AndroidCompositionLocals_androidKt.b)));
            }
            goz1.x();
            Context context0 = (Context)goz1.h(AndroidCompositionLocals_androidKt.b);
            goz2 = goz1;
            fubp.j(hfc0, fryk0, hlm0, ((fuaz)fubd0).e.a(context0), ((fuaz)fubd0).c, ((fuaz)fubd0).d, goz2, v2 & 14);
            hfc0 = hfc0;
            goz2.x();
            goto label_53;
        }
        hfc0 = hfc0;
        goz2 = goz1;
        if((fubd0 instanceof fuba)) {
            goz2.M(0x100B6DA4);
            fubp.c(iqn.a(hfc0, "IconInCircle"), ((fuba)fubd0), goz2, 0);
            goz2.x();
            goto label_53;
        }
        if((fubd0 instanceof fubc)) {
            goz2.M(0x100B7863);
            fubp.i(iqn.a(hfc0, "LeadingTravel"), ((fubc)fubd0), goz2, 0);
            goz2.x();
            goto label_53;
        }
        if((fubd0 instanceof fubb)) {
            goz2.M(-245034329);
            hfc hfc1 = iqn.a(hfc.e, "LeadingRadioButton");
            fxd.a(((fubb)fubd0).a, null, hfc1, false, null, goz2, 0x1B0, 56);
            goz2 = goz2;
            goz2.x();
        label_53:
            gsb gsb0 = goz2.af();
            if(gsb0 != null) {
                gsb0.d = new fubf(hfc0, fubd0, v, v1);
            }
            return;
        }
        if((fubd0 instanceof fuay)) {
            goz2.M(0x100B9A6D);
            iqn.a(hfc0, "LeadingCheckBox");
            fuay fuay0 = (fuay)fubd0;
            throw null;
        }
        goz2.M(0x100B3B81);
        goz2.x();
        throw new ibnq();
    }

    public static final void e(hfc hfc0, fuby fuby0, goz goz0, int v) {
        goz goz2;
        goz goz1 = goz0.ao(0xBA0B8161);
        int v1 = (v & 6) == 0 ? v | (goz1.X(hfc0) ? 4 : 2) : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(fuby0) ? 0x20 : 16);
        }
        if((v1 & 19) == 18 && goz1.ac()) {
            goz1.G();
            goz2 = goz1;
        }
        else {
            jbn jbn0 = fpu.d(goz1).m;
            goz1.M(0x6530C940);
            hll hll0 = fuby0.b == null ? null : new hll(fuby0.b.a(((Context)goz1.h(AndroidCompositionLocals_androidKt.b))));
            goz1.x();
            goz1.M(1697695700);
            long v2 = hll0 == null ? fpu.a(goz1).q : hll0.j;
            goz1.x();
            goz2 = goz1;
            ftzd.a(fuby0.a, hfc0, v2, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jbn0, goz2, v1 << 3 & 0x70, 0, 0x1FFF8);
        }
        gsb gsb0 = goz2.af();
        if(gsb0 != null) {
            gsb0.d = new fubg(hfc0, fuby0, v);
        }
    }

    public static final void f(hfc hfc0, fubx fubx0, goz goz0, int v) {
        goz goz1 = goz0.ao(0xAE7757F3);
        int v1 = (v & 6) == 0 ? (goz1.X(hfc0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.X(fubx0) ? 0x20 : 16);
        }
        if((v1 & 19) == 18 && goz1.ac()) {
            goz1.G();
        }
        else {
            hfc hfc1 = dls.e(dls.o(hfc0, 52.0f), 32.0f);
            gav.a(fubx0.a, null, hfc1, (fubx0.a ? fuav.a : null), false, null, null, goz1, 0x30, 0x70);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new fubi(hfc0, fubx0, v);
        }
    }

    public static final void g(hfc hfc0, fuca fuca0, goz goz0, int v, int v1) {
        hfc hfc2;
        hfc hfc1;
        int v2;
        goz goz1 = goz0.ao(0x4367FB35);
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
            v2 |= (goz1.X(fuca0) ? 0x20 : 16);
        }
        if((v2 & 19) == 18 && goz1.ac()) {
            goz1.G();
            hfc2 = hfc1;
            goto label_117;
        }
        hfc2 = v1 == 0 ? hfc1 : hfc.e;
        if((fuca0 instanceof fubu)) {
            goz1.M(560775831);
            if(((fubu)fuca0).b) {
                goz1.M(0x216D0629);
                hfc hfc3 = iqn.a(hfc2, "TrailingExpandableUp");
                fryh fryh0 = new fryh(0x7F0805AA);  // drawable:gs_keyboard_arrow_up_vd_theme_24
                goz1.M(0x9562EB1);
                goz1.x();
                fubp.j(hfc3, fryh0, null, hll.h, null, fuaw.a, goz1, 0x36C00);
            }
            else {
                goz1.M(0x21728165);
                hfc hfc4 = iqn.a(hfc2, "TrailingExpandableDown");
                fryh fryh1 = new fryh(0x7F0805A8);  // drawable:gs_keyboard_arrow_down_vd_theme_24
                goz1.M(156654705);
                goz1.x();
                fubp.j(hfc4, fryh1, null, hll.h, null, fuaw.a, goz1, 0x36C00);
            }
            goz1.x();
            goz1.x();
            goto label_117;
        }
        if((fuca0 instanceof fubv)) {
            goz1.M(0x95679FB);
            hey hey0 = hfc.e;
            iau iau0 = dii.a(dho.c, hei.o, goz1, 0x30);
            int v3 = fube.a(gol.c(goz1));
            gzk gzk0 = goz1.ak();
            hfc hfc5 = hew.c(goz1, hey0);
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
            guo.b(goz1, hfc5, iej.c);
            frxs frxs0 = ((fubv)fuca0).c;
            goz1.M(-1210268376);
            hlm hlm0 = frxs0 == null ? null : frxs0.b(((Context)goz1.h(AndroidCompositionLocals_androidKt.b)));
            goz1.x();
            Context context0 = (Context)goz1.h(AndroidCompositionLocals_androidKt.b);
            fubp.j(hfc2, ((fubv)fuca0).a, hlm0, ((fubv)fuca0).f.a(context0), ((fubv)fuca0).d, ((fubv)fuca0).e, goz1, v2 & 14);
            goz1.M(-1210260963);
            fryv fryv0 = ((fubv)fuca0).b;
            if(fryv0 != null) {
                jbn jbn0 = fpu.d(goz1).l;
                goz1.M(0xB7DCF72B);
                goz1.x();
                ftzd.a(fryv0, dla.j(hey0, 0.0f, 4.0f, 0.0f, 0.0f, 13), hll.i, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jbn0, goz1, 0x30, 0, 0x1FFF8);
                goz1 = goz1;
            }
            goz1.x();
            goz1.z();
            goz1.x();
            goto label_117;
        }
        if((fuca0 instanceof fubx)) {
            goz1.M(0x956D086);
            fubp.f(iqn.a(hfc2, "TrailingSwitch"), ((fubx)fuca0), goz1, 0);
            goz1.x();
            goto label_117;
        }
        if((fuca0 instanceof fuby)) {
            goz1.M(0x956DA8A);
            fubp.e(hfc2, ((fuby)fuca0), goz1, v2 & 14);
            goz1.x();
            goto label_117;
        }
        if((fuca0 instanceof fubz)) {
            goz1.M(0x956E230);
            fubp.h(iqn.a(hfc2, "TrailingTransaction"), ((fubz)fuca0), goz1, 0);
            goz1.x();
            goto label_117;
        }
        if((fuca0 instanceof fubw)) {
            goz1.M(0x218700C0);
            hfc hfc6 = iqn.a(hfc2, "TrailingRadioButton");
            fxd.a(((fubw)fuca0).a, null, hfc6, false, null, goz1, 0x30, 56);
            goz1 = goz1;
            goz1.x();
            goto label_117;
        }
        if((fuca0 instanceof fubs)) {
            goz1.M(0x9570554);
            fubp.b(iqn.a(hfc2, "TrailingCheckBox"), ((fubs)fuca0).a, goz1, 0);
            goz1.x();
            goto label_117;
        }
        if((fuca0 instanceof fubq)) {
            goz1.M(156701007);
            ftvg.a(iqn.a(hfc2, "TrailingBadge"), ((fubq)fuca0).a, goz1, 0, 0);
            goz1.x();
            goto label_117;
        }
        if((fuca0 instanceof fubr)) {
            goz1.M(156703976);
            fubp.a(iqn.a(hfc2, "TrailingBalance"), ((fubr)fuca0), goz1, 0);
            goz1.x();
        label_117:
            gsb gsb0 = goz1.af();
            if(gsb0 != null) {
                gsb0.d = new fubh(hfc2, fuca0, v, v1);
            }
            return;
        }
        goz1.M(0x9561607);
        goz1.x();
        throw new ibnq();
    }

    public static final void h(hfc hfc0, fubz fubz0, goz goz0, int v) {
        long v3;
        long v2;
        jbn jbn1;
        jbn jbn0;
        goz goz1 = goz0.ao(0x3E1074F5);
        boolean z = true;
        int v1 = (v & 6) == 0 ? (goz1.X(hfc0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(fubz0) ? 0x20 : 16);
        }
        if((v1 & 19) == 18 && goz1.ac()) {
            goz1.G();
        }
        else {
            boolean z1 = fubz0.d;
            if(z1) {
                goz1.M(-70835425);
                jbn0 = fpu.d(goz1).g;
            }
            else {
                goz1.M(0xFBC72980);
                jbn0 = fpu.d(goz1).h;
            }
            goz1.x();
            if(z1) {
                goz1.M(-70830146);
                jbn1 = fpu.d(goz1).l;
            }
            else {
                goz1.M(0xFBC73DFF);
                jbn1 = fpu.d(goz1).k;
            }
            goz1.x();
            fucb fucb0 = fubz0.c;
            switch(fucb0.ordinal()) {
                case 1: {
                    goz1.M(-70819802);
                    if(hyxx.c()) {
                        goz1.M(2099570765);
                        v2 = fpu.a(goz1).s;
                    }
                    else {
                        goz1.M(0x7D25F676);
                        v2 = fpu.a(goz1).A;
                    }
                    goz1.x();
                    goz1.x();
                    break;
                }
                case 2: 
                case 4: 
                case 6: {
                    goz1.M(-70806278);
                    v2 = fpu.a(goz1).w;
                    goz1.x();
                    break;
                }
                case 5: 
                case 7: {
                    goz1.M(0xFBC7807C);
                    v2 = fpu.a(goz1).A;
                    goz1.x();
                    break;
                }
                case 0: 
                case 3: 
                case 8: {
                    goz1.M(-70821858);
                    v2 = fpu.a(goz1).q;
                    goz1.x();
                    break;
                }
                default: {
                    goz1.M(-70826608);
                    goz1.x();
                    throw new ibnq();
                }
            }
            switch(fucb0.ordinal()) {
                case 1: {
                    goz1.M(-70798906);
                    if(hyxx.c()) {
                        goz1.M(2100218541);
                        v3 = fpu.a(goz1).s;
                    }
                    else {
                        goz1.M(2100287702);
                        v3 = fpu.a(goz1).A;
                    }
                    goz1.x();
                    goz1.x();
                    break;
                }
                case 3: {
                    goz1.M(0xFBC7F004);
                    v3 = fsbs.e(fpu.a(goz1), goz1);
                    goz1.x();
                    break;
                }
                case 2: 
                case 4: 
                case 6: {
                    goz1.M(-70785382);
                    v3 = fpu.a(goz1).w;
                    goz1.x();
                    break;
                }
                case 5: 
                case 7: {
                    goz1.M(-70790628);
                    v3 = fpu.a(goz1).A;
                    goz1.x();
                    break;
                }
                case 0: 
                case 8: {
                    goz1.M(-70800962);
                    v3 = fpu.a(goz1).q;
                    goz1.x();
                    break;
                }
                default: {
                    goz1.M(-70804356);
                    goz1.x();
                    throw new ibnq();
                }
            }
            goz1.M(-70780795);
            fryv fryv0 = fubz0.b;
            if(fryv0 == null || fryv0.a(((Context)goz1.h(AndroidCompositionLocals_androidKt.b))).length() <= 0) {
                z = false;
            }
            goz1.x();
            if(!z) {
                switch(fucb0.ordinal()) {
                    case 1: {
                        fryv0 = new fryr(0x7F1524FF);  // string:pending "Pending"
                        break;
                    }
                    case 2: {
                        fryv0 = new fryr(0x7F150CFE);  // string:declined "Declined"
                        break;
                    }
                    case 3: {
                        fryv0 = new fryr(0x7F15282B);  // string:refunded "Refunded"
                        break;
                    }
                    case 4: {
                        fryv0 = new fryr(0x7F15105F);  // string:failed "Failed"
                        break;
                    }
                    case 5: {
                        fryv0 = new fryr(0x7F15282A);  // string:refund_pending "Refund pending"
                        break;
                    }
                    case 6: {
                        fryv0 = new fryr(0x7F152829);  // string:refund_declined "Refund declined"
                        break;
                    }
                    case 7: {
                        fryv0 = new fryr(0x7F150671);  // string:canceled "Canceled"
                        break;
                    }
                    case 0: 
                    case 8: {
                        fryv0 = null;
                        break;
                    }
                    default: {
                        throw new ibnq();
                    }
                }
            }
            iau iau0 = dii.a(dho.c, hei.o, goz1, 0x30);
            int v4 = fube.a(gol.c(goz1));
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
            if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v4))) {
                Integer integer0 = v4;
                goz1.P(integer0);
                goz1.p(integer0, ibtw0);
            }
            guo.a(goz1, iej.g);
            guo.b(goz1, hfc1, iej.c);
            ftzd.a(fubz0.a, null, v2, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jbn0, goz1, 0, 0, 0x1FFFA);
            goz1.M(-1702136596);
            if(fryv0 != null) {
                ftzd.a(fryv0, null, v3, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jbn1, goz1, 0, 0, 0x1FFFA);
            }
            goz1.x();
            goz1.z();
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new fubk(hfc0, fubz0, v);
        }
    }

    public static final void i(hfc hfc0, fubc fubc0, goz goz0, int v) {
        goz goz1 = goz0.ao(0xDB80028E);
        int v1 = (v & 6) == 0 ? (goz1.X(hfc0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.X(fubc0) ? 0x20 : 16);
        }
        if((v1 & 19) == 18 && goz1.ac()) {
            goz1.G();
            gsb gsb0 = goz1.af();
            if(gsb0 != null) {
                gsb0.d = new fubn(hfc0, fubc0, v);
            }
            return;
        }
        hfc hfc1 = dls.e(hfc0, 60.0f);
        iau iau0 = dii.a(dho.g(8.0f), hei.n, goz1, 54);
        int v2 = fube.a(gol.c(goz1));
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
        throw null;
    }

    public static final void j(hfc hfc0, fryk fryk0, hlm hlm0, long v, fryv fryv0, fuaw fuaw0, goz goz0, int v1) {
        CharSequence charSequence0;
        String s6;
        CharSequence charSequence5;
        String s5;
        CharSequence charSequence4;
        CharSequence charSequence3;
        CharSequence charSequence2;
        CharSequence charSequence1;
        fryv fryv1 = fryv0;
        goz goz1 = goz0.ao(0x618909D3);
        int v2 = (v1 & 6) == 0 ? (goz1.X(hfc0) ? 4 : 2) | v1 : v1;
        if((v1 & 0x30) == 0) {
            v2 |= (((v1 & 0x40) == 0 ? goz1.X(fryk0) : goz1.Z(fryk0)) ? 0x20 : 16);
        }
        if((v1 & 0x180) == 0) {
            v2 |= (goz1.X(hlm0) ? 0x100 : 0x80);
        }
        if((v1 & 0xC00) == 0) {
            v2 |= (goz1.W(v) ? 0x800 : 0x400);
        }
        if((v1 & 0x6000) == 0) {
            v2 |= (goz1.Z(fryv1) ? 0x4000 : 0x2000);
        }
        if((0x30000 & v1) == 0) {
            v2 |= (goz1.V(fuaw0.ordinal()) ? 0x20000 : 0x10000);
        }
        if((74899 & v2) == 74898 && goz1.ac()) {
            goz1.G();
        }
        else {
            float f = 72.0f;
            int v3 = fuaw0.ordinal();
            String s = null;
            switch(v3) {
                case 0: {
                    goz1.M(1246901051);
                    hfc hfc4 = dls.k(hfc.e, 24.0f);
                    iau iau1 = dhw.a(hei.a, false);
                    int v5 = fube.a(gol.c(goz1));
                    gzk gzk1 = goz1.ak();
                    hfc hfc5 = hew.c(goz1, hfc4);
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
                    guo.b(goz1, hfc5, iej.c);
                    hfc hfc6 = iqn.a(dls.k(cqx.c(hfc0, v), 24.0f), "DefaultIcon");
                    goz1.M(0xADCA318B);
                    if(fryv1 == null) {
                        fryv1 = null;
                        charSequence1 = null;
                    }
                    else {
                        charSequence1 = fryv1.a(((Context)goz1.h(AndroidCompositionLocals_androidKt.b)));
                    }
                    goz1.x();
                    if(charSequence1 != null) {
                        String s2 = charSequence1.toString();
                        if(s2.length() != 0) {
                            s = s2;
                        }
                    }
                    ftyy.b(fryk0, s, hfc6, null, null, 0.0f, hlm0, goz1, v2 >> 3 & 14 | v2 << 12 & 0x380000, 56);
                    goz1.z();
                    goz1.x();
                    break;
                }
                case 1: {
                    goz1.M(1247307027);
                    hfc hfc7 = dls.k(hfc.e, 32.0f);
                    iau iau2 = dhw.a(hei.a, false);
                    int v6 = fube.a(gol.c(goz1));
                    gzk gzk2 = goz1.ak();
                    hfc hfc8 = hew.c(goz1, hfc7);
                    ibth ibth2 = iej.a;
                    goz1.O();
                    if(goz1.x) {
                        goz1.t(ibth2);
                    }
                    else {
                        goz1.T();
                    }
                    guo.b(goz1, iau2, iej.e);
                    guo.b(goz1, gzk2, iej.d);
                    ibtw ibtw2 = iej.f;
                    if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v6))) {
                        Integer integer2 = v6;
                        goz1.P(integer2);
                        goz1.p(integer2, ibtw2);
                    }
                    guo.a(goz1, iej.g);
                    guo.b(goz1, hfc8, iej.c);
                    hfc hfc9 = iqn.a(cqx.c(hhi.a(dls.k(hfc0, 32.0f), eah.b(8.0f)), v), "SquareMediumIcon");
                    goz1.M(0x31AA7F34);
                    if(fryv1 == null) {
                        fryv1 = null;
                        charSequence2 = null;
                    }
                    else {
                        charSequence2 = fryv1.a(((Context)goz1.h(AndroidCompositionLocals_androidKt.b)));
                    }
                    goz1.x();
                    if(charSequence2 != null) {
                        String s3 = charSequence2.toString();
                        if(s3.length() != 0) {
                            s = s3;
                        }
                    }
                    ftyy.b(fryk0, s, hfc9, null, null, 0.0f, hlm0, goz1, v2 >> 3 & 14 | v2 << 12 & 0x380000, 56);
                    goz1.z();
                    goz1.x();
                    break;
                }
                case 2: {
                    goz1.M(0x4A601954);
                    hfc hfc10 = dls.k(hfc.e, 72.0f);
                    iau iau3 = dhw.a(hei.a, false);
                    int v7 = fube.a(gol.c(goz1));
                    gzk gzk3 = goz1.ak();
                    hfc hfc11 = hew.c(goz1, hfc10);
                    ibth ibth3 = iej.a;
                    goz1.O();
                    if(goz1.x) {
                        goz1.t(ibth3);
                    }
                    else {
                        goz1.T();
                    }
                    guo.b(goz1, iau3, iej.e);
                    guo.b(goz1, gzk3, iej.d);
                    ibtw ibtw3 = iej.f;
                    if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v7))) {
                        Integer integer3 = v7;
                        goz1.P(integer3);
                        goz1.p(integer3, ibtw3);
                    }
                    guo.a(goz1, iej.g);
                    guo.b(goz1, hfc11, iej.c);
                    hfc hfc12 = iqn.a(cqx.c(hhi.a(dls.k(hfc0, 72.0f), eah.b(8.0f)), v), "SquareLargeIcon");
                    goz1.M(0xF7133533);
                    if(fryv1 == null) {
                        fryv1 = null;
                        charSequence3 = null;
                    }
                    else {
                        charSequence3 = fryv1.a(((Context)goz1.h(AndroidCompositionLocals_androidKt.b)));
                    }
                    goz1.x();
                    if(charSequence3 != null) {
                        String s4 = charSequence3.toString();
                        if(s4.length() != 0) {
                            s = s4;
                        }
                    }
                    ftyy.b(fryk0, s, hfc12, null, null, 0.0f, hlm0, goz1, v2 >> 3 & 14 | v2 << 12 & 0x380000, 56);
                    goz1.z();
                    goz1.x();
                    break;
                }
                case 3: {
                    goz1.M(0x4A67BFC7);
                    float f1 = hyxx.c() ? 72.0f : 64.0f;
                    hfc hfc13 = dls.k(hfc.e, f1);
                    iau iau4 = dhw.a(hei.a, false);
                    int v8 = fube.a(gol.c(goz1));
                    gzk gzk4 = goz1.ak();
                    hfc hfc14 = hew.c(goz1, hfc13);
                    ibth ibth4 = iej.a;
                    goz1.O();
                    if(goz1.x) {
                        goz1.t(ibth4);
                    }
                    else {
                        goz1.T();
                    }
                    guo.b(goz1, iau4, iej.e);
                    guo.b(goz1, gzk4, iej.d);
                    ibtw ibtw4 = iej.f;
                    if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v8))) {
                        Integer integer4 = v8;
                        goz1.P(integer4);
                        goz1.p(integer4, ibtw4);
                    }
                    guo.a(goz1, iej.g);
                    guo.b(goz1, hfc14, iej.c);
                    hfc hfc15 = dls.k(hfc0, (hyxx.c() ? 72.0f : 64.0f));
                    if(!hyxx.c()) {
                        f = 64.0f;
                    }
                    hfc hfc16 = iqn.a(cqx.c(hhi.a(hfc15, eah.b(f)), v), "AvatarIcon");
                    goz1.M(0xBC7BF292);
                    if(fryv1 == null) {
                        fryv1 = null;
                        charSequence4 = null;
                    }
                    else {
                        charSequence4 = fryv1.a(((Context)goz1.h(AndroidCompositionLocals_androidKt.b)));
                    }
                    goz1.x();
                    if(charSequence4 == null) {
                        s5 = null;
                    }
                    else {
                        s5 = charSequence4.toString();
                        if(s5.length() == 0) {
                            s5 = null;
                        }
                    }
                    ftyy.b(fryk0, s5, hfc16, null, hys.g, 0.0f, null, goz1, v2 >> 3 & 14 | 0x6000, 104);
                    goz1.z();
                    goz1.x();
                    break;
                }
                case 4: {
                    goz1.M(0x4A710FFE);
                    hfc hfc17 = dls.k(hfc.e, 32.0f);
                    iau iau5 = dhw.a(hei.a, false);
                    int v9 = fube.a(gol.c(goz1));
                    gzk gzk5 = goz1.ak();
                    hfc hfc18 = hew.c(goz1, hfc17);
                    ibth ibth5 = iej.a;
                    goz1.O();
                    if(goz1.x) {
                        goz1.t(ibth5);
                    }
                    else {
                        goz1.T();
                    }
                    guo.b(goz1, iau5, iej.e);
                    guo.b(goz1, gzk5, iej.d);
                    ibtw ibtw5 = iej.f;
                    if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v9))) {
                        Integer integer5 = v9;
                        goz1.P(integer5);
                        goz1.p(integer5, ibtw5);
                    }
                    guo.a(goz1, iej.g);
                    guo.b(goz1, hfc18, iej.c);
                    hfc hfc19 = iqn.a(cqx.c(hhi.a(dls.k(hfc0, 32.0f), eah.b(32.0f)), v), "CircleMediumIcon");
                    goz1.M(0x81E4A1B1);
                    if(fryv1 == null) {
                        fryv1 = null;
                        charSequence5 = null;
                    }
                    else {
                        charSequence5 = fryv1.a(((Context)goz1.h(AndroidCompositionLocals_androidKt.b)));
                    }
                    goz1.x();
                    if(charSequence5 == null) {
                        s6 = null;
                    }
                    else {
                        s6 = charSequence5.toString();
                        if(s6.length() == 0) {
                            s6 = null;
                        }
                    }
                    ftyy.b(fryk0, s6, hfc19, null, hys.g, 0.0f, null, goz1, v2 >> 3 & 14 | 0x6000, 104);
                    goz1.z();
                    goz1.x();
                    break;
                }
                default: {
                    if(v3 == 5) {
                        goz1.M(0x4A79159F);
                        hfc hfc1 = dls.k(hfc.e, 48.0f);
                        iau iau0 = dhw.a(hei.a, false);
                        int v4 = fube.a(gol.c(goz1));
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
                        if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v4))) {
                            Integer integer0 = v4;
                            goz1.P(integer0);
                            goz1.p(integer0, ibtw0);
                        }
                        guo.a(goz1, iej.g);
                        guo.b(goz1, hfc2, iej.c);
                        hfc hfc3 = iqn.a(cqx.c(hhi.a(dls.k(hfc0, 48.0f), eah.b(48.0f)), v), "CircleLargeIcon");
                        goz1.M(0x474D57B0);
                        if(fryv1 == null) {
                            fryv1 = null;
                            charSequence0 = null;
                        }
                        else {
                            charSequence0 = fryv1.a(((Context)goz1.h(AndroidCompositionLocals_androidKt.b)));
                        }
                        goz1.x();
                        if(charSequence0 != null) {
                            String s1 = charSequence0.toString();
                            if(s1.length() != 0) {
                                s = s1;
                            }
                        }
                        ftyy.b(fryk0, s, hfc3, null, hys.g, 0.0f, null, goz1, v2 >> 3 & 14 | 0x6000, 104);
                        goz1.z();
                        goz1.x();
                        break;
                    }
                    goz1.M(0x236E06D8);
                    goz1.x();
                    throw new ibnq();
                }
            }
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new fubj(hfc0, fryk0, hlm0, v, fryv1, fuaw0, v1);
        }
    }
}

