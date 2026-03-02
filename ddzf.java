import androidx.compose.runtime.ParcelableSnapshotMutableState;

public final class ddzf {
    public static final void a(ddbl ddbl0, hfc hfc0, long v, long v1, float f, goz goz0, int v2, int v3) {
        hey hey2;
        float f4;
        long v21;
        long v19;
        long v17;
        long v16;
        hey hey1;
        long v13;
        float f2;
        long v12;
        long v11;
        hfc hfc2;
        float f1;
        long v9;
        int v8;
        long v6;
        hfc hfc1;
        int v4;
        goz goz1 = goz0.ao(-2115671078);
        if((v3 & 1) == 0) {
            v4 = (v2 & 6) == 0 ? (((v2 & 8) == 0 ? goz1.X(ddbl0) : goz1.Z(ddbl0)) ? 4 : 2) | v2 : v2;
        }
        else {
            v4 = v2 | 6;
        }
        if((v3 & 2) != 0) {
            v4 |= 0x30;
            hfc1 = hfc0;
        }
        else if((v2 & 0x30) == 0) {
            hfc1 = hfc0;
            v4 |= (goz1.X(hfc1) ? 0x20 : 16);
        }
        else {
            hfc1 = hfc0;
        }
        int v5 = 0x80;
        if((v2 & 0x180) == 0) {
            if((v3 & 4) == 0) {
                v6 = v;
                if(goz1.W(v6)) {
                    v5 = 0x100;
                }
            }
            else {
                v6 = v;
            }
            v4 |= v5;
        }
        else {
            v6 = v;
        }
        int v7 = 0x400;
        if((v2 & 0xC00) == 0) {
            if((v3 & 8) == 0) {
                v8 = v3 & 2;
                v9 = v1;
                if(goz1.W(v9)) {
                    v7 = 0x800;
                }
            }
            else {
                v8 = v3 & 2;
                v9 = v1;
            }
            v4 |= v7;
        }
        else {
            v8 = v3 & 2;
            v9 = v1;
        }
        int v10 = v4 | 0x6000;
        if((v10 & 9363) == 9362 && goz1.ac()) {
            goz1.G();
            f1 = f;
            hfc2 = hfc1;
            v11 = v9;
            v12 = v6;
        }
        else {
            goz1.I();
            if((v2 & 1) != 0 && !goz1.aa()) {
                goz1.G();
                if((v3 & 4) != 0) {
                    v10 &= -897;
                }
                if((v3 & 8) != 0) {
                    v10 &= 0xFFFFE3FF;
                }
                f2 = f;
                v13 = v9;
            }
            else {
                if(v8 != 0) {
                    hfc1 = hfc.e;
                }
                if((v3 & 4) != 0) {
                    v10 &= -897;
                    v6 = fpu.a(goz1).a;
                }
                if((v3 & 8) != 0) {
                    v9 = fpu.a(goz1).a;
                    v10 &= 0xFFFFE3FF;
                }
                v13 = v9;
                f2 = 2.0f;
            }
            goz1.w();
            Float float0 = (ddbl0 instanceof ddbg) ? ((float)((ddbg)ddbl0).a) : null;
            gui gui0 = chg.c((float0 == null ? 0.0f : ((float)float0)), chm.c(500, 0, cif.c, 2), goz1, 0, 28);
            hey hey0 = hfc.e;
            iau iau0 = dhw.a(hei.e, false);
            int v14 = ddyo.a(gol.c(goz1));
            gzk gzk0 = goz1.ak();
            hfc hfc3 = hew.c(goz1, hey0);
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
            if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v14))) {
                Integer integer0 = v14;
                goz1.P(integer0);
                goz1.p(integer0, ibtw0);
            }
            guo.a(goz1, iej.g);
            guo.b(goz1, hfc3, iej.c);
            goz1.M(0x37800652);
            if((ddbl0 instanceof ddbj)) {
                long v15 = fpu.a(goz1).a;
                hey1 = hey0;
                v16 = v6;
                v17 = v13;
                fitn.a(dls.k(hey0, 28.0f), v15, f2, 0L, 1, 0.0f, goz1, v10 >> 6 & 0x380 | 6, 40);
                goz1 = goz1;
            }
            else {
                v16 = v6;
                hey1 = hey0;
                v17 = v13;
            }
            goz1.x();
            goz1.M(0x378027B3);
            if((ddbl0 instanceof ddbg)) {
                float f3 = ((Number)gui0.a()).floatValue() * 360.0f;
                hfc hfc4 = dls.k(hfc1, 28.0f);
                goz1.M(-1224400529);
                int v18 = ((v10 & 0x1C00 ^ 0xC00) <= 0x800 || !goz1.W(v17)) && (v10 & 0xC00) != 0x800 ? 0 : 1;
                v19 = v16;
                int v20 = (((v10 & 0x380 ^ 0x180) <= 0x100 || !goz1.W(v19)) && (v10 & 0x180) != 0x100 ? 0 : 1) | (((0xE000 & v10) == 0x4000 ? 1 : 0) | v18) | goz1.U(f3);
                Object object0 = goz1.j();
                if(v20 == 0 && object0 != gop.a) {
                    v21 = v17;
                    f4 = f2;
                }
                else {
                    f4 = f2;
                    ddyp ddyp0 = new ddyp(v17, f4, v19, f3);
                    v21 = v17;
                    goz1.P(ddyp0);
                    object0 = ddyp0;
                }
                goz1.x();
                crn.a(hfc4, ((ibts)object0), goz1, 0);
            }
            else {
                v21 = v17;
                f4 = f2;
                v19 = v16;
            }
            goz1.x();
            goz1.M(0x37806417);
            if((ddbl0 instanceof ddbk)) {
                dhw.d(cqx.a(dls.k(hfc1, 28.0f), fpu.a(goz1).a, eah.a), goz1, 0);
                hpw hpw0 = ism.a(0x7F080508, goz1, 0);  // drawable:gs_check_vd_theme_24
                long v22 = fpu.a(goz1).b;
                hey2 = hey1;
                fiso.a(hpw0, null, dls.k(hey2, 18.0f), v22, goz1, 440, 0);
            }
            else {
                hey2 = hey1;
            }
            goz1.x();
            goz1.M(0x37809908);
            if((ddbl0 instanceof ddbh)) {
                dhw.d(cqx.a(dls.k(hfc1, 28.0f), 0xFFF55E5700000000L, eah.a), goz1, 0);
                hpw hpw1 = ism.a(0x7F080571, goz1, 0);  // drawable:gs_exclamation_vd_theme_24
                long v23 = fpu.a(goz1).b;
                fiso.a(hpw1, null, dls.k(hey2, 18.0f), v23, goz1, 440, 0);
            }
            goz1.x();
            goz1.z();
            hfc2 = hfc1;
            v12 = v19;
            f1 = f4;
            v11 = v21;
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new ddyq(ddbl0, hfc2, v12, v11, f1, v2, v3);
        }
    }

    public static final void b(ddbl ddbl0, goz goz0, int v) {
        Object object11;
        Object object7;
        Object object1;
        Object object10;
        Object object6;
        int v9;
        Integer integer2;
        boolean z4;
        Object object0;
        goz goz1 = goz0.ao(0x4A0BF1DE);
        int v1 = (v & 6) == 0 ? (((v & 8) == 0 ? goz1.X(ddbl0) : goz1.Z(ddbl0)) ? 4 : 2) | v : v;
        if((v1 & 3) == 2 && goz1.ac()) {
            goz1.G();
        }
        else {
            iau iau0 = dhw.a(hei.e, false);
            int v2 = ddyo.a(gol.c(goz1));
            gzk gzk0 = goz1.ak();
            hfc hfc0 = hew.c(goz1, hfc.e);
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
            guo.b(goz1, hfc0, iej.c);
            clj clj0 = clz.d(Boolean.valueOf((ddbl0 instanceof ddbg) || (ddbl0 instanceof ddbj)), "Percentage Progress Transition", goz1, 0x30, 0);
            ddyx ddyx0 = ddyx.a;
            cmc cmc0 = cmv.c;
            if(clj0.z()) {
                goz1.M(0x635A29CD);
                goz1.x();
                object0 = clj0.f();
            }
            else {
                goz1.M(0x63564970);
                boolean z = goz1.X(clj0);
                object0 = goz1.j();
                if(z || object0 == gop.a) {
                    hbm hbm0 = hbl.a();
                    ibts ibts0 = hbm0 == null ? null : hbm0.i();
                    hbm hbm1 = hbl.b(hbm0);
                    try {
                        object1 = clj0.f();
                    }
                    finally {
                        hbl.d(hbm0, hbm1, ibts0);
                    }
                    goz1.P(object1);
                    object0 = object1;
                }
                goz1.x();
            }
            goz1.M(-647639470);
            float f = 6.0f;
            goz1.x();
            jkv jkv0 = new jkv((((Boolean)object0).booleanValue() ? 6.0f : 0.0f));
            boolean z1 = goz1.X(clj0);
            Object object2 = goz1.j();
            if(z1 || object2 == gop.a) {
                object2 = new gpx(new ddyy(clj0), null);
                goz1.P(object2);
            }
            boolean z2 = ((Boolean)((gui)object2).a()).booleanValue();
            goz1.M(-647639470);
            if(!z2) {
                f = 0.0f;
            }
            goz1.x();
            jkv jkv1 = new jkv(f);
            boolean z3 = goz1.X(clj0);
            Object object3 = goz1.j();
            if(z3 || object3 == gop.a) {
                object3 = new gpx(new ddyz(clj0), null);
                goz1.P(object3);
            }
            Integer integer1 = (int)0;
            gui gui0 = clz.g(clj0, jkv0, jkv1, ((cii)ddyx0.a(((gui)object3).a(), goz1, integer1)), cmc0, goz1, 0x30000);
            goz1.M(0xF06ADF80);
            if((ddbl0 instanceof ddbj)) {
                float f1 = ddzf.d(gui0);
                long v4 = fpu.a(goz1).a;
                long v5 = fpu.a(goz1).h;
                z4 = ddbl0 instanceof ddbg;
                integer2 = integer1;
                fitn.a(dls.k(hfc.e, 68.0f), v4, f1, v5, 1, 0.0f, goz1, 6, 0x20);
                goz1 = goz1;
            }
            else {
                integer2 = integer1;
                z4 = ddbl0 instanceof ddbg;
            }
            goz1.x();
            goz1.M(0xF06B0EB1);
            if(z4) {
                float f2 = ((ddbg)ddbl0).a;
                gui gui1 = chg.c(f2, chm.c(350, 0, null, 6), goz1, 0xC30, 20);
                float f3 = ddzf.d(gui0);
                long v6 = fpu.a(goz1).a;
                long v7 = fpu.a(goz1).c;
                goz1.M(5004770);
                boolean z5 = goz1.X(gui1);
                Object object4 = goz1.j();
                if(z5 || object4 == gop.a) {
                    object4 = new ddyr(gui1);
                    goz1.P(object4);
                }
                goz1.x();
                ddif.a(((ibth)object4), v6, f3, v7, 68.0f, goz1, 0x6000, 0);
                hfc hfc1 = cqx.c(hhi.a(dls.k(hfc.e, 50.0f), eah.a), fpu.a(goz1).O);
                iau iau1 = dhw.a(hei.e, false);
                int v8 = ddyo.a(gol.c(goz1));
                gzk gzk1 = goz1.ak();
                hfc hfc2 = hew.c(goz1, hfc1);
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
                if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v8))) {
                    Integer integer3 = v8;
                    goz1.P(integer3);
                    goz1.p(integer3, ibtw1);
                }
                guo.a(goz1, iej.g);
                guo.b(goz1, hfc2, iej.c);
                String s = isq.d(0x7F152CA7, new Object[]{ibvr.c(100.0f * f2)}, goz1);  // string:sharing_progress_number "%1$d%%"
                jbn jbn0 = fpu.d(goz1).m;
                v9 = v1;
                fiuk.b(s, null, fpu.a(goz1).Q, 0L, null, 0L, new jjy(3), 0L, 0, false, 0, 0, null, jbn0, goz1, 0, 0, 0x1FBFA);
                goz1 = goz1;
                goz1.z();
            }
            else {
                v9 = v1;
            }
            goz1.x();
            goz1.M(5004770);
            boolean z6 = (v9 & 14) == 4 || (v9 & 8) != 0 && goz1.X(ddbl0);
            Object object5 = goz1.j();
            if(z6 || object5 == gop.a) {
                ParcelableSnapshotMutableState parcelableSnapshotMutableState0 = new ParcelableSnapshotMutableState(Boolean.valueOf(ibuq.m(ddbl0, ddbk.a) || ibuq.m(ddbl0, ddbh.a)), gul.a);
                goz1.P(parcelableSnapshotMutableState0);
                object5 = parcelableSnapshotMutableState0;
            }
            goz1.x();
            clj clj1 = clz.d(((gra)object5).a(), null, goz1, 0, 2);
            ddza ddza0 = ddza.a;
            cmc cmc1 = cmv.a;
            if(clj1.z()) {
                goz1.M(0x635A29CD);
                goz1.x();
                object6 = clj1.f();
            }
            else {
                goz1.M(0x63564970);
                boolean z7 = goz1.X(clj1);
                object6 = goz1.j();
                if(z7 || object6 == gop.a) {
                    hbm hbm2 = hbl.a();
                    ibts ibts1 = hbm2 == null ? null : hbm2.i();
                    hbm hbm3 = hbl.b(hbm2);
                    try {
                        object7 = clj1.f();
                    }
                    finally {
                        hbl.d(hbm2, hbm3, ibts1);
                    }
                    goz1.P(object7);
                    object6 = object7;
                }
                goz1.x();
            }
            goz1.M(0xBF4D75B4);
            goz1.x();
            Float float0 = (float)(((Boolean)object6).booleanValue() ? 1.0f : 0.0f);
            boolean z8 = goz1.X(clj1);
            Object object8 = goz1.j();
            if(z8 || object8 == gop.a) {
                object8 = new gpx(new ddzb(clj1), null);
                goz1.P(object8);
            }
            boolean z9 = ((Boolean)((gui)object8).a()).booleanValue();
            goz1.M(0xBF4D75B4);
            goz1.x();
            Float float1 = (float)(z9 ? 1.0f : 0.0f);
            boolean z10 = goz1.X(clj1);
            Object object9 = goz1.j();
            if(z10 || object9 == gop.a) {
                object9 = new gpx(new ddzc(clj1), null);
                goz1.P(object9);
            }
            gui gui2 = clz.g(clj1, float0, float1, ((cii)ddza0.a(((gui)object9).a(), goz1, integer2)), cmc1, goz1, 0);
            int v11 = ibvr.c(((jks)goz1.h(ipa.d)).eg(16.0f));
            ddyw ddyw0 = ddyw.a;
            cmc cmc2 = cmv.g;
            if(clj1.z()) {
                goz1.M(0x635A29CD);
                goz1.x();
                object10 = clj1.f();
            }
            else {
                goz1.M(0x63564970);
                boolean z11 = goz1.X(clj1);
                object10 = goz1.j();
                if(z11 || object10 == gop.a) {
                    hbm hbm4 = hbl.a();
                    ibts ibts2 = hbm4 == null ? null : hbm4.i();
                    hbm hbm5 = hbl.b(hbm4);
                    try {
                        object11 = clj1.f();
                    }
                    finally {
                        hbl.d(hbm4, hbm5, ibts2);
                    }
                    goz1.P(object11);
                    object10 = object11;
                }
                goz1.x();
            }
            goz1.M(0x48589B83);
            goz1.x();
            jlf jlf0 = new jlf((((Boolean)object10).booleanValue() ? 0L : ((long)v11) & 0xFFFFFFFFL));
            boolean z12 = goz1.X(clj1);
            Object object12 = goz1.j();
            if(z12 || object12 == gop.a) {
                object12 = new gpx(new ddzd(clj1), null);
                goz1.P(object12);
            }
            boolean z13 = ((Boolean)((gui)object12).a()).booleanValue();
            goz1.M(0x48589B83);
            goz1.x();
            jlf jlf1 = new jlf((z13 ? 0L : ((long)v11) & 0xFFFFFFFFL));
            boolean z14 = goz1.X(clj1);
            Object object13 = goz1.j();
            if(z14 || object13 == gop.a) {
                object13 = new gpx(new ddze(clj1), null);
                goz1.P(object13);
            }
            gui gui3 = clz.g(clj1, jlf0, jlf1, ((cii)ddyw0.a(((gui)object13).a(), goz1, integer2)), cmc2, goz1, 0);
            float f4 = ((jks)goz1.h(ipa.d)).eg(4.0f);
            goz1.M(0x6E3C21FE);
            Object object14 = goz1.j();
            Object object15 = gop.a;
            if(object14 == object15) {
                object14 = chc.a(0.0f);
                goz1.P(object14);
            }
            goz1.x();
            Object object16 = ((gra)object5).a();
            goz1.M(0x97EA02AA);
            int v13 = goz1.X(((gra)object5)) | goz1.Z(((chb)object14)) | goz1.U(f4);
            Object object17 = goz1.j();
            if(v13 != 0 || object17 == object15) {
                object17 = new ddyv(((gra)object5), ((chb)object14), f4, null);
                goz1.P(object17);
            }
            goz1.x();
            gqe.f(object16, ((ibtw)object17), goz1);
            goz1.M(0xF06C2151);
            if((ddbl0 instanceof ddbk)) {
                dhw.d(cqx.c(hhi.a(dls.k(hfc.e, 68.0f), eah.a), hll.h(fpu.a(goz1).a, ddzf.c(gui2))), goz1, 0);
                hpw hpw0 = ism.a(0x7F080508, goz1, 0);  // drawable:gs_check_vd_theme_24
                long v14 = hll.h(fpu.a(goz1).b, ddzf.c(gui2));
                hfc hfc3 = dls.k(hfc.e, 44.0f);
                goz1.M(5004770);
                boolean z15 = goz1.X(gui3);
                Object object18 = goz1.j();
                if(z15 || object18 == object15) {
                    object18 = new ddys(gui3);
                    goz1.P(object18);
                }
                goz1.x();
                fiso.a(hpw0, null, dku.a(hfc3, ((ibts)object18)), v14, goz1, 56, 0);
            }
            goz1.x();
            goz1.M(0xF06C5FC6);
            if((ddbl0 instanceof ddbh)) {
                dhw.d(cqx.c(hhi.a(dls.k(hfc.e, 68.0f), eah.a), hll.h(0xFFF55E5700000000L, ddzf.c(gui2))), goz1, 0);
                hpw hpw1 = ism.a(0x7F080571, goz1, 0);  // drawable:gs_exclamation_vd_theme_24
                long v15 = hll.h(fpu.a(goz1).b, ddzf.c(gui2));
                hfc hfc4 = dls.k(hfc.e, 44.0f);
                goz1.M(5004770);
                boolean z16 = goz1.Z(((chb)object14));
                Object object19 = goz1.j();
                if(z16 || object19 == object15) {
                    object19 = new ddyt(((chb)object14));
                    goz1.P(object19);
                }
                goz1.x();
                fiso.a(hpw1, null, dku.a(hfc4, ((ibts)object19)), v15, goz1, 56, 0);
            }
            goz1.x();
            goz1.z();
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new ddyu(ddbl0, v);
        }
    }

    private static final float c(gui gui0) {
        return ((Number)gui0.a()).floatValue();
    }

    private static final float d(gui gui0) {
        return ((jkv)gui0.a()).a;
    }
}

