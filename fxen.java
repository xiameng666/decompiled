import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.location.quake.PowerStateListener.PowerBroadcastReceiver;
import j..util.Objects;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class fxen extends fxov {
    public static final int a;
    private static final IntentFilter b;
    private final Context c;
    private BroadcastReceiver d;
    private ScheduledExecutorService e;

    static {
        bboh.c("EQMon", bbcu.g, "PwrRCL");
        fxen.b = new IntentFilter("android.intent.action.BATTERY_CHANGED");
    }

    public fxen(Context context0, fxnw fxnw0) {
        super(fxnw0);
        this.c = context0;
    }

    static int a(Context context0) {
        return fxen.c(jwe.b(context0, null, fxen.b, 2));
    }

    @Override  // fxov
    public final fxou b() {
        Intent intent0 = jwe.b(this.c, null, fxen.b, 2);
        if(intent0 != null) {
            switch(intent0.getIntExtra("plugged", -1)) {
                case 1: 
                case 2: {
                    return ((long)fxen.c(intent0)) < huwd.a.n().P() ? new fxou(2, 13) : fxou.b;
                }
                default: {
                    return new fxou(2, 13);
                }
            }
        }
        return new fxou(2, 13);
    }

    private static int c(Intent intent0) {
        if(intent0 != null) {
            int v = intent0.getIntExtra("level", 0);
            int v1 = intent0.getIntExtra("scale", 0);
            return v1 == 0 ? 0 : v * 100 / v1;
        }
        return 0;
    }

    @Override  // fxov
    public final void f() {
        synchronized(this) {
            if(this.d == null) {
                this.d = new PowerStateListener.PowerBroadcastReceiver(this);
                IntentFilter intentFilter0 = new IntentFilter();
                intentFilter0.addAction("android.intent.action.ACTION_POWER_CONNECTED");
                intentFilter0.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
                jwe.b(this.c, this.d, intentFilter0, 2);
                this.i.a();
            }
            bbll bbll0 = new bbll(1, 10);
            this.e = bbll0;
            fxnw fxnw0 = this.i;
            Objects.requireNonNull(fxnw0);
            bbll0.a(new fxem(fxnw0), huwd.j(), huwd.j(), TimeUnit.MILLISECONDS);
        }
    }

    @Override  // fxov
    public final void g() {
        synchronized(this) {
            BroadcastReceiver broadcastReceiver0 = this.d;
            if(broadcastReceiver0 != null) {
                this.c.unregisterReceiver(broadcastReceiver0);
                this.d = null;
            }
            ScheduledExecutorService scheduledExecutorService0 = this.e;
            if(scheduledExecutorService0 != null) {
                scheduledExecutorService0.shutdownNow();
                this.e = null;
            }
        }
    }
}

