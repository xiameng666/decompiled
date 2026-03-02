import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.auth.easyunlock.userpresence.PeriodicCheckChimeraReceiver;

public final class ajmc {
    private static ajmc a = null;
    private static final String b = "ajmc";
    private final Context c;
    private final bbib d;

    static {
        bboh.b("ajmc", bbcu.dK);
    }

    private ajmc(Context context0) {
        bbib bbib0 = new bbib(context0);
        super();
        this.c = context0;
        this.d = bbib0;
    }

    public static ajmc a(Context context0) {
        synchronized(ajmc.class) {
            if(ajmc.a == null) {
                ajmc.a = new ajmc(context0.getApplicationContext());
            }
        }
        return ajmc.a;
    }

    public final void b() {
        Intent intent0 = PeriodicCheckChimeraReceiver.a(this.c);
        PendingIntent pendingIntent0 = PendingIntent.getBroadcast(this.c, 0, intent0, 0xA000000);
        this.d.k("UserPresenceScheduler", 1, System.currentTimeMillis(), 60000L, pendingIntent0, "com.google.android.gms");
    }

    public final void c() {
        Intent intent0 = PeriodicCheckChimeraReceiver.a(this.c);
        PendingIntent pendingIntent0 = PendingIntent.getBroadcast(this.c, 0, intent0, 0x22000000);
        if(pendingIntent0 != null) {
            this.d.a(pendingIntent0);
        }
    }
}

