import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import java.io.PrintWriter;

public final class ekqg {
    public boolean a;
    public final ekqx b;
    private boolean c;
    private boolean d;
    private final Intent e;
    private gfsx f;

    public ekqg(ekqx ekqx0) {
        this.e = new Intent("com.google.android.gms.gcm.TRIGGER_IDLE").setPackage("com.google.android.gms");
        this.f = gfqx.a;
        this.b = ekqx0;
    }

    public final void a(PrintWriter printWriter0) {
        synchronized(this) {
            printWriter0.println("\nIdleness tracker states:");
            printWriter0.println("isScreenOn:" + this.a);
            printWriter0.println("isDockIdle:" + this.d);
            printWriter0.println("device idle:" + this.c);
        }
    }

    public final void b(bbib bbib0, String s) {
        synchronized(this) {
            if(!s.equals("android.intent.action.DOCK_ACTIVE")) {
                this.a = true;
            }
            this.d = false;
            if(this.f.i()) {
                bbib0.a(((PendingIntent)this.f.d()));
                this.f = gfqx.a;
            }
            if(this.c) {
                this.c = false;
            }
        }
    }

    public final void c() {
        synchronized(this) {
            if(!this.c && (!this.a || this.d)) {
                this.c = true;
                ekrs.b().f.a(7);
            }
        }
    }

    public final void d(bbib bbib0, String s, Context context0) {
        synchronized(this) {
            if(s.equals("android.intent.action.DOCK_IDLE")) {
                this.d = true;
            }
            else {
                this.a = false;
                this.d = false;
            }
            long v1 = hrvh.a.i().i();
            if(v1 == 0L) {
                this.c();
                return;
            }
            if(!this.f.i()) {
                this.f = gfsx.m(PendingIntent.getBroadcast(context0, 0, this.e, 0x44000000));
                bbib0.d("NetworkScheduler", 3, SystemClock.elapsedRealtime() + v1, ((PendingIntent)this.f.d()), "com.google.android.gms");
            }
        }
    }

    public final boolean e() {
        synchronized(this) {
        }
        return this.c;
    }
}

