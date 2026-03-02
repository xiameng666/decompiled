import android.content.Context;
import android.content.Intent;

public final class argi implements Runnable {
    public final argm a;

    public argi(argm argm0) {
        this.a = argm0;
    }

    @Override
    public final void run() {
        argm argm0 = this.a;
        if(argm0.d == 4) {
            return;
        }
        argl argl0 = argm0.b;
        Context context0 = argm0.c.a;
        int v = avyq.a(context0, 0x7F080B2F);
        juo juo0 = new juo(context0);
        juo0.s(v);
        juo0.D = context0.getColor(0x7F060E76);  // color:quantum_googblue
        juo0.D("Transfer in progress");
        juo0.k(context0.getResources().getString((argm0.c.b ? 0x7F152F28 : 0x7F152F16)));  // string:source_wifi_notification_text "Keep both devices on and close to each other"
        juo0.K(true);
        juo0.C = argm0.c.b();
        Intent intent0 = new Intent();
        intent0.setClassName(context0, "com.google.android.gms.backup.component.D2dSourceActivity");
        intent0.addFlags(0x10000000);
        if(argm0.c.b) {
            intent0.setAction("com.google.android.gms.backup.ACTION_WIFI_D2D");
            intent0.putExtra("com.google.android.gms.backup.LAUNCHED_FROM_NOTIFICATION", true);
        }
        juo0.h = cjok.a(context0, 0, intent0, 0xA000000);
        argl0.b(bayn.f(context0).b(juo0.a()));
        argm0.d = 4;
    }
}

