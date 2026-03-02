import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.ContentObserver;
import android.os.Looper;
import android.os.Message;
import android.provider.Settings.Global;
import android.util.Log;
import com.google.android.gms.wearable.node.ble.peripheral.BleServicesConnectionManager.1;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;

public final class feiy extends fefp implements fees, ffmj {
    public final Context a;
    public final BluetoothAdapter b;
    public final BluetoothManager c;
    public final feez d;
    public final fefg e;
    public final Looper f;
    final feiw g;
    final feit h;
    public final feix i;
    public final feir j;
    public final feiv k;
    public final feiq l;
    public final feiu m;
    public final AtomicReference n;
    public ContentObserver o;
    private boolean p;
    private final BroadcastReceiver t;

    public feiy(Context context0, BluetoothAdapter bluetoothAdapter0, BluetoothManager bluetoothManager0, feez feez0, fefg fefg0, Looper looper0, fczq fczq0) {
        super("IosServicesCM", looper0);
        feix feix0 = new feix(this);
        this.i = feix0;
        feir feir0 = new feir(this);
        this.j = feir0;
        feiv feiv0 = new feiv(this);
        this.k = feiv0;
        this.t = new BleServicesConnectionManager.1(this);
        this.a = context0;
        this.b = bluetoothAdapter0;
        this.c = bluetoothManager0;
        this.d = feez0;
        this.e = fefg0;
        this.f = looper0;
        this.n = new AtomicReference(fczq0);
        feiw feiw0 = new feiw(this);
        this.g = feiw0;
        feit feit0 = new feit(this);
        this.h = feit0;
        fefg0.c(feiw0);
        feez0.c = feit0;
        ffgm.g("IosServicesConnectionManager", this);
        feiq feiq0 = new feiq(this);
        this.l = feiq0;
        feiu feiu0 = new feiu(this);
        this.m = feiu0;
        this.t(feix0);
        this.t(feir0);
        this.t(feiq0);
        this.t(feiu0);
        this.u(feix0, feir0);
        this.u(feir0, feix0);
        this.u(feir0, feiq0);
        this.u(feiq0, feir0);
        this.t(feiv0);
        this.u(feiq0, feiv0);
        this.u(feiv0, feiu0);
        this.u(feiu0, feiv0);
        this.u(feiv0, feiq0);
        this.A(feix0);
        this.F();
    }

    @Override  // fefp
    protected final boolean C(Message message0) {
        return message0.what != 8;
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
                return "MSG_BLUETOOTH_OFF";
            }
            case 4: {
                return "MSG_COMPANION_ACL_CONNECTED";
            }
            case 5: {
                return "MSG_COMPANION_ACL_DISCONNECTED";
            }
            case 6: {
                return "MSG_SERVICE_DISCOVERY_COMPLETE";
            }
            case 7: {
                return "MSG_ON_SERVICE_CHANGED";
            }
            case 8: {
                return "MSG_HANDLE_NOTIFICATION";
            }
            case 9: {
                return "MSG_READY_TO_SETUP_ANCS";
            }
            case 10: {
                return "MSG_UPDATE_TIME";
            }
            case 11: {
                return "MSG_ERROR";
            }
            case 12: {
                return "MSG_STANDALONE_MODE_ENABLED";
            }
            case 13: {
                return "MSG_STANDALONE_MODE_DISABLED";
            }
            default: {
                return "UNKNOWN";
            }
        }
    }

    public final int b() {
        int v = Settings.Global.getInt(this.a.getContentResolver(), "tethered_config_state", 0);
        return bbqa.c() || v != 0 ? v : 2;
    }

    public final void c(boolean z) {
        feiy.k(("setBluetoothBroadcastReceiverEnabled: " + z));
        Looper looper0 = this.f;
        batl.l(looper0.isCurrentThread());
        if(z) {
            if(!this.p) {
                IntentFilter intentFilter0 = new IntentFilter("android.bluetooth.device.action.ACL_CONNECTED");
                intentFilter0.addAction("android.bluetooth.device.action.ACL_DISCONNECTED");
                intentFilter0.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
                clht clht0 = new clht(looper0);
                jwe.c(this.a, this.t, intentFilter0, null, clht0, 2);
                this.p = true;
            }
        }
        else if(this.p) {
            this.a.unregisterReceiver(this.t);
            this.p = false;
        }
    }

    public final boolean f(feex feex0) {
        if(Log.isLoggable("IosServicesCM", 5)) {
            Log.w("IosServicesCM", "Got exception", feex0);
        }
        switch(feex0.a) {
            case 0x100: 
            case 260: {
                feiy.k("Service is missing when OnServiceChanged enabled.");
                return true;
            }
            case 1: 
            case 2: 
            case 3: 
            case 6: 
            case 0x105: 
            case 0x106: {
                feez feez0 = this.d;
                feez.k("Refreshing GATT");
                BluetoothGatt bluetoothGatt0 = feez0.e;
                if(bluetoothGatt0 == null) {
                    Log.w("BluetoothGattHelper", "mBluetoothGatt is null, not refreshing GATT.");
                }
                else {
                    try {
                        bluetoothGatt0.getClass().getMethod("refresh", null).invoke(feez0.e, null);
                        synchronized(feez0.d) {
                            feez0.f = false;
                        }
                    }
                    catch(NoSuchMethodException noSuchMethodException0) {
                        Log.w("BluetoothGattHelper", "Couldn\'t find refresh method, not refreshing GATT", noSuchMethodException0);
                    }
                    catch(InvocationTargetException invocationTargetException0) {
                        Log.w("BluetoothGattHelper", "Invocation target exception, not refreshing GATT", invocationTargetException0);
                    }
                    catch(IllegalAccessException illegalAccessException0) {
                        Log.w("BluetoothGattHelper", "Illegal access exception, not refreshing GATT", illegalAccessException0);
                    }
                }
                try {
                    feiy.k("Re-discovering services after refresh()");
                    feez0.g(hzwz.b());
                    return true;
                }
                catch(feex unused_ex) {
                    feiy.k("Failed to discover services");
                    return false;
                }
            }
            default: {
                return false;
            }
        }
    }

    public final boolean g(Intent intent0) {
        if(hzwz.a.c().b() && intent0.getIntExtra("android.bluetooth.device.extra.TRANSPORT", 2) != 2) {
            return false;
        }
        BluetoothDevice bluetoothDevice0 = (BluetoothDevice)intent0.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
        return bluetoothDevice0 != null && bluetoothDevice0.getAddress().equals(fefq.a(this.a.getContentResolver()));
    }

    @Override  // fees
    public final void h(fczq fczq0) {
        feiy.k(("updateConfiguration: config is " + (fczq0.f ? "enabled" : "disabled")));
        this.n.set(fczq0);
        if(fczq0.f) {
            this.x(1);
            return;
        }
        this.x(2);
    }

    static void i(feiy feiy0, Message message0) {
        String s = feiy0.a(message0.what);
        feiy.k(("[" + feiy0.r().a() + "] Unhandled message: " + s));
    }

    @Override  // fefp
    protected final boolean j(Message message0) {
        return this.C(message0);
    }

    public static final void k(String s) {
        if(Log.isLoggable("IosServicesCM", 3)) {
            Log.d("IosServicesCM", s);
        }
    }

    @Override  // ffmj
    public final void md(bbpd bbpd0, boolean z, boolean z1) {
        String s;
        bbpd0.b();
        AtomicReference atomicReference0 = this.n;
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
        bbpd0.println("=====");
        bbpd0.println("Current Connection States:");
        bbpd0.println("iOS System Services is not connected.");
        bbpd0.println("BLE state machine log records");
        bbpd0.b();
        for(int v = 0; v < this.p(); ++v) {
            bbpd0.println(this.s(v).toString());
        }
        bbpd0.a();
        bbpd0.a();
    }

    @Override  // fefp, fees
    public final void n() {
        this.x(2);
        super.n();
    }

    @Override  // fefp, fees
    public final void o() {
        super.o();
        if(((fczq)this.n.get()).f) {
            this.x(1);
        }
    }
}

