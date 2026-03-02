import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.content.Context;
import android.os.Message;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;

public final class fegb extends fefp implements fekb, ffmj {
    static final UUID a;
    static final UUID b;
    public final Context c;
    public final AtomicReference d;
    public final BluetoothDevice e;
    public final fega f;
    public final fefz g;
    public final fefv h;
    public final fekh i;
    volatile BluetoothGatt j;
    fegc k;
    volatile int l;
    public volatile gmcu m;
    volatile gmcu n;

    static {
        fegb.a = UUID.fromString("C9C92447-8F77-4C63-9C79-25E71B4CA9B3");
        fegb.b = UUID.fromString("ABDD3056-28FA-441D-A470-55A75A52553A");
    }

    public fegb(Context context0, BluetoothAdapter bluetoothAdapter0, fczq fczq0) {
        super("BleClientConnection", context0.getMainLooper());
        fega fega0 = new fega(this);
        this.f = fega0;
        fefz fefz0 = new fefz(this);
        this.g = fefz0;
        this.h = new fefv(this);
        ffmn.a("BleClientConnection", "create new BleClientConnection instance", new Object[0]);
        this.c = context0;
        this.e = bluetoothAdapter0.getRemoteDevice(fczq0.c);
        this.d = new AtomicReference(fczq0);
        this.i = new fekh();
        this.t(fega0);
        this.t(fefz0);
        this.u(fega0, fefz0);
        this.u(fefz0, fega0);
        this.A(fega0);
        this.F();
    }

    @Override  // fefp
    protected final boolean C(Message message0) {
        return true;
    }

    @Override  // fefp
    protected final String a(int v) {
        switch(v) {
            case 0: {
                return "MSG_GATT_DISCONNECTED";
            }
            case 1: {
                return "MSG_GATT_START_CONNECTING";
            }
            case 2: {
                return "MSG_GATT_CONNECTED";
            }
            case 3: {
                return "MSG_SERVICE_DISCOVERY_COMPLETE";
            }
            case 4: {
                return "MSG_START_SERVICE_DISCOVERY";
            }
            case 5: {
                return "MSG_HANDLE_NOTIFICATION";
            }
            case 6: {
                return "MSG_UPDATE_RECONNECTION_STRATEGY";
            }
            case 7: {
                return "MSG_PSM_CHARACTERISTIC_READ_TIMEOUT";
            }
            default: {
                return "UNKNOWN";
            }
        }
    }

    @Override  // fekb
    public final void b() {
    }

    @Override  // fekb
    public final void c() {
    }

    @Override  // fekb
    public final void close() {
        ffmn.a("BleClientConnection", "Stopping BleClientCM", new Object[0]);
        super.n();
    }

    @Override  // fefp
    protected final void d() {
        if(this.j != null) {
            this.j.close();
            this.j = null;
        }
        fegc fegc0 = this.k;
        if(fegc0 != null) {
            fegc0.close();
            this.k = null;
        }
    }

    @Override  // fekb
    public final void f(int v) {
        this.y(6, new fefw(v));
    }

    static void g(fegb fegb0, Message message0) {
        String s = fegb0.a(message0.what);
        ffmn.a("BleClientConnection", "[%s] Unhandled message: %s", new Object[]{fegb0.r().a(), s});
    }

    @Override  // fefp
    protected final boolean j(Message message0) {
        return true;
    }

    @Override  // ffmj
    public final void md(bbpd bbpd0, boolean z, boolean z1) {
        String s;
        bbpd0.b();
        AtomicReference atomicReference0 = this.d;
        if(atomicReference0 == null) {
            s = "null";
        }
        else if(((fczq)atomicReference0.get()).f) {
            s = "enabled";
        }
        else {
            s = "disabled";
        }
        bbpd0.println("ConnectionConfig is " + s);
        bbpd0.println("MTU=" + this.l);
        bbpd0.println("=====");
        bbpd0.println("Current Connection States:");
        fekh fekh0 = this.i;
        if(fekh0 != null) {
            fekh0.md(bbpd0, z, z1);
        }
        bbpd0.println("BLE state machine log records");
        bbpd0.b();
        for(int v = 0; v < this.p(); ++v) {
            bbpd0.println(this.s(v).toString());
        }
        bbpd0.a();
        bbpd0.a();
    }

    @Override  // fefp
    public final void o() {
        ffmn.a("BleClientConnection", "Starting BleClientCM", new Object[0]);
        super.o();
        this.z(1, 5000L);
    }
}

