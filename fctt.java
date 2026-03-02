import android.app.Notification.Action.Builder;
import android.app.Notification.Action;
import android.app.Notification.Builder;
import android.app.Notification;
import android.app.PendingIntent;
import com.google.android.gms.wearable.backup.wear.WearBackupOptInChimeraActivity;
import com.google.android.gms.wearable.backup.wear.WearBackupOptInNotificationService;
import com.google.android.gms.wearable.backup.wear.WearBackupSettingsChimeraActivity;
import java.util.concurrent.atomic.AtomicReference;

public final class fctt implements glzn {
    public final WearBackupOptInNotificationService a;

    public fctt(WearBackupOptInNotificationService wearBackupOptInNotificationService0) {
        this.a = wearBackupOptInNotificationService0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        Integer integer0 = (int)2;
        if(!((Boolean)object0).booleanValue()) {
            WearBackupOptInNotificationService.a.d("Disabled, not running", new Object[0]);
            return gmbu.i(integer0);
        }
        WearBackupOptInNotificationService wearBackupOptInNotificationService0 = this.a;
        bayn bayn0 = bayn.f(wearBackupOptInNotificationService0);
        if(bayn0 == null) {
            WearBackupOptInNotificationService.a.f("Unable to send notifications: notificationManager is null", new Object[0]);
            return gmbu.i(integer0);
        }
        WearBackupOptInNotificationService.a.d("Showing opt-in notification", new Object[0]);
        PendingIntent pendingIntent0 = fcnn.b(wearBackupOptInNotificationService0, WearBackupSettingsChimeraActivity.b().putExtra("enable_backup_from_notification", true));
        Notification.Action notification$Action0 = new Notification.Action.Builder(null, wearBackupOptInNotificationService0.getText(0x7F1508F4), pendingIntent0).build();  // string:common_turn_on "Turn on"
        Notification.Builder notification$Builder0 = fcnn.a(wearBackupOptInNotificationService0).setContentTitle(wearBackupOptInNotificationService0.getText(0x7F1535EB)).setContentText(wearBackupOptInNotificationService0.getText(0x7F1535EA)).setAutoCancel(false).addAction(notification$Action0);  // string:wear_backup_opt_in_notification_title "Back up watch"
        if(hzub.f()) {
            new jvr(wearBackupOptInNotificationService0).f("com.google.android.backup.notification.wear_backup_opt_in.tag", 2, notification$Builder0.build());
        }
        else {
            notification$Builder0.setContentIntent(fcnn.b(wearBackupOptInNotificationService0, WearBackupOptInChimeraActivity.a(null)));
            Notification notification0 = notification$Builder0.build();
            bayn0.y("com.google.android.backup.notification.wear_backup_opt_in.tag", 2, evuh.bo, notification0);
        }
        AtomicReference atomicReference0 = new AtomicReference();
        return glzd.f(gmbt.h(glzd.f(WearBackupOptInNotificationService.f(wearBackupOptInNotificationService0).b(new fctu(atomicReference0), gmap.a), new fctv(atomicReference0), gmap.a)), new fctx(wearBackupOptInNotificationService0), gmap.a);
    }
}

