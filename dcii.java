import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.PendingIntent.CanceledException;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.nearby.sharing.NotificationChimeraBroadcastReceiver;
import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.ShareTargetAction;
import com.google.android.gms.nearby.sharing.StreamAttachment;
import com.google.android.gms.nearby.sharing.TransferMetadata;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class dcii {
    public final Context a;
    public final cuqn b;
    public final ddlj c;
    private static dcii d;
    private final ScheduledExecutorService e;

    private dcii(Context context0, ddlj ddlj0) {
        this.e = cuui.f();
        this.a = context0;
        cuqn cuqn0 = new cuqn(context0);
        this.b = cuqn0;
        this.c = ddlj0;
        cuqn0.c = true;
        cuqn0.g(new NotificationChannelGroup("NEARBY_SHARING_CHANNEL_GROUP_ID", "Quick Share"));
        NotificationChannel notificationChannel0 = new NotificationChannel("nearby_sharing_file", "File Transfers", 4);
        notificationChannel0.setDescription("Files from other users.");
        notificationChannel0.setGroup("NEARBY_SHARING_CHANNEL_GROUP_ID");
        dcii.y(notificationChannel0);
        cuqn0.f(notificationChannel0);
        NotificationChannel notificationChannel1 = new NotificationChannel("nearby_sharing_alert", "Alerts", 4);
        notificationChannel1.setDescription("Shown when a nearby device is trying to send a file");
        notificationChannel1.setGroup("NEARBY_SHARING_CHANNEL_GROUP_ID");
        dcii.y(notificationChannel1);
        cuqn0.f(notificationChannel1);
        NotificationChannel notificationChannel2 = new NotificationChannel("nearby_sharing_privacy", "Privacy Reminder", 2);
        notificationChannel2.setDescription("@com.google.android.gms:string/sharing_visible_to_nearby_devices");
        notificationChannel2.setGroup("NEARBY_SHARING_CHANNEL_GROUP_ID");
        dcii.y(notificationChannel2);
        cuqn0.f(notificationChannel2);
        NotificationChannel notificationChannel3 = new NotificationChannel("nearby_sharing_app", "App Installs", 4);
        notificationChannel3.setDescription("Installs the app through Quick Share");
        notificationChannel3.setGroup("NEARBY_SHARING_CHANNEL_GROUP_ID");
        dcii.y(notificationChannel3);
        cuqn0.f(notificationChannel3);
        if(hvrc.I()) {
            NotificationChannel notificationChannel4 = new NotificationChannel("nearby_sharing_privacy_interrupting", "Interrupting alerts", 4);
            notificationChannel4.setDescription("Shown when privacy-sensitive information needs to be displayed");
            notificationChannel4.setGroup("NEARBY_SHARING_CHANNEL_GROUP_ID");
            cuqn0.f(notificationChannel4);
        }
        if(cuqn0.a("nearby_sharing") != null) {
            cuqn0.h("nearby_sharing");
        }
    }

    public final PendingIntent a(ShareTarget shareTarget0, TransferMetadata transferMetadata0) {
        Intent intent0 = new Intent();
        String s = hvod.c() ? "com.google.android.gms.nearby.sharing.main.MainActivity" : "com.google.android.gms.nearby.sharing.receive.ReceiveActivity";
        Intent intent1 = intent0.setClassName(this.a, s).addFlags(0x10000000).addFlags(0x8000).putExtra("share_target_bytes", dcii.r(shareTarget0)).putExtra("com.google.android.gms.nearby.sharing.TOTAL_ATTACHMENT_COUNT", shareTarget0.e().size()).putExtra("transfer_metadata_bytes", bauc.n(transferMetadata0));
        PendingIntent pendingIntent0 = fqaw.a(this.a, shareTarget0.hashCode(), intent1, 0xC000000);
        gftb.check(pendingIntent0);
        return pendingIntent0;
    }

    public final PendingIntent b() {
        Intent intent0 = new Intent();
        String s = hvod.c() ? "com.google.android.gms.nearby.sharing.main.MainActivity" : "com.google.android.gms.nearby.sharing.settings.SettingsActivity";
        Intent intent1 = intent0.setClassName(this.a, s).setPackage("com.google.android.gms").addFlags(0x10000000).addFlags(0x8000).putExtra("is_from_onboarding", true);
        PendingIntent pendingIntent0 = fqaw.a(this.a, 1001, intent1, 0xC000000);
        gftb.check(pendingIntent0);
        return pendingIntent0;
    }

    public final PendingIntent c(Map map0, Intent intent0) {
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: map0.keySet()) {
            arrayList0.add(dizi.d(((ShareTarget)object0)));
        }
        ArrayList arrayList1 = new ArrayList();
        Collections.sort(arrayList0, new dcih(map0));
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            TransferMetadata transferMetadata0 = (TransferMetadata)map0.get(((ShareTarget)arrayList0.get(v1)));
            if(transferMetadata0 == null) {
                transferMetadata0 = new dcnn(1000).a();
            }
            arrayList1.add(transferMetadata0);
        }
        Intent intent1 = djaj.e(intent0);
        Context context0 = this.a;
        Intent intent2 = intent1.setClassName(context0, (hvod.c() ? "com.google.android.gms.nearby.sharing.main.MainActivity" : "com.google.android.gms.nearby.sharing.send.SendActivity")).addFlags(0x10000000).addFlags(0x8000);
        if(hvod.c()) {
            intent2.putExtra("is_for_send_surface", true);
        }
        ArrayList arrayList2 = new ArrayList(arrayList0.size());
        for(Object object1: arrayList0) {
            arrayList2.add(StreamAttachment.e(((ShareTarget)object1)));
        }
        bauc.k(arrayList2, intent2, "share_target_bytes");
        bauc.k(arrayList1, intent2, "transfer_metadata_bytes");
        PendingIntent pendingIntent0 = fqaw.a(context0, 1001, intent2, 0xC000000);
        gftb.check(pendingIntent0);
        return pendingIntent0;
    }

    public static dcii d(Context context0) {
        ddlj ddlj0 = new ddlj(context0.getApplicationContext(), bbnk.a);
        if(dcii.d == null) {
            dcii.d = new dcii(new adv(context0.getApplicationContext(), context0.getTheme()), ddlj0);
        }
        return dcii.d;
    }

    public final void e() {
        cuqn cuqn0 = this.b;
        StatusBarNotification[] arr_statusBarNotification = cuqn0.k();
        for(int v = 0; v < arr_statusBarNotification.length; ++v) {
            StatusBarNotification statusBarNotification0 = arr_statusBarNotification[v];
            if("nearby_sharing".equals(statusBarNotification0.getTag())) {
                cuqn0.e(statusBarNotification0.getTag(), statusBarNotification0.getId());
            }
        }
    }

    public final void f(ShareTarget shareTarget0) {
        if(bbqa.c() && shareTarget0.o == 1) {
            this.i();
            return;
        }
        this.b.e("nearby_sharing", djbr.d(1, shareTarget0));
    }

    public final void g() {
        this.b.e("nearby_sharing", 3);
    }

    public final void h(int v) {
        this.b.e("nearby_sharing", dcii.t(v));
    }

    public final void i() {
        this.b.e("nearby_sharing", 5);
    }

    public final void j(int v) {
        int v1;
        Context context0 = this.a;
        if(dcww.b(context0).d()) {
            return;
        }
        switch(v) {
            case 0: {
                v1 = 0x7F152C5B;  // string:sharing_notification_channel_hidden_visibility "To protect your privacy, 
                                  // no one can share with you. Tap to change."
                break;
            }
            case 4: {
                v1 = 0x7F152C5C;  // string:sharing_notification_channel_self_share_visibility "To protect your privacy, 
                                  // only your devices can share with you. Tap to change."
                break;
            }
            default: {
                v1 = 0x7F152C51;  // string:sharing_notification_channel_contacts_visibility "To protect your privacy, 
                                  // only contacts can share with you. Tap to change."
            }
        }
        cuqi cuqi0 = new cuqi(context0, "nearby_sharing_privacy");
        cuqi0.ag(new juk());
        cuqi0.Z("Everyone mode has ended");
        cuqi0.Y(context0.getString(v1));
        cuqi0.h = this.b();
        cuqi0.al();
        cuqi0.m = 0;
        cuqi0.ak();
        cuqi0.ad(true);
        cuqi0.X(true);
        cuqi0.D = djbm.a(context0);
        cuqi0.ao();
        cuqi0.an();
        cuqi0.af(0x7F080EEC);  // drawable:sharing_ic_v3_foreground
        cuqi0.aj("Quick Share");
        dcii.w(cuqi0);
        this.u(4, cuqi0.a());
    }

    public final void k(ShareTarget shareTarget0, TransferMetadata transferMetadata0) {
        Context context0 = this.a;
        if(!dcww.b(context0).d()) {
            CharSequence charSequence0 = TextUtils.isEmpty(transferMetadata0.c) ? djbr.q(context0, shareTarget0) : djbr.p(context0, shareTarget0, transferMetadata0.c);
            if(!dcww.b(context0).d()) {
                int v = dcii.s(shareTarget0);
                cuqi cuqi0 = new cuqi(context0, "nearby_sharing_file");
                cuqi0.ag(new juk());
                cuqi0.ab(dizk.d(new ddlt(context0, shareTarget0)));
                cuqi0.Z(shareTarget0.b);
                cuqi0.Y(charSequence0);
                cuqi0.h = this.a(shareTarget0, transferMetadata0);
                Intent intent0 = new Intent("com.google.android.gms.nearby.sharing.ACTION_DISMISS").setPackage("com.google.android.gms").putExtra("share_target_bytes", dcii.r(shareTarget0)).putExtra("com.google.android.gms.nearby.sharing.TOTAL_ATTACHMENT_COUNT", shareTarget0.e().size()).putExtra("notification_id", v);
                PendingIntent pendingIntent0 = IntentOperation.getPendingIntent(context0, NotificationChimeraBroadcastReceiver.class, intent0, djbr.d(1006, shareTarget0), 0xC000000, false);
                gftb.check(pendingIntent0);
                cuqi0.aa(pendingIntent0);
                cuqi0.al();
                cuqi0.m = 2;
                cuqi0.ak();
                cuqi0.ac(true);
                cuqi0.ad(true);
                cuqi0.D = djbm.a(context0);
                cuqi0.an();
                this.x(shareTarget0);
                cuqi0.ai();
                cuqi0.af(0x7F080EEC);  // drawable:sharing_ic_v3_foreground
                cuqi0.aj("Quick Share");
                if(!shareTarget0.n || !transferMetadata0.i) {
                    CharSequence charSequence1 = context0.getText(0x7F152B9D);  // string:sharing_action_reject "@com.google.android.gms:string/common_decline"
                    Intent intent1 = new Intent("com.google.android.gms.nearby.sharing.ACTION_REJECT").setPackage("com.google.android.gms").putExtra("share_target_bytes", dcii.r(shareTarget0)).putExtra("com.google.android.gms.nearby.sharing.TOTAL_ATTACHMENT_COUNT", shareTarget0.e().size()).putExtra("notification_id", v);
                    PendingIntent pendingIntent1 = IntentOperation.getPendingIntent(context0, NotificationChimeraBroadcastReceiver.class, intent1, djbr.d(1003, shareTarget0), 0xC000000, false);
                    gftb.check(pendingIntent1);
                    cuqi0.W(0x7F080B22, charSequence1, pendingIntent1);  // drawable:quantum_gm_ic_clear_vd_theme_24
                }
                dcii.w(cuqi0);
                cuqi0.X(true);
                this.u(v, cuqi0.a());
            }
        }
    }

    public final void l(ShareTarget shareTarget0, List list0, int v) {
        String s;
        Context context0 = this.a;
        if(dcww.b(context0).d()) {
            return;
        }
        int v1 = dcii.s(shareTarget0);
        Intent intent0 = new Intent("com.google.android.gms.nearby.sharing.ACTION_DISMISS").setPackage("com.google.android.gms").putExtra("share_target_bytes", dcii.r(shareTarget0)).putExtra("com.google.android.gms.nearby.sharing.TOTAL_ATTACHMENT_COUNT", shareTarget0.e().size()).putExtra("notification_id", v1);
        PendingIntent pendingIntent0 = IntentOperation.getPendingIntent(context0, NotificationChimeraBroadcastReceiver.class, intent0, djbr.d(1006, shareTarget0), 0xC000000, false);
        cuqi cuqi0 = new cuqi(context0, "nearby_sharing_file");
        cuqi0.ag(new juk());
        dcnn dcnn0 = new dcnn(1006);
        dcnn0.i = v;
        cuqi0.h = this.a(shareTarget0, dcnn0.a());
        gftb.check(pendingIntent0);
        cuqi0.aa(pendingIntent0);
        cuqi0.al();
        cuqi0.m = 2;
        cuqi0.ak();
        cuqi0.D = djbm.a(context0);
        cuqi0.ad(false);
        cuqi0.an();
        this.x(shareTarget0);
        cuqi0.ai();
        cuqi0.af(0x7F080EEC);  // drawable:sharing_ic_v3_foreground
        cuqi0.aj("Quick Share");
        if(v == 0) {
            for(Object object0: list0) {
                PendingIntent pendingIntent1 = fqaw.a(context0, ((ShareTargetAction)object0).hashCode(), new Intent().setClassName(context0, "com.google.android.gms.nearby.sharing.NotificationActionActivity").addFlags(0x10000000).addFlags(0x8000).putExtra("share_target_bytes", dcii.r(shareTarget0)).putExtra("com.google.android.gms.nearby.sharing.TOTAL_ATTACHMENT_COUNT", shareTarget0.e().size()).putExtra("share_pending_intent", ((ShareTargetAction)object0).c).putExtra("notification_id", v1), 0xC000000);
                gftb.check(pendingIntent1);
                cuqi0.W(0, ((ShareTargetAction)object0).a, pendingIntent1);
            }
            cuqi0.Z(shareTarget0.b);
            if(djbr.B(shareTarget0)) {
                s = "Text received";
            }
            else {
                String s1 = djbr.r(context0, shareTarget0.e().size(), shareTarget0.e());
                s = ((adv)context0).a().getString(0x7F152C6A, new Object[]{s1});  // string:sharing_notification_incoming_complete_file_v2 "%1$s received"
            }
            cuqi0.Y(s);
            cuqi0.ab(dizk.d(new ddlt(context0, shareTarget0)));
        }
        else {
            cuqi0.Z("Received clipboard content");
            cuqi0.Y("Ready to paste");
        }
        dcii.w(cuqi0);
        cuqi0.X(true);
        this.u(v1, cuqi0.a());
    }

    public final void m(ShareTarget shareTarget0, TransferMetadata transferMetadata0) {
        Context context0 = this.a;
        if(dcww.b(context0).d()) {
            return;
        }
        int v = dcii.s(shareTarget0);
        cuqi cuqi0 = new cuqi(context0, "nearby_sharing_file");
        cuqi0.ag(new juk());
        cuqi0.ab(dizk.d(new ddlt(context0, shareTarget0)));
        cuqi0.Z(shareTarget0.b);
        cuqi0.Y("Can\'t complete transfer");
        cuqi0.h = this.a(shareTarget0, transferMetadata0);
        Intent intent0 = new Intent("com.google.android.gms.nearby.sharing.ACTION_DISMISS").setPackage("com.google.android.gms").putExtra("share_target_bytes", dcii.r(shareTarget0)).putExtra("com.google.android.gms.nearby.sharing.TOTAL_ATTACHMENT_COUNT", shareTarget0.e().size()).putExtra("notification_id", v);
        PendingIntent pendingIntent0 = IntentOperation.getPendingIntent(context0, NotificationChimeraBroadcastReceiver.class, intent0, djbr.d(1006, shareTarget0), 0xC000000, false);
        gftb.check(pendingIntent0);
        cuqi0.aa(pendingIntent0);
        cuqi0.al();
        cuqi0.m = 2;
        cuqi0.ak();
        cuqi0.D = djbm.a(context0);
        cuqi0.ad(true);
        cuqi0.an();
        this.x(shareTarget0);
        cuqi0.ai();
        cuqi0.af(0x7F080EEC);  // drawable:sharing_ic_v3_foreground
        cuqi0.aj("Quick Share");
        dcii.w(cuqi0);
        cuqi0.X(true);
        this.u(v, cuqi0.a());
        this.o(v, shareTarget0);
    }

    public final void n(ShareTarget shareTarget0, TransferMetadata transferMetadata0, boolean z) {
        Context context0 = this.a;
        if(!dcww.b(context0).d()) {
            String s = transferMetadata0.c;
            if(z) {
                dcvz.a.b().p("Launch receive surface for non-automotive form factor.", new Object[0]);
                try {
                    PendingIntent pendingIntent0 = fqaw.a(context0, shareTarget0.hashCode(), new Intent().setClassName(context0, "com.google.android.gms.nearby.sharing.receive.ReceiveActivity").addFlags(0x10000000).addFlags(0x8000).putExtra("share_target_bytes", dcii.r(shareTarget0)).putExtra("com.google.android.gms.nearby.sharing.TOTAL_ATTACHMENT_COUNT", shareTarget0.e().size()).putExtra("transfer_metadata_bytes", bauc.n(transferMetadata0)), 0xC000000);
                    gftb.check(pendingIntent0);
                    pendingIntent0.send();
                    return;
                }
                catch(PendingIntent.CanceledException pendingIntent$CanceledException0) {
                    dcvz.a.e().f(pendingIntent$CanceledException0).p("Failed to launch receive surface.", new Object[0]);
                }
            }
            CharSequence charSequence0 = TextUtils.isEmpty(s) ? djbr.q(this.a, shareTarget0) : djbr.p(this.a, shareTarget0, s);
            Context context1 = this.a;
            if(!dcww.b(context1).d()) {
                int v = dcii.s(shareTarget0);
                cuqi cuqi0 = new cuqi(context1, "nearby_sharing_file");
                cuqi0.ag(new juk());
                cuqi0.ab(dizk.d(new ddlt(context1, shareTarget0)));
                cuqi0.h = this.a(shareTarget0, transferMetadata0);
                Intent intent0 = new Intent("com.google.android.gms.nearby.sharing.ACTION_DISMISS").setPackage("com.google.android.gms").putExtra("share_target_bytes", dcii.r(shareTarget0)).putExtra("com.google.android.gms.nearby.sharing.TOTAL_ATTACHMENT_COUNT", shareTarget0.e().size()).putExtra("notification_id", v);
                PendingIntent pendingIntent1 = IntentOperation.getPendingIntent(context1, NotificationChimeraBroadcastReceiver.class, intent0, djbr.d(1006, shareTarget0), 0xC000000, false);
                gftb.check(pendingIntent1);
                cuqi0.aa(pendingIntent1);
                cuqi0.al();
                cuqi0.m = 2;
                cuqi0.ak();
                cuqi0.ac(true);
                cuqi0.D = djbm.a(context1);
                cuqi0.an();
                this.x(shareTarget0);
                cuqi0.ai();
                cuqi0.af(0x7F080EEC);  // drawable:sharing_ic_v3_foreground
                cuqi0.aj("Quick Share");
                cuqi0.Z(shareTarget0.b);
                cuqi0.Y(charSequence0);
                CharSequence charSequence1 = context1.getText(0x7F152B9D);  // string:sharing_action_reject "@com.google.android.gms:string/common_decline"
                Intent intent1 = new Intent("com.google.android.gms.nearby.sharing.ACTION_REJECT").setPackage("com.google.android.gms").putExtra("share_target_bytes", dcii.r(shareTarget0)).putExtra("com.google.android.gms.nearby.sharing.TOTAL_ATTACHMENT_COUNT", shareTarget0.e().size()).putExtra("notification_id", v);
                PendingIntent pendingIntent2 = IntentOperation.getPendingIntent(context1, NotificationChimeraBroadcastReceiver.class, intent1, djbr.d(1003, shareTarget0), 0xC000000, false);
                gftb.check(pendingIntent2);
                cuqi0.W(0x7F080B22, charSequence1, pendingIntent2);  // drawable:quantum_gm_ic_clear_vd_theme_24
                CharSequence charSequence2 = context1.getText(0x7F152B8C);  // string:sharing_action_accept "@com.google.android.gms:string/common_accept"
                Intent intent2 = new Intent("com.google.android.gms.nearby.sharing.ACTION_ACCEPT").setPackage("com.google.android.gms").putExtra("share_target_bytes", dcii.r(shareTarget0)).putExtra("com.google.android.gms.nearby.sharing.TOTAL_ATTACHMENT_COUNT", shareTarget0.e().size()).putExtra("notification_id", v);
                PendingIntent pendingIntent3 = IntentOperation.getPendingIntent(context1, NotificationChimeraBroadcastReceiver.class, intent2, djbr.d(1002, shareTarget0), 0xC000000, false);
                gftb.check(pendingIntent3);
                cuqi0.W(0x7F080B54, charSequence2, pendingIntent3);  // drawable:quantum_gm_ic_done_vd_theme_24
                dcii.w(cuqi0);
                cuqi0.X(true);
                this.u(v, cuqi0.a());
            }
        }
    }

    final void o(int v, ShareTarget shareTarget0) {
        this.p(v, shareTarget0, hvqs.a.aT().br());
    }

    public final void p(int v, ShareTarget shareTarget0, long v1) {
        dcig dcig0 = new dcig(this, v, shareTarget0);
        ((cuuh)this.e).g(dcig0, v1, TimeUnit.MILLISECONDS);
    }

    public final boolean q() {
        StatusBarNotification[] arr_statusBarNotification = this.b.k();
        for(int v = 0; v < arr_statusBarNotification.length; ++v) {
            StatusBarNotification statusBarNotification0 = arr_statusBarNotification[v];
            if("nearby_sharing".equals(statusBarNotification0.getTag()) && statusBarNotification0.getId() == 3) {
                return true;
            }
        }
        return false;
    }

    static byte[] r(ShareTarget shareTarget0) {
        ShareTarget shareTarget1 = dizi.d(shareTarget0);
        if(hvqz.a.b().aD() && !shareTarget1.g().isEmpty()) {
            dcls dcls0 = StreamAttachment.e(shareTarget1).b();
            dcls0.s = shareTarget1.n;
            return bauc.n(dcls0.a());
        }
        return bauc.n(StreamAttachment.e(shareTarget1));
    }

    public static final int s(ShareTarget shareTarget0) {
        return !bbqa.c() || shareTarget0.o != 1 ? djbr.d(1, shareTarget0) : 5;
    }

    static int t(int v) {
        return (v << 10) + 2;
    }

    public final void u(int v, Notification notification0) {
        if(notification0.getSmallIcon() == null) {
            dcvz.a.e().h("Invalid notification (no valid small icon) %s", notification0);
            return;
        }
        this.b.j("nearby_sharing", v, notification0);
    }

    public static final void v() {
        dcii dcii0 = dcii.d;
        if(dcii0 != null) {
            cjpa cjpa0 = dcii0.c.a().c();
            cjpa0.j("enable_long_timeout_for_hide_dismissed_notification");
            cjpa0.j("most_recent_notification_dismissed_timestamp");
            cjpd.g(cjpa0);
            dcvz.a.b().p("Resetting the fast init notification blacklist.", new Object[0]);
            dcii dcii1 = dcii.d;
            batl.s(dcii1);
            dcii1.e();
        }
    }

    public static final void w(cuqi cuqi0) {
        cuqi0.ap();
        cuqi0.ah(new long[0]);
    }

    public final void x(ShareTarget shareTarget0) {
        dizk.f(new ddlt(this.a, shareTarget0));
    }

    private static final void y(NotificationChannel notificationChannel0) {
        notificationChannel0.setSound(null, null);
        notificationChannel0.enableVibration(false);
    }
}

