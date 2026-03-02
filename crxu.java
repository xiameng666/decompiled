import android.app.NotificationChannel;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources.NotFoundException;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.chimera.modules.mobiledataplan.AppContextProvider;
import com.google.android.gms.mobiledataplan.PurchasePlanActivation;
import com.google.android.gms.mobiledataplan.notification.NotificationListenerIntentOperation;
import j..util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

public final class crxu {
    public static final ggeo a;
    public static final bboh b;
    public final Context c;
    public final bayn d;
    public final cslu e;
    public final tyb f;
    private final gmcg g;

    static {
        ggek ggek0 = new ggek();
        ggek0.i(gsoj.b, "com.google.android.gms.mobiledataplan.NOTIFICATION.LOW_BALANCE");
        ggek0.i(gsoj.c, "com.google.android.gms.mobiledataplan.NOTIFICATION.UPSELL_OFFER");
        ggek0.i(gsoj.d, "com.google.android.gms.mobiledataplan.NOTIFICATION.ACCOUNT_ALERT");
        ggek0.i(gsoj.e, "com.google.android.gms.mobiledataplan.NOTIFICATION.OUT_OF_DATA");
        ggek0.i(gsoj.f, "com.google.android.gms.mobiledataplan.NOTIFICATION.EXPIRATION_REMINDER");
        ggek0.i(gsoj.g, "com.google.android.gms.mobiledataplan.NOTIFICATION.ACCOUNT_BALANCE_UPDATE");
        ggek0.i(gsoj.h, "com.google.android.gms.mobiledataplan.NOTIFICATION.PURCHASE");
        ggek0.i(gsoj.i, "com.google.android.gms.mobiledataplan.NOTIFICATION.NETWORK_SETUP");
        ggek0.i(gsoj.j, "com.google.android.gms.mobiledataplan.NOTIFICATION.DAILY_UPDATE");
        ggek0.i(gsoj.k, "com.google.android.gms.mobiledataplan.NOTIFICATION.PAY_AS_YOU_GO");
        ggek0.i(gsoj.l, "com.google.android.gms.mobiledataplan.NOTIFICATION.OTHER");
        ggek0.i(gsoj.o, "com.google.android.gms.mobiledataplan.NOTIFICATION.LOW_BALANCE");
        crxu.a = ggkm.c(ggek0.b());
        crxu.b = bboh.b("MobileDataPlan", bbcu.ck);
    }

    public crxu() {
        Context context0 = AppContextProvider.a();
        super();
        this.c = context0;
        this.d = bayn.f(context0);
        this.g = new bblp(1, 9);
        this.e = new cslu();
        this.f = txc.d(context0);
    }

    public final int a() {
        try {
            return avyq.a(this.c, 0x7F080CF3);
        }
        catch(Resources.NotFoundException unused_ex) {
            return avyq.a(this.c, 0x7F080D3E);
        }
    }

    public static long b(haut haut0, long v) {
        hfwn hfwn0;
        haus haus0 = haus.a(haut0.b);
        int v1 = haus0.ordinal();
        if(v1 == 0) {
            hfwn0 = (haut0.b == 2 ? ((hauw)haut0.c) : hauw.a).d;
            if(hfwn0 == null) {
                hfwn0 = hfwn.a;
            }
        }
        else {
            switch(v1) {
                case 1: {
                    hfwn0 = (haut0.b == 3 ? ((haux)haut0.c) : haux.a).d;
                    if(hfwn0 == null) {
                        return ((ProtoLiteMessage)hfwn.a).equals(hfyn.c) ? v : hfyn.b(hfwn.a);
                    }
                    break;
                }
                case 2: {
                    hfwn0 = (haut0.b == 4 ? ((hauu)haut0.c) : hauu.a).c;
                    if(hfwn0 == null) {
                        return ((ProtoLiteMessage)hfwn.a).equals(hfyn.c) ? v : hfyn.b(hfwn.a);
                    }
                    break;
                }
                case 3: {
                    hfwn0 = (haut0.b == 5 ? ((hauv)haut0.c) : hauv.a).c;
                    if(hfwn0 == null) {
                        return ((ProtoLiteMessage)hfwn.a).equals(hfyn.c) ? v : hfyn.b(hfwn.a);
                    }
                    break;
                }
                default: {
                    ((ggtj)crxu.b.j()).B("Received GCM message with unrecognized body type %s", haus0);
                    return 0x8000000000000000L;
                }
            }
        }
        return ((ProtoLiteMessage)hfwn0).equals(hfyn.c) ? v : hfyn.b(hfwn0);
    }

    static long c(haut haut0, long v) {
        switch((gsoj.b(haut0.e) == null ? gsoj.q : gsoj.b(haut0.e)).ordinal()) {
            case 1: {
                return v + hvko.a.q().i();
            }
            case 2: {
                return v + hvko.a.q().v();
            }
            case 3: {
                hauu hauu0 = haut0.b == 4 ? ((hauu)haut0.c) : hauu.a;
                hauq hauq0 = hauu0.d == null ? hauq.a : hauu0.d;
                return !hvjw.k() || hauq0 == null || hava.b(hauq0.i) != 14 ? v + hvjk.a.e().a() : hvjw.d();
            }
            case 4: {
                return v + hvle.a.b().e();
            }
            case 5: {
                return v + hvle.a.b().c();
            }
            case 6: {
                return v + hvle.a.b().a();
            }
            case 7: {
                return v + hvle.a.b().g();
            }
            case 8: {
                return v + hvle.a.b().h();
            }
            case 9: {
                return v + hvle.a.b().b();
            }
            case 10: {
                return v + hvle.a.b().f();
            }
            case 11: {
                return v + hvle.a.b().d();
            }
            default: {
                return 0x8000000000000000L;
            }
        }
    }

    final PendingIntent d(Intent intent0) {
        return fqaw.a(this.c, 0, intent0, 0xC000000);
    }

    final PendingIntent e(Intent intent0, haut haut0) {
        return fqaw.f(this.c, ((int)haut0.d), intent0, 0xC000000);
    }

    final Intent f(haut haut0, String s) {
        Intent intent0 = new Intent("com.google.android.gms.mobiledataplan.NOTIFICATION_TO_ACTIVITY");
        intent0.setComponent(new ComponentName(this.c, s));
        this.n(intent0, haut0);
        return intent0;
    }

    public final Intent g(haut haut0) {
        Intent intent0 = IntentOperation.getStartIntent(this.c, NotificationListenerIntentOperation.class, "com.google.android.gms.mobiledataplan.NOTIFICATION_DELETE");
        if(intent0 == null) {
            ((ggtj)crxu.b.j()).x("Using NotificationListenerIntentOperation.class out of GmsCore context");
            return null;
        }
        this.n(intent0, haut0);
        return intent0;
    }

    public final gfsx h(NotificationChannel notificationChannel0) {
        if(hvle.j() && TextUtils.isEmpty(notificationChannel0.getName())) {
            ((ggtj)crxu.b.j()).B("Notifications channelName is empty for channelId: %s", notificationChannel0.getId());
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gizj.a).v_newBuilder();
            String s = notificationChannel0.getId();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gizj gizj0 = (gizj)hftp0.b_message;
            s.getClass();
            gizj0.b = s;
            int v = notificationChannel0.getImportance();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gizj)hftp0.b_message).d = v;
            return gfsx.m(((gizj)hftp0.N_build()));
        }
        try {
            this.d.p(notificationChannel0);
        }
        catch(IllegalArgumentException unused_ex) {
            if(hvle.j()) {
                ((ggtj)crxu.b.j()).X("Error when creating notification channelId: %s, channelName: %s, channelImportance: %d", notificationChannel0.getId(), notificationChannel0.getName(), Integer.valueOf(notificationChannel0.getImportance()));
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gizj.a).v_newBuilder();
                String s1 = notificationChannel0.getId();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gizj gizj1 = (gizj)hftp1.b_message;
                s1.getClass();
                gizj1.b = s1;
                String s2 = notificationChannel0.getName().toString();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gizj gizj2 = (gizj)hftp1.b_message;
                s2.getClass();
                gizj2.c = s2;
                int v1 = notificationChannel0.getImportance();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ((gizj)hftp1.b_message).d = v1;
                return gfsx.m(((gizj)hftp1.N_build()));
            }
        }
        return gfqx.a;
    }

    public static hauq i(haut haut0) {
        int v = haus.a(haut0.b).ordinal();
        if(v != 0) {
            switch(v) {
                case 1: {
                    hauq hauq0 = (haut0.b == 3 ? ((haux)haut0.c) : haux.a).e;
                    return hauq0 == null ? hauq.a : hauq0;
                }
                case 2: {
                    hauq hauq1 = (haut0.b == 4 ? ((hauu)haut0.c) : hauu.a).d;
                    return hauq1 == null ? hauq.a : hauq1;
                }
                default: {
                    return null;
                }
            }
        }
        hauq hauq2 = (haut0.b == 2 ? ((hauw)haut0.c) : hauw.a).e;
        return hauq2 == null ? hauq.a : hauq2;
    }

    static String j(Context context0, hauq hauq0) {
        return !hvlb.e() || hauq0.p.isEmpty() ? "" : csli.h(context0, hauq0.p);
    }

    public final void k(String s, String s1, String s2) {
        crxt crxt0 = new crxt(this, s2, s1, s);
        this.g.execute(crxt0);
    }

    public final void l() {
        crxn crxn0 = crxn.c();
        bayn bayn0 = this.d;
        StatusBarNotification[] arr_statusBarNotification = bayn0.D();
        for(int v = 0; v < arr_statusBarNotification.length; ++v) {
            StatusBarNotification statusBarNotification0 = arr_statusBarNotification[v];
            if("com.google.android.gms.mobiledataplan.NOTIFICATION_TAG".equals(statusBarNotification0.getTag()) && ((statusBarNotification0.getNotification().flags & 16) != 0 || !hvle.n())) {
                int v1 = statusBarNotification0.getId();
                bayn0.o("com.google.android.gms.mobiledataplan.NOTIFICATION_TAG", v1, evuh.bh);
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)haut.a).v_newBuilder();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((haut)hftp0.b_message).d = (long)v1;
                crxn0.f(((haut)hftp0.N_build()), gizm.k, "MDP_UiAction", hhct.ah);
            }
        }
    }

    public static void m(List list0) {
        gged_interceptors gged0 = gged_interceptors.h(gggq.j(gggq.d(list0, new crxq()), new crxr()));
        if(!gged0.isEmpty()) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gizk.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gizk gizk0 = (gizk)hftp0.b_message;
            hfuo hfuo0 = gizk0.b;
            if(!hfuo0.c()) {
                gizk0.b = ProtoLiteMessage.E(hfuo0);
            }
            hfrj.E(gged0, gizk0.b);
            gizk gizk1 = (gizk)hftp0.N_build();
            crxn crxn0 = crxn.c();
            gizg gizg0 = crxn0.D(20, "Ui", "MDP_BgTask");
            ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)gizg0).jf(5, null);
            hftp1.X(((ProtoLiteMessage)gizg0));
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gizg gizg1 = (gizg)hftp1.b_message;
            gizk1.getClass();
            gizg1.B = gizk1;
            gizg1.b |= 0x20000;
            crxn0.d(((gizg)hftp1.N_build()), hhct.Z);
        }
    }

    final void n(Intent intent0, haut haut0) {
        gsoj gsoj0;
        int v;
        String s1;
        String s;
        hauq hauq0;
        switch(haus.a(haut0.b).ordinal()) {
            case 0: {
                hauw hauw0 = haut0.b == 2 ? ((hauw)haut0.c) : hauw.a;
                hauq0 = hauw0.e == null ? hauq.a : hauw0.e;
                s = hauq0.f;
                s1 = crxu.j(this.c, hauq0);
                v = hava.b(hauq0.i) == 0 ? 1 : hava.b(hauq0.i);
                gsoj0 = gsoj.b;
                break;
            }
            case 1: {
                haux haux0 = haut0.b == 3 ? ((haux)haut0.c) : haux.a;
                hauq0 = haux0.e == null ? hauq.a : haux0.e;
                s = hauq0.f;
                v = hava.b(hauq0.i) == 0 ? 1 : hava.b(hauq0.i);
                gsoj0 = gsoj.c;
                s1 = crxu.j(this.c, hauq0);
                break;
            }
            case 2: {
                hauu hauu0 = haut0.b == 4 ? ((hauu)haut0.c) : hauu.a;
                hauq0 = hauu0.d == null ? hauq.a : hauu0.d;
                s = hauq0.f;
                v = hava.b(hauq0.i) == 0 ? 1 : hava.b(hauq0.i);
                gsoj0 = gsoj.d;
                s1 = crxu.j(this.c, hauq0);
                break;
            }
            default: {
                return;
            }
        }
        if(hvle.f()) {
            gsoj0 = gsoj.b(haut0.e);
            if(gsoj0 == null) {
                gsoj0 = gsoj.q;
            }
        }
        intent0.putExtra("NOTIFICATION_LOGGING_REQUESTING_CPID", s).putExtra("NOTIFICATION_LOGGING_ICCID", s1).putExtra("NOTIFICATION_LOGGING_NOTIFICATION_ID", haut0.d).putExtra("NOTIFICATION_LOGGING_NOTIFICATION_TYPE", (gsoj0 == gsoj.q ? 0 : gsoj0.a())).putExtra("NOTIFICATION_LOGGING_NOTIFICATION_GENRE", (v == 1 ? 0 : hava.a(v))).putExtra("NOTIFICATION_LOGGING_MESSAGE_CASE", haus.a(haut0.b).g);
        if(hvlq.j() && !hauq0.n.isEmpty()) {
            intent0.putExtra("NOTIFICATION_LOGGING_CAMPAIGN_ID", hauq0.n);
            Level level0 = cslm.h();
            crxu.b.g(level0).B("Intent URI: \'%s\'", intent0.toURI());
        }
        haus haus0 = haus.a(haut0.b);
        if(hvlq.w() && haus0 == haus.a && (hauq0.b & 1) != 0) {
            PurchasePlanActivation purchasePlanActivation0 = new PurchasePlanActivation();
            purchasePlanActivation0.a = (hauq0.o == null ? hbyd.a : hauq0.o).b;
            hbyd hbyd0 = hauq0.o;
            purchasePlanActivation0.b = (hbyd0 == null ? hbyd.a : hbyd0).c;
            if(hbyd0 == null) {
                hbyd0 = hbyd.a;
            }
            purchasePlanActivation0.c = hbyc.a((hbyc.b(hbyd0.d) == 0 ? 1 : hbyc.b(hbyd0.d)));
            intent0.putExtra("PURCHASE_PLAN_ACTIVATION", purchasePlanActivation0);
            intent0.setAction("com.google.android.gms.mobiledataplan.ui.PURCHASE_PLAN_ACTIVATION");
            Level level1 = cslm.h();
            crxu.b.g(level1).B("Plan activation was added for %s", haus0);
        }
        ArrayList arrayList0 = new ArrayList(haut0.g.size());
        ArrayList arrayList1 = new ArrayList(haut0.g.size());
        for(Object object0: haut0.g) {
            arrayList0.add(((hauy)object0).c);
            arrayList1.add(Integer.valueOf(((hauy)object0).b));
            if(hvle.a.b().z()) {
                int v1 = haut0.b;
                if(haus.a(v1) == haus.b) {
                    haux haux1 = v1 == 3 ? ((haux)haut0.c) : haux.a;
                    gsqd gsqd0 = haux1.c == null ? gsqd.a : haux1.c;
                    if(gsqd0.d.size() == 0) {
                        Level level2 = cslm.h();
                        crxu.b.g(level2).x("Empty list for UpsellPlans, no PlanID for direct access");
                    }
                    else if(gsqd0.d.size() > 1) {
                        Level level3 = cslm.h();
                        crxu.b.g(level3).x("There is more than one plan for direct UpsellPlan purchase!");
                    }
                    else {
                        String s2 = ((gsqf)gsqd0.d.get(0)).d;
                        if(TextUtils.isEmpty(s2)) {
                            Level level4 = cslm.h();
                            crxu.b.g(level4).x("Empty plan id, do not add direct access");
                        }
                        else {
                            intent0.putExtra("NOTIFICATION_ACTION_UPSELL_PLAN_ID", s2);
                        }
                    }
                }
            }
        }
        intent0.putExtra("NOTIFICATION_ACTION_LABELS", ((String[])arrayList0.toArray(new String[0])));
        intent0.putExtra("NOTIFICATION_ACTION_TYPES", glwy.n(arrayList1));
        intent0.setFlags(0x24008000);
    }

    public final void o(int v) {
        bboh bboh0 = crxu.b;
        ((ggtj)bboh0.h()).z("Attempting to remove notification with ID %d", v);
        bayn bayn0 = this.d;
        StatusBarNotification[] arr_statusBarNotification = bayn0.D();
        for(int v1 = 0; v1 < arr_statusBarNotification.length; ++v1) {
            StatusBarNotification statusBarNotification0 = arr_statusBarNotification[v1];
            ((ggtj)bboh0.h()).z("Found notification with ID %d", statusBarNotification0.getId());
            if(Objects.equals(statusBarNotification0.getTag(), "com.google.android.gms.mobiledataplan.NOTIFICATION_TAG") && statusBarNotification0.getId() == v) {
                ((ggtj)bboh0.h()).z("Removing notification with ID %d", v);
                bayn0.o("com.google.android.gms.mobiledataplan.NOTIFICATION_TAG", v, evuh.bh);
            }
        }
    }

    public final void p(haut haut0) {
        crxs crxs0 = new crxs(this, haut0);
        this.g.execute(crxs0);
    }

    public final boolean q() {
        return bayo.a(this.c).f();
    }

    public final boolean r(String s) {
        return this.e.b(s) ? this.d.d("com.google.android.gms.mobiledataplan.NOTIFICATION") != null && !this.d.d("com.google.android.gms.mobiledataplan.NOTIFICATION").isBlocked() && this.d.c(s) != null && this.d.c(s).getImportance() != 0 : false;
    }

    public static boolean s(gsoj gsoj0) {
        if(!hvle.f()) {
            switch(gsoj0.ordinal()) {
                case 1: {
                    return true;
                }
                case 2: {
                    return hvko.K();
                }
                case 3: {
                    return true;
                }
                default: {
                    return false;
                }
            }
        }
        int v = gsoj0.ordinal();
        if(v != 14) {
            switch(v) {
                case 1: {
                    return hvle.a.b().I();
                }
                case 2: {
                    return hvle.a.b().O();
                }
                case 3: {
                    return hvle.e();
                }
                case 4: {
                    return hvle.l();
                }
                case 5: {
                    return hvle.i();
                }
                case 6: {
                    return hvle.g();
                }
                case 7: {
                    return hvle.o();
                }
                case 8: {
                    return hvle.a.b().M();
                }
                case 9: {
                    return hvle.h();
                }
                case 10: {
                    return hvle.m();
                }
                case 11: {
                    return hvle.k();
                }
                default: {
                    return false;
                }
            }
        }
        return hvlq.m();
    }

    public static final NotificationChannel t(String s, String s1, int v) {
        NotificationChannel notificationChannel0 = new NotificationChannel(s, s1, v);
        notificationChannel0.setGroup("com.google.android.gms.mobiledataplan.NOTIFICATION");
        return notificationChannel0;
    }

    public static gspe u(ProtoLiteBuilder hftp0, long v) {
        hfwn hfwn0 = hfyn.h(System.currentTimeMillis());
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gspe gspe0 = (gspe)hftp0.b_message;
        hfwn0.getClass();
        gspe0.g = hfwn0;
        gspe0.b |= 2;
        hfwn hfwn1 = ((gspe)hftp0.b_message).f;
        if(hfwn1 == null) {
            hfwn1 = hfwn.a;
        }
        int v1 = 1;
        if(((ProtoLiteMessage)hfwn1).equals(hfyn.c)) {
            ProtoLiteMessage hftv0 = hftp0.b_message;
            hfwn hfwn2 = ((gspe)hftv0).g;
            if(hfwn2 == null) {
                hfwn2 = hfwn.a;
            }
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            gspe gspe1 = (gspe)hftp0.b_message;
            hfwn2.getClass();
            gspe1.f = hfwn2;
            gspe1.b |= 1;
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((gspe)hftv1).h = v;
        long v2 = ((gspe)hftv1).d + 1L;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp0.b_message;
        ((gspe)hftv2).d = v2;
        long v3 = ((gspe)hftv2).e + 1L;
        if(!hftv2.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv3 = hftp0.b_message;
        ((gspe)hftv3).e = v3;
        int v4 = hava.b(((gspe)hftv3).c);
        if(v4 != 0) {
            v1 = v4;
        }
        if(!hftv3.isImmutable()) {
            hftp0.ensureMutable();
        }
        gspe gspe2 = (gspe)hftp0.b_message;
        gspe2.c = hava.a(v1);
        return (gspe)hftp0.N_build();
    }
}

