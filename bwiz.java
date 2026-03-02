import android.content.Context;
import com.google.android.gms.home.stub.SystemPowerMonitorImpl.highPowerBroadcastReceiver.1;

public final class bwiz {
    public static final bboh a;
    public final Context b;

    static {
        bwiz.a = bboh.b("SysPowerMonitor", bbcu.fA);
    }

    public bwiz(Context context0) {
        ibuq.f(context0, "context");
        super();
        this.b = context0;
        new SystemPowerMonitorImpl.highPowerBroadcastReceiver.1(this, context0);
    }

    public final boolean a() {
        return bwiy.b(this.b);
    }
}

