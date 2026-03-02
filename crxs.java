import android.app.Notification.Action.Builder;
import android.app.Notification.BigTextStyle;
import android.app.Notification.Builder;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import java.util.logging.Level;

public final class crxs implements Runnable {
    public final crxu a;
    public final haut b;

    public crxs(crxu crxu0, haut haut0) {
        this.a = crxu0;
        this.b = haut0;
    }

    @Override
    public final void run() {
        ProtoLiteBuilder hftp4;
        String s;
        Pair pair1;
        gspf gspf0;
        boolean z;
        Intent intent2;
        PendingIntent pendingIntent0;
        ProtoLiteBuilder hftp0;
        crwc crwc1;
        Long long1;
        long v5;
        long v4;
        long v3;
        Pair pair0;
        haut haut0 = this.b;
        long v = System.currentTimeMillis();
        long v1 = crxu.b(haut0, v);
        long v2 = crxu.c(haut0, Math.min(v1 - v, 0L));
        Long long0 = (long)1L;
        if(!hvlq.m() && crxd.e(haut0)) {
            Level level0 = cslm.h();
            crxu.b.g(level0).x("eSIM disabled for the device, yet received eSIM notification");
            pair0 = Pair.create(gizm.f, hhct.F);
            v3 = v;
            v4 = v1;
            v5 = v2;
            long1 = long0;
        }
        else if(!hvko.a.q().T() && !crxd.e(haut0)) {
            pair0 = Pair.create(gizm.f, hhct.E);
            v3 = v;
            v4 = v1;
            v5 = v2;
            long1 = long0;
        }
        else {
            hauq hauq0 = crxu.i(haut0);
        alab1:
            switch(haus.a(haut0.b).ordinal()) {
                case 0: {
                    s = "com.google.android.gms.mobiledataplan.NOTIFICATION.LOW_BALANCE";
                    goto label_37;
                }
                case 1: {
                    if(hvko.K()) {
                        s = "com.google.android.gms.mobiledataplan.NOTIFICATION.UPSELL_OFFER";
                        goto label_37;
                    }
                    else {
                        pair0 = Pair.create(gizm.f, hhct.G);
                        v3 = v;
                        v4 = v1;
                        v5 = v2;
                        long1 = long0;
                    }
                    break;
                }
                case 2: {
                    s = "com.google.android.gms.mobiledataplan.NOTIFICATION.ACCOUNT_ALERT";
                label_37:
                    crxu crxu0 = this.a;
                    if(hvle.f()) {
                        gsoj gsoj0 = gsoj.b(haut0.e) == null ? gsoj.q : gsoj.b(haut0.e);
                        if(gsoj0.ordinal() != 0 && gsoj0.ordinal() != 16) {
                            gsoj gsoj1 = gsoj.b(haut0.e) == null ? gsoj.q : gsoj.b(haut0.e);
                            s = (String)crxu.a.get(gsoj1);
                            if(!crxu.s((gsoj.b(haut0.e) == null ? gsoj.q : gsoj.b(haut0.e))) || crxu0.d.c(s) == null) {
                                pair0 = Pair.create(gizm.f, hhct.H);
                                v3 = v;
                                v4 = v1;
                                v5 = v2;
                                long1 = long0;
                            }
                            else {
                                goto label_56;
                            }
                        }
                        else {
                            pair0 = Pair.create(gizm.w, hhct.R);
                            v3 = v;
                            v4 = v1;
                            v5 = v2;
                            long1 = long0;
                        }
                    }
                    else {
                    label_56:
                        if(hauq0 != null && s != null) {
                            hvle hvle0 = hvle.a;
                            if(hvle0.b().j() && (hauq0.c.isEmpty() || hauq0.d.isEmpty())) {
                                goto label_302;
                            }
                            else if(hava.b(hauq0.i) != 3 && (!hvjw.n() || hava.b(hauq0.i) != 14)) {
                                v3 = v;
                                v4 = v1;
                                goto label_115;
                            }
                            else {
                                String s1 = csli.g(crxu0.c);
                                if(!crvw.u() && crvw.c().d.c(s1) == null) {
                                    v3 = v;
                                    pair0 = Pair.create(gizm.t, hhct.O);
                                    v4 = v1;
                                    v5 = v2;
                                    long1 = long0;
                                }
                                else {
                                    gspg gspg0 = crvw.c().h(s1);
                                    if(gspg0 == null) {
                                        gspg0 = gspg.a;
                                    }
                                    for(Object object0: gspg0.b) {
                                        gspe gspe0 = (gspe)object0;
                                        v3 = v;
                                        if(hava.b(gspe0.c) == 3 && gspe0.e > 0L && !hvle0.b().u()) {
                                            pair0 = Pair.create(gizm.t, hhct.O);
                                            v4 = v1;
                                            v5 = v2;
                                            long1 = long0;
                                            break alab1;
                                        }
                                        v = v3;
                                    }
                                    v3 = v;
                                    if(hvjq.d() && hauq0.e != 0L) {
                                        crvw crvw0 = crvw.c();
                                        v4 = v1;
                                        long v6 = hauq0.e;
                                        crvx crvx0 = crvw0.d;
                                        crwc crwc0 = crvx0.b(long0);
                                        if(crwc0 == null) {
                                            crxn.c().O(hhct.by, 19, "Local_Cache", "MDP_Notification");
                                            crwb crwb0 = new crwb();
                                            crwb0.d(long0);
                                            crwc0 = crwb0.a();
                                        }
                                        if(crwc0.c() == null) {
                                            crwc1 = crwc0;
                                            hftp0 = ((ProtoLiteMessage)hfyt.a).v_newBuilder();
                                        }
                                        else {
                                            hfyt hfyt0 = crwc0.c();
                                            crwc1 = crwc0;
                                            hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)hfyt0).jf(5, null);
                                            hftp0.X(((ProtoLiteMessage)hfyt0));
                                        }
                                        if(!hftp0.b_message.isImmutable()) {
                                            hftp0.ensureMutable();
                                        }
                                        ((hfyt)hftp0.b_message).d = v6;
                                        crwb crwb1 = crwc1.a();
                                        crwb1.c(((hfyt)hftp0.N_build()));
                                        crvx0.h(crwb1.a());
                                    }
                                    else {
                                        v4 = v1;
                                    }
                                label_115:
                                    if(!crxu0.q()) {
                                        pair0 = Pair.create(gizm.e, hhct.D);
                                        v5 = v2;
                                        long1 = long0;
                                    }
                                    else if(crxu0.r(s)) {
                                        long v7 = Math.min(v2, crxu.c(haut0, 0L));
                                        if(v7 - hvjk.a.e().e() <= 0L) {
                                            ((ggtj)crxu.b.j()).A("Notification expired before it reached the device with timeout %d", v7);
                                            pair0 = Pair.create(gizm.n, hhct.K);
                                            v5 = v2;
                                            long1 = long0;
                                        }
                                        else {
                                            if(crxd.e(haut0)) {
                                                Intent intent0 = new Intent("com.google.android.gms.mobiledataplan.ui.DETAIL");
                                                v5 = v2;
                                                intent0.setComponent(new ComponentName(crxu0.c, "com.google.android.gms.mobiledataplan.ui.MobileDataPlanDetailActivity"));
                                                crxu0.n(intent0, haut0);
                                                intent0.setFlags(0x14000000);
                                                pendingIntent0 = crxu0.d(intent0);
                                            }
                                            else {
                                                v5 = v2;
                                                pendingIntent0 = crxu0.d(crxu0.f(haut0, "com.google.android.gms.mobiledataplan.ui.MobileDataPlanSettingsActivity"));
                                            }
                                            Intent intent1 = crxu0.g(haut0);
                                            PendingIntent pendingIntent1 = intent1 == null ? null : crxu0.e(intent1, haut0);
                                            Context context0 = crxu0.c;
                                            int v8 = context0.getColor(0x7F060BC1);  // color:material_google_blue_600
                                            Notification.Builder notification$Builder0 = new Notification.Builder(context0, s);
                                            Notification.Builder notification$Builder1 = new Notification.Builder(context0, s);
                                            int v9 = hvko.O();
                                            Notification.Builder notification$Builder2 = new Notification.Builder(context0, s);
                                            int v10 = !hvle.n() || !hauq0.l ? 1 : 0;
                                            int v11 = v9 & v10;
                                            long1 = long0;
                                            notification$Builder1.setAutoCancel(((boolean)v10)).setContentIntent(pendingIntent0).setDeleteIntent(pendingIntent1);
                                            notification$Builder0.setContentTitle(hauq0.c).setContentText(hauq0.d).setAutoCancel(((boolean)v10)).setContentIntent(pendingIntent0).setDeleteIntent(pendingIntent1);
                                            if(hvle0.b().R()) {
                                                notification$Builder0.setStyle(new Notification.BigTextStyle().bigText(hauq0.d));
                                            }
                                            if(v11 != 0) {
                                                notification$Builder0.setGroup("com.google.android.gms.mobiledataplan.NOTIFICATION");
                                                notification$Builder1.setGroup("com.google.android.gms.mobiledataplan.NOTIFICATION");
                                                notification$Builder2.setAutoCancel(((boolean)v10)).setContentIntent(pendingIntent0).setGroup("com.google.android.gms.mobiledataplan.NOTIFICATION").setGroupSummary(true);
                                                notification$Builder2.setGroupAlertBehavior(2);
                                            }
                                            notification$Builder1.setColor(v8).setCategory("msg");
                                            notification$Builder0.setColor(v8).setCategory("msg");
                                            if(v11 != 0) {
                                                notification$Builder2.setColor(v8).setCategory("msg");
                                            }
                                            if(hvko.O() && !hauq0.j.isEmpty()) {
                                                Bitmap bitmap0 = cslm.a(crxu0.f, hauq0.j);
                                                if(bitmap0 == null) {
                                                    int v12 = crxu0.a();
                                                    notification$Builder0.setSmallIcon(v12);
                                                    notification$Builder1.setSmallIcon(v12);
                                                    if(v11 != 0) {
                                                        notification$Builder2.setSmallIcon(v12);
                                                    }
                                                }
                                                else {
                                                    Icon icon0 = Icon.createWithBitmap(bitmap0);
                                                    notification$Builder0.setSmallIcon(icon0);
                                                    notification$Builder1.setSmallIcon(icon0);
                                                    if(v11 != 0) {
                                                        notification$Builder2.setSmallIcon(icon0);
                                                    }
                                                }
                                            }
                                            else {
                                                int v13 = crxu0.a();
                                                notification$Builder0.setSmallIcon(v13);
                                                notification$Builder1.setSmallIcon(v13);
                                                if(v11 != 0) {
                                                    notification$Builder2.setSmallIcon(v13);
                                                }
                                            }
                                            if(hvko.O() && !hauq0.k.isEmpty()) {
                                                Bitmap bitmap1 = cslm.a(crxu0.f, hauq0.k);
                                                if(bitmap1 != null) {
                                                    notification$Builder0.setLargeIcon(bitmap1);
                                                }
                                            }
                                            String s2 = hauq0.h.isEmpty() ? "Device Plans" : hauq0.h;
                                            Bundle bundle0 = new Bundle();
                                            bundle0.putString("android.substName", s2);
                                            notification$Builder0.addExtras(bundle0);
                                            notification$Builder1.setExtras(bundle0);
                                            if(v11 != 0) {
                                                notification$Builder2.setExtras(bundle0);
                                            }
                                            if(hvle0.b().Q()) {
                                                String s3 = hauq0.g;
                                                if(TextUtils.isEmpty(s3)) {
                                                    crwa crwa0 = crvw.c().d.a(Long.valueOf(hauq0.e));
                                                    if(crwa0 == null) {
                                                        s3 = null;
                                                    }
                                                    else {
                                                        gspd gspd0 = crwa0.a();
                                                        s3 = gspd0 == null ? null : bbqr.b(gspd0.d);
                                                    }
                                                }
                                                if(!TextUtils.isEmpty(s3)) {
                                                    notification$Builder0.setSubText(s3);
                                                }
                                            }
                                            notification$Builder0.setTimeoutAfter(v7);
                                            notification$Builder1.setTimeoutAfter(v7);
                                            if(v11 != 0) {
                                                notification$Builder2.setTimeoutAfter(v7);
                                            }
                                            if(hvle0.b().S()) {
                                                long v14 = System.currentTimeMillis();
                                                long v15 = Math.min(crxu.b(haut0, v14), v14);
                                                notification$Builder0.setWhen(v15);
                                                notification$Builder1.setWhen(v15);
                                                notification$Builder0.setShowWhen(true);
                                                notification$Builder1.setShowWhen(true);
                                                if(v11 != 0) {
                                                    notification$Builder2.setWhen(v15);
                                                    notification$Builder2.setShowWhen(true);
                                                }
                                            }
                                            int v16 = 0;
                                            while(v16 < haut0.g.size()) {
                                                hauy hauy0 = (hauy)haut0.g.get(v16);
                                                int v17 = hauy0.b;
                                                switch((hauz.b(v17) == 0 ? 1 : hauz.b(v17)) - 2) {
                                                    case 1: {
                                                        if(hvle0.b().t()) {
                                                            intent2 = crxu0.g(haut0);
                                                            if(intent2 != null) {
                                                                z = true;
                                                                goto label_242;
                                                            }
                                                        }
                                                        break;
                                                    }
                                                    case 2: {
                                                        intent2 = crxu0.f(haut0, "com.google.android.gms.mobiledataplan.ui.MobileDataPlanSettingsActivity");
                                                        z = false;
                                                        goto label_242;
                                                    }
                                                    case 3: {
                                                        intent2 = crxu0.f(haut0, "com.google.android.gms.mobiledataplan.ui.MobileDataPlanDetailActivity");
                                                        z = false;
                                                    label_242:
                                                        int v18 = hauz.b(hauy0.b) == 0 ? 1 : hauz.b(hauy0.b);
                                                        Intent intent3 = intent2.putExtra("NOTIFICATION_ACTION", (v18 == 1 ? 0 : hauz.a(v18))).putExtra("NOTIFICATION_ACTION_INDEX", v16);
                                                        notification$Builder0.addAction(new Notification.Action.Builder(avyq.a(context0, 0), hauy0.c, (z ? crxu0.e(intent3, haut0) : crxu0.d(intent3))).build());
                                                        break;
                                                    }
                                                    default: {
                                                        ((ggtj)crxu.b.j()).z("Received invalid notification action %d", v17);
                                                    }
                                                }
                                                ++v16;
                                            }
                                            notification$Builder0.setPublicVersion(notification$Builder1.build());
                                            int v19 = (int)haut0.d;
                                            bayn bayn0 = crxu0.d;
                                            evuh evuh0 = evuh.bh;
                                            bayn0.y("com.google.android.gms.mobiledataplan.NOTIFICATION_TAG", v19, evuh0, notification$Builder0.build());
                                            if(v11 != 0) {
                                                bayn0.y("com.google.android.gms.mobiledataplan.NOTIFICATION_TAG", 0, evuh0, notification$Builder2.build());
                                            }
                                            hauq hauq1 = crxu.i(haut0);
                                            if(hauq1 != null) {
                                                String s4 = csli.g(context0);
                                                int v20 = hava.b(hauq1.i) == 0 ? 1 : hava.b(hauq1.i);
                                                if(crvw.c().h(s4) == null) {
                                                    gspf0 = (gspf)((ProtoLiteMessage)gspg.a).v_newBuilder();
                                                }
                                                else {
                                                    gspg gspg1 = crvw.c().h(s4);
                                                    ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)gspg1).jf(5, null);
                                                    hftp1.X(((ProtoLiteMessage)gspg1));
                                                    gspf0 = (gspf)hftp1;
                                                }
                                                int v21;
                                                for(v21 = 0; true; ++v21) {
                                                    if(v21 >= ((gspg)gspf0.b_message).b.size()) {
                                                        v21 = -1;
                                                        break;
                                                    }
                                                    int v22 = hava.b(gspf0.a(v21).c);
                                                    if(v22 == 0) {
                                                        v22 = 1;
                                                    }
                                                    if(v22 == v20) {
                                                        break;
                                                    }
                                                }
                                                if(v21 == -1) {
                                                    ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gspe.a).v_newBuilder();
                                                    if(!hftp2.b_message.isImmutable()) {
                                                        hftp2.ensureMutable();
                                                    }
                                                    gspe gspe1 = (gspe)hftp2.b_message;
                                                    gspe1.c = hava.a(v20);
                                                    gspe gspe2 = crxu.u(hftp2, ((long)v19));
                                                    if(!gspf0.b_message.isImmutable()) {
                                                        ((ProtoLiteBuilder)gspf0).ensureMutable();
                                                    }
                                                    gspg gspg2 = (gspg)gspf0.b_message;
                                                    gspe2.getClass();
                                                    gspg2.b();
                                                    gspg2.b.add(gspe2);
                                                }
                                                else {
                                                    gspe gspe3 = gspf0.a(v21);
                                                    ProtoLiteBuilder hftp3 = (ProtoLiteBuilder)((ProtoLiteMessage)gspe3).jf(5, null);
                                                    hftp3.X(((ProtoLiteMessage)gspe3));
                                                    gspe gspe4 = crxu.u(hftp3, ((long)v19));
                                                    if(!gspf0.b_message.isImmutable()) {
                                                        ((ProtoLiteBuilder)gspf0).ensureMutable();
                                                    }
                                                    gspg gspg3 = (gspg)gspf0.b_message;
                                                    gspe4.getClass();
                                                    gspg3.b();
                                                    gspg3.b.set(v21, gspe4);
                                                }
                                                crvw.c().E(s4, ((gspg)((ProtoLiteBuilder)gspf0).N_build()));
                                            }
                                            pair1 = Pair.create(gizm.i, hhct.af);
                                            pair0 = pair1;
                                            break;
                                        }
                                    }
                                    else {
                                        pair0 = Pair.create(gizm.d, hhct.C);
                                        v5 = v2;
                                        long1 = long0;
                                    }
                                }
                            }
                        }
                        else {
                        label_302:
                            v3 = v;
                            v4 = v1;
                            v5 = v2;
                            long1 = long0;
                            ((ggtj)crxu.b.j()).x("Gcm message doesn\'t set notification data.");
                            pair1 = Pair.create(gizm.q, hhct.M);
                            pair0 = pair1;
                        }
                    }
                    break;
                }
                default: {
                    s = null;
                    goto label_37;
                }
            }
        }
        crxn.c().g(haut0, ((gizm)pair0.first), "MDP_Notification", ((hhct)pair0.second), v3 - v4, v5);
        if(hvjw.k() && hhct.af == pair0.second) {
            hauq hauq2 = crxu.i(haut0);
            if(hauq2 != null && hava.b(hauq2.i) == 14) {
                long v23 = System.currentTimeMillis();
                crvx crvx1 = crvw.c().d;
                crwc crwc2 = crvx1.b(long1);
                if(crwc2 == null) {
                    crxn.c().O(hhct.by, 19, "Local_Cache", "MDP_Notification");
                    crwb crwb2 = new crwb();
                    crwb2.d(long1);
                    crwc2 = crwb2.a();
                }
                if(crwc2.c() == null) {
                    hftp4 = ((ProtoLiteMessage)hfyt.a).v_newBuilder();
                }
                else {
                    hfyt hfyt1 = crwc2.c();
                    hftp4 = (ProtoLiteBuilder)((ProtoLiteMessage)hfyt1).jf(5, null);
                    hftp4.X(((ProtoLiteMessage)hfyt1));
                }
                hfwn hfwn0 = hfyn.h(v23);
                if(!hftp4.b_message.isImmutable()) {
                    hftp4.ensureMutable();
                }
                hfyt hfyt2 = (hfyt)hftp4.b_message;
                hfwn0.getClass();
                hfyt2.c = hfwn0;
                hfyt2.b |= 1;
                crwb crwb3 = crwc2.a();
                crwb3.c(((hfyt)hftp4.N_build()));
                boolean z1 = crvx1.h(crwb3.a());
                crxn crxn0 = crxn.c();
                giyo giyo0 = giyo.a;
                ProtoLiteBuilder hftp5 = ((ProtoLiteMessage)giyo0).v_newBuilder();
                if(!hftp5.b_message.isImmutable()) {
                    hftp5.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp5.b_message;
                ((giyo)hftv0).b = 11;
                if(!hftv0.isImmutable()) {
                    hftp5.ensureMutable();
                }
                ((giyo)hftp5.b_message).c = z1;
                Integer integer0 = (int)0;
                crxn0.j(((giyo)hftp5.N_build()), "MDP_Notification", integer0);
                boolean z2 = crvw.c().B(hhcr.h, "MDP_Notification");
                crxn crxn1 = crxn.c();
                ProtoLiteBuilder hftp6 = ((ProtoLiteMessage)giyo0).v_newBuilder();
                if(!hftp6.b_message.isImmutable()) {
                    hftp6.ensureMutable();
                }
                ProtoLiteMessage hftv1 = hftp6.b_message;
                ((giyo)hftv1).b = 12;
                if(!hftv1.isImmutable()) {
                    hftp6.ensureMutable();
                }
                ((giyo)hftp6.b_message).c = z2;
                crxn1.j(((giyo)hftp6.N_build()), "MDP_Notification", integer0);
            }
        }
    }
}

