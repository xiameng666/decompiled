import android.content.Context;
import android.content.IntentFilter;
import com.google.android.location.collectionlib.BluetoothDeviceScanner.BluetoothDeviceEventsReceiver;

public final class fvky extends fvnr {
    protected final BluetoothDeviceScanner.BluetoothDeviceEventsReceiver a;
    protected final Context b;

    public fvky(Context context0, fvls fvls0, fvlt fvlt0, fybc fybc0) {
        super(fvls0, fvlt0, fybc0);
        this.a = new BluetoothDeviceScanner.BluetoothDeviceEventsReceiver(this);
        this.b = context0;
    }

    public static int a(int v) {
        switch(v) {
            case 10: {
                return 1;
            }
            case 11: {
                return 3;
            }
            case 12: {
                return 4;
            }
            case 13: {
                return 2;
            }
            default: {
                return 0;
            }
        }
    }

    @Override  // fvnr
    protected final void b() {
        IntentFilter intentFilter0 = new IntentFilter();
        intentFilter0.addAction("android.bluetooth.device.action.ACL_CONNECTED");
        intentFilter0.addAction("android.bluetooth.device.action.ACL_DISCONNECTED");
        intentFilter0.addAction("android.bluetooth.device.action.ACL_DISCONNECT_REQUESTED");
        intentFilter0.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
        jwe.c(this.a.a.b, this.a, intentFilter0, null, this.a.a.m, 2);
    }

    @Override  // fvnr
    protected final void c() {
        this.a.a.b.unregisterReceiver(this.a);
    }

    public final void d(fwxv fwxv0, int v, long v1) {
        fwxv0.g();
        this.m.a.F(fwxv0, v, v1);
    }
}

