import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothGattCharacteristic;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Looper;
import android.os.Message;
import android.os.PowerManager;
import android.util.Log;
import com.google.android.gms.wearable.node.ble.BleConnectionManager.1;
import com.google.android.gms.wearable.node.ble.BleConnectionManager.2;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class feeq extends fefp implements fees, fefa, ffmj {
    public final Context a;
    public final BluetoothAdapter b;
    final ArrayBlockingQueue c;
    public feeu d;
    public final fefg e;
    final feez f;
    public volatile AtomicReference g;
    final AtomicBoolean h;
    public final AtomicInteger i;
    final BroadcastReceiver j;
    public final BroadcastReceiver k;
    final feei l;
    public final feel m;
    public final feej n;
    public final feem o;
    public final feeo p;
    private final ayuw t;
    private final ayuw u;
    private final feet v;
    private final AtomicBoolean w;
    private final feep x;
    private final feen y;
    private final feek z;

    public feeq(Context context0, BluetoothAdapter bluetoothAdapter0, feet feet0, feez feez0, fefg fefg0, Looper looper0, fczq fczq0) {
        super("BleConnectionManager", looper0);
        hzzi.a.i().aq();
        hzzi.a.i().ar();
        ayuw ayuw0 = new ayuw(300);
        this.t = ayuw0;
        ayuw ayuw1 = new ayuw(50);
        this.u = ayuw1;
        this.c = new ArrayBlockingQueue(100);
        AtomicBoolean atomicBoolean0 = new AtomicBoolean(true);
        this.w = atomicBoolean0;
        this.g = new AtomicReference();
        this.h = new AtomicBoolean(false);
        new AtomicInteger();
        new AtomicInteger();
        this.i = new AtomicInteger();
        this.j = new BleConnectionManager.1(this);
        this.k = new BleConnectionManager.2(this);
        new IntentFilter("android.intent.action.SCREEN_ON");
        feei feei0 = new feei(this);
        this.l = feei0;
        feep feep0 = new feep(this);
        this.x = feep0;
        feel feel0 = new feel(this);
        this.m = feel0;
        feen feen0 = new feen(this);
        this.y = feen0;
        feek feek0 = new feek(this);
        this.z = feek0;
        feej feej0 = new feej(this);
        this.n = feej0;
        feem feem0 = new feem(this);
        this.o = feem0;
        feeo feeo0 = new feeo(this);
        this.p = feeo0;
        this.a = context0;
        this.b = bluetoothAdapter0;
        this.v = feet0;
        this.e = fefg0;
        fefg0.c(feei0);
        this.g.set(fczq0);
        this.f = feez0;
        feez0.c = this;
        PowerManager powerManager0 = (PowerManager)context0.getSystemService(PowerManager.class);
        fdob fdob0 = fdob.b();
        fdob0.a(fdnl.p);
        fdob0.a(fdnl.A);
        fdob0.a(fdnl.B);
        fdob0.a(fdnl.z);
        fdob0.a(fdnl.q);
        fdob0.a(fdnl.r);
        fdob0.a(fdnl.s);
        fdob0.a(fdnl.t);
        fdob0.a(fdnl.v);
        fdob0.a(fdnl.u);
        fdob0.a(fdnl.w);
        fdob0.a(fdnl.x);
        fdob0.a(fdnl.y);
        fdob0.a(fdnl.m);
        fdob0.a(fdnl.n);
        fdob0.a(fdnl.l);
        fdob0.a(fdnl.o);
        fdob0.a(fdnl.f);
        fdob0.a(fdnl.e);
        fdob0.a(fdnl.g);
        fdob0.l(fdnl.j, ayuw0);
        fdob0.l(fdnl.k, ayuw1);
        atomicBoolean0.set(fczq0 == null || fczq0.i);
        ffgm.g("BleConnectionManager", this);
        this.t(feep0);
        this.t(feel0);
        this.t(feen0);
        this.t(feek0);
        this.t(feej0);
        this.t(feem0);
        this.t(feeo0);
        this.u(feep0, feel0);
        this.u(feel0, feen0);
        this.u(feen0, feek0);
        this.u(feen0, feem0);
        this.u(feek0, feej0);
        this.u(feek0, feem0);
        this.u(feej0, feem0);
        this.u(feem0, feel0);
        this.u(feel0, feep0);
        this.u(feep0, feeo0);
        this.u(feeo0, feep0);
        this.A(feeo0);
        this.F();
    }

    private final void G() {
        try {
            feez feez0 = this.f;
            if(feez0.j()) {
                feeq.k("Disconnecting");
                feez0.e();
            }
            else {
                feeq.k("Not disconnecting; already disconnected");
            }
        }
        catch(feex unused_ex) {
            Log.w("BleConnectionManager", "Bluetooth exception caught while disconnecting");
        }
        finally {
            this.z(22, hzzi.b());
        }
    }

    @Override  // fefp
    protected final String a(int v) {
        switch(v) {
            case 1: {
                return "MSG_INIT";
            }
            case 2: {
                return "MSG_BT_ADAPTER_STATE_CHANGED";
            }
            case 3: {
                return "MSG_CONNECTION_CONFIG_UPDATE";
            }
            case 4: {
                return "MSG_START_SCAN";
            }
            case 5: {
                return "MSG_START_FORCED_SCAN";
            }
            case 6: {
                return "MSG_SCAN_FAILED";
            }
            case 7: {
                return "MSG_STOP_SCAN";
            }
            case 8: {
                return "MSG_RESCHEDULE_SCAN";
            }
            case 9: {
                return "MSG_RECONNECT_REQUESTED";
            }
            case 10: {
                return "MSG_SERVICE_DISCOVERY_COMPLETE";
            }
            case 11: {
                return "MSG_HANDLE_NOTIFICATION";
            }
            case 12: {
                return "MSG_DECOMMISSION_WATCH";
            }
            case 13: {
                return "MSG_RECONNECT_CHARACTERISTIC_CHANGED";
            }
            case 14: {
                return "MSG_ERROR";
            }
            case 15: {
                return "MSG_CONNECTION_THREAD_DONE";
            }
            case 16: {
                return "MSG_GATT_CONNECTION_CLOSED";
            }
            case 17: {
                return "MSG_READY_TO_SETUP_ANCS";
            }
            case 18: {
                return "MSG_UPDATE_TIME";
            }
            case 19: {
                return "MSG_ON_SERVICE_CHANGED";
            }
            case 20: {
                return "MSG_RESET_CHARACTERISTIC_CHANGED";
            }
            case 21: {
                return "MSG_RESET_CONNECTION";
            }
            default: {
                return "UNKNOWN";
            }
        }
    }

    public final void b() {
        if(((fczq)this.g.get()).f) {
            if(this.h.compareAndSet(false, true)) {
                IntentFilter intentFilter0 = new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED");
                intentFilter0.addAction("android.gms.wearable.altReconnect");
                jwe.b(this.a, this.j, intentFilter0, 2);
            }
        }
        else if(this.h.compareAndSet(true, false)) {
            this.a.unregisterReceiver(this.j);
        }
    }

    @Override  // fefa
    public final void c(BluetoothGattCharacteristic bluetoothGattCharacteristic0) {
    }

    @Override  // fefp
    protected final void d() {
        feeq.k("onQuitting");
        this.g();
        this.G();
        this.G();
        this.e.b();
        feeu feeu0 = this.d;
        if(feeu0 != null) {
            feeu0.a();
        }
        if(this.h.compareAndSet(true, false)) {
            this.a.unregisterReceiver(this.j);
        }
    }

    @Override  // fefa
    public final void f() {
        feeq.k("onServiceChanged");
        this.x(19);
    }

    public final void g() {
        feet feet0 = this.v;
        AtomicBoolean atomicBoolean0 = feet0.e;
        if(!atomicBoolean0.get()) {
            feet.a("Not scanning, returning.");
            return;
        }
        esaa esaa0 = feet0.d;
        if(esaa0.l()) {
            esaa0.g();
        }
        feet.a("Stopping scanning for null.");
        feet0.c.getAdapter().getBluetoothLeScanner();
        boolean z = !feet0.c.getAdapter().isEnabled();
        feet0.b = null;
        atomicBoolean0.set(false);
        feeq.k("Stopped scan.");
        this.v(4);
        this.v(7);
        this.v(5);
        this.d.c();
    }

    @Override  // fees
    public final void h(fczq fczq0) {
        feeq.k(("updateConfiguration: config is " + (fczq0.f ? "enabled" : "disabled")));
        this.g.set(fczq0);
        this.x(3);
    }

    public final boolean i(Message message0) {
        if(message0.what != 9 && message0.what != 15) {
            int v = message0.what;
            feeq.k(("[" + this.r().a() + "] Unhandled message: " + v));
            return false;
        }
        return true;
    }

    @Override  // fefp
    protected final boolean j(Message message0) {
        return message0.what != 11;
    }

    public static final void k(String s) {
        if(Log.isLoggable("BleConnectionManager", 3)) {
            Log.d("BleConnectionManager", s);
        }
    }

    @Override  // fefa
    public final void l(BluetoothGattCharacteristic bluetoothGattCharacteristic0) {
        bluetoothGattCharacteristic0.getUuid();
    }

    @Override  // fefa
    public final void m() {
        feeq.k("onServicesDiscovered");
        this.x(10);
    }

    @Override  // ffmj
    public final void md(bbpd bbpd0, boolean z, boolean z1) {
        String s;
        bbpd0.b();
        if(this.g == null) {
            s = "null";
        }
        else if(((fczq)this.g.get()).f) {
            s = "enabled";
        }
        else {
            s = "disabled";
        }
        bbpd0.println("ConnectionConfig is " + s);
        bbpd0.println("=====");
        bbpd0.println("onServiceChanged() Connectivity Model is enabled");
        bbpd0.println("Current Connection States:");
        bbpd0.println("iOS Companion App is not connected.");
        bbpd0.println("iOS System Services is not connected.");
        bbpd0.println("isWatchDecommissioned=false");
        bbpd0.println("BLE connection stats");
        bbpd0.b();
        for(Object object0: this.c) {
            ((feeu)object0).b(bbpd0);
        }
        bbpd0.a();
        bbpd0.println("BLE state machine log records");
        bbpd0.b();
        for(int v = 0; v < this.p(); ++v) {
            bbpd0.println(this.s(v).toString());
        }
        bbpd0.a();
        bbpd0.a();
    }
}

