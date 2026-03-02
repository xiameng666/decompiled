import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import java.util.concurrent.ScheduledExecutorService;

public final class blti implements blso {
    public final Context a;
    public final bnae b;
    public final bltb c;
    public final ScheduledExecutorService d;
    public final bnaj e;
    public final BluetoothAdapter f;
    public TracingBroadcastReceiver g;
    public bltd h;
    public static final int i;

    static {
        bnaa.a("TurnOnBluetoothStageHandler");
    }

    public blti(Context context0, bnae bnae0) {
        bbll bbll0 = new bbll(1, 9);
        bnah bnah0 = new bnah(context0);
        super();
        this.a = context0;
        this.b = bnae0;
        this.c = new bltb(context0, bnae0);
        this.d = bbll0;
        this.f = bahu.a(context0);
        this.e = bnah0;
    }

    @Override  // blso
    public final void a() {
        this.c.a();
    }
}

