import androidx.compose.animation.EnterExitTransitionElement;
import androidx.compose.runtime.ParcelableSnapshotMutableState;

public final class ccf {
    public static final boolean a(clj clj0) {
        return clj0.f() == cde.c && clj0.g() == cde.c;
    }

    public static final void b(boolean z, hfc hfc0, ceq ceq0, cer cer0, String s, ibtx ibtx0, goz goz0, int v, int v1) {
        cer cer2;
        ceq ceq3;
        hfc hfc3;
        String s1;
        ibtx ibtx1;
        cer cer1;
        ceq ceq1;
        hfc hfc1;
        int v2;
        boolean z2;
        goz goz1 = goz0.ao(0xA9A6203B);
        boolean z1 = true;
        if((v & 6) == 0) {
            z2 = z;
            v2 = (goz1.Y(z2) ? 4 : 2) | v;
        }
        else {
            z2 = z;
            v2 = v;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
            hfc1 = hfc0;
        }
        else if((v & 0x30) == 0) {
            hfc1 = hfc0;
            v2 |= (goz1.X(hfc1) ? 0x20 : 16);
        }
        else {
            hfc1 = hfc0;
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
            ceq1 = ceq0;
        }
        else if((v & 0x180) == 0) {
            ceq1 = ceq0;
            v2 |= (goz1.X(ceq1) ? 0x100 : 0x80);
        }
        else {
            ceq1 = ceq0;
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
            cer1 = cer0;
        }
        else if((v & 0xC00) == 0) {
            cer1 = cer0;
            v2 |= (goz1.X(cer1) ? 0x800 : 0x400);
        }
        else {
            cer1 = cer0;
        }
        int v3 = v2 | 0x6000;
        if((0x30000 & v) == 0) {
            ibtx1 = ibtx0;
            v3 |= (goz1.Z(ibtx1) ? 0x20000 : 0x10000);
        }
        else {
            ibtx1 = ibtx0;
        }
        if((74899 & v3) == 74898) {
            z1 = false;
        }
        if(goz1.ad(z1, v3 & 1)) {
            hfc hfc2 = (v1 & 2) == 0 ? hfc1 : hfc.e;
            ceq ceq2 = (v1 & 4) == 0 ? ceq1 : cef.o(null, 3).a(cef.m(null, 15));
            if((v1 & 8) != 0) {
                cer1 = cef.u(null, 15).a(cef.p(null, 3));
            }
            clj clj0 = clz.d(Boolean.valueOf(z2), "AnimatedVisibility", goz1, v3 & 14 | v3 >> 9 & 0x70, 0);
            Object object0 = goz1.j();
            if(object0 == gop.a) {
                object0 = cbt.a;
                goz1.P(object0);
            }
            ccf.d(clj0, ((ibts)object0), hfc2, ceq2, cer1, ibtx1, goz1, v3 << 3 & 0xE000 | (v3 << 3 & 0x380 | 0x30 | v3 << 3 & 0x1C00) | v3 & 0x70000);
            s1 = "AnimatedVisibility";
            hfc3 = hfc2;
            ceq3 = ceq2;
        }
        else {
            goz1.G();
            s1 = s;
            hfc3 = hfc1;
            ceq3 = ceq1;
        }
        cer2 = cer1;
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new cbu(z, hfc3, ceq3, cer2, s1, ibtx0, v, v1);
        }
    }

    public static final void c(dlp dlp0, boolean z, hfc hfc0, ceq ceq0, cer cer0, String s, ibtx ibtx0, goz goz0, int v, int v1) {
        cer cer3;
        ceq ceq2;
        hfc hfc3;
        String s1;
        ibtx ibtx1;
        cer cer1;
        ceq ceq1;
        hfc hfc1;
        goz goz1 = goz0.ao(234057107);
        boolean z1 = true;
        int v2 = (v & 0x30) == 0 ? (goz1.Y(z) ? 0x20 : 16) | v : v;
        if((v1 & 2) != 0) {
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
        if((v1 & 4) != 0) {
            v2 |= 0xC00;
            ceq1 = ceq0;
        }
        else if((v & 0xC00) == 0) {
            ceq1 = ceq0;
            v2 |= (goz1.X(ceq1) ? 0x800 : 0x400);
        }
        else {
            ceq1 = ceq0;
        }
        if((v1 & 8) != 0) {
            v2 |= 0x6000;
            cer1 = cer0;
        }
        else if((v & 0x6000) == 0) {
            cer1 = cer0;
            v2 |= (goz1.X(cer1) ? 0x4000 : 0x2000);
        }
        else {
            cer1 = cer0;
        }
        int v3 = v2 | 0x30000;
        if((0x180000 & v) == 0) {
            ibtx1 = ibtx0;
            v3 |= (goz1.Z(ibtx1) ? 0x100000 : 0x80000);
        }
        else {
            ibtx1 = ibtx0;
        }
        if((0x92491 & v3) == 0x92490) {
            z1 = false;
        }
        if(goz1.ad(z1, v3 & 1)) {
            hfc hfc2 = (v1 & 2) == 0 ? hfc1 : hfc.e;
            if((v1 & 4) != 0) {
                ceq1 = cef.o(null, 3).a(cef.k(null, null, 15));
            }
            cer cer2 = (v1 & 8) == 0 ? cer1 : cef.p(null, 3).a(cef.s(null, null, 15));
            clj clj0 = clz.d(Boolean.valueOf(z), "AnimatedVisibility", goz1, v3 >> 12 & 0x70 | v3 >> 3 & 14, 0);
            Object object0 = goz1.j();
            if(object0 == gop.a) {
                object0 = cbv.a;
                goz1.P(object0);
            }
            ccf.d(clj0, ((ibts)object0), hfc2, ceq1, cer2, ibtx1, goz1, v3 & 0xE000 | (v3 & 0x380 | 0x30 | v3 & 0x1C00) | v3 >> 3 & 0x70000);
            s1 = "AnimatedVisibility";
            hfc3 = hfc2;
            ceq2 = ceq1;
            cer3 = cer2;
        }
        else {
            goz1.G();
            hfc3 = hfc1;
            ceq2 = ceq1;
            cer3 = cer1;
            s1 = s;
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new cbw(dlp0, z, hfc3, ceq2, cer3, s1, ibtx0, v, v1);
        }
    }

    public static final void d(clj clj0, ibts ibts0, hfc hfc0, ceq ceq0, cer cer0, ibtx ibtx0, goz goz0, int v) {
        ibtx ibtx1;
        cer cer1;
        ceq ceq1;
        goz goz1 = goz0.ao(1706321816);
        int v1 = 1;
        int v2 = (v & 6) == 0 ? (goz1.X(clj0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v2 |= (goz1.Z(ibts0) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v2 |= (goz1.X(hfc0) ? 0x100 : 0x80);
        }
        if((v & 0xC00) == 0) {
            ceq1 = ceq0;
            v2 |= (goz1.X(ceq1) ? 0x800 : 0x400);
        }
        else {
            ceq1 = ceq0;
        }
        if((v & 0x6000) == 0) {
            cer1 = cer0;
            v2 |= (goz1.X(cer1) ? 0x4000 : 0x2000);
        }
        else {
            cer1 = cer0;
        }
        if((v & 0x30000) == 0) {
            ibtx1 = ibtx0;
            v2 |= (goz1.Z(ibtx1) ? 0x20000 : 0x10000);
        }
        else {
            ibtx1 = ibtx0;
        }
        if(goz1.ad((74899 & v2) != 74898, v2 & 1)) {
            if((v2 & 14) != 4) {
                v1 = 0;
            }
            Object object0 = goz1.j();
            if((v1 | ((v2 & 0x70) == 0x20 ? 1 : 0)) != 0 || object0 == gop.a) {
                object0 = new ccc(ibts0, clj0);
                goz1.P(object0);
            }
            hfc hfc1 = hzt.a(hfc0, ((ibtx)object0));
            Object object1 = goz1.j();
            if(object1 == gop.a) {
                object1 = ccd.a;
                goz1.P(object1);
            }
            ccf.f(clj0, ibts0, hfc1, ceq1, cer1, ((ibtw)object1), ibtx1, goz1, v2 << 6 & 0x1C00000 | (v2 & 14 | 0x30000 | v2 & 0x70 | v2 & 0x1C00 | 0xE000 & v2));
        }
        else {
            goz1.G();
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new cce(clj0, ibts0, hfc0, ceq0, cer0, ibtx0, v);
        }
    }

    public static final void e(dim dim0, boolean z, hfc hfc0, ceq ceq0, cer cer0, String s, ibtx ibtx0, goz goz0, int v, int v1) {
        cer cer3;
        ceq ceq2;
        hfc hfc3;
        String s1;
        ibtx ibtx1;
        cer cer1;
        ceq ceq1;
        hfc hfc1;
        goz goz1 = goz0.ao(0x6B47FAAB);
        boolean z1 = true;
        int v2 = (v & 0x30) == 0 ? (goz1.Y(z) ? 0x20 : 16) | v : v;
        if((v1 & 2) != 0) {
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
        if((v1 & 4) != 0) {
            v2 |= 0xC00;
            ceq1 = ceq0;
        }
        else if((v & 0xC00) == 0) {
            ceq1 = ceq0;
            v2 |= (goz1.X(ceq1) ? 0x800 : 0x400);
        }
        else {
            ceq1 = ceq0;
        }
        if((v1 & 8) != 0) {
            v2 |= 0x6000;
            cer1 = cer0;
        }
        else if((v & 0x6000) == 0) {
            cer1 = cer0;
            v2 |= (goz1.X(cer1) ? 0x4000 : 0x2000);
        }
        else {
            cer1 = cer0;
        }
        int v3 = v2 | 0x30000;
        if((0x180000 & v) == 0) {
            ibtx1 = ibtx0;
            v3 |= (goz1.Z(ibtx1) ? 0x100000 : 0x80000);
        }
        else {
            ibtx1 = ibtx0;
        }
        if((0x92491 & v3) == 0x92490) {
            z1 = false;
        }
        if(goz1.ad(z1, v3 & 1)) {
            hfc hfc2 = (v1 & 2) == 0 ? hfc1 : hfc.e;
            if((v1 & 4) != 0) {
                ceq1 = cef.o(null, 3).a(cef.n(null, null, 15));
            }
            cer cer2 = (v1 & 8) == 0 ? cer1 : cef.p(null, 3).a(cef.v(null, null, 15));
            clj clj0 = clz.d(Boolean.valueOf(z), "AnimatedVisibility", goz1, v3 >> 12 & 0x70 | v3 >> 3 & 14, 0);
            Object object0 = goz1.j();
            if(object0 == gop.a) {
                object0 = cbx.a;
                goz1.P(object0);
            }
            ccf.d(clj0, ((ibts)object0), hfc2, ceq1, cer2, ibtx1, goz1, v3 & 0xE000 | (v3 & 0x380 | 0x30 | v3 & 0x1C00) | v3 >> 3 & 0x70000);
            s1 = "AnimatedVisibility";
            hfc3 = hfc2;
            ceq2 = ceq1;
            cer3 = cer2;
        }
        else {
            goz1.G();
            hfc3 = hfc1;
            ceq2 = ceq1;
            cer3 = cer1;
            s1 = s;
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new cby(dim0, z, hfc3, ceq2, cer3, s1, ibtx0, v, v1);
        }
    }

    public static final void f(clj clj0, ibts ibts0, hfc hfc0, ceq ceq0, cer cer0, ibtw ibtw0, ibtx ibtx0, goz goz0, int v) {
        cer cer2;
        ceq ceq2;
        clb clb6;
        clb clb5;
        clb clb4;
        clb clb3;
        clb clb2;
        clb clb1;
        clb clb0;
        goz goz1 = goz0.ao(0x72039C2F);
        int v1 = (v & 6) == 0 ? (goz1.X(clj0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(ibts0) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (goz1.X(hfc0) ? 0x100 : 0x80);
        }
        if((v & 0xC00) == 0) {
            v1 |= (goz1.X(ceq0) ? 0x800 : 0x400);
        }
        if((v & 0x6000) == 0) {
            v1 |= (goz1.X(cer0) ? 0x4000 : 0x2000);
        }
        if((0x30000 & v) == 0) {
            v1 |= (goz1.Z(ibtw0) ? 0x20000 : 0x10000);
        }
        int v2 = (0xC00000 & v) == 0 ? v1 | 0x180000 | (goz1.Z(ibtx0) ? 0x800000 : 0x400000) : v1 | 0x180000;
        if(goz1.ad((v2 & 0x492493) != 4793490, v2 & 1)) {
            if(!((Boolean)ibts0.a(clj0.g())).booleanValue() && !((Boolean)ibts0.a(clj0.f())).booleanValue() && !clj0.z() && !clj0.x()) {
                goz1.M(0xEFC5E6B3);
            }
            else {
                goz1.M(0xF227073D);
                int v3 = v2 & 14 | 0x30;
                boolean z = (v3 & 14 ^ 6) > 4 && goz1.X(clj0) || (v3 & 6) == 4;
                Object object0 = goz1.j();
                if(z || object0 == gop.a) {
                    object0 = clj0.f();
                    goz1.P(object0);
                }
                if(clj0.z()) {
                    object0 = clj0.f();
                }
                goz1.M(0x6DEFB3B0);
                cde cde0 = ccf.h(clj0, ibts0, object0, goz1);
                goz1.x();
                Object object1 = clj0.g();
                goz1.M(0x6DEFB3B0);
                cde cde1 = ccf.h(clj0, ibts0, object1, goz1);
                goz1.x();
                clj clj1 = clz.b(clj0, cde0, cde1, "EnterExitTransition", goz1, v3 & 14 | 0xC00);
                gui gui0 = guf.a(ibtw0, goz1);
                Object object2 = ibtw0.a(clj1.f(), clj1.g());
                int v4 = goz1.X(clj1) | goz1.X(gui0);
                Object object3 = goz1.j();
                if(v4 != 0 || object3 == gop.a) {
                    object3 = new cbs(clj1, gui0, null);
                    goz1.P(object3);
                }
                Object object4 = goz1.j();
                Object object5 = gop.a;
                if(object4 == object5) {
                    ParcelableSnapshotMutableState parcelableSnapshotMutableState0 = new ParcelableSnapshotMutableState(object2, gul.a);
                    goz1.P(parcelableSnapshotMutableState0);
                    object4 = parcelableSnapshotMutableState0;
                }
                ibom ibom0 = ibom.a;
                boolean z1 = goz1.Z(((ibtw)object3));
                Object object6 = goz1.j();
                if(z1 || object6 == object5) {
                    object6 = new gtt(((ibtw)object3), ((gra)object4), null);
                    goz1.P(object6);
                }
                gqe.f(ibom0, ((ibtw)object6), goz1);
                if(ccf.a(clj1) && ((Boolean)((gra)object4).a()).booleanValue()) {
                    goz1.M(0xEFC5E6B3);
                }
                else {
                    goz1.M(0xF236BEB3);
                    Object object7 = goz1.j();
                    if((v2 & 14) == 4 || object7 == object5) {
                        object7 = new cch(clj1);
                        goz1.P(object7);
                    }
                    Object object8 = goz1.j();
                    if(object8 == object5) {
                        object8 = cdp.a;
                        goz1.P(object8);
                    }
                    boolean z2 = goz1.X(clj1);
                    Object object9 = goz1.j();
                    if(z2 || object9 == object5) {
                        object9 = new ParcelableSnapshotMutableState(ceq0, gul.a);
                        goz1.P(object9);
                    }
                    if(clj1.f() != clj1.g() || clj1.f() != cde.b) {
                        if(clj1.g() == cde.b) {
                            cef.i(((gra)object9), cef.d(((gra)object9)).a(ceq0));
                        }
                    }
                    else if(clj1.z()) {
                        cef.i(((gra)object9), ceq0);
                    }
                    else {
                        cef.i(((gra)object9), ceq.a);
                    }
                    ceq ceq1 = cef.d(((gra)object9));
                    boolean z3 = goz1.X(clj1);
                    Object object10 = goz1.j();
                    if(z3 || object10 == object5) {
                        object10 = new ParcelableSnapshotMutableState(cer0, gul.a);
                        goz1.P(object10);
                    }
                    if(clj1.f() != clj1.g() || clj1.f() != cde.b) {
                        if(clj1.g() != cde.b) {
                            cef.j(((gra)object10), cef.h(((gra)object10)).a(cer0));
                        }
                    }
                    else if(clj1.z()) {
                        cef.j(((gra)object10), cer0);
                    }
                    else {
                        cef.j(((gra)object10), cer.a);
                    }
                    cer cer1 = cef.h(((gra)object10));
                    cgw cgw0 = ceq1.b;
                    int v5 = cgw0.c != null || cer1.b.c != null ? 1 : 0;
                    if(cgw0.b != null || cer1.b.b != null) {
                        goz1.M(0x7FA35C5);
                        cmc cmc0 = cmv.g;
                        Object object11 = goz1.j();
                        if(object11 == object5) {
                            object11 = "Built-in slide";
                            goz1.P("Built-in slide");
                        }
                        String s = (String)object11;
                        clb0 = clz.h(clj1, cmc0, goz1, 0x180);
                        goz1.x();
                    }
                    else {
                        goz1.M(0x7FBD310);
                        goz1.x();
                        clb0 = null;
                    }
                    if(v5 == 0) {
                        goz1.M(0x7FEEA87);
                        goz1.x();
                        clb1 = null;
                    }
                    else {
                        goz1.M(0x7FD399F);
                        cmc cmc1 = cmv.h;
                        Object object12 = goz1.j();
                        if(object12 == object5) {
                            object12 = "Built-in shrink/expand";
                            goz1.P("Built-in shrink/expand");
                        }
                        String s1 = (String)object12;
                        clb1 = clz.h(clj1, cmc1, goz1, 0x180);
                        goz1.x();
                    }
                    if(v5 == 0) {
                        clb2 = clb1;
                        goz1.M(0x802A3C7);
                        goz1.x();
                        clb3 = null;
                    }
                    else {
                        goz1.M(0x8000A21);
                        cmc cmc2 = cmv.g;
                        clb2 = clb1;
                        Object object13 = goz1.j();
                        if(object13 == object5) {
                            object13 = "Built-in InterruptionHandlingOffset";
                            goz1.P("Built-in InterruptionHandlingOffset");
                        }
                        String s2 = (String)object13;
                        clb3 = clz.h(clj1, cmc2, goz1, 0x180);
                        goz1.x();
                    }
                    boolean z4 = cgw0.d != null || cer1.b.d != null;
                    if(cgw0.a != null || cer1.b.a != null) {
                        goz1.M(0xD60BF483);
                        cmc cmc3 = cmv.a;
                        Object object14 = goz1.j();
                        if(object14 == object5) {
                            object14 = "Built-in alpha";
                            goz1.P("Built-in alpha");
                        }
                        String s3 = (String)object14;
                        clb4 = clz.h(clj1, cmc3, goz1, 0x180);
                        goz1.x();
                    }
                    else {
                        goz1.M(-703690136);
                        goz1.x();
                        clb4 = null;
                    }
                    if(z4) {
                        goz1.M(0xD60F92A3);
                        cmc cmc4 = cmv.a;
                        Object object15 = goz1.j();
                        if(object15 == object5) {
                            object15 = "Built-in scale";
                            goz1.P("Built-in scale");
                        }
                        String s4 = (String)object15;
                        clb5 = clz.h(clj1, cmc4, goz1, 0x180);
                        goz1.x();
                    }
                    else {
                        goz1.M(-703453048);
                        goz1.x();
                        clb5 = null;
                    }
                    if(z4) {
                        goz1.M(0xD61357E0);
                        clb6 = clz.h(clj1, cef.d, goz1, 0x180);
                        goz1.x();
                    }
                    else {
                        goz1.M(-703203064);
                        goz1.x();
                        clb6 = null;
                    }
                    int v6 = goz1.Z(clb4) | goz1.X(ceq1) | goz1.X(cer1) | goz1.Z(clb5) | goz1.X(clj1) | goz1.Z(clb6);
                    Object object16 = goz1.j();
                    if(v6 == 0 && object16 != object5) {
                        ceq2 = ceq1;
                        cer2 = cer1;
                    }
                    else {
                        ceq2 = ceq1;
                        cer2 = cer1;
                        object16 = new cdf(clb4, clb5, clj1, ceq2, cer2, clb6);
                        goz1.P(object16);
                    }
                    hey hey0 = hfc.e;
                    int v7 = goz1.Y(((boolean)(v5 ^ 1))) | goz1.X(((ibth)object8));
                    Object object17 = goz1.j();
                    if(v7 != 0 || object17 == object5) {
                        object17 = new cdq(((boolean)(v5 ^ 1)), ((ibth)object8));
                        goz1.P(object17);
                    }
                    hfc hfc1 = hlv.a(hey0, ((ibts)object17)).a(new EnterExitTransitionElement(clj1, clb2, clb3, clb0, ceq2, cer2, ((ibth)object8), ((cdf)object16)));
                    goz1.M(0xFF8EA177);
                    goz1.x();
                    hfc hfc2 = hfc0.a(hfc1.a(hey0));
                    Object object18 = goz1.j();
                    if(object18 == object5) {
                        object18 = new cbo(((cch)object7));
                        goz1.P(object18);
                    }
                    long v8 = gol.c(goz1);
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
                    int v9 = (int)(v8 ^ v8 >>> 0x20);
                    guo.b(goz1, ((cbo)object18), iej.e);
                    guo.b(goz1, gzk0, iej.d);
                    ibtw ibtw1 = iej.f;
                    if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v9))) {
                        Integer integer0 = v9;
                        goz1.P(integer0);
                        goz1.p(integer0, ibtw1);
                    }
                    guo.a(goz1, iej.g);
                    guo.b(goz1, hfc3, iej.c);
                    ibtx0.a(((cch)object7), goz1, Integer.valueOf(v2 >> 18 & 0x70));
                    goz1.z();
                }
                goz1.x();
            }
            goz1.x();
        }
        else {
            goz1.G();
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new cbp(clj0, ibts0, hfc0, ceq0, cer0, ibtw0, ibtx0, v);
        }
    }

    public static final void g(cjh cjh0, hfc hfc0, ceq ceq0, cer cer0, String s, ibtx ibtx0, goz goz0, int v) {
        cer cer2;
        hfc hfc1;
        String s1;
        ibtx ibtx1;
        ceq ceq1;
        goz goz1 = goz0.ao(0x272964F3);
        boolean z = true;
        int v1 = ((v & 6) == 0 ? (((v & 8) == 0 ? goz1.X(cjh0) : goz1.Z(cjh0)) ? 4 : 2) | v : v) | 0x30;
        if((v & 0x180) == 0) {
            ceq1 = ceq0;
            v1 |= (goz1.X(ceq1) ? 0x100 : 0x80);
        }
        else {
            ceq1 = ceq0;
        }
        int v2 = v1 | 0x6C00;
        if((0x30000 & v) == 0) {
            ibtx1 = ibtx0;
            v2 |= (goz1.Z(ibtx1) ? 0x20000 : 0x10000);
        }
        else {
            ibtx1 = ibtx0;
        }
        if((74899 & v2) == 74898) {
            z = false;
        }
        if(goz1.ad(z, v2 & 1)) {
            hey hey0 = hfc.e;
            cer cer1 = cef.p(null, 3).a(cef.u(null, 15));
            clj clj0 = clz.c(cjh0, "AnimatedVisibility", goz1, v2 & 14 | v2 >> 9 & 0x70, 0);
            Object object0 = goz1.j();
            if(object0 == gop.a) {
                object0 = cbz.a;
                goz1.P(object0);
            }
            ccf.d(clj0, ((ibts)object0), hey0, ceq1, cer1, ibtx1, goz1, v2 << 3 & 0xE000 | (v2 << 3 & 0x380 | 0x30 | v2 << 3 & 0x1C00) | v2 & 0x70000);
            s1 = "AnimatedVisibility";
            hfc1 = hey0;
            cer2 = cer1;
        }
        else {
            goz1.G();
            hfc1 = hfc0;
            cer2 = cer0;
            s1 = s;
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new cca(cjh0, hfc1, ceq0, cer2, s1, ibtx0, v);
        }
    }

    private static final cde h(clj clj0, ibts ibts0, Object object0, goz goz0) {
        cde cde0;
        goz0.K(0xE6D15FA7, clj0);
        if(clj0.z()) {
            goz0.M(0xF35AE61F);
            goz0.x();
            if(((Boolean)ibts0.a(object0)).booleanValue()) {
                cde0 = cde.b;
            }
            else if(((Boolean)ibts0.a(clj0.f())).booleanValue()) {
                cde0 = cde.c;
            }
            else {
                cde0 = cde.a;
            }
        }
        else {
            goz0.M(0xF35F14F4);
            Object object1 = goz0.j();
            if(object1 == gop.a) {
                ParcelableSnapshotMutableState parcelableSnapshotMutableState0 = new ParcelableSnapshotMutableState(Boolean.valueOf(false), gul.a);
                goz0.P(parcelableSnapshotMutableState0);
                object1 = parcelableSnapshotMutableState0;
            }
            if(((Boolean)ibts0.a(clj0.f())).booleanValue()) {
                ((gra)object1).b(Boolean.valueOf(true));
            }
            if(((Boolean)ibts0.a(object0)).booleanValue()) {
                cde0 = cde.b;
            }
            else {
                cde0 = ((Boolean)((gra)object1).a()).booleanValue() ? cde.c : cde.a;
            }
            goz0.x();
        }
        goz0.x();
        return cde0;
    }
}

