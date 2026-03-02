import android.app.Notification;
import android.app.NotificationChannel;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.VersionedPackage;
import android.content.rollback.PackageRollbackInfo;
import android.content.rollback.RollbackInfo;
import android.content.rollback.RollbackManager;
import android.os.Bundle;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.phonesky.recovery.NotificationClickedIntentOperation;
import com.google.android.gms.phonesky.recovery.RollbackCommittedIntentOperation;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public final class eius {
    private final Context a;
    private final eive b;
    private final eiuq c;
    private final eiur d;
    private final eivd e;

    public eius(Context context0) {
        eive eive0 = new eive(context0, new eiur(context0));
        eiuq eiuq0 = new eiuq(new bbsq(context0));
        eiur eiur0 = new eiur(context0);
        super();
        this.e = eivd.a();
        this.a = context0;
        this.b = eive0;
        this.c = eiuq0;
        this.d = eiur0;
    }

    public final void a() {
        long v1;
        Intent intent0;
        Context context0 = this.a;
        if(bbnp.i(context0) && !hxmt.a.e().h()) {
            eiup.b("Latchsky device, recovery not supported", new Object[0]);
            return;
        }
        String s = hxmt.f();
        if(this.c.a(s)) {
            eiur eiur0 = this.d;
            eiur0.a(5);
            RollbackManager rollbackManager0 = (RollbackManager)context0.getSystemService("rollback");
            if(rollbackManager0 == null) {
                eiur0.b(6, 3);
                eiup.b("Failed to get RollbackManager", new Object[0]);
            }
            else {
                List list0 = rollbackManager0.getAvailableRollbacks();
                if(list0 != null && !list0.isEmpty()) {
                    eivf eivf0 = null;
                    Iterator iterator0 = list0.iterator();
                    while(true) {
                        intent0 = null;
                        if(!iterator0.hasNext()) {
                            break;
                        }
                        Object object0 = iterator0.next();
                        RollbackInfo rollbackInfo0 = (RollbackInfo)object0;
                        Iterator iterator1 = rollbackInfo0.getPackages().iterator();
                    label_22:
                        if(iterator1.hasNext()) {
                            Object object1 = iterator1.next();
                            PackageRollbackInfo packageRollbackInfo0 = (PackageRollbackInfo)object1;
                            if(!"com.android.vending".equals(packageRollbackInfo0.getPackageName())) {
                                goto label_22;
                            }
                            int v = rollbackInfo0.getRollbackId();
                            VersionedPackage versionedPackage0 = packageRollbackInfo0.getVersionRolledBackFrom();
                            if(versionedPackage0 == null) {
                                throw new NullPointerException("Null versionRolledBackFrom");
                            }
                            eivf0 = new eivf(v, versionedPackage0);
                            break;
                        }
                    }
                    if(eivf0 == null) {
                        eiur0.a(7);
                        eiup.a("No rollback is available for %s", new Object[]{"com.android.vending"});
                    }
                    else {
                        BlockingQueue blockingQueue0 = RollbackCommittedIntentOperation.a;
                        if(!blockingQueue0.isEmpty()) {
                            blockingQueue0.clear();
                        }
                        gged_interceptors gged0 = gged_interceptors.l(eivf0.b);
                        Intent intent1 = new Intent("android.intent.action.ROLLBACK_COMMITTED");
                        PendingIntent pendingIntent0 = RollbackCommittedIntentOperation.getPendingIntent(context0, RollbackCommittedIntentOperation.class, intent1, 0, 0x2000000);
                        gftb.check(pendingIntent0);
                        IntentSender intentSender0 = pendingIntent0.getIntentSender();
                        rollbackManager0.commitRollback(eivf0.a, gged0, intentSender0);
                        try {
                            intent0 = (Intent)blockingQueue0.poll(RollbackCommittedIntentOperation.b, TimeUnit.MILLISECONDS);
                        }
                        catch(InterruptedException unused_ex) {
                        }
                        if(intent0 == null) {
                            this.d.b(6, 3);
                            eiup.b("Failed to receive the status of rollback", new Object[0]);
                        }
                        else {
                            if(intent0.getIntExtra("android.content.rollback.extra.STATUS", 1) == 0) {
                                this.d.a(6);
                                eiup.a("Package successfully rolled back", new Object[0]);
                                return;
                            }
                            this.d.b(6, 3);
                            eiup.b("Rollback of Phonesky failed: %s", new Object[]{intent0.getStringExtra("android.content.rollback.extra.STATUS_MESSAGE")});
                        }
                    }
                }
                else {
                    eiur0.a(7);
                    eiup.a("No rollback is available", new Object[0]);
                }
            }
        }
        try {
            v1 = (long)(((Long)((glyq)this.e.c()).u()));
        }
        catch(ExecutionException | InterruptedException unused_ex) {
            eiup.b("Error getting notificationLastShownTimestampMs from ProtoDataStore", new Object[0]);
            v1 = -1L;
        }
        String s1 = hxmt.f();
        boolean z = this.c.a(s1);
        if(Long.compare(v1, -1L) != 0) {
            long v2 = System.currentTimeMillis() - v1;
            if(v2 < hxmt.c() && !z) {
                try {
                    this.e.d();
                }
                catch(ExecutionException | InterruptedException unused_ex) {
                    eiup.b("Failed to reset ProtoDataStore", new Object[0]);
                }
                this.d.a(4);
                eiup.a("Package successfully uninstalled", new Object[0]);
                return;
            }
            if(v2 < hxmt.a.e().b()) {
                eiup.b("Notification recently shown", new Object[0]);
                return;
            }
        }
        this.b.b();
        try {
            this.e.d();
        }
        catch(ExecutionException | InterruptedException unused_ex) {
            eiup.b("Failed to reset ProtoDataStore", new Object[0]);
        }
        if(z) {
            eiup.a("Should show recovery notification", new Object[0]);
            eive eive0 = this.b;
            gfsx gfsx0 = eive0.c;
            if(gfsx0.i()) {
                if(((bayn)gfsx0.d()).c("com.google.android.gms.phonesky.recovery.ShowNotification") == null) {
                    NotificationChannel notificationChannel0 = new NotificationChannel("com.google.android.gms.phonesky.recovery.ShowNotification", eive0.a(0x7F151A71), 2);  // string:notification_channel_name "Google Play Store Recovery"
                    ((bayn)gfsx0.d()).p(notificationChannel0);
                }
                bayn bayn0 = (bayn)gfsx0.d();
                Intent intent2 = IntentOperation.getStartIntent(eive0.a, NotificationClickedIntentOperation.class, "com.google.android.gms.phonesky.recovery.CLICK");
                PendingIntent pendingIntent1 = PendingIntent.getService(eive0.a, 1, intent2, 0xA000000);
                juo juo0 = new juo(eive0.a, "com.google.android.gms.phonesky.recovery.ShowNotification");
                juo0.s(avyq.a(eive0.a, 0x7F080DB4));
                juo0.K(true);
                juo0.m = -1;
                juo0.D(eive0.a(0x7F151A77));  // string:notification_content_title "The Play Store app isn\'t working."
                juo0.k(eive0.a(0x7F151A75));  // string:notification_content_text "To fix it, install a recovery version of the app."
                juo0.h = pendingIntent1;
                juo0.d(avyq.a(eive0.a, 0x7F080D05), eive0.a(0x7F150815), pendingIntent1);  // string:common_continue "Continue"
                Bundle bundle0 = new Bundle();
                bundle0.putString("android.substName", eive0.a(0x7F151A70));  // string:notification_app_name "Google Play Store"
                juo0.e(bundle0);
                Notification notification0 = juo0.a();
                bayn0.w(1, evuh.Y, notification0);
                try {
                    ((glyq)eive0.d.a.b(new eiut(System.currentTimeMillis()), gmap.a)).u();
                }
                catch(ExecutionException | InterruptedException unused_ex) {
                    eiup.b("Failed to update notificationLastShownTimestampMs in ProtoDataStore", new Object[0]);
                }
                eive0.b.a(2);
                return;
            }
            eiup.b("Missing NotificationManager", new Object[0]);
            eive0.b.b(2, 3);
        }
    }
}

