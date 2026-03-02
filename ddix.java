import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.google.android.gms.nearby.sharing.ShareTarget;

public final class ddix {
    public static final void a(ddbl ddbl0, ddbp ddbp0, ShareTarget shareTarget0, goz goz0, int v) {
        Object object15;
        Object object11;
        Object object5;
        Object object1;
        Object object14;
        Object object10;
        Integer integer2;
        int v8;
        Object object4;
        Object object0;
        ibuq.f(shareTarget0, "shareTarget");
        goz goz1 = goz0.ao(0x2ED031B9);
        int v1 = (v & 6) == 0 ? (goz1.X(ddbl0) ? 4 : 2) | v : v;
        if((v & 0x180) == 0) {
            v1 |= (goz1.Z(shareTarget0) ? 0x100 : 0x80);
        }
        if((v1 & 0x83) == 130 && goz1.ac()) {
            goz1.G();
        }
        else {
            iau iau0 = dhw.a(hei.e, false);
            long v2 = gol.c(goz1);
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
            int v3 = (int)(v2 ^ v2 >>> 0x20);
            guo.b(goz1, iau0, iej.e);
            guo.b(goz1, gzk0, iej.d);
            ibtw ibtw0 = iej.f;
            if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v3))) {
                Integer integer0 = v3;
                goz1.P(integer0);
                goz1.p(integer0, ibtw0);
            }
            guo.a(goz1, iej.g);
            guo.b(goz1, hfc0, iej.c);
            clj clj0 = clz.d(Boolean.valueOf((ddbl0 instanceof ddbg) || (ddbl0 instanceof ddbj)), "Avatar Progress Transition", goz1, 0x30, 0);
            ddip ddip0 = ddip.a;
            cmc cmc0 = cmv.a;
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
            goz1.M(-1801591133);
            float f = 1.0f;
            goz1.x();
            Float float0 = (float)(((Boolean)object0).booleanValue() ? 0.733333f : 1.0f);
            boolean z1 = goz1.X(clj0);
            Object object2 = goz1.j();
            if(z1 || object2 == gop.a) {
                gpx gpx0 = new gpx(new ddiq(clj0), null);
                goz1.P(gpx0);
                object2 = gpx0;
            }
            boolean z2 = ((Boolean)((gui)object2).a()).booleanValue();
            goz1.M(-1801591133);
            goz1.x();
            Float float1 = (float)(z2 ? 0.733333f : 1.0f);
            boolean z3 = goz1.X(clj0);
            Object object3 = goz1.j();
            if(z3 || object3 == gop.a) {
                object3 = new gpx(new ddir(clj0), null);
                goz1.P(object3);
            }
            Integer integer1 = (int)0;
            gui gui0 = clz.g(clj0, float0, float1, ((cii)ddip0.a(((gui)object3).a(), goz1, integer1)), cmc0, goz1, 0x30000);
            ddim ddim0 = ddim.a;
            cmc cmc1 = cmv.c;
            if(clj0.z()) {
                goz1.M(0x635A29CD);
                goz1.x();
                object4 = clj0.f();
            }
            else {
                goz1.M(0x63564970);
                boolean z4 = goz1.X(clj0);
                object4 = goz1.j();
                if(z4 || object4 == gop.a) {
                    hbm hbm2 = hbl.a();
                    ibts ibts1 = hbm2 == null ? null : hbm2.i();
                    hbm hbm3 = hbl.b(hbm2);
                    try {
                        object5 = clj0.f();
                    }
                    finally {
                        hbl.d(hbm2, hbm3, ibts1);
                    }
                    goz1.P(object5);
                    object4 = object5;
                }
                goz1.x();
            }
            goz1.M(606604589);
            goz1.x();
            jkv jkv0 = new jkv((((Boolean)object4).booleanValue() ? 4.0f : 0.0f));
            boolean z5 = goz1.X(clj0);
            Object object6 = goz1.j();
            if(z5 || object6 == gop.a) {
                object6 = new gpx(new ddin(clj0), null);
                goz1.P(object6);
            }
            boolean z6 = ((Boolean)((gui)object6).a()).booleanValue();
            goz1.M(606604589);
            goz1.x();
            jkv jkv1 = new jkv((z6 ? 4.0f : 0.0f));
            boolean z7 = goz1.X(clj0);
            Object object7 = goz1.j();
            if(z7 || object7 == gop.a) {
                object7 = new gpx(new ddio(clj0), null);
                goz1.P(object7);
            }
            gui gui1 = clz.g(clj0, jkv0, jkv1, ((cii)ddim0.a(((gui)object7).a(), goz1, integer1)), cmc1, goz1, 0x30000);
            goz1.M(396787034);
            if((ddbl0 instanceof ddbj)) {
                float f1 = ddix.b(gui1);
                long v6 = fpu.a(goz1).f;
                long v7 = fpu.a(goz1).B;
                v8 = v1;
                integer2 = integer1;
                fitn.a(dls.k(hfc.e, 60.0f), v6, f1, v7, 1, 0.0f, goz1, 6, 0x20);
                goz1 = goz1;
            }
            else {
                v8 = v1;
                integer2 = integer1;
            }
            goz1.x();
            goz1.M(0x17A6A9E3);
            if((ddbl0 instanceof ddbg)) {
                cmb cmb0 = chm.c(350, 0, null, 6);
                gui gui2 = chg.c(((ddbg)ddbl0).a, cmb0, goz1, 0x30, 28);
                float f2 = ddix.b(gui1);
                long v9 = fpu.a(goz1).f;
                long v10 = fpu.a(goz1).B;
                goz1.M(5004770);
                boolean z8 = goz1.X(gui2);
                Object object8 = goz1.j();
                if(z8 || object8 == gop.a) {
                    object8 = new ddig(gui2);
                    goz1.P(object8);
                }
                goz1.x();
                ddif.a(((ibth)object8), v9, f2, v10, 60.0f, goz1, 0x6000, 0);
                goz1 = goz1;
            }
            goz1.x();
            ddbf.h(shareTarget0, ((Number)gui0.a()).floatValue() * 60.0f, goz1, v8 >> 6 & 14);
            goz1.M(5004770);
            Object object9 = goz1.j();
            if((v8 & 14) == 4 || object9 == gop.a) {
                ParcelableSnapshotMutableState parcelableSnapshotMutableState0 = new ParcelableSnapshotMutableState(Boolean.valueOf((ddbl0 instanceof ddbk) || (ddbl0 instanceof ddbh)), gul.a);
                goz1.P(parcelableSnapshotMutableState0);
                object9 = parcelableSnapshotMutableState0;
            }
            goz1.x();
            clj clj1 = clz.d(((gra)object9).a(), null, goz1, 0, 2);
            ddis ddis0 = ddis.a;
            cmc cmc2 = cmv.a;
            if(clj1.z()) {
                goz1.M(0x635A29CD);
                goz1.x();
                object10 = clj1.f();
            }
            else {
                goz1.M(0x63564970);
                boolean z9 = goz1.X(clj1);
                object10 = goz1.j();
                if(z9 || object10 == gop.a) {
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
            goz1.M(0x4577620F);
            goz1.x();
            Float float2 = (float)(((Boolean)object10).booleanValue() ? 1.0f : 0.0f);
            boolean z10 = goz1.X(clj1);
            Object object12 = goz1.j();
            if(z10 || object12 == gop.a) {
                gpx gpx1 = new gpx(new ddit(clj1), null);
                goz1.P(gpx1);
                object12 = gpx1;
            }
            boolean z11 = ((Boolean)((gui)object12).a()).booleanValue();
            goz1.M(0x4577620F);
            if(!z11) {
                f = 0.0f;
            }
            goz1.x();
            Float float3 = f;
            boolean z12 = goz1.X(clj1);
            Object object13 = goz1.j();
            if(z12 || object13 == gop.a) {
                object13 = new gpx(new ddiu(clj1), null);
                goz1.P(object13);
            }
            gui gui3 = clz.g(clj1, float2, float3, ((cii)ddis0.a(((gui)object13).a(), goz1, integer2)), cmc2, goz1, 0);
            int v12 = ibvr.c(((jks)goz1.h(ipa.d)).eg(16.0f));
            ddil ddil0 = ddil.a;
            cmc cmc3 = cmv.g;
            if(clj1.z()) {
                goz1.M(0x635A29CD);
                goz1.x();
                object14 = clj1.f();
            }
            else {
                goz1.M(0x63564970);
                boolean z13 = goz1.X(clj1);
                object14 = goz1.j();
                if(z13 || object14 == gop.a) {
                    hbm hbm6 = hbl.a();
                    ibts ibts3 = hbm6 == null ? null : hbm6.i();
                    hbm hbm7 = hbl.b(hbm6);
                    try {
                        object15 = clj1.f();
                    }
                    finally {
                        hbl.d(hbm6, hbm7, ibts3);
                    }
                    goz1.P(object15);
                    object14 = object15;
                }
                goz1.x();
            }
            goz1.M(-1350250210);
            goz1.x();
            jlf jlf0 = new jlf((((Boolean)object14).booleanValue() ? 0L : ((long)v12) & 0xFFFFFFFFL));
            boolean z14 = goz1.X(clj1);
            Object object16 = goz1.j();
            if(z14 || object16 == gop.a) {
                object16 = new gpx(new ddiv(clj1), null);
                goz1.P(object16);
            }
            boolean z15 = ((Boolean)((gui)object16).a()).booleanValue();
            goz1.M(-1350250210);
            goz1.x();
            jlf jlf1 = new jlf((z15 ? 0L : ((long)v12) & 0xFFFFFFFFL));
            boolean z16 = goz1.X(clj1);
            Object object17 = goz1.j();
            if(z16 || object17 == gop.a) {
                object17 = new gpx(new ddiw(clj1), null);
                goz1.P(object17);
            }
            gui gui4 = clz.g(clj1, jlf0, jlf1, ((cii)ddil0.a(((gui)object17).a(), goz1, integer2)), cmc3, goz1, 0);
            float f3 = ((jks)goz1.h(ipa.d)).eg(4.0f);
            goz1.M(0x6E3C21FE);
            Object object18 = goz1.j();
            Object object19 = gop.a;
            if(object18 == object19) {
                object18 = chc.a(0.0f);
                goz1.P(object18);
            }
            goz1.x();
            Object object20 = ((gra)object9).a();
            goz1.M(0x97EA02AA);
            int v14 = goz1.X(((gra)object9)) | goz1.Z(((chb)object18)) | goz1.U(f3);
            Object object21 = goz1.j();
            if(v14 != 0 || object21 == object19) {
                object21 = new ddik(((gra)object9), ((chb)object18), f3, null);
                goz1.P(object21);
            }
            goz1.x();
            gqe.f(object20, ((ibtw)object21), goz1);
            goz1.M(0x17A77E07);
            if((ddbl0 instanceof ddbk)) {
                dhw.d(cqx.a(dls.k(hfc.e, 60.0f), hll.h(ddhw.a(goz1).e, ddix.c(gui3)), eah.a), goz1, 0);
                hpw hpw0 = ism.a(0x7F080508, goz1, 0);  // drawable:gs_check_vd_theme_24
                float f4 = ddix.c(gui3);
                long v15 = hll.h(hll.e, f4);
                hfc hfc1 = dls.k(hfc.e, 32.0f);
                goz1.M(5004770);
                boolean z17 = goz1.X(gui4);
                Object object22 = goz1.j();
                if(z17 || object22 == object19) {
                    object22 = new ddih(gui4);
                    goz1.P(object22);
                }
                goz1.x();
                fiso.a(hpw0, null, dku.a(hfc1, ((ibts)object22)), v15, goz1, 56, 0);
            }
            goz1.x();
            goz1.M(0x17A7BFE3);
            if((ddbl0 instanceof ddbh)) {
                dhw.d(cqx.a(dls.k(hfc.e, 60.0f), hll.h(ddhw.a(goz1).w, ddix.c(gui3)), eah.a), goz1, 0);
                hpw hpw1 = ism.a(0x7F080571, goz1, 0);  // drawable:gs_exclamation_vd_theme_24
                float f5 = ddix.c(gui3);
                long v16 = hll.h(hll.e, f5);
                hfc hfc2 = dls.k(hfc.e, 32.0f);
                goz1.M(5004770);
                boolean z18 = goz1.Z(((chb)object18));
                Object object23 = goz1.j();
                if(z18 || object23 == object19) {
                    object23 = new ddii(((chb)object18));
                    goz1.P(object23);
                }
                goz1.x();
                fiso.a(hpw1, null, dku.a(hfc2, ((ibts)object23)), v16, goz1, 56, 0);
            }
            goz1.x();
            goz1.z();
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new ddij(ddbl0, ddbp0, shareTarget0, v);
        }
    }

    private static final float b(gui gui0) {
        return ((jkv)gui0.a()).a;
    }

    private static final float c(gui gui0) {
        return ((Number)gui0.a()).floatValue();
    }
}

