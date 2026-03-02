import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.trustagent.trustlet.device.bluetooth.internal.BluetoothConnectionTracker.3;
import java.util.Collections;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

public final class ezfs {
    public static final bboh a;
    public final ExecutorService b;
    public final ezfr c;
    public final ezfr d;
    private static final gged_interceptors e;
    private static final IntentFilter f;
    private final Context g;
    private final BroadcastReceiver h;
    private final AtomicBoolean i;
    private boolean j;
    private final ezfq k;
    private final ezfq l;

    static {
        ezfs.a = bboh.b("TrustAgent", bbcu.aR);
        ezfs.e = gged_interceptors.n(Long.valueOf(1000L), Long.valueOf(2000L), Long.valueOf(3000L));
        IntentFilter intentFilter0 = new IntentFilter();
        intentFilter0.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
        intentFilter0.addAction("android.bluetooth.device.action.ACL_CONNECTED");
        intentFilter0.addAction("android.bluetooth.device.action.ACL_DISCONNECTED");
        intentFilter0.addAction("android.bluetooth.device.action.BOND_STATE_CHANGED");
        ezfs.f = intentFilter0;
    }

    public ezfs(Context context0, ezfp ezfp0) {
        bblp bblp0 = new bblp(1, 10);
        super();
        this.i = new AtomicBoolean(false);
        this.j = false;
        this.g = context0;
        this.b = bblp0;
        this.c = new ezfr(context0, ezfs.e, "com.google.android.gms.trustagent.trustlet.device.bluetooth.internal.CONNECTION_ALARM");
        this.d = new ezfr(context0, Collections.singletonList(Long.valueOf(5000L)), "com.google.android.gms.trustagent.trustlet.device.bluetooth.internal.DISCONNECTION_ALARM");
        this.k = new ezfn(this, ezfp0);
        this.l = new ezfo(this, ezfp0);
        this.h = new BluetoothConnectionTracker.3(this, ezfp0);
    }

    public static BluetoothDevice a(Intent intent0) {
        if(bbqa.c()) {
            BluetoothDevice bluetoothDevice0 = (BluetoothDevice)intent0.getParcelableExtra("android.bluetooth.device.extra.DEVICE", BluetoothDevice.class);
            gftb.z(bluetoothDevice0, "Received bluetooth broadcast without a device.");
            return bluetoothDevice0;
        }
        BluetoothDevice bluetoothDevice1 = (BluetoothDevice)intent0.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
        gftb.z(bluetoothDevice1, "Received bluetooth broadcast without a device.");
        return bluetoothDevice1;
    }

    public final void b() {
        if(!this.d()) {
            this.g.registerReceiver(this.h, ezfs.f);
            this.c.a(this.k);
            this.d.a(this.l);
            this.e(true);
        }
    }

    public final void c() {
        if(this.d()) {
            this.g.unregisterReceiver(this.h);
            this.c.f(this.k);
            this.d.f(this.l);
            this.e(false);
        }
    }

    final boolean d() {
        return hzca.i() ? this.i.get() : this.j;
    }

    private final void e(boolean z) {
        if(hzca.i()) {
            this.i.set(z);
            return;
        }
        this.j = z;
    }
}

