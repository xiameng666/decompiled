import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

public final class tzc {
    static final ibxd[] a;
    public static final ivi b;

    static {
        tzc.a = new ibxd[]{new ibut(tzc.class, "displayedDrawable", "getDisplayedDrawable(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/runtime/MutableState;", 1)};
        tzc.b = new ivi("DisplayedDrawable");
    }

    public static final tzl a(ibtw ibtw0) {
        ibuq.f(ibtw0, "composable");
        return new tzi(ibtw0);
    }

    public static final void b(Object object0, String s, hfc hfc0, hel hel0, hyt hyt0, float f, hlm hlm0, tzl tzl0, tzl tzl1, ibts ibts0, goz goz0, int v, int v1) {
        uae uae0;
        txx txx3;
        txx txx2;
        ibts ibts2;
        ibts ibts1;
        tzl tzl3;
        hyt hyt2;
        hel hel2;
        float f2;
        hfc hfc2;
        goz goz2;
        tzl tzl2;
        hlm hlm1;
        int v6;
        int v5;
        int v4;
        int v3;
        float f1;
        hyt hyt1;
        hel hel1;
        hfc hfc1;
        int v2;
        goz goz1 = goz0.ao(0xE26CA470);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (goz1.Z(object0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x30) == 0) {
            v2 |= (goz1.X(s) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
            hfc1 = hfc0;
        }
        else if((v & 0x180) == 0) {
            hfc1 = hfc0;
            v2 |= (goz1.X(hfc1) ? 0x100 : 0x80);
        }
        else {
            hfc1 = hfc0;
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
            hel1 = hel0;
        }
        else if((v & 0xC00) == 0) {
            hel1 = hel0;
            v2 |= (goz1.X(hel1) ? 0x800 : 0x400);
        }
        else {
            hel1 = hel0;
        }
        if((v1 & 16) != 0) {
            v2 |= 0x6000;
            hyt1 = hyt0;
        }
        else if((v & 0x6000) == 0) {
            hyt1 = hyt0;
            v2 |= (goz1.X(hyt1) ? 0x4000 : 0x2000);
        }
        else {
            hyt1 = hyt0;
        }
        if((v1 & 0x20) == 0) {
            f1 = f;
            if((v & 0x30000) == 0) {
                v2 |= (goz1.U(f1) ? 0x20000 : 0x10000);
            }
        }
        else {
            v2 |= 0x30000;
            f1 = f;
        }
        if((v1 & 0x40) == 0) {
            v3 = (v & 0x180000) == 0 ? v2 | (goz1.X(hlm0) ? 0x100000 : 0x80000) : v2;
        }
        else {
            v3 = v2 | 0x180000;
        }
        if((v1 & 0x80) != 0) {
            v3 |= 0xC00000;
            v4 = v1 & 0x80;
        }
        else if((v & 0xC00000) == 0) {
            v4 = v1 & 0x80;
            v3 |= (goz1.X(tzl0) ? 0x800000 : 0x400000);
        }
        else {
            v4 = v1 & 0x80;
        }
        if((v1 & 0x100) != 0) {
            v3 |= 0x6000000;
            v5 = v1 & 0x100;
        }
        else if((0x6000000 & v) == 0) {
            v5 = v1 & 0x100;
            v3 |= (goz1.X(tzl1) ? 0x4000000 : 0x2000000);
        }
        else {
            v5 = v1 & 0x100;
        }
        if((v1 & 0x200) != 0) {
            v3 |= 0x30000000;
            v6 = v1 & 0x200;
        }
        else if((0x30000000 & v) == 0) {
            v6 = v1 & 0x200;
            v3 |= (goz1.Z(ibts0) ? 0x20000000 : 0x10000000);
        }
        else {
            v6 = v1 & 0x200;
        }
        if((306783379 & v3) == 306783378 && goz1.ac()) {
            goz1.G();
            hlm1 = hlm0;
            tzl2 = tzl1;
            goz2 = goz1;
            hfc2 = hfc1;
            f2 = f1;
            hel2 = hel1;
            hyt2 = hyt1;
            tzl3 = tzl0;
            ibts1 = ibts0;
        }
        else {
            if((v1 & 4) != 0) {
                hfc1 = hfc.e;
            }
            if((v1 & 8) != 0) {
                hel1 = hei.e;
            }
            if((v1 & 16) != 0) {
                hyt1 = hys.b;
            }
            if((v1 & 0x20) != 0) {
                f1 = 1.0f;
            }
            hlm hlm2 = (v1 & 0x40) == 0 ? hlm0 : null;
            tzl tzl4 = v4 == 0 ? tzl0 : null;
            tzl tzl5 = v5 == 0 ? tzl1 : null;
            if(v6 == 0) {
                ibts2 = ibts0;
            }
            else {
                goz1.M(0x6E3C21FE);
                Object object1 = goz1.j();
                if(object1 == gop.a) {
                    object1 = new tyr();
                    goz1.P(object1);
                }
                ibts2 = (ibts)object1;
                goz1.x();
            }
            goz1.M(-103437801);
            Context context0 = (Context)goz1.h(AndroidCompositionLocals_androidKt.b);
            goz1.M(5004770);
            boolean z = goz1.X(context0);
            Object object2 = goz1.j();
            if(z || object2 == gop.a) {
                object2 = txc.d(context0);
                ibuq.e(object2, "with(...)");
                goz1.P(object2);
            }
            goz1.x();
            goz1.x();
            ibuq.c(((tyb)object2));
            goz1.M(-103430078);
            goz1.M(-103432306);
            goz1.M(0x68FF4C21);
            goz1.M(-1224400529);
            int v7 = goz1.X(object0) | goz1.X(((tyb)object2));
            int v8 = v3 & 14 | v3 >> 21 & 0x380 | v3 >> 3 & 0x1C00;
            int v9 = ((v8 & 0x380 ^ 0x180) <= 0x100 || !goz1.X(ibts2)) && (v8 & 0x180) != 0x100 ? 0 : 1;
            int v10 = ((v8 & 0x1C00 ^ 0xC00) <= 0x800 || !goz1.X(hyt1)) && (v8 & 0xC00) != 0x800 ? 0 : 1;
            Object object3 = goz1.j();
            if((v9 | v7 | v10) != 0 || object3 == gop.a) {
                txx txx0 = ((tyb)object2).g(object0);
                if(ibuq.m(hyt1, hys.a)) {
                    txx0 = (txx)txx0.x();
                }
                else if(ibuq.m(hyt1, hys.e) || ibuq.m(hyt1, hys.b)) {
                    txx0 = (txx)txx0.y();
                }
                object3 = (txx)ibts2.a(txx0);
                goz1.P(object3);
            }
            txx txx1 = (txx)object3;
            goz1.x();
            goz1.x();
            goz1.M(-103431849);
            if(tzl4 == null) {
                txx2 = null;
            }
            else {
                goz1.M(5004770);
                boolean z1 = goz1.Z(txx1);
                Object object4 = goz1.j();
                if(z1 || object4 == gop.a) {
                    object4 = new tyx(txx1);
                    goz1.P(object4);
                }
                goz1.x();
                goz1.M(5004770);
                boolean z2 = goz1.Z(txx1);
                Object object5 = goz1.j();
                if(z2 || object5 == gop.a) {
                    object5 = new tyy(txx1);
                    goz1.P(object5);
                }
                goz1.x();
                txx2 = tzl4.a(((ibts)(((ibwx)object4))), ((ibts)(((ibwx)object5))));
            }
            goz1.x();
            if(txx2 != null) {
                txx1 = txx2;
            }
            goz1.x();
            goz1.M(0xF9D5CA0B);
            if(tzl5 == null) {
                txx3 = null;
            }
            else {
                goz1.M(5004770);
                boolean z3 = goz1.Z(txx1);
                Object object6 = goz1.j();
                if(z3 || object6 == gop.a) {
                    object6 = new tyz(txx1);
                    goz1.P(object6);
                }
                goz1.x();
                goz1.M(5004770);
                boolean z4 = goz1.Z(txx1);
                Object object7 = goz1.j();
                if(z4 || object7 == gop.a) {
                    object7 = new tza(txx1);
                    goz1.P(object7);
                }
                goz1.x();
                txx3 = tzl5.a(((ibts)(((ibwx)object6))), ((ibts)(((ibwx)object7))));
            }
            goz1.x();
            if(txx3 != null) {
                txx1 = txx3;
            }
            goz1.x();
            ibuq.f(txx1, "<this>");
            ibuq.f(txx1, "<this>");
            if(uqq.m(txx1.k)) {
                int v11 = txx1.j;
                uae0 = uqq.m(v11) ? new uae(txx1.k, v11) : null;
            }
            else {
                uae0 = null;
            }
            goz1.M(0x8FF43785);
            goz1.M(-1633490746);
            int v12 = goz1.X(uae0);
            int v13 = ((v3 >> 3 & 0x70 ^ 0x30) <= 0x20 || !goz1.X(hfc1)) && (v3 >> 3 & 0x30) != 0x20 ? 0 : 1;
            Object object8 = goz1.j();
            if((v12 | v13) != 0 || object8 == gop.a) {
                if(uae0 == null) {
                    tzn tzn0 = new tzn();
                    object8 = new tzm(new tzu(new tzb(tzn0)), hzt.a(hfc1, new tyu(tzn0)));
                }
                else {
                    object8 = new tzm(new uaa(uae0), hfc1);
                }
                goz1.P(object8);
            }
            goz1.x();
            goz1.x();
            goz1.M(0xF9D5FA11);
            Boolean boolean0 = (Boolean)goz1.h(ipv.a);
            goz1.x();
            ibtw ibtw0 = tzl4 == null ? null : tzl4.b();
            goz2 = goz1;
            tzc.c(txx1, ((tzm)object8).a, ((tzm)object8).b, s, hel1, hyt1, f1, hlm2, ibtw0, (tzl5 == null ? null : tzl5.b()), goz2, v3 << 6 & 0x1C00 | v3 << 3 & 0xE000 | v3 << 3 & 0x70000 | v3 << 3 & 0x380000 | v3 << 3 & 0x1C00000);
            tzl2 = tzl5;
            ibts1 = ibts2;
            hfc2 = hfc1;
            hel2 = hel1;
            f2 = f1;
            hlm1 = hlm2;
            tzl3 = tzl4;
            hyt2 = hyt1;
        }
        gsb gsb0 = goz2.af();
        if(gsb0 != null) {
            gsb0.d = new tys(object0, s, hfc2, hel2, hyt2, f2, hlm1, tzl3, tzl2, ibts1, v, v1);
        }
    }

    public static final void c(txx txx0, uac uac0, hfc hfc0, String s, hel hel0, hyt hyt0, float f, hlm hlm0, ibtw ibtw0, ibtw ibtw1, goz goz0, int v) {
        goz goz2;
        hlm hlm1;
        float f1;
        hyt hyt1;
        goz goz1 = goz0.ao(0x81C497A9);
        int v1 = (v & 6) == 0 ? (goz1.Z(txx0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(uac0) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (goz1.X(hfc0) ? 0x100 : 0x80);
        }
        if((v & 0xC00) == 0) {
            v1 |= (goz1.X(s) ? 0x800 : 0x400);
        }
        if((v & 0x6000) == 0) {
            v1 |= (goz1.X(hel0) ? 0x4000 : 0x2000);
        }
        if((0x30000 & v) == 0) {
            hyt1 = hyt0;
            v1 |= (goz1.X(hyt1) ? 0x20000 : 0x10000);
        }
        else {
            hyt1 = hyt0;
        }
        if((0x180000 & v) == 0) {
            f1 = f;
            v1 |= (goz1.U(f1) ? 0x100000 : 0x80000);
        }
        else {
            f1 = f;
        }
        if((0xC00000 & v) == 0) {
            hlm1 = hlm0;
            v1 |= (goz1.X(hlm1) ? 0x800000 : 0x400000);
        }
        else {
            hlm1 = hlm0;
        }
        if((0x6000000 & v) == 0) {
            v1 |= (goz1.Z(ibtw0) ? 0x4000000 : 0x2000000);
        }
        if((0x30000000 & v) == 0) {
            v1 |= (goz1.Z(ibtw1) ? 0x20000000 : 0x10000000);
        }
        if((306783379 & v1) == 306783378 && goz1.ac()) {
            goz1.G();
            goz2 = goz1;
        }
        else {
            goz1.M(-38500790);
            Object object0 = goz1.j();
            Object object1 = gop.a;
            if(object0 == object1) {
                object0 = gqe.a(ibru.a, goz1);
                goz1.P(object0);
            }
            lps lps0 = (lps)goz1.h(ltr.a);
            goz1.M(0x97EA02AA);
            int v2 = goz1.X(txx0) | goz1.X(uac0) | goz1.X(lps0);
            Object object2 = goz1.j();
            if(v2 != 0 || object2 == object1) {
                object2 = new tzh(txx0, uac0, ((icck)object0), lps0);
                goz1.P(object2);
            }
            goz1.x();
            goz1.x();
            if(ibtw0 == null) {
            label_56:
                if(ibtw1 != null && ((tzh)object2).k() == uaf.d) {
                    goz1.M(0x3CB9C060);
                    tzc.d(ibtw1, hfc0, goz1, v1 >> 27 & 14);
                    goz1.x();
                    goz2 = goz1;
                }
                else {
                    goz1.M(1018845986);
                    hey hey0 = hfc.e;
                    goz1.M(5004770);
                    boolean z = goz1.X(((tzh)object2));
                    Object object3 = goz1.j();
                    if(z || object3 == object1) {
                        object3 = new tyv(((tzh)object2));
                        goz1.P(object3);
                    }
                    goz1.x();
                    goz2 = goz1;
                    cth.a(((tzh)object2), s, hfc0.a(iuc.d(hey0, ((ibts)object3))), hel0, hyt1, f1, hlm1, goz2, v1 >> 6 & 0x70 | v1 >> 3 & 0x1C00 | 0xE000 & v1 >> 3 | 0x70000 & v1 >> 3 | v1 >> 3 & 0x380000, 0);
                    goz2.x();
                }
            }
            else {
                switch(((tzh)object2).k().ordinal()) {
                    case 0: 
                    case 1: {
                        goz1.M(1018716220);
                        tzc.d(ibtw0, hfc0, goz1, v1 >> 24 & 14);
                        goz1.x();
                        goz2 = goz1;
                        break;
                    }
                    default: {
                        goto label_56;
                    }
                }
            }
        }
        gsb gsb0 = goz2.af();
        if(gsb0 != null) {
            gsb0.d = new tyw(txx0, uac0, hfc0, s, hel0, hyt0, f, hlm0, ibtw0, ibtw1, v);
        }
    }

    private static final void d(ibtw ibtw0, hfc hfc0, goz goz0, int v) {
        goz0.M(0x5B56071A);
        iau iau0 = dhw.a(hei.a, false);
        long v1 = gol.c(goz0);
        gzk gzk0 = goz0.ak();
        hfc hfc1 = hew.c(goz0, hfc0);
        ibth ibth0 = iej.a;
        goz0.O();
        if(goz0.x) {
            goz0.t(ibth0);
        }
        else {
            goz0.T();
        }
        int v2 = (int)(v1 ^ v1 >>> 0x20);
        guo.b(goz0, iau0, iej.e);
        guo.b(goz0, gzk0, iej.d);
        ibtw ibtw1 = iej.f;
        if(goz0.x || !ibuq.m(goz0.j(), Integer.valueOf(v2))) {
            Integer integer0 = v2;
            goz0.P(integer0);
            goz0.p(integer0, ibtw1);
        }
        guo.a(goz0, iej.g);
        guo.b(goz0, hfc1, iej.c);
        ibtw0.a(goz0, Integer.valueOf(v & 14));
        goz0.z();
        goz0.x();
    }
}

