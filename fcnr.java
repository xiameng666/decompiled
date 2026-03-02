import android.app.Notification.Builder;
import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.wearable.backup.wear.WearBackupSettingsChimeraActivity;

public final class fcnr implements glzn {
    public final fcns a;
    public final boolean b;

    public fcnr(fcns fcns0, boolean z) {
        this.a = fcns0;
        this.b = z;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        Void void0 = (Void)object0;
        fcns fcns0 = this.a;
        Context context0 = fcns0.c;
        if(new aqjk(context0).i()) {
            bayn bayn0 = bayn.f(context0);
            if(bayn0 != null) {
                Intent intent0 = WearBackupSettingsChimeraActivity.b();
                Notification.Builder notification$Builder0 = fcnn.a(context0).setContentIntent(fcnn.b(context0, intent0));
                if(this.b) {
                    fcno.a.h("Rolling back the backup feature.", new Object[0]);
                    notification$Builder0.setContentTitle(context0.getText(0x7F1535EE)).setContentText(context0.getText(0x7F1535ED));  // string:wear_backup_rollback_title "Backup unavailable"
                }
                else {
                    fcno.a.h("Rolling forward the backup feature.", new Object[0]);
                    notification$Builder0.setContentTitle(context0.getText(0x7F1535F0)).setContentText(context0.getText(0x7F1535EF));  // string:wear_backup_rollforward_notification_title "Backup now available"
                }
                Notification notification0 = notification$Builder0.build();
                bayn0.y("com.google.android.backup.notification.wear_backup_rollback.tag", 1, evuh.bg, notification0);
            }
        }
        return fcns0.d.a();
    }
}

