import android.app.Notification.Action.Builder;
import android.app.Notification.Action;
import android.app.Notification.BigTextStyle;
import android.app.Notification.Builder;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.PendingIntent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.identitycredentials.CreateCredentialHandle;
import java.util.Arrays;

public final class bxvw implements gmbg {
    final gmcu a;
    final bxvx b;
    final String c;

    public bxvw(gmcu gmcu0, bxvx bxvx0, String s) {
        this.a = gmcu0;
        this.b = bxvx0;
        this.c = s;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        ibuq.f(throwable0, "t");
        this.a.r(throwable0);
    }

    @Override  // gmbg
    public final void b(Object object0) {
        ibuq.f(((bydi)object0), "result");
        CreateCredentialHandle createCredentialHandle0 = new CreateCredentialHandle(null, ((bydi)object0).a);
        this.a.q(createCredentialHandle0);
        if(hufl.a.c().d()) {
            ((ggtj)this.b.d.h()).x("Notification disabled for conditional create");
            return;
        }
        bxvx bxvx0 = this.b;
        String s = this.c;
        PendingIntent pendingIntent0 = ((bydi)object0).b;
        PackageManager packageManager0 = bxvx0.a.getPackageManager();
        if(packageManager0 == null) {
            ((ggtj)bxvx0.d.j()).x("Package manager is null");
            return;
        }
        String s1 = byca.c(packageManager0, s);
        if(s1 == null) {
            ((ggtj)bxvx0.d.j()).x("App label is null");
            return;
        }
        bycc bycc0 = bxvx0.b;
        ibuq.e("%1$s just created a passkey for your account. You can try this faster and safer way to sign in next time", "getString(...)");
        String s2 = String.format("%1$s just created a passkey for your account. You can try this faster and safer way to sign in next time", Arrays.copyOf(new Object[]{s1}, 1));
        ibuq.e(s2, "format(...)");
        if(bycc0.a.getPackageManager() == null) {
            return;
        }
        ibuq.e("Sign in faster next time", "getString(...)");
        evuh evuh0 = evuh.cG;
        Integer integer0 = (int)0x7F080842;  // drawable:ic_settings_24dp
        ibuq.f("Sign in faster next time", "title");
        ibuq.f(s2, "text");
        ibuq.f(evuh0, "notificationId");
        bayn bayn0 = bycc0.b;
        if(bayn0 != null) {
            if("Sign in faster next time".length() != 0 && s2.length() != 0) {
                ibuq.e("Settings", "getString(...)");
                if("identity_credentials_channel_id".length() == 0) {
                    Log.w("CredNotificationManager", "Channel id is empty");
                    Log.w("CredNotificationManager", "Notification channel is not valid");
                    return;
                }
                NotificationChannel notificationChannel0 = bayn0.c("identity_credentials_channel_id");
                if(notificationChannel0 == null) {
                    Log.i("CredNotificationManager", "Creating notification channel");
                    NotificationChannel notificationChannel1 = new NotificationChannel("identity_credentials_channel_id", "Settings", 4);
                    try {
                        bayn0.p(notificationChannel1);
                        goto label_50;
                    }
                    catch(RemoteException remoteException0) {
                        Log.e("CredNotificationManager", "Failed to create notification channel", remoteException0);
                    }
                    Log.w("CredNotificationManager", "Notification channel is not valid");
                    return;
                }
                else {
                    CharSequence charSequence0 = notificationChannel0.getName();
                    if(charSequence0 == null || !"Settings".equals(charSequence0)) {
                        notificationChannel0.setName("Settings");
                    }
                }
            label_50:
                Notification.Builder notification$Builder0 = new Notification.Builder(bycc0.a, "identity_credentials_channel_id");
                Bundle bundle0 = new Bundle();
                bundle0.putString("android.substName", "Settings");
                integer0.getClass();
                notification$Builder0.setSmallIcon(0x7F080842);  // drawable:ic_settings_24dp
                ibuq.e("Manage", "getString(...)");
                Notification.Action notification$Action0 = new Notification.Action.Builder(null, "Manage", pendingIntent0).build();
                ibuq.e(notification$Action0, "build(...)");
                notification$Builder0.addAction(notification$Action0);
                Notification notification0 = notification$Builder0.setContentTitle("Sign in faster next time").setContentText(s2).setStyle(new Notification.BigTextStyle().bigText(s2)).addExtras(bundle0).build();
                ibuq.e(notification0, "build(...)");
                bycc0.b.y("identity_credentials_notification_tag", 1, evuh0, notification0);
                ((ggtj)this.b.d.h()).x("Notification displayed for conditional create");
                return;
            }
            Log.w("CredNotificationManager", "Notification title or text is empty");
            throw new IllegalArgumentException("Notification title or text is empty");
        }
        Log.w("CredNotificationManager", "Notification Manager is null");
    }
}

