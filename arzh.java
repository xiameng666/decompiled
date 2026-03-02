import android.app.Notification.Builder;
import android.app.Notification;
import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.backup.g1.notifications.msa.EnableMmsAndNotifyUserGcmTaskChimeraService;
import java.util.concurrent.Callable;

public final class arzh implements Callable {
    public final EnableMmsAndNotifyUserGcmTaskChimeraService a;
    public final gmcd b;
    public final gmcd c;
    public final gmcd d;
    public final gmcd e;
    public final cllr f;

    public arzh(EnableMmsAndNotifyUserGcmTaskChimeraService enableMmsAndNotifyUserGcmTaskChimeraService0, gmcd gmcd0, gmcd gmcd1, gmcd gmcd2, gmcd gmcd3, cllr cllr0) {
        this.a = enableMmsAndNotifyUserGcmTaskChimeraService0;
        this.b = gmcd0;
        this.c = gmcd1;
        this.d = gmcd2;
        this.e = gmcd3;
        this.f = cllr0;
    }

    @Override
    public final Object call() {
        boolean z = ((Boolean)this.b.get()).booleanValue();
        EnableMmsAndNotifyUserGcmTaskChimeraService enableMmsAndNotifyUserGcmTaskChimeraService0 = this.a;
        Object object0 = (int)2;
        if(!z) {
            EnableMmsAndNotifyUserGcmTaskChimeraService.a.m("Not enabling MMS / showing notification because backup is off", new Object[0]);
            enableMmsAndNotifyUserGcmTaskChimeraService0.b.b(2);
            return object0;
        }
        if(!((Boolean)this.c.get()).booleanValue() && hqje.a.m().P()) {
            EnableMmsAndNotifyUserGcmTaskChimeraService.a.m("Not enabling MMS / showing notification because device is not ETU", new Object[0]);
            enableMmsAndNotifyUserGcmTaskChimeraService0.b.b(3);
            return object0;
        }
        if(!((Boolean)this.d.get()).booleanValue()) {
            EnableMmsAndNotifyUserGcmTaskChimeraService.a.m("Not enabling MMS / showing notification because MSA was not shown", new Object[0]);
            enableMmsAndNotifyUserGcmTaskChimeraService0.b.b(4);
            return object0;
        }
        if(!((Boolean)this.e.get()).booleanValue()) {
            EnableMmsAndNotifyUserGcmTaskChimeraService.a.m("Not showing notification because MMS backup is already enabled", new Object[0]);
            enableMmsAndNotifyUserGcmTaskChimeraService0.b.b(5);
            return object0;
        }
        asdc.a.a(enableMmsAndNotifyUserGcmTaskChimeraService0, true);
        Bundle bundle0 = this.f.b;
        if(bundle0 == null) {
            EnableMmsAndNotifyUserGcmTaskChimeraService.a.f("Not showing notification because extras bundle was null", new Object[0]);
            enableMmsAndNotifyUserGcmTaskChimeraService0.b.b(6);
            return object0;
        }
        String s = bundle0.getString("title");
        String s1 = bundle0.getString("text");
        if(s != null && s1 != null) {
            if(enableMmsAndNotifyUserGcmTaskChimeraService0.b == null) {
                enableMmsAndNotifyUserGcmTaskChimeraService0.d();
            }
            Notification.Builder notification$Builder0 = aqyp.c(enableMmsAndNotifyUserGcmTaskChimeraService0, "com.google.android.gms.backup.g1.featureupdates.notification.channel.id");
            notification$Builder0.setContentTitle(s);
            notification$Builder0.setContentText(s1);
            PendingIntent pendingIntent0 = fqaw.a(enableMmsAndNotifyUserGcmTaskChimeraService0, 0, aqzc.i(giah.k), 0x4000000);
            if(pendingIntent0 == null) {
                EnableMmsAndNotifyUserGcmTaskChimeraService.a.f("Not showing notification because pending intent could not be created", new Object[0]);
                enableMmsAndNotifyUserGcmTaskChimeraService0.b.b(8);
                return object0;
            }
            notification$Builder0.setContentIntent(pendingIntent0);
            notification$Builder0.setAutoCancel(true);
            notification$Builder0.setSmallIcon(avyq.a(enableMmsAndNotifyUserGcmTaskChimeraService0, 0x7F080A6A));
            bayn bayn0 = bayn.f(enableMmsAndNotifyUserGcmTaskChimeraService0);
            if(bayn0 != null) {
                Notification notification0 = notification$Builder0.build();
                bayn0.y("com.google.android.backup.g1.notification.mms_enabled.tag", 4, evuh.aB, notification0);
            }
            aryi aryi0 = enableMmsAndNotifyUserGcmTaskChimeraService0.b;
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gidu.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gidu)hftp0.b_message).c = 4;
            ((gidu)hftp0.b_message).b |= 1;
            gidu gidu0 = (gidu)hftp0.N_build();
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)ghys.a).v_newBuilder();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ghys ghys0 = (ghys)hftp1.b_message;
            gidu0.getClass();
            ghys0.X = gidu0;
            ghys0.c |= 0x8000000;
            aryi0.a(((ghys)hftp1.N_build()));
            return (int)0;
        }
        EnableMmsAndNotifyUserGcmTaskChimeraService.a.f("Not showing notification because extras title and text were null", new Object[0]);
        enableMmsAndNotifyUserGcmTaskChimeraService0.b.b(7);
        return object0;
    }
}

