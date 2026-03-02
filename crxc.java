import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.util.Base64;
import com.google.android.gms.mobiledataplan.MdpDataPlanStatusResponse;
import com.google.android.gms.mobiledataplan.MdpUpsellOfferResponse;
import com.google.android.gms.mobiledataplan.PurchasePlanActivation;
import j..time.Duration;
import java.util.Set;
import java.util.logging.Level;
import jeb.synthetic.FIN;
import jeb.synthetic.TWR;

public final class crxc implements Runnable {
    public final Intent a;
    public final Context b;

    public crxc(Intent intent0, Context context0) {
        this.a = intent0;
        this.b = context0;
    }

    @Override
    public final void run() {
        Integer integer0;
        crwe crwe1;
        Intent intent2;
        crxp crxp1;
        String s2;
        crxp crxp0;
        hauq hauq0;
        hgks hgks0;
        hgkw hgkw0;
        hgku hgku0;
        haut haut0;
        byte[] arr_b;
        crxd crxd0 = crxd.a();
        Context context0 = this.b;
        crxn crxn0 = new crxn(context0);
        Intent intent0 = this.a;
        if(intent0 != null && intent0.hasExtra("event_gtaf")) {
            String s = intent0.getStringExtra("event_gtaf");
            if(s != null && !s.isEmpty()) {
                try {
                    arr_b = Base64.decode(s, 0);
                }
                catch(IllegalArgumentException illegalArgumentException0) {
                    a.ae(crxd.a.j(), "Cannot parse GTAF\'s GCM message from raw.", illegalArgumentException0);
                    crxn0.f(null, gizm.c, "MDP_Notification", hhct.z);
                    return;
                }
                try {
                    ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)haut.a), arr_b, 0, arr_b.length, hftc.a);
                    ProtoLiteMessage.P_makeImmutable(hftv0);
                    haut0 = (haut)hftv0;
                }
                catch(hfur hfur0) {
                    a.ae(crxd.a.j(), "Cannot parse GTAF\'s GCM message from proto.", hfur0);
                    crxn0.f(null, gizm.c, "MDP_Notification", hhct.z);
                    return;
                }
                if(crxd0.b == null) {
                    crxd0.b = new crxu();
                }
                if(crxd0.c == null) {
                    crxd0.c = new crwy();
                }
                if(crxd.e(haut0)) {
                    if(hvlq.m()) {
                        int v = haut0.b;
                        if(haus.a(v) == haus.a) {
                            hauw hauw0 = v == 2 ? ((hauw)haut0.c) : hauw.a;
                            gsou gsou0 = hauw0.c == null ? gsou.a : hauw0.c;
                            Intent intent1 = new Intent().setClassName(context0, "com.google.android.gms.mobiledataplan.ui.MobileDataPlanDetailActivity").setFlags(0x10000000);
                            intent1.putExtra("NOTIFICATION_LOGGING_NOTIFICATION_ID", ((int)haut0.d));
                            if(hvlq.n() && (gsoj.b(haut0.e) == null ? gsoj.q : gsoj.b(haut0.e)) == gsoj.p) {
                                intent1.setAction("ESIM_ACCOUNT_NOTIFICATION");
                                switch((gsou0.m == null ? hgkv.a : gsou0.m).b) {
                                    case 0: {
                                        hgku0 = hgku.a;
                                        break;
                                    }
                                    case 1: {
                                        hgku0 = hgku.b;
                                        break;
                                    }
                                    case 2: {
                                        hgku0 = hgku.c;
                                        break;
                                    }
                                    case 3: {
                                        hgku0 = hgku.d;
                                        break;
                                    }
                                    default: {
                                        hgku0 = null;
                                    }
                                }
                                if(hgku0 == null) {
                                    hgku0 = hgku.e;
                                }
                                intent1.putExtra("ESIM_ACCOUNT_NOTIFICATION", hgku0);
                                context0.startActivity(intent1);
                                return;
                            }
                            if((gsoj.b(haut0.e) == null ? gsoj.q : gsoj.b(haut0.e)) != gsoj.o) {
                                return;
                            }
                            crxd0.b.p(haut0);
                            intent1.setAction("ESIM_CODE_NOTIFICATION");
                            switch((gsou0.m == null ? hgkv.a : gsou0.m).c) {
                                case 0: {
                                    hgkw0 = hgkw.a;
                                    break;
                                }
                                case 1: {
                                    hgkw0 = hgkw.b;
                                    break;
                                }
                                case 2: {
                                    hgkw0 = hgkw.c;
                                    break;
                                }
                                case 3: {
                                    hgkw0 = hgkw.d;
                                    break;
                                }
                                case 4: {
                                    hgkw0 = hgkw.e;
                                    break;
                                }
                                default: {
                                    hgkw0 = null;
                                }
                            }
                            if(hgkw0 == null) {
                                hgkw0 = hgkw.f;
                            }
                            intent1.putExtra("ESIM_CODE_NOTIFICATION", hgkw0);
                            if(hgkw0 == hgkw.c) {
                                switch((gsou0.m == null ? hgkv.a : gsou0.m).d) {
                                    case 0: {
                                        hgks0 = hgks.a;
                                        break;
                                    }
                                    case 1: {
                                        hgks0 = hgks.b;
                                        break;
                                    }
                                    case 2: {
                                        hgks0 = hgks.c;
                                        break;
                                    }
                                    case 3: {
                                        hgks0 = hgks.d;
                                        break;
                                    }
                                    case 4: {
                                        hgks0 = hgks.e;
                                        break;
                                    }
                                    case 5: {
                                        hgks0 = hgks.f;
                                        break;
                                    }
                                    case 6: {
                                        hgks0 = hgks.g;
                                        break;
                                    }
                                    case 7: {
                                        hgks0 = hgks.h;
                                        break;
                                    }
                                    default: {
                                        hgks0 = null;
                                    }
                                }
                                if(hgks0 == null) {
                                    hgks0 = hgks.i;
                                }
                                intent1.putExtra("ESIM_CODE_REASON", hgks0);
                            }
                            context0.startActivity(intent1);
                            return;
                        }
                    }
                    ((ggtj)crxd.a.j()).x("eSIM notification failed: incorrect message body or feature not enabled");
                    return;
                }
                if(hvko.G()) {
                    int v1 = haut0.b;
                    haus haus0 = haus.a;
                    if(haus.a(v1) == haus0) {
                        hauq0 = (v1 == 2 ? ((hauw)haut0.c) : hauw.a).e;
                        if(hauq0 != null) {
                            goto label_114;
                        }
                        hauq0 = hauq.a;
                        goto label_114;
                    }
                    if(haus.a(v1) == haus.b) {
                        hauq0 = (v1 == 3 ? ((haux)haut0.c) : haux.a).e;
                        if(hauq0 != null) {
                            goto label_114;
                        }
                        hauq0 = hauq.a;
                        goto label_114;
                    }
                    if(haus.a(v1) == haus.c) {
                        hauq0 = (v1 == 4 ? ((hauu)haut0.c) : hauu.a).d;
                        if(hauq0 != null) {
                            goto label_114;
                        }
                        hauq0 = hauq.a;
                        goto label_114;
                    }
                    if(crxd.f(haut0)) {
                        hauq0 = null;
                    label_114:
                        if(crxd.f(haut0)) {
                            gged_interceptors gged0 = gged_interceptors.l(new crxo());
                            int v2 = ((ggna)gged0).c;
                            int v3 = 0;
                            while(true) {
                                crxp0 = null;
                                if(v3 < v2) {
                                    crxp0 = (crxp)gged0.get(v3);
                                    ++v3;
                                    if(crxp0.a(haut0)) {
                                        break;
                                    }
                                    continue;
                                }
                                break;
                            }
                            if(crxp0 == null) {
                                crxn0.f(crxd.b(haut0), gizm.F, "MDP_Notification", hhct.Y);
                            }
                            if(crxp0 != null) {
                                goto label_130;
                            }
                        }
                        else {
                            crxp0 = null;
                        label_130:
                            if(hvlb.e()) {
                                String s1 = hauq0.p;
                                Level level0 = cslm.h();
                                crxd.a.g(level0).B("enableCpidv2ForMultisimNotification=True and trying to find iccid for hashedImsi: %s", s1);
                                s2 = csli.h(context0, s1);
                                Level level1 = cslm.h();
                                crxd.a.g(level1).R("For hashedImsi: %s, iccid: %s", s1, s2);
                            }
                            else {
                                s2 = csli.g(context0);
                            }
                            if(!hvle.d() && !hvle.c()) {
                                crxp1 = crxp0;
                            }
                            else {
                                if(haut0.f == 0L) {
                                    crxn0.f(crxd.b(haut0), gizm.A, "MDP_Notification", hhct.T);
                                }
                                if(hvle.d() && context0 != null && csli.c(context0) == null) {
                                    crxn0.f(crxd.b(haut0), gizm.B, "MDP_Notification", hhct.U);
                                    return;
                                }
                                if(haut0.f == 0L) {
                                    crxp1 = crxp0;
                                }
                                else {
                                    crxp1 = crxp0;
                                    if(csli.b(s2) != haut0.f) {
                                        crxn0.f(crxd.b(haut0), gizm.z, "MDP_Notification", hhct.S);
                                        if(hvle.c()) {
                                            crxn0.f(crxd.b(haut0), gizm.C, "MDP_Notification", hhct.V);
                                            return;
                                        }
                                    }
                                }
                            }
                            if(crxp1 == null && hauq0 != null && hauq0.e == 0L) {
                                ((ggtj)crxd.a.j()).x("Received a notification without a valid carrier ID");
                                crxn0.f(crxd.b(haut0), gizm.r, "MDP_Notification", hhct.N);
                                return;
                            }
                            if(hvko.D() && !cslm.d().booleanValue()) {
                                if(s2 == null) {
                                    ((ggtj)crxd.a.i()).x("Couldn\'t get SIM serial number");
                                    crxn0.f(crxd.b(haut0), gizm.a, "MDP_Notification", hhct.A);
                                    return;
                                }
                                Long long0 = crvw.c().p(s2);
                                if(crxp1 == null && hauq0 != null && (long0 == null || !long0.equals(Long.valueOf(hauq0.e)))) {
                                    ((ggtj)crxd.a.j()).x("Received a notification that doesn\'t match the current carrier");
                                    crxn0.f(crxd.b(haut0), gizm.s, "MDP_Notification", hhct.B);
                                    return;
                                }
                            }
                            if(hvle.a.b().P() && (hvko.C() || crxd.d()) && ((gsoj.b(haut0.e) == null ? gsoj.q : gsoj.b(haut0.e)) != gsoj.d && crxp1 == null && hauq0 != null) && !hvle.a.b().i().b.contains((gsoj.b(haut0.e) == null ? gsoj.q : gsoj.b(haut0.e)).name())) {
                                crvw crvw0 = crvw.c();
                                hfys hfys0 = crxd.d() ? crvw0.l() : crvw0.k(Long.valueOf(hauq0.e), crvw.c().s(s2));
                                int v4 = hfys0 == null || (hhcr.b(hfys0.g) == null ? hhcr.k : hhcr.b(hfys0.g)) != hhcr.c && (hhcr.b(hfys0.g) == null ? hhcr.k : hhcr.b(hfys0.g)) != hhcr.f && (hhcr.b(hfys0.g) == null ? hhcr.k : hhcr.b(hfys0.g)) != hhcr.e ? 0 : 1;
                                if(hvjw.n() && hfys0 != null) {
                                    v4 = (hhcr.b(hfys0.g) == null ? hhcr.k : hhcr.b(hfys0.g)) == hhcr.i ? 0 : 1;
                                }
                                if(v4 != 0) {
                                    ((ggtj)crxd.a.h()).x("Received a notification while consent is revoked or declined");
                                    crxn0.f(crxd.b(haut0), gizm.u, "MDP_Notification", hhct.P);
                                    return;
                                }
                            }
                            if(hvjq.a.c().m() && (gsoj.b(haut0.e) == null ? gsoj.q : gsoj.b(haut0.e)) == gsoj.m) {
                                Level level2 = cslm.h();
                                crxd.a.g(level2).x("Received a GCM message with type HIDDEN.");
                                crxn0.f(haut0, gizm.v, "MDP_Notification", hhct.Q);
                                if(hvjw.j() && crxp1 != null) {
                                    if(crxp1.b()) {
                                        crxn0.f(crxd.b(haut0), gizm.D, "MDP_Notification", hhct.W);
                                        return;
                                    }
                                    crxn0.f(crxd.b(haut0), gizm.E, "MDP_Notification", hhct.X);
                                    return;
                                }
                            }
                            else {
                                crxd0.b.p(haut0);
                            }
                            int v5 = haut0.b;
                            if(haus.a(v5) == haus.b) {
                                haux haux0 = v5 == 3 ? ((haux)haut0.c) : haux.a;
                                crwy crwy0 = crxd0.c;
                                MdpUpsellOfferResponse mdpUpsellOfferResponse0 = cryi.d((haux0.c == null ? gsqd.a : haux0.c));
                                if(hvko.E()) {
                                    Set set0 = crwy.a;
                                    __monitor_enter(set0);
                                    try {
                                        crwy0.b();
                                        Set set1 = (Set)crwy0.c.get("UPSELL_OFFER");
                                        if(set1 == null) {
                                            return;
                                        }
                                        for(Object object0: set1) {
                                            new crxa(crwy0.d, ((String)object0)).c(mdpUpsellOfferResponse0);
                                        }
                                    }
                                    finally {
                                        __monitor_exit(set0);
                                    }
                                    return;
                                }
                            }
                            else if(haus.a(v5) == haus0) {
                                hauw hauw1 = v5 == 2 ? ((hauw)haut0.c) : hauw.a;
                                gsou gsou1 = hauw1.c == null ? gsou.a : hauw1.c;
                                if(gsou1.d.size() != 0) {
                                    MdpDataPlanStatusResponse mdpDataPlanStatusResponse0 = cryi.c(gsou1, crwm.c().d(gsou1.c, "AIzaSyAxmTFlJLw9-uEJ1pFJUzw8LX7veGxGUoI"), new Bundle());
                                    crwy crwy1 = crxd0.c;
                                    if(hvko.E()) {
                                        Set set2 = crwy.a;
                                        __monitor_enter(set2);
                                        int v7 = FIN.finallyOpen$NT();
                                        crwy1.b();
                                        Set set3 = (Set)crwy1.c.get("BALANCE_UPDATE");
                                        if(set3 == null) {
                                            FIN.finallyExec$NT(v7);
                                        }
                                        else {
                                            for(Object object1: set3) {
                                                new crxa(crwy1.d, ((String)object1)).b(mdpDataPlanStatusResponse0);
                                            }
                                            FIN.finallyCodeBegin$NT(v7);
                                        }
                                    }
                                    crxd0.d.b(mdpDataPlanStatusResponse0);
                                    bboh bboh0 = crxd.a;
                                    bboh0.g(cslm.h()).B("handlePlanActivation, enablePlanActivationStatus enabled: %b", Boolean.valueOf(hvlq.s()));
                                    if(hvlq.s()) {
                                        goto label_264;
                                    }
                                    if(hvlq.w()) {
                                        hauw hauw2 = haut0.b == 2 ? ((hauw)haut0.c) : hauw.a;
                                        hauq hauq1 = hauw2.e == null ? hauq.a : hauw2.e;
                                        if((hauq1.b & 1) == 0) {
                                            intent2 = null;
                                        }
                                        else {
                                            PurchasePlanActivation purchasePlanActivation0 = new PurchasePlanActivation();
                                            purchasePlanActivation0.a = (hauq1.o == null ? hbyd.a : hauq1.o).b;
                                            hbyd hbyd0 = hauq1.o;
                                            purchasePlanActivation0.b = (hbyd0 == null ? hbyd.a : hbyd0).c;
                                            if(hbyd0 == null) {
                                                hbyd0 = hbyd.a;
                                            }
                                            int v8 = hbyc.b(hbyd0.d);
                                            purchasePlanActivation0.c = hbyc.a((v8 == 0 ? 1 : v8));
                                            intent2 = new Intent();
                                            intent2.setAction("com.google.android.gms.mobiledataplan.ui.PURCHASE_PLAN_ACTIVATION");
                                            intent2.setClassName(context0, "com.google.android.gms.mobiledataplan.ui.MobileDataPlanSettingsActivity");
                                            intent2.putExtra("PURCHASE_PLAN_ACTIVATION", purchasePlanActivation0);
                                            intent2.addFlags(0x30000000);
                                        }
                                    }
                                    else {
                                        intent2 = null;
                                    }
                                    if(intent2 != null) {
                                        context0.startActivity(intent2);
                                        return;
                                    label_264:
                                        bboh0.g(cslm.h()).x("Show notification to update pending purchase status.");
                                        crxd0.b.p(haut0);
                                        return;
                                    }
                                }
                            }
                        }
                        return;
                    }
                    if(hvli.a.c().c()) {
                        int v9 = haut0.b;
                        if(haus.a(v9) == haus.e) {
                            String s3 = (v9 == 6 ? ((haur)haut0.c) : haur.a).d;
                            int v10 = haut0.b;
                            long v11 = (v10 == 6 ? ((haur)haut0.c) : haur.a).f;
                            haur haur0 = v10 == 6 ? ((haur)haut0.c) : haur.a;
                            String s4 = (haur0.k == null ? hauq.a : haur0.k).m;
                            if(hvli.b().b.contains(s3)) {
                                String s5 = csli.g(context0);
                                Long long1 = crvw.c().p(s5);
                                if(long1 != null && v11 != 0L && ((long)long1) == v11) {
                                    if(cslp.a(context0, s3)) {
                                        Intent intent3 = new Intent("com.google.android.libraries.cloud.telco.subgraph.impl.SUBGRAPH_SDK_NOTIFICATION");
                                        intent3.setPackage(s3);
                                        crvw crvw1 = crvw.c();
                                        crwd crwd0 = new crwd();
                                        crwd0.a = s5;
                                        crwd0.b = s3;
                                        crwe crwe0 = new crwe(crwd0);
                                        Object object2 = crvw1.d.b;
                                        __monitor_enter(object2);
                                        int v12 = FIN.finallyOpen$NT();
                                        crvy crvy0 = crvw1.d.a;
                                        if(!gfta.c(crwe0.c()) && !gfta.c(crwe0.b())) {
                                            SQLiteDatabase sQLiteDatabase0 = crvy0.d();
                                            if(sQLiteDatabase0 == null) {
                                                ((ggtj)crvy.a.i()).x("Unable to fetch writable database");
                                            }
                                            else {
                                                String[] arr_s = {crwe0.c(), crwe0.b()};
                                                try {
                                                    Cursor cursor0 = sQLiteDatabase0.rawQuery("INSERT INTO SdkNotificationTable (iccid, destination_package, last_sent_notification_id) VALUES (?, ?, 1) ON CONFLICT(iccid, destination_package) DO UPDATE SET last_sent_notification_id = last_sent_notification_id + 1 ", arr_s);
                                                    TWR.declareResource(cursor0);
                                                    TWR.useResource$NT(cursor0);
                                                    cursor0.moveToFirst();
                                                    cursor0.close();
                                                }
                                                catch(SQLiteException sQLiteException0) {
                                                    a.ae(crvy.a.j(), "Exception occurred while upserting into SdkNotificationTable", sQLiteException0);
                                                }
                                            }
                                        }
                                        else {
                                            ((ggtj)crvy.a.i()).B("Primary key is not set while upserting %s", "SdkNotificationTable");
                                        }
                                        FIN.finallyCodeBegin$NT(v12);
                                        __monitor_exit(object2);
                                        FIN.finallyCodeEnd$NT(v12);
                                        Object object3 = crvw1.d.b;
                                        __monitor_enter(object3);
                                        int v13 = FIN.finallyOpen$NT();
                                        crvy crvy1 = crvw1.d.a;
                                        if(!gfta.c(s5) && !gfta.c(s3)) {
                                            SQLiteDatabase sQLiteDatabase1 = crvy1.c();
                                            if(sQLiteDatabase1 == null) {
                                                crwe1 = null;
                                            }
                                            else {
                                                Cursor cursor1 = sQLiteDatabase1.query("SdkNotificationTable", new String[]{"last_sent_notification_id"}, "iccid = ? AND destination_package = ?", new String[]{s5, s3}, null, null, null);
                                                TWR.declareResource(cursor1);
                                                TWR.useResource$NT(cursor1);
                                                crwd crwd1 = new crwd();
                                                crwd1.a = s5;
                                                crwd1.b = s3;
                                                if(cursor1.getCount() == 0) {
                                                    TWR.useResource$NT(cursor1);
                                                    ((ggtj)crvy.a.h()).R("No rows found with this input {%s, %s}", s5, s3);
                                                    crwd1.c = (int)0;
                                                }
                                                else {
                                                    TWR.useResource$NT(cursor1);
                                                    cursor1.moveToFirst();
                                                    int v14 = cursor1.getColumnIndex("last_sent_notification_id");
                                                    if(cursor1.getType(v14) == 0) {
                                                        TWR.useResource$NT(cursor1);
                                                        integer0 = null;
                                                    }
                                                    else {
                                                        TWR.useResource$NT(cursor1);
                                                        integer0 = cursor1.getInt(v14);
                                                    }
                                                    TWR.useResource$NT(cursor1);
                                                    crwd1.c = integer0;
                                                }
                                                crwe1 = new crwe(crwd1);
                                            }
                                        }
                                        else {
                                            crwe1 = null;
                                        }
                                        FIN.finallyCodeBegin$NT(v13);
                                        __monitor_exit(object3);
                                        FIN.finallyCodeEnd$NT(v13);
                                        intent3.putExtra("notification_id", Integer.valueOf((crwe1 == null ? 0 : ((int)crwe1.a()))));
                                        int v15 = haut0.b;
                                        if(v15 == 6) {
                                            haur haur1 = (haur)haut0.c;
                                        }
                                        haur haur2 = v15 == 6 ? ((haur)haut0.c) : haur.a;
                                        intent3.putExtra("notification_content_title", (haur2.k == null ? hauq.a : haur2.k).c);
                                        intent3.putExtra("notification_content_text", (haut0.b == 6 ? ((haur)haut0.c) : haur.a).j);
                                        if(!(haut0.b == 6 ? ((haur)haut0.c) : haur.a).g.isEmpty()) {
                                            intent3.putExtra("notification_content_small_icon", (haut0.b == 6 ? ((haur)haut0.c) : haur.a).g.toByteArray());
                                        }
                                        if(!(haut0.b == 6 ? ((haur)haut0.c) : haur.a).h.isEmpty()) {
                                            intent3.putExtra("notification_content_large_icon", (haut0.b == 6 ? ((haur)haut0.c) : haur.a).h.toByteArray());
                                        }
                                        intent3.putExtra("notification_cpid", crvw.c().s(s5));
                                        intent3.putExtra("notification_sim_id", s5);
                                        intent3.putExtra("notification_destination_package", s3);
                                        intent3.putExtra("notification_content_type", (haut0.b == 6 ? ((haur)haut0.c) : haur.a).e);
                                        intent3.putExtra("notification_final_action", (haut0.b == 6 ? ((haur)haut0.c) : haur.a).i);
                                        intent3.putExtra("notification_payload", (haut0.b == 6 ? ((haur)haut0.c) : haur.a).b.toByteArray());
                                        haur haur3 = haut0.b == 6 ? ((haur)haut0.c) : haur.a;
                                        intent3.putExtra("notification_time", hfyn.b((haur3.c == null ? hfwn.a : haur3.c)));
                                        if(s4.length() != 0 && !s4.isEmpty()) {
                                            intent3.putExtra("notification_tracking_id", s4);
                                            Duration duration0 = Duration.ofSeconds(hvli.a.c().a());
                                            gfug gfug0 = crxd0.e;
                                            Duration duration1 = gfug0.d();
                                            if(!gfug0.a) {
                                                gfug0.f();
                                                Level level3 = cslm.h();
                                                crxd.a.g(level3).A("Notification time stopwatch started. Elapsed: %d", duration1.toSeconds());
                                                goto label_386;
                                            }
                                            if(duration0.compareTo(duration1) <= 0) {
                                                gfug0.e();
                                                Level level4 = cslm.h();
                                                crxd.a.g(level4).A("Notification time stopwatch reset. Elapsed: %s", duration1.toSeconds());
                                            label_386:
                                                context0.startForegroundService(intent3);
                                                crxn0.f(crxd.b(haut0), gizm.b, "MDP_Notification", hhct.aa);
                                                return;
                                            }
                                            ((ggtj)crxd.a.j()).K("Rate limit in seconds: %d for 3P Notifications was exceeded. Elapsed seconds: %d. Dropping 3P notification message.", duration0.toSeconds(), duration1.toSeconds());
                                            crxn0.f(crxd.b(haut0), gizm.H, "MDP_Notification", hhct.ac);
                                        }
                                        else {
                                            ((ggtj)crxd.a.i()).B("Notification message is incomplete, there is no third party tracking ID for destination package: %s", s3);
                                        }
                                    }
                                    else {
                                        ((ggtj)crxd.a.i()).B("Notification intended to package %s is not installed or not authorized in UE", s3);
                                    }
                                }
                            }
                            else {
                                ((ggtj)crxd.a.i()).x("Destination packages in message body doesn\'t match with allowed package.");
                            }
                            crxn0.f(crxd.b(haut0), gizm.b, "MDP_Notification", hhct.ab);
                            return;
                        }
                    }
                    ((ggtj)crxd.a.j()).x("Received a notification without a message body");
                    crxn0.f(crxd.b(haut0), gizm.p, "MDP_Notification", hhct.L);
                    return;
                }
                Level level5 = cslm.h();
                crxd.a.g(level5).x("GCM not enabled. Ignoring GCM message.");
                return;
            }
            ((ggtj)crxd.a.j()).x("GCM message does not have the payload.");
            crxn0.f(null, gizm.o, "MDP_Notification", hhct.y);
            return;
        }
        ((ggtj)crxd.a.j()).B("GCM message is null or does not have the key %s.", "event_gtaf");
        crxn0.f(null, gizm.o, "MDP_Notification", hhct.y);
    }
}

