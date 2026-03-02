import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothServerSocket;
import android.bluetooth.BluetoothSocket;
import android.os.Looper;
import android.util.Log;
import j..util.Objects;
import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

final class fejy extends Thread implements Closeable {
    public boolean a;
    public boolean b;
    public final AtomicBoolean c;
    BluetoothServerSocket d;
    volatile BluetoothSocket e;
    volatile boolean f;
    final AtomicBoolean g;
    final feju h;
    private Method i;
    private boolean j;
    private final BluetoothAdapter k;
    private final fekd l;
    private final fekc m;
    private final feju n;

    public fejy(feju feju0, feju feju1, BluetoothAdapter bluetoothAdapter0, fekd fekd0, fekc fekc0) {
        Objects.requireNonNull(feju0);
        this.h = feju0;
        super("BluetoothServerThread");
        this.j = true;
        this.a = false;
        this.b = false;
        this.n = feju1;
        this.k = bluetoothAdapter0;
        this.l = fekd0;
        this.m = fekc0;
        this.c = new AtomicBoolean(false);
        this.g = new AtomicBoolean(false);
    }

    public final void a(boolean z, boolean z1) {
        ffmn.d("BluetoothServer", "setConnectable(%s), connectionEstablished(%s)", new Object[]{Boolean.valueOf(z), Boolean.valueOf(z1)});
        this.b = z;
        fekd fekd0 = this.l;
        if(fekd0 == null) {
            feju.b(z, this.k, this.i, this.h.a);
            return;
        }
        fekd0.c(this.m, z1);
        fekd0.a(this.m, z);
    }

    protected final void b() {
        synchronized(this.h.c) {
            this.g.set(true);
            this.h.c.notify();
        }
    }

    private final void c() {
        BluetoothServerSocket bluetoothServerSocket0;
        int v = 0;
        ffmn.a("BluetoothServer", "createSocketAndSetScanMode", new Object[0]);
        int v1 = (int)hzun.a.b().c();
        while(v < v1) {
            try {
                bluetoothServerSocket0 = this.k.listenUsingRfcommWithServiceRecord("WearableBt", fejt.a);
            }
            catch(IOException iOException0) {
                Log.e("BluetoothServer", "Failed to listen on server socket: " + iOException0.toString());
                if(this.f) {
                    break;
                }
                gmde.d(hzun.a.b().b(), TimeUnit.MILLISECONDS);
                ++v;
                continue;
            }
            this.d = bluetoothServerSocket0;
            this.i = feju.a();
            return;
        }
        Log.e("BluetoothServer", a.f(v1, "Failed to listen on server socket ", " times. Giving up."));
        throw new IllegalStateException("Unable to listen for RFCOMM sockets.");
    }

    @Override
    public final void close() {
        fejw fejw0;
        ffmn.d("BluetoothServer", "Signalling server termination.", new Object[0]);
        this.f = true;
        synchronized(this.h.h) {
            fejw0 = this.h.j;
        }
        ffmm.a(this.h.i);
        ffmm.a(fejw0);
        ffmm.a(this.e);
        try {
            ffmm.a(this.d);
        }
        catch(NullPointerException nullPointerException0) {
            if(Log.isLoggable("BluetoothServer", 5)) {
                Log.w("BluetoothServer", "Error closing bluetoothServerSocket", nullPointerException0);
            }
        }
        fekd fekd0 = this.l;
        if(fekd0 != null) {
            fekd0.c(this.m, false);
            fekd0.a(this.m, false);
        }
        this.interrupt();
        gmde.c(this);
    }

    @Override
    public final void run() {
        Object object3;
        fczq fczq2;
        feju feju1;
        Object object2;
        fczq fczq1;
        int v;
        fczq fczq0;
        feju feju0;
        String s;
        Object object0;
        ffmn.a("BluetoothServer", "BTServerThread starting", new Object[0]);
        try {
            this.c();
            ffmn.a("BluetoothServer", "Successfully created socket", new Object[0]);
        }
        catch(IllegalStateException illegalStateException0) {
            Log.w("BluetoothServer", "Server thread could not listen for RFComm sockets; server thread closing", illegalStateException0);
            this.f = true;
        }
        while(!this.f) {
            try {
                ffmn.a("BluetoothServer", "maybeWaitUntilNotified", new Object[0]);
                object0 = this.h.c;
                __monitor_enter(object0);
            }
            catch(IOException iOException0) {
                goto label_124;
            }
            try {
                if(this.j) {
                    try {
                        try {
                            this.j = false;
                        }
                        catch(InterruptedException interruptedException0) {
                        label_21:
                            ffmn.d("BluetoothServer", "BTServer thread interrupted", new Object[0]);
                            if(!this.f && Log.isLoggable("BluetoothServer", 5)) {
                                Log.w("BluetoothServer", "This is an unexpected interrupt", interruptedException0);
                                try {
                                    goto label_30;
                                label_27:
                                    this.g.set(false);
                                    this.a = false;
                                    throw throwable0;
                                label_30:
                                    this.g.set(false);
                                    this.a = false;
                                    goto label_36;
                                }
                                catch(Throwable throwable1) {
                                }
                                goto label_34;
                            }
                        }
                    }
                    catch(Throwable throwable0) {
                        goto label_27;
                    }
                }
                else {
                    while(!this.g.get()) {
                        this.a = true;
                        ffmn.d("BluetoothServer", "Waiting for new config", new Object[0]);
                        object0.wait();
                    }
                }
                goto label_30;
            }
            catch(InterruptedException interruptedException0) {
                goto label_21;
            }
            catch(Throwable throwable0) {
                goto label_27;
            }
            try {
            label_34:
                __monitor_exit(object0);
                throw throwable1;
            label_36:
                __monitor_exit(object0);
                ffmn.a("BluetoothServer", "ServerThread done waiting", new Object[0]);
                if(this.f) {
                    continue;
                }
                ffmn.a("BluetoothServer", "Setting connectable", new Object[0]);
                this.a(true, false);
            }
            catch(IOException iOException0) {
                goto label_124;
            }
            try {
                ffmn.d("BluetoothServer", "accepting next connection", new Object[0]);
                this.e = this.d.accept();
                goto label_47;
            }
            catch(IOException iOException1) {
                try {
                    this.a(false, false);
                    throw iOException1;
                label_47:
                    ffmn.d("BluetoothServer", "BTServer accepted incoming connection", new Object[0]);
                    this.a(false, true);
                    s = this.e.getRemoteDevice().getAddress();
                    feju0 = this.h;
                    List list0 = feju0.b.h();
                    ffmn.a("BluetoothServer", "List of currently known configs from store: %s", new Object[]{list0});
                    for(Object object1: list0) {
                        fczq0 = (fczq)object1;
                        if(!s.equals(fczq0.c)) {
                            continue;
                        }
                        v = fczq0.n ^ 1;
                        goto label_62;
                    }
                    fczq0 = null;
                    v = 0;
                label_62:
                    Boolean boolean0 = Boolean.valueOf(((boolean)v));
                    if(fczq0 == null) {
                        fczq0 = "[none found]";
                    }
                    ffmn.d("BluetoothServer", "Starting a connection with incoming address %s, addressMatchesNonMigratingConfig %s, matched preexisting config: %s", new Object[]{s, boolean0, fczq0});
                    if(v != 0 || feju0.g == null) {
                        fczq1 = feju0.f;
                        if(fczq1 != null) {
                            ffmn.d("BluetoothServer", "This is a main config from addr %s, config: %s", new Object[]{s, fczq1});
                            if(fczq1.c != null && !gfqz.e(s, fczq1.c)) {
                                Log.w("BluetoothServer", "Incoming BT connection from unrecognized device and no phone switching config is present. Abandoning this connection.");
                                ffmm.a(this.e);
                                goto label_105;
                            }
                            else {
                                object2 = feju0.h;
                                __monitor_enter(object2);
                                goto label_79;
                            }
                            goto label_88;
                        }
                        else if(Log.isLoggable("BluetoothServer", 5)) {
                            Log.w("BluetoothServer", "Tried to start a connection for main config but it was switched to null");
                        }
                    }
                    else {
                        goto label_88;
                    }
                    goto label_105;
                }
                catch(IOException iOException0) {
                    goto label_124;
                }
            }
            try {
            label_79:
                feju0.k = true;
                feju0.i = new fejw(fczq1, this.e, this.n);
                feju0.i.a();
                goto label_86;
            }
            catch(Throwable throwable2) {
                try {
                    __monitor_exit(object2);
                    throw throwable2;
                label_86:
                    __monitor_exit(object2);
                    goto label_105;
                label_88:
                    feju1 = this.h;
                    fczq2 = feju1.g;
                    if(fczq2 != null) {
                        ffmn.d("BluetoothServer", "This is a migrating config from addr %s, config: %s", new Object[]{s, fczq2});
                        object3 = feju1.h;
                        __monitor_enter(object3);
                        goto label_97;
                    }
                    else if(Log.isLoggable("BluetoothServer", 5)) {
                        Log.w("BluetoothServer", "Tried to start a connection for migrating config but it was switched to null");
                    }
                    goto label_105;
                }
                catch(IOException iOException0) {
                    goto label_124;
                }
            }
            try {
            label_97:
                feju1.l = true;
                feju1.j = new fejw(fczq2, this.e, this.n);
                feju1.j.a();
                goto label_104;
            }
            catch(Throwable throwable3) {
                try {
                    __monitor_exit(object3);
                    throw throwable3;
                label_104:
                    __monitor_exit(object3);
                label_105:
                    feju feju2 = this.h;
                    String s1 = feju2.f == null ? "NULL" : feju2.f;
                    Boolean boolean1 = Boolean.valueOf(feju2.k);
                    String s2 = feju2.g == null ? "NULL" : feju2.g;
                    ffmn.d("BluetoothServer", "Checking if another connection is expected: main config %s running: %s, migrating config %s running: %s", new Object[]{s1, boolean1, s2, Boolean.valueOf(feju2.l)});
                    if(feju2.f != null && !feju2.k) {
                        ffmn.a("BluetoothServer", "Expecting a connection from main config", new Object[0]);
                        this.j = true;
                    }
                    if(feju2.g == null || feju2.l) {
                        continue;
                    }
                    ffmn.a("BluetoothServer", "Expecting a connection from migrating config.", new Object[0]);
                    this.j = true;
                    continue;
                }
                catch(IOException iOException0) {
                }
            }
        label_124:
            if(this.c.compareAndSet(true, false)) {
                try {
                    this.c();
                }
                catch(IllegalStateException illegalStateException1) {
                    Log.w("BluetoothServer", "Server thread could not listen for RFComm sockets; server thread closing", illegalStateException1);
                    this.f = true;
                }
            }
            else {
                if(this.f) {
                    continue;
                }
                this.f = true;
                Log.e("BluetoothServer", "Server thread could not accept BT socket for an unknown reason; re-creating server thread", iOException0);
                new clht(Looper.getMainLooper()).post(new fejx(this));
            }
        }
    }

    @Override
    public final String toString() {
        return String.format("BluetoothServerThread: shouldAccept=%s isWaiting=%s advertiserIsRunning=%s isClosed=%s notified=%s serverSocket=%s", Boolean.valueOf(this.j), Boolean.valueOf(this.a), Boolean.valueOf(this.b), Boolean.valueOf(this.f), this.g, this.d);
    }
}

