import android.app.NotificationChannel;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Bundle;

public final class blsj {
    private static final bboh a;
    private final Context b;
    private final String c;
    private final String d;
    private bayo e;
    private final boolean f;
    private final int g;

    static {
        blsj.a = bnaa.a("AuthenticatorNotificationManager");
    }

    public blsj(Context context0, int v, String s, String s1, boolean z) {
        this.b = context0;
        this.g = v;
        batl.r(s, "title cannot be null");
        this.c = s;
        this.d = s1;
        this.f = z;
    }

    public final void a() {
        ((ggtj)blsj.a.h()).B("Dismissing the \"%s\" notification.", this.c);
        bayo bayo0 = this.e;
        if(bayo0 != null) {
            bayo0.a.c();
            this.e = null;
        }
    }

    public final void b() {
        if(this.f) {
            Bundle bundle0 = new Bundle();
            Context context0 = this.b;
            bundle0.putString("android.substName", "Google");
            Intent intent0 = new Intent().setClassName(context0, "com.google.android.gms.fido.authenticator.ui.LockscreenActivity");
            intent0.putExtra("session_id", this.g);
            PendingIntent pendingIntent0 = bbmq.g(context0, intent0, 0x4C000000);
            juo juo0 = new juo(context0, "fido.authenticator_notification_channel.high_importance");
            juo0.D(this.c);
            juo0.k(this.d);
            juo0.H(BitmapFactory.decodeResource(context0.getResources(), 0x7F080A6A));
            juo0.s(avyq.a(context0, 0x7F080D6C));
            juo0.C = bundle0;
            juo0.h(true);
            juo0.m = 1;
            juo0.B = "call";
            juo0.E = 1;
            juo0.F(pendingIntent0, true);
            NotificationChannel notificationChannel0 = new NotificationChannel("fido.authenticator_notification_channel.high_importance", "Sign in requests from nearby devices", 4);
            bayn bayn0 = bayn.f(context0);
            if(bayn0 != null) {
                bayn0.p(notificationChannel0);
            }
            if(this.e == null) {
                this.e = bayo.a(context0);
            }
            this.e.e("AuthenticatorNotificationManager", 1, juo0.a());
            return;
        }
        Intent intent1 = new Intent().setClassName("com.google.android.gms", "class_name");
        Context context1 = this.b;
        PendingIntent pendingIntent1 = fqaw.e(context1, 0, intent1, 0x4000000);
        Bundle bundle1 = new Bundle();
        bundle1.putString("android.substName", "Google");
        juo juo1 = new juo(context1, "fido.authenticator_notification_channel");
        juo1.s(avyq.a(context1, 0x7F080D6C));
        juo1.D(this.c);
        juo1.k(this.d);
        juo1.H(BitmapFactory.decodeResource(context1.getResources(), 0x7F080A6A));
        juo1.C = bundle1;
        juo1.h(true);
        juo1.E = 1;
        NotificationChannel notificationChannel1 = new NotificationChannel("fido.authenticator_notification_channel", "Sign in requests from nearby devices", 3);
        bayn bayn1 = bayn.f(context1);
        if(bayn1 != null) {
            bayn1.p(notificationChannel1);
        }
        juo1.h = pendingIntent1;
        if(this.e == null) {
            this.e = bayo.a(context1);
        }
        this.e.e("AuthenticatorNotificationManager", 1, juo1.a());
    }
}

