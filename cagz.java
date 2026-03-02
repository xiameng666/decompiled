import android.accounts.Account;
import android.content.Context;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import j..time.LocalDate;

public final class cagz {
    public static final Boolean a(gra gra0) {
        return (Boolean)gra0.a();
    }

    public static final void b(gra gra0, Boolean boolean0) {
        gra0.b(boolean0);
    }

    public static final void c(Account account0, goz goz0, int v) {
        goz goz2;
        goz goz1 = goz0.ao(-52989010);
        if((((v & 6) == 0 ? v | (goz1.Z(account0) ? 4 : 2) : v) & 3) == 2 && goz1.ac()) {
            goz1.G();
            goz2 = goz1;
        }
        else {
            String s = isq.c(0x7F1515EE, goz1);  // string:intrusiondetection_resources_card_title "Google Account"
            hfc hfc0 = dla.i(dla.i(hfc.e, 0.0f, 8.0f, 1), 14.0f, 0.0f, 2);
            jbn jbn0 = fpu.d(goz1).l;
            long v1 = fpu.a(goz1).a;
            hey hey0 = hfc.e;
            gdh.b(s, hfc0, v1, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, jbn0, goz1, 0x30, 0, 0x1FFF8);
            String s1 = account0 == null ? null : account0.name;
            goz1.M(0x24C969BE);
            if(s1 == null) {
                s1 = isq.c(0x7F1515E8, goz1);  // string:intrusiondetection_no_account_selected "No Google account"
            }
            goz1.x();
            goz2 = goz1;
            gdh.b(s1, dla.j(dla.i(dla.i(hey0, 0.0f, 8.0f, 1), 14.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 12.0f, 7), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, fpu.d(goz1).j, goz2, 0x30, 0, 0x1FFFC);
        }
        gsb gsb0 = goz2.af();
        if(gsb0 != null) {
            gsb0.d = new cagh(account0, v);
        }
    }

    public static final void d(ibts ibts0, cahe cahe0, String s, long v, goz goz0, int v1) {
        goz goz3;
        Boolean boolean1;
        String s3;
        Context context1;
        Object object6;
        aca aca1;
        goz goz2;
        ibuq.f(ibts0, "downloadLogsClick");
        ibuq.f(cahe0, "uiModel");
        ibuq.f(s, "deviceName");
        goz goz1 = goz0.ao(1435604808);
        int v2 = (v1 & 6) == 0 ? (goz1.Z(ibts0) ? 4 : 2) | v1 : v1;
        if((v1 & 0x30) == 0) {
            v2 |= (goz1.Z(cahe0) ? 0x20 : 16);
        }
        if((v1 & 0x180) == 0) {
            v2 |= (goz1.X(s) ? 0x100 : 0x80);
        }
        if((v1 & 0xC00) == 0) {
            v2 |= (goz1.W(v) ? 0x800 : 0x400);
        }
        if((v2 & 0x493) == 1170 && goz1.ac()) {
            goz1.G();
            goz2 = goz1;
        }
        else {
            caje caje0 = cahe0.h;
            Object object0 = goz1.j();
            Object object1 = gop.a;
            if(object0 == object1) {
                object0 = gqe.a(ibru.a, goz1);
                goz1.P(object0);
            }
            Context context0 = (Context)goz1.h(AndroidCompositionLocals_androidKt.b);
            fm fm0 = null;
            String s1 = cahe0.f == null ? null : cahe0.f.name;
            lps lps0 = (lps)goz1.h(ltr.a);
            String s2 = a.u(v, "biometricAuthRequest");
            goz1.M(0x6E3C21FE);
            Object object2 = goz1.j();
            if(object2 == object1) {
                ParcelableSnapshotMutableState parcelableSnapshotMutableState0 = new ParcelableSnapshotMutableState(null, gul.a);
                goz1.P(parcelableSnapshotMutableState0);
                object2 = parcelableSnapshotMutableState0;
            }
            goz1.x();
            xob xob0 = (context0 instanceof xob) ? ((xob)context0) : null;
            if(xob0 != null) {
                fm0 = xob0.getSupportFragmentManager();
            }
            goz1.M(931744070);
            adu adu0 = new adu();
            goz1.M(-1633490746);
            int v3 = goz1.Z(fm0) | goz1.X(s2);
            Object object3 = goz1.j();
            if(v3 != 0 || object3 == object1) {
                object3 = new cagm(fm0, s2);
                goz1.P(object3);
            }
            goz1.x();
            aca aca0 = abn.a(adu0, ((ibts)object3), goz1);
            goz1.x();
            goz1.M(0x378994CF);
            if(fm0 != null) {
                goz1.M(-1224400529);
                int v4 = goz1.Z(fm0) | goz1.X(s2) | goz1.Z(lps0);
                Object object4 = goz1.j();
                if(v4 != 0 || object4 == object1) {
                    object4 = new cagn(fm0, s2, lps0, ((gra)object2));
                    goz1.P(object4);
                }
                goz1.x();
                gqe.b(fm0, lps0, ((ibts)object4), goz1);
            }
            goz1.x();
            Boolean boolean0 = cagz.a(((gra)object2));
            goz1.M(-1224400529);
            int v5 = goz1.Z(context0) | goz1.Z(ibts0);
            int v6 = (v2 & 0x380) == 0x100 ? 1 : 0;
            Object object5 = goz1.j();
            if((v5 | v6) == 0 && object5 != object1) {
                aca1 = aca0;
                object6 = object1;
                context1 = context0;
                s3 = s2;
                boolean1 = boolean0;
            }
            else {
                context1 = context0;
                s3 = s2;
                aca1 = aca0;
                object6 = object1;
                boolean1 = boolean0;
                object5 = new cags(context1, ibts0, s, ((gra)object2), null);
                goz1.P(object5);
            }
            goz1.x();
            gqe.f(boolean1, ((ibtw)object5), goz1);
            hfc hfc0 = dla.j(iqn.a(hfc.e, a.u(v, "downloadButton")), 0.0f, 0.0f, 0.0f, 12.0f, 7);
            goz1.M(-1224400529);
            int v7 = goz1.X(s1) | goz1.Z(caje0) | goz1.Z(((icck)object0)) | goz1.Z(fm0) | goz1.X(s3) | goz1.Z(aca1) | goz1.Z(context1);
            Object object7 = goz1.j();
            if((v7 | v6) == 0 && object7 != object6) {
                goz3 = goz1;
            }
            else {
                goz3 = goz1;
                cago cago0 = new cago(s1, caje0, ((icck)object0), fm0, s3, aca1, context1, s);
                goz3.P(cago0);
                object7 = cago0;
            }
            goz3.x();
            goz2 = goz3;
            fcm.a(((ibth)object7), hfc0, false, null, null, null, null, null, cafu.b, goz2, 0x30000000, 508);
        }
        gsb gsb0 = goz2.af();
        if(gsb0 != null) {
            gsb0.d = new cagp(ibts0, cahe0, s, v, v1);
        }
    }

    public static final void e(cahe cahe0, goz goz0, int v) {
        ibuq.f(cahe0, "model");
        goz goz1 = goz0.ao(0xC0BEDC21);
        if((((v & 6) == 0 ? (goz1.Z(cahe0) ? 4 : 2) | v : v) & 3) == 2 && goz1.ac()) {
            goz1.G();
        }
        else {
            String s = isq.c(0x7F1515F3, goz1);  // string:intrusiondetection_retrieval_title "Intrusion Logging"
            gze gze0 = gzf.e(-158555720, new cagx(cahe0), goz1);
            clwl.c(s, false, null, null, null, null, cafu.a, null, null, gze0, goz1, 0xC00000, 6, 894);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new cagl(cahe0, v);
        }
    }

    public static final void f(int v, hfc hfc0, ibth ibth0, goz goz0, int v1, int v2) {
        ibth ibth2;
        hfc hfc2;
        ibth ibth1;
        hfc hfc1;
        int v3;
        goz goz1 = goz0.ao(0x7BF6FE77);
        if((v2 & 1) == 0) {
            v3 = (v1 & 6) == 0 ? (goz1.V(v) ? 4 : 2) | v1 : v1;
        }
        else {
            v3 = v1 | 6;
        }
        if((v2 & 2) != 0) {
            v3 |= 0x30;
            hfc1 = hfc0;
        }
        else if((v1 & 0x30) == 0) {
            hfc1 = hfc0;
            v3 |= (goz1.X(hfc1) ? 0x20 : 16);
        }
        else {
            hfc1 = hfc0;
        }
        if((v2 & 4) != 0) {
            v3 |= 0x180;
            ibth1 = ibth0;
        }
        else if((v1 & 0x180) == 0) {
            ibth1 = ibth0;
            v3 |= (goz1.Z(ibth1) ? 0x100 : 0x80);
        }
        else {
            ibth1 = ibth0;
        }
        if((v3 & 0x93) == 0x92 && goz1.ac()) {
            goz1.G();
            hfc2 = hfc1;
            ibth2 = ibth1;
        }
        else {
            hfc hfc3 = (v2 & 2) == 0 ? hfc1 : hfc.e;
            ibth ibth3 = (v2 & 4) == 0 ? ibth1 : null;
            String s = isq.c(v, goz1);
            long v4 = fpu.a(goz1).f;
            long v5 = fpu.a(goz1).a;
            hfc hfc4 = dla.f(hfc3, 0.0f, 16.0f, 16.0f, 16.0f);
            iau iau0 = dll.b(dho.a, hei.j, goz1, 0);
            int v6 = cagf.a(gol.c(goz1));
            gzk gzk0 = goz1.ak();
            hfc hfc5 = hew.c(goz1, hfc4);
            ibth ibth4 = iej.a;
            goz1.O();
            if(goz1.x) {
                goz1.t(ibth4);
            }
            else {
                goz1.T();
            }
            ibtw ibtw0 = iej.e;
            guo.b(goz1, iau0, ibtw0);
            ibtw ibtw1 = iej.d;
            guo.b(goz1, gzk0, ibtw1);
            ibtw ibtw2 = iej.f;
            if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v6))) {
                Integer integer0 = v6;
                goz1.P(integer0);
                goz1.p(integer0, ibtw2);
            }
            ibts ibts0 = iej.g;
            guo.a(goz1, ibts0);
            ibtw ibtw3 = iej.c;
            guo.b(goz1, hfc5, ibtw3);
            dlv.a(dls.o(hfc.e, 16.0f), goz1);
            iau iau1 = dii.a(dho.c, hei.m, goz1, 0);
            gzk gzk1 = goz1.ak();
            hfc hfc6 = hew.c(goz1, hfc.e);
            goz1.O();
            int v7 = cagf.a(gol.c(goz1));
            if(goz1.x) {
                goz1.t(ibth4);
            }
            else {
                goz1.T();
            }
            guo.b(goz1, iau1, ibtw0);
            guo.b(goz1, gzk1, ibtw1);
            if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v7))) {
                Integer integer1 = v7;
                goz1.P(integer1);
                goz1.p(integer1, ibtw2);
            }
            guo.a(goz1, ibts0);
            guo.b(goz1, hfc6, ibtw3);
            if(ibth3 == null) {
                ibth2 = null;
                goz1.M(0x8B6328DB);
                gdh.b(s, null, v4, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, fpu.d(goz1).k, goz1, 0, 0, 0x1FFFA);
                goz1 = goz1;
            }
            else {
                goz1.M(0x8B5AACCC);
                goz1.M(0x6797956D);
                iwg iwg0 = new iwg(null);
                String s1 = huht.d();
                jbf jbf0 = new jbf(new jat(v5, 0L, null, null, null, null, null, 0L, null, null, null, 0L, jjz.b, null, 0xEFFE), 14);
                goz1.M(5004770);
                Object object0 = goz1.j();
                if((v3 & 0x380) == 0x100 || object0 == gop.a) {
                    object0 = new cagj(ibth3);
                    goz1.P(object0);
                }
                goz1.x();
                int v8 = iwg0.b(new iwz(s1, jbf0, ((ixb)object0)));
                try {
                    iwg0.j(s);
                }
                catch(Throwable throwable0) {
                    iwg0.k(v8);
                    throw throwable0;
                }
                iwg0.k(v8);
                ibth2 = ibth3;
                iwj iwj0 = iwg0.d();
                goz1.x();
                ebw.b(iwj0, null, fpu.d(goz1).k, null, 0, false, 0, 0, null, goz1, 0, 0, 0x7FA);
            }
            goz1.x();
            goz1.z();
            goz1.z();
            hfc2 = hfc3;
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new cagk(v, hfc2, ibth2, v1, v2);
        }
    }

    public static final void g(hfc hfc0, ibts ibts0, String s, LocalDate localDate0, cahe cahe0, long v, goz goz0, int v1) {
        hfc hfc2;
        goz goz2;
        hfc hfc1;
        ibts ibts1;
        goz goz1 = goz0.ao(-935174804);
        int v2 = v1 | 6;
        if((v1 & 0x30) == 0) {
            ibts1 = ibts0;
            v2 |= (goz1.Z(ibts1) ? 0x20 : 16);
        }
        else {
            ibts1 = ibts0;
        }
        if((v1 & 0x180) == 0) {
            v2 |= (goz1.X(s) ? 0x100 : 0x80);
        }
        if((v1 & 0xC00) == 0) {
            v2 |= (goz1.Z(localDate0) ? 0x800 : 0x400);
        }
        if((v1 & 0x6000) == 0) {
            v2 |= (goz1.Y(false) ? 0x4000 : 0x2000);
        }
        if((0x30000 & v1) == 0) {
            v2 |= (goz1.Z(cahe0) ? 0x20000 : 0x10000);
        }
        if((0x180000 & v1) == 0) {
            v2 |= (goz1.W(v) ? 0x100000 : 0x80000);
        }
        if((v2 & 0x92493) == 0x92492 && goz1.ac()) {
            goz1.G();
            hfc1 = hfc0;
            goz2 = goz1;
        }
        else {
            goz1.I();
            if((v1 & 1) != 0 && !goz1.aa()) {
                goz1.G();
                hfc2 = hfc0;
            }
            else {
                hfc2 = hfc.e;
            }
            goz1.w();
            goz2 = goz1;
            clyd.c(dla.i(dla.i(hfc2, 0.0f, 12.0f, 1), 24.0f, 0.0f, 2), null, null, null, 0L, gzf.e(-519890087, new cagr(hfc2, s, localDate0, cahe0, ibts1, v), goz1), goz2, 0x30C00, 22);
            hfc1 = hfc2;
        }
        gsb gsb0 = goz2.af();
        if(gsb0 != null) {
            gsb0.d = new cagi(hfc1, ibts0, s, localDate0, cahe0, v, v1);
        }
    }
}

