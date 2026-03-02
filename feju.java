import android.bluetooth.BluetoothAdapter;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build.VERSION;
import android.util.Log;
import com.google.android.gms.wearable.node.bluetooth.BluetoothServerImpl.1;
import j..util.Objects;
import java.io.Closeable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class feju implements ffmj, Closeable {
    public final feft a;
    public final ffds b;
    public final Object c;
    public boolean d;
    public fejy e;
    volatile fczq f;
    volatile fczq g;
    final Object h;
    fejw i;
    fejw j;
    boolean k;
    boolean l;
    final BroadcastReceiver m;
    private final BluetoothAdapter n;
    private final Context o;
    private final fekd p;
    private boolean q;
    private final fekc r;
    private final boolean s;

    public feju() {
        throw null;
    }

    public feju(Context context0, feft feft0, ffds ffds0, fekd fekd0) {
        this.c = new Object();
        this.q = false;
        this.f = null;
        this.g = null;
        this.h = new Object();
        this.i = null;
        this.j = null;
        this.k = false;
        this.l = false;
        this.r = new fekc("BluetoothServer");
        BluetoothServerImpl.1 bluetoothServerImpl$10 = new BluetoothServerImpl.1(this);
        this.m = bluetoothServerImpl$10;
        batl.h("BluetoothServerImpl.constructor");
        this.o = context0;
        this.n = bahu.a(context0);
        this.a = feft0;
        this.b = ffds0;
        this.p = fekd0;
        this.s = hzyg.e();
        this.d = false;
        jwe.b(context0, bluetoothServerImpl$10, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"), 4);
    }

    static Method a() {
        try {
            return Build.VERSION.SDK_INT <= 0x20 ? BluetoothAdapter.class.getMethod("setScanMode", Integer.TYPE, Integer.TYPE) : null;
        }
        catch(NoSuchMethodException noSuchMethodException0) {
            throw new IllegalStateException("BluetoothAdapter#setScanMode must be available.", noSuchMethodException0);
        }
    }

    static void b(boolean z, BluetoothAdapter bluetoothAdapter0, Method method0, feft feft0) {
        int v;
        String s;
        try {
            s = " (" + (z ? "enabled" : "disabled") + ")";
            v = z ? 21 : 20;
            if(Build.VERSION.SDK_INT <= 0x20) {
                if(method0 == null) {
                    throw new IllegalArgumentException("setScanModeMethod must be non-null on versions less than 33");
                }
                method0.invoke(bluetoothAdapter0, v, ((int)0));
            }
            else {
                bluetoothAdapter0.setScanMode(v);
            }
            if(Log.isLoggable("BluetoothServer", 3)) {
                Log.d("BluetoothServer", "set scan mode to " + v + s);
            }
            if(feft0 != null) {
                if(z) {
                    if(feft.b()) {
                        feft.a("start(): SystemProp override set to off.");
                        return;
                    }
                    fefr fefr0 = new fefr(feft0);
                    feft0.b.execute(fefr0);
                    return;
                }
                if(feft.b()) {
                    feft.a("stop(): SystemProp override is set to off.");
                }
                fefs fefs0 = new fefs(feft0);
                feft0.b.execute(fefs0);
            }
        }
        catch(InvocationTargetException | IllegalAccessException | IllegalArgumentException exception0) {
            if(Log.isLoggable("BluetoothServer", 6)) {
                Log.e("BluetoothServer", "error setting scan mode to " + v + s, exception0);
            }
        }
    }

    public final void c(fczq fczq0) {
        batl.h("addConfiguration");
        ffmn.d("BluetoothServer", "Adding new configuration %s", new Object[]{fczq0});
        if(fczq0.n) {
            this.g = fczq0;
            if(this.s && (this.f != null && (fczq0.c != null && Objects.equals(fczq0.c, this.f.c)))) {
                ffmn.d("BluetoothServer", "Scenario appears to be A->A transfer. Stopping main config.", new Object[0]);
                this.i(fejz.b);
            }
        }
        else {
            this.f = fczq0;
        }
        if(fczq0.n) {
            if(this.l) {
                return;
            }
        }
        else if(this.k) {
            return;
        }
        this.g();
    }

    @Override
    public final void close() {
        fejy fejy0;
        batl.h("BluetoothServerImpl.close");
        ffmn.d("BluetoothServer", "Shutting down BluetoothServerImpl", new Object[0]);
        try {
            this.o.unregisterReceiver(this.m);
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            if(Log.isLoggable("BluetoothServer", 5)) {
                Log.w("BluetoothServer", "Receiver not registered", illegalArgumentException0);
            }
        }
        this.h();
        ffmn.a("BluetoothServer", "Attempting to close BT Server thread", new Object[0]);
        synchronized(this.c) {
            fejy0 = this.e;
            this.e = null;
        }
        ffmm.a(fejy0);
        this.d = true;
    }

    public final void d(boolean z, boolean z1) {
        ffmn.d("BluetoothServer", "onClientThreadTermination: wasMigratingThread=%s, wasStopped=%s", new Object[]{Boolean.valueOf(z), Boolean.valueOf(z1)});
        if(!z1) {
            if(z) {
                __monitor_enter(this.h);
                this.l = false;
                this.j = null;
            }
            else {
                __monitor_enter(this.h);
                this.k = false;
                this.i = null;
            }
            __monitor_exit(this.h);
        }
        synchronized(this.c) {
            if(this.e != null && !this.e.f) {
                this.e.b();
            }
        }
    }

    public final void f(fczq fczq0) {
        ffmn.d("BluetoothServer", "removeConfiguration: %s", new Object[]{fczq0});
        if(fczq0.equals(this.g)) {
            this.i(fejz.a);
            this.g = null;
            return;
        }
        if(fczq0.equals(this.f)) {
            if(this.g == null) {
                this.i(fejz.b);
                this.f = null;
                return;
            }
            this.i(fejz.c);
            return;
        }
        if(Log.isLoggable("BluetoothServer", 5)) {
            Log.w("BluetoothServer", "removeConfiguration received unrecognized config " + fczq0);
        }
    }

    public final void g() {
        feju feju0;
        fejy fejy0;
        if(this.d) {
            ffmn.a("BluetoothServer", "Not starting connection after object is disposed", new Object[0]);
            return;
        }
        BluetoothAdapter bluetoothAdapter0 = this.n;
        if(bluetoothAdapter0 != null && bluetoothAdapter0.isEnabled()) {
            synchronized(this.c) {
                if(this.e != null && !this.e.f) {
                    fejy0 = null;
                    feju0 = this;
                }
                else {
                    fejy0 = this.e;
                    feju0 = this;
                    feju0.e = new fejy(feju0, this, bluetoothAdapter0, this.p, this.r);
                    feju0.q = false;
                }
                if(!feju0.q) {
                    feju0.q = true;
                    feju0.e.start();
                }
                fejy fejy1 = feju0.e;
                if(fejy1.a) {
                    fejy1.b();
                }
            }
            ffmm.a(fejy0);
            return;
        }
        ffmn.a("BluetoothServer", "Waiting for Bluetooth adapter to enable before starting connection.", new Object[0]);
    }

    public final void h() {
        this.i(fejz.a);
        this.i(fejz.b);
    }

    private final void i(fejz fejz0) {
        fejw fejw1;
        fejw fejw0;
        ffmn.d("BluetoothServer", "stopConnection: stopType=%s", new Object[]{fejz0});
        if(fejz0 == fejz.a) {
            synchronized(this.h) {
                fejw0 = this.j;
                this.l = false;
                this.j = null;
            }
            ffmm.a(fejw0);
            return;
        }
        synchronized(this.h) {
            fejw1 = this.i;
            this.k = false;
            this.i = null;
        }
        ffmm.a(fejw1);
        if(fejz0 == fejz.c) {
            if(this.g != null) {
                this.f = this.g;
                this.g = null;
            }
            synchronized(this.h) {
                fejw fejw2 = this.j;
                if(fejw2 != null) {
                    this.i = fejw2;
                    this.k = this.l;
                    this.l = false;
                    this.j = null;
                    synchronized(this.c) {
                        if(this.k) {
                            fejy fejy0 = this.e;
                            if(fejy0 != null) {
                                fejy0.c.set(true);
                                ffmm.a(fejy0.d);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override  // ffmj
    public final void md(bbpd bbpd0, boolean z, boolean z1) {
        fejw fejw1;
        fejw fejw0;
        bbpd0.println("=======================");
        bbpd0.println("BluetoothServer:");
        bbpd0.b();
        BluetoothAdapter bluetoothAdapter0 = this.n;
        if(bluetoothAdapter0 != null) {
            bbpd0.println("isEnabled: " + bluetoothAdapter0.isEnabled());
        }
        feft feft0 = this.a;
        if(feft0 != null) {
            feft0.md(bbpd0, z, z1);
        }
        bbpd0.println("serverThreadStarted: " + this.q);
        synchronized(this.c) {
            bbpd0.println("serverThread: " + this.e);
        }
        synchronized(this.h) {
            fejw0 = this.i;
            fejw1 = this.j;
        }
        bbpd0.println("isClosed: " + this.d);
        bbpd0.println("mainConfig: " + this.f + " with connection " + fejw0 + " is running: " + this.k);
        bbpd0.println("migratingConfig: " + this.g + " with connection " + fejw1 + " is running: " + this.l);
        bbpd0.a();
        bbpd0.println("=======================");
    }
}

