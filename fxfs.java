import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import com.google.android.location.quake.ScreenStateListener.1;
import java.util.function.Supplier;

public final class fxfs extends fxov implements Supplier {
    public boolean a;
    public static final int b;
    private final Context c;
    private BroadcastReceiver d;

    static {
        bboh.c("EQMon", bbcu.g, "ScrRCL");
    }

    public fxfs(Context context0, fxnw fxnw0) {
        super(fxnw0);
        this.c = context0;
    }

    @Override  // fxov
    public final fxou b() {
        return fxou.b;
    }

    @Override  // fxov
    public final void f() {
        synchronized(this) {
            this.a = false;
            if(this.d == null) {
                this.d = new ScreenStateListener.1(this);
                IntentFilter intentFilter0 = new IntentFilter();
                intentFilter0.addAction("android.intent.action.SCREEN_ON");
                intentFilter0.addAction("android.intent.action.SCREEN_OFF");
                jwe.b(this.c, this.d, intentFilter0, 2);
            }
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
        }
    }

    @Override
    public final Object get() {
        return (int)(this.a ? 2 : 1);
    }
}

