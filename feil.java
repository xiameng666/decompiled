import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothGattServer;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.wearable.node.ble.peripheral.BleL2capConnectionManager.1;
import j..util.Objects;
import java.util.concurrent.atomic.AtomicReference;

public final class feil extends fefp implements fees, ffmj {
    public final Context a;
    public final BluetoothAdapter b;
    public final AtomicReference c;
    public final feio d;
    public final fegm e;
    public final fejm f;
    public final feic g;
    public final fejb h;
    public final Looper i;
    final feii j;
    final feif k;
    public final fekd l;
    public final fekc m;
    BroadcastReceiver n;
    BroadcastReceiver o;
    public final feij p;
    public final feik t;
    public final feih u;
    public final feig v;

    public feil(Context context0, BluetoothAdapter bluetoothAdapter0, feio feio0, fegm fegm0, fejm fejm0, feic feic0, fejb fejb0, Looper looper0, fekd fekd0, fczq fczq0) {
        super("IosL2capCM", looper0);
        this.m = new fekc("BleL2capConnectionManager");
        feij feij0 = new feij(this);
        this.p = feij0;
        feik feik0 = new feik(this);
        this.t = feik0;
        feih feih0 = new feih(this);
        this.u = feih0;
        feig feig0 = new feig(this);
        this.v = feig0;
        this.a = context0;
        this.b = bluetoothAdapter0;
        this.d = feio0;
        this.e = fegm0;
        this.f = fejm0;
        this.g = feic0;
        this.h = fejb0;
        this.i = looper0;
        this.l = fekd0;
        this.c = new AtomicReference(fczq0);
        feii feii0 = new feii(this);
        this.j = feii0;
        boolean z = false;
        gftb.r(feio0.d == null, "The listener must be set only once.");
        gftb.z(feii0, "The listener must not be null.");
        feio0.d = feii0;
        if(fejm0.k == null) {
            z = true;
        }
        gftb.r(z, "listener should only be set once.");
        gftb.check(feii0);
        fejm0.k = feii0;
        Objects.requireNonNull(fejm0);
        feif feif0 = new feif(this, fekd0, new feie(fejm0));
        this.k = feif0;
        fejb0.h = feif0;
        this.t(feij0);
        this.t(feik0);
        this.t(feih0);
        this.t(feig0);
        this.u(feij0, feik0);
        this.u(feik0, feij0);
        this.u(feik0, feih0);
        this.u(feih0, feik0);
        this.u(feih0, feig0);
        this.u(feig0, feih0);
        this.A(feij0);
        this.F();
        feil.f(("config is " + (fczq0.f ? "enabled" : "disabled")));
    }

    @Override  // fefp
    protected final String a(int v) {
        switch(v) {
            case 1: {
                return "MSG_CONNECTION_ENABLED";
            }
            case 2: {
                return "MSG_CONNECTION_DISABLED";
            }
            case 3: {
                return "MSG_BLUETOOTH_ADAPTER_ON";
            }
            case 4: {
                return "MSG_BLUETOOTH_ADAPTER_OFF";
            }
            case 5: {
                return "MSG_GATT_CONNECTED";
            }
            case 6: {
                return "MSG_GATT_DISCONNECTED";
            }
            case 8: {
                return "MSG_RETRY_ADVERTISING";
            }
            case 9: {
                return "MSG_RETRY_OPENING_SERVER";
            }
            case 10: {
                return "MSG_RETRY_INTENSE_ADVERTISING";
            }
            default: {
                return a.f(v, "UNKNOWN(", ")");
            }
        }
    }

    final void b(boolean z) {
        feil.f(("setBluetoothAdapterStateReceiverEnabled: " + z));
        Looper looper0 = this.i;
        batl.l(looper0.isCurrentThread());
        if(!z) {
            BroadcastReceiver broadcastReceiver0 = this.n;
            if(broadcastReceiver0 != null) {
                this.a.unregisterReceiver(broadcastReceiver0);
                this.n = null;
            }
        }
        else if(this.n == null) {
            BleL2capConnectionManager.1 bleL2capConnectionManager$10 = new BleL2capConnectionManager.1(this);
            IntentFilter intentFilter0 = new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED");
            clht clht0 = new clht(looper0);
            this.a.registerReceiver(bleL2capConnectionManager$10, intentFilter0, null, clht0);
            this.n = bleL2capConnectionManager$10;
        }
    }

    static void c(feil feil0, Message message0) {
        String s = feil0.a(message0.what);
        feil.f(("[" + feil0.r().a() + "] Unhandled message: " + s));
    }

    public static final void f(String s) {
        if(Log.isLoggable("IosL2capCM", 3)) {
            Log.d("IosL2capCM", s);
        }
    }

    @Override  // fees
    public final void h(fczq fczq0) {
        feil.f(("updateConfiguration: config is " + (fczq0.f ? "enabled" : "disabled")));
        this.c.set(fczq0);
        if(fczq0.f) {
            this.x(1);
            return;
        }
        this.x(2);
    }

    @Override  // ffmj
    public final void md(bbpd bbpd0, boolean z, boolean z1) {
        bbpd0.println("BleL2capConnectionManager:");
        bbpd0.b();
        bbpd0.println("ConnectionConfiguration is " + (((fczq)this.c.get()).f ? "enabled" : "disabled"));
        fein fein0 = this.d.c;
        String s = " not";
        bbpd0.println("Socket server is" + (1 == (fein0 == null || !fein0.isAlive() ? 0 : 1) ? "" : " not") + " running.");
        BluetoothGattServer bluetoothGattServer0 = this.e.i;
        StringBuilder stringBuilder0 = new StringBuilder("WearL2capPsm server is");
        if(bluetoothGattServer0 != null) {
            s = "";
        }
        stringBuilder0.append(s);
        stringBuilder0.append(" opened.");
        bbpd0.println(stringBuilder0.toString());
        bbpd0.println("L2cap state machine log records");
        bbpd0.b();
        for(int v = 0; v < this.p(); ++v) {
            bbpd0.println(this.s(v).toString());
        }
        bbpd0.a();
        bbpd0.a();
    }

    @Override  // fefp, fees
    public final void n() {
        feil.f("Stopping IosL2capCM");
        this.x(2);
        super.n();
    }

    @Override  // fefp, fees
    public final void o() {
        super.o();
        feil.f("Starting IosL2capCM");
        if(((fczq)this.c.get()).f) {
            this.x(1);
        }
    }
}

