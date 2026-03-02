import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.security.advancedprotection.AdvancedProtectionManager;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

public final class caib {
    public static final Boolean a(gra gra0) {
        return (Boolean)gra0.a();
    }

    public static final void b(gra gra0, Boolean boolean0) {
        gra0.b(boolean0);
    }

    public static final void c(gra gra0, boolean z) {
        gra0.b(Boolean.valueOf(z));
    }

    public static final boolean d(gra gra0) {
        return ((Boolean)gra0.a()).booleanValue();
    }

    public static final void e(gra gra0) {
        caib.b(gra0, null);
    }

    public static final void f(gra gra0) {
        caib.c(gra0, false);
    }

    public static final void g(Account account0, goz goz0, int v) {
        goz goz2;
        goz goz1 = goz0.ao(0xFD4D9811);
        if((((v & 6) == 0 ? (goz1.Z(account0) ? 4 : 2) | v : v) & 3) == 2 && goz1.ac()) {
            goz1.G();
            goz2 = goz1;
        }
        else {
            String s = account0 == null ? null : account0.name;
            goz1.M(0xE047E09E);
            if(s == null) {
                s = isq.c(0x7F1515DF, goz1);  // string:intrusiondetection_autofill_account "Select Google Account"
            }
            goz1.x();
            hfc hfc0 = dls.w(dla.i(hfc.e, 0.0f, 8.0f, 1));
            jbn jbn0 = fpu.d(goz1).j;
            goz2 = goz1;
            gdh.b(s, hfc0, fpu.a(goz1).f, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, jbn0, goz2, 0x30, 0, 0x1FFF8);
        }
        gsb gsb0 = goz2.af();
        if(gsb0 != null) {
            gsb0.d = new cahl(account0, v);
        }
    }

    public static final void h(caie caie0, goz goz0, int v) {
        ibuq.f(caie0, "model");
        goz goz1 = goz0.ao(482041287);
        if((((v & 6) == 0 ? (goz1.Z(caie0) ? 4 : 2) | v : v) & 3) == 2 && goz1.ac()) {
            goz1.G();
        }
        else {
            goz1.M(0x900A2A79);
            goz1.x();
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new cahk(caie0, v);
        }
    }

    public static final void i(caie caie0, goz goz0, int v) {
        bboh bboh1;
        hey hey1;
        fm fm1;
        goz goz2;
        caie caie1 = caie0;
        ibuq.f(caie1, "model");
        goz goz1 = goz0.ao(484423006);
        if((((v & 6) == 0 ? (goz1.Z(caie1) ? 4 : 2) | v : v) & 3) == 2 && goz1.ac()) {
            goz1.G();
            goz2 = goz1;
        }
        else {
            bboh bboh0 = cajd.a("IntrusionDetectionSettingsScreen");
            grx grx0 = AndroidCompositionLocals_androidKt.b;
            Context context0 = (Context)goz1.h(grx0);
            xob xob0 = (context0 instanceof xob) ? ((xob)context0) : null;
            fm fm0 = xob0 == null ? null : xob0.getSupportFragmentManager();
            lps lps0 = (lps)goz1.h(ltr.a);
            goz1.M(0x6E3C21FE);
            Object object0 = goz1.j();
            Object object1 = gop.a;
            if(object0 == object1) {
                ParcelableSnapshotMutableState parcelableSnapshotMutableState0 = new ParcelableSnapshotMutableState(null, gul.a);
                goz1.P(parcelableSnapshotMutableState0);
                object0 = parcelableSnapshotMutableState0;
            }
            goz1.x();
            goz1.M(0x6E3C21FE);
            Object object2 = goz1.j();
            if(object2 == object1) {
                ParcelableSnapshotMutableState parcelableSnapshotMutableState1 = new ParcelableSnapshotMutableState(Boolean.valueOf(false), gul.a);
                goz1.P(parcelableSnapshotMutableState1);
                object2 = parcelableSnapshotMutableState1;
            }
            goz1.x();
            goz1.M(1674057939);
            if(fm0 != null) {
                goz1.M(0x97EA02AA);
                int v1 = goz1.Z(fm0) | goz1.Z(lps0);
                Object object3 = goz1.j();
                if(v1 != 0 || object3 == object1) {
                    object3 = new caho(fm0, lps0, ((gra)object0));
                    goz1.P(object3);
                }
                goz1.x();
                gqe.b(fm0, lps0, ((ibts)object3), goz1);
            }
            goz1.x();
            AdvancedProtectionManager advancedProtectionManager0 = an..ExternalSyntheticApiModelOutline0.m(context0.getSystemService(AdvancedProtectionManager.class));
            hfc hfc0 = dls.w(hfc.e);
            iau iau0 = dhw.a(hei.a, false);
            hey hey0 = hfc.e;
            gzk gzk0 = goz1.ak();
            hfc hfc1 = hew.c(goz1, hfc0);
            ibth ibth0 = iej.a;
            goz1.O();
            int v2 = cahf.a(gol.c(goz1));
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
            dic dic0 = dic.a;
            goz1.M(0x97EA02AA);
            int v3 = goz1.Z(fm0) | goz1.Z(context0) | goz1.Z(bboh0);
            Object object4 = goz1.j();
            if(v3 != 0 || object4 == object1) {
                object4 = new caht(fm0, context0, bboh0, null);
                goz1.P(object4);
            }
            goz1.x();
            gqe.e(fm0, context0, ((ibtw)object4), goz1);
            Boolean boolean0 = caib.a(((gra)object0));
            goz1.M(-1633490746);
            boolean z = goz1.Z(caie1);
            Object object5 = goz1.j();
            if(z || object5 == object1) {
                object5 = new cahu(caie1, ((gra)object0), null);
                goz1.P(object5);
            }
            goz1.x();
            gqe.f(boolean0, ((ibtw)object5), goz1);
            goz1.M(-1224400529);
            int v4 = goz1.Z(fm0) | goz1.Z(context0) | goz1.Z(bboh0) | goz1.Z(caie1);
            Object object6 = goz1.j();
            if(v4 == 0 && object6 != object1) {
                fm1 = fm0;
                hey1 = hey0;
                bboh1 = bboh0;
            }
            else {
                bboh1 = bboh0;
                hey1 = hey0;
                cahw cahw0 = new cahw(fm0, context0, bboh1, caie0, null);
                fm1 = fm0;
                caie1 = caie0;
                goz1.P(cahw0);
                object6 = cahw0;
            }
            goz1.x();
            gqe.e(fm1, ((context0 instanceof Activity) ? ((Activity)context0) : null), ((ibtw)object6), goz1);
            Context context1 = (Context)goz1.h(grx0);
            adu adu0 = new adu();
            goz1.M(-1633490746);
            int v5 = goz1.Z(context1) | goz1.Z(caie1);
            Object object7 = goz1.j();
            if(v5 != 0 || object7 == object1) {
                object7 = new cahp(context1, caie1);
                goz1.P(object7);
            }
            goz1.x();
            aca aca0 = abn.a(adu0, ((ibts)object7), goz1);
            Object object8 = goz1.j();
            if(object8 == object1) {
                object8 = gqe.a(ibru.a, goz1);
                goz1.P(object8);
            }
            caje caje0 = caie1.f;
            int v6 = caib.d(((gra)object2)) ^ 1;
            hfc hfc2 = dla.d(dic0.a(hey1, hei.i), 16.0f);
            goz1.M(-1224400529);
            int v7 = goz1.Z(caie1) | goz1.Z(bboh1) | goz1.Z(caje0) | goz1.Z(((icck)object8)) | goz1.Z(context1) | goz1.Z(advancedProtectionManager0) | goz1.Z(aca0);
            Object object9 = goz1.j();
            if(v7 != 0 || object9 == object1) {
                cahq cahq0 = new cahq(caie1, bboh1, caje0, ((icck)object8), ((gra)object2), context1, advancedProtectionManager0, aca0);
                goz1.P(cahq0);
                object9 = cahq0;
            }
            goz1.x();
            goz2 = goz1;
            fcm.a(((ibth)object9), hfc2, ((boolean)v6), null, null, null, null, null, cagd.h, goz2, 0x30000000, 504);
            goz2.z();
        }
        gsb gsb0 = goz2.af();
        if(gsb0 != null) {
            gsb0.d = new cahr(caie1, v);
        }
    }

    public static final void j(int v, hfc hfc0, ibtw ibtw0, ibth ibth0, goz goz0, int v1, int v2) {
        int v7;
        goz goz2;
        ibth ibth2;
        ibtw ibtw2;
        hfc hfc2;
        ibth ibth1;
        ibtw ibtw1;
        hfc hfc1;
        int v3;
        goz goz1 = goz0.ao(2072524071);
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
            ibtw1 = ibtw0;
        }
        else if((v1 & 0x180) == 0) {
            ibtw1 = ibtw0;
            v3 |= (goz1.Z(ibtw1) ? 0x100 : 0x80);
        }
        else {
            ibtw1 = ibtw0;
        }
        if((v2 & 8) != 0) {
            v3 |= 0xC00;
            ibth1 = ibth0;
        }
        else if((v1 & 0xC00) == 0) {
            ibth1 = ibth0;
            v3 |= (goz1.Z(ibth1) ? 0x800 : 0x400);
        }
        else {
            ibth1 = ibth0;
        }
        if((v3 & 0x493) == 1170 && goz1.ac()) {
            goz1.G();
            hfc2 = hfc1;
            ibtw2 = ibtw1;
            ibth2 = ibth1;
            goz2 = goz1;
        }
        else {
            hfc hfc3 = (v2 & 2) == 0 ? hfc1 : hfc.e;
            ibtw ibtw3 = (v2 & 4) == 0 ? ibtw1 : cagd.g;
            ibth ibth3 = (v2 & 8) == 0 ? ibth1 : null;
            String s = isq.c(v, goz1);
            long v4 = fpu.a(goz1).f;
            long v5 = fpu.a(goz1).a;
            hfc hfc4 = dla.d(hfc3, 16.0f);
            iau iau0 = dll.b(dho.a, hei.j, goz1, 0);
            int v6 = cahf.a(gol.c(goz1));
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
            ibtw ibtw4 = iej.e;
            guo.b(goz1, iau0, ibtw4);
            ibtw ibtw5 = iej.d;
            guo.b(goz1, gzk0, ibtw5);
            ibtw ibtw6 = iej.f;
            if(goz1.x) {
                v7 = v6;
            label_69:
                Integer integer0 = v7;
                goz1.P(integer0);
                goz1.p(integer0, ibtw6);
            }
            else {
                v7 = v6;
                if(!ibuq.m(goz1.j(), Integer.valueOf(v7))) {
                    goto label_69;
                }
            }
            ibts ibts0 = iej.g;
            guo.a(goz1, ibts0);
            ibtw ibtw7 = iej.c;
            guo.b(goz1, hfc5, ibtw7);
            ibtw3.a(goz1, Integer.valueOf(v3 >> 6 & 14));
            dlv.a(dls.o(hfc.e, 16.0f), goz1);
            iau iau1 = dii.a(dho.c, hei.m, goz1, 0);
            gzk gzk1 = goz1.ak();
            hfc hfc6 = hew.c(goz1, hfc.e);
            goz1.O();
            int v8 = cahf.a(gol.c(goz1));
            if(goz1.x) {
                goz1.t(ibth4);
            }
            else {
                goz1.T();
            }
            guo.b(goz1, iau1, ibtw4);
            guo.b(goz1, gzk1, ibtw5);
            if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v8))) {
                Integer integer1 = v8;
                goz1.P(integer1);
                goz1.p(integer1, ibtw6);
            }
            guo.a(goz1, ibts0);
            guo.b(goz1, hfc6, ibtw7);
            if(ibth3 == null) {
                ibth2 = null;
                goz1.M(-955000917);
                goz2 = goz1;
                gdh.b(s, null, v4, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, fpu.d(goz1).k, goz2, 0, 0, 0x1FFFA);
                goz2.x();
            }
            else {
                goz1.M(0xC70B5B9C);
                goz1.M(0xEADCC9D);
                iwg iwg0 = new iwg(null);
                String s1 = huht.d();
                jbf jbf0 = new jbf(new jat(v5, 0L, null, null, null, null, null, 0L, null, null, null, 0L, jjz.b, null, 0xEFFE), 14);
                goz1.M(5004770);
                Object object0 = goz1.j();
                if((v3 & 0x1C00) == 0x800 || object0 == gop.a) {
                    object0 = new cahh(ibth3);
                    goz1.P(object0);
                }
                goz1.x();
                int v9 = iwg0.b(new iwz(s1, jbf0, ((ixb)object0)));
                try {
                    iwg0.j(s);
                }
                catch(Throwable throwable0) {
                    iwg0.k(v9);
                    throw throwable0;
                }
                iwg0.k(v9);
                iwj iwj0 = iwg0.d();
                goz1.x();
                ibth2 = ibth3;
                ebw.b(iwj0, null, fpu.d(goz1).k, null, 0, false, 0, 0, null, goz1, 0, 0, 0x7FA);
                goz1.x();
                goz2 = goz1;
            }
            goz2.z();
            goz2.z();
            hfc2 = hfc3;
            ibtw2 = ibtw3;
        }
        gsb gsb0 = goz2.af();
        if(gsb0 != null) {
            gsb0.d = new cahi(v, hfc2, ibtw2, ibth2, v1, v2);
        }
    }

    public static final void k(caie caie0, goz goz0, int v) {
        ibuq.f(caie0, "model");
        goz goz1 = goz0.ao(1897167082);
        if((((v & 6) == 0 ? (goz1.Z(caie0) ? 4 : 2) | v : v) & 3) == 2 && goz1.ac()) {
            goz1.G();
        }
        else {
            String s = isq.c(0x7F1515F5, goz1);  // string:intrusiondetection_title "Setup Device Protection"
            gze gze0 = gzf.e(-468487501, new cahz(caie0), goz1);
            clwl.c(s, caie0.b, null, null, null, null, cagd.a, null, cagd.b, gze0, goz1, 0x30C00000, 6, 364);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new cahj(caie0, v);
        }
    }

    public static final void l(caie caie0, goz goz0, int v) {
        goz goz1 = goz0.ao(-1889938007);
        if((((v & 6) == 0 ? (goz1.Z(caie0) ? 4 : 2) | v : v) & 3) == 2 && goz1.ac()) {
            goz1.G();
        }
        else {
            String s = isq.c(0x7F1515F3, goz1);  // string:intrusiondetection_retrieval_title "Intrusion Logging"
            jbn jbn0 = fpu.d(goz1).m;
            long v1 = fpu.a(goz1).a;
            gdh.b(s, dla.j(hfc.e, 24.0f, 24.0f, 24.0f, 0.0f, 8), v1, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, jbn0, goz1, 0, 0, 0x1FFF8);
            String s1 = isq.c(0x7F1515F4, goz1);  // string:intrusiondetection_summary "Device protection includes Intrusion Logging. 
                                                  // If you suspect a security issue, you or a trusted expert you ask for help can check 
                                                  // to see what happened and who might be responsible."
            jbn jbn1 = fpu.d(goz1).k;
            long v2 = fpu.a(goz1).f;
            gdh.b(s1, dla.f(hfc.e, 24.0f, 8.0f, 24.0f, 16.0f), v2, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, jbn1, goz1, 0, 0, 0x1FFF8);
            goz1 = goz1;
            caib.j(0x7F1515E9, null, cagd.c, null, goz1, 0x180, 10);  // string:intrusiondetection_readonly_pref_1_desc "Intrusion Logging preserves logs 
                                                                      // of some device activity in private, end-to-end encrypted storage on Google servers"
            caib.j(0x7F1515EA, null, cagd.d, null, goz1, 0x180, 10);  // string:intrusiondetection_readonly_pref_2_desc "Logs include info like device connections, 
                                                                      // network activity such as app installs, some browsing history, and when your screen 
                                                                      // was unlocked"
            caib.j(0x7F1515EB, null, cagd.e, null, goz1, 0x180, 10);  // string:intrusiondetection_readonly_pref_3_desc "Logs can only be accessed using 
                                                                      // your Google Account and the device\'s screen lock"
            caib.j(0x7F1515EC, null, cagd.f, caie0.c, goz1, 0x180, 2);  // string:intrusiondetection_readonly_pref_4_desc "Learn about Intrusion Logging"
            caib.m(caie0.d, null, goz1, 0);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new cahn(caie0, v);
        }
    }

    public static final void m(Account account0, hfc hfc0, goz goz0, int v) {
        hfc hfc1;
        goz goz1 = goz0.ao(224706279);
        int v1 = (v & 6) == 0 ? (goz1.Z(account0) ? 4 : 2) | v : v;
        if(((v1 | 0x30) & 19) == 18 && goz1.ac()) {
            goz1.G();
            hfc1 = hfc0;
        }
        else {
            hey hey0 = hfc.e;
            hfc hfc2 = dla.i(hey0, cltw.e, 0.0f, 2);
            iau iau0 = dii.a(dho.g(cltw.h), hei.m, goz1, 0);
            int v2 = cahf.a(gol.c(goz1));
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
            hfc hfc4 = dla.j(hey0, 0.0f, 24.0f, 0.0f, 0.0f, 13);
            gdh.b(isq.c(0x7F1515EE, goz1), hfc4, fpu.a(goz1).a, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, fpu.d(goz1).h, goz1, 0, 0, 0x1FFF8);  // string:intrusiondetection_resources_card_title "Google Account"
            caib.g(account0, goz1, (v1 | 0x30) & 14);
            goz1.z();
            hfc1 = hey0;
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new cahm(account0, hfc1, v);
        }
    }
}

