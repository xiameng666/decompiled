import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import com.google.android.location.quake.DeepStillListener.1;

public final class fxdp extends fxov {
    public static final int a;
    private final Context b;
    private BroadcastReceiver c;

    static {
        bboh.c("EQMon", bbcu.g, "StlRCL");
    }

    public fxdp(Context context0, fxnw fxnw0) {
        super(fxnw0);
        this.b = context0;
    }

    @Override  // fxov
    public final fxou b() {
        return futd.a ? fxou.b : new fxou(2, 16);
    }

    @Override  // fxov
    public final void f() {
        synchronized(this) {
            if(this.c == null) {
                this.c = new DeepStillListener.1(this);
                IntentFilter intentFilter0 = new IntentFilter();
                intentFilter0.addAction("com.google.android.location.activity.DEEP_STILL_MODE_ENABLED");
                intentFilter0.addAction("com.google.android.location.activity.DEEP_STILL_MODE_DISABLED");
                jwe.b(this.b, this.c, intentFilter0, 4);
            }
        }
    }

    @Override  // fxov
    public final void g() {
        synchronized(this) {
            BroadcastReceiver broadcastReceiver0 = this.c;
            if(broadcastReceiver0 != null) {
                this.b.unregisterReceiver(broadcastReceiver0);
                this.c = null;
            }
        }
    }
}

