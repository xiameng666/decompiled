import android.app.PendingIntent;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.content.Context;
import android.content.Intent;
import android.net.Uri.Builder;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.wearable.node.bluetooth.BluetoothClientThread..ExternalSyntheticLambda1;
import java.io.Closeable;
import java.io.IOException;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public final class fejs extends Thread implements Closeable {
    public final fekh a;
    public final fczq b;
    public final bbib c;
    public final AtomicReference d;
    public final Object e;
    public volatile boolean f;
    private final Context g;
    private final BluetoothDevice h;
    private final Lock i;
    private final Condition j;
    private final esaa k;
    private final gmcg l;
    private final AtomicReference m;
    private final boolean n;
    private volatile boolean o;
    private volatile boolean p;
    private final AtomicBoolean q;
    private final cjnr r;

    public fejs(Context context0, BluetoothDevice bluetoothDevice0, fczq fczq0, fekh fekh0, gmcg gmcg0) {
        ReentrantLock reentrantLock0 = new ReentrantLock();
        this.i = reentrantLock0;
        this.j = reentrantLock0.newCondition();
        AtomicReference atomicReference0 = new AtomicReference();
        this.d = atomicReference0;
        this.e = new Object();
        this.m = new AtomicReference(null);
        this.f = false;
        this.o = false;
        this.p = false;
        this.g = context0;
        batl.s(bluetoothDevice0);
        this.h = bluetoothDevice0;
        batl.s(fczq0);
        this.b = fczq0;
        this.a = fekh0;
        this.c = new bbib(context0);
        this.r = cjnm.b(context0);
        this.n = hzuk.c();
        atomicReference0.set(fejs.b(fczq0));
        esaa esaa0 = new esaa(context0, 1, "WearableBluetooth", null, "com.google.android.gms");
        this.k = esaa0;
        esaa0.j(false);
        this.q = new AtomicBoolean(true);
        new clht(context0.getMainLooper());
        this.l = gmcg0;
        this.setName("WearableBtClientThread-" + fczq0.j);
    }

    public final PendingIntent a() {
        Intent intent0 = new Intent("com.google.android.gms.wearable.node.bluetooth.RETRY_CONNECTION", new Uri.Builder().scheme("content").authority(this.b.c).build()).setPackage("com.google.android.gms");
        return PendingIntent.getBroadcast(this.g, 1, intent0, 0xC000000);
    }

    public static felq b(fczq fczq0) {
        felp felp0;
        int v = fczq0.l;
        int v1 = 2;
        if(v == 3) {
            if(hzun.a.b().n()) {
                v = 3;
            }
            else {
                if(Log.isLoggable("WearableBluetooth", 3)) {
                    Log.d("WearableBluetooth", "Config specifies retry strategy as OFF but it is overridden to LOW_POWER");
                }
                v = 2;
            }
        }
        hzun hzun0 = hzun.a;
        if(hzun0.b().m()) {
            if(v == 3) {
                felp0 = new felp(0, 0L, -1L);
                v1 = 3;
            }
            else if(v == 0) {
                felp0 = felq.b();
                v1 = 0;
            }
            else if(v == 1) {
                felp0 = new felp(((int)hzun0.b().f()), hzun0.b().d(), hzun0.b().h());
                v1 = 1;
            }
            else if(v == 2) {
                felp0 = new felp(((int)hzun0.b().g()), hzun0.b().e(), hzun0.b().i());
            }
            else {
                Log.w("RetryRateLimiter", "Invalid retry strategy (" + fczq.c(v) + "). Resolving to DEFAULT strategy.");
                felp0 = felq.b();
                v1 = v;
            }
            Log.d("WearableBluetooth", String.format("Using flagged values for retry strategy: %s [%s, %s, %s]", fczq.c(v1), ((int)felp0.a), ((long)felp0.c), ((long)felp0.b)));
            return new felq(felp0.a, felp0.b, felp0.c);
        }
        if(v == 3) {
            v1 = 3;
            felp0 = new felp(0, 0L, -1L);
        }
        else if(v == 0) {
            felp0 = felq.b();
            v1 = 0;
        }
        else if(v == 1) {
            felp0 = new felp(6, 32000L, 30000L);
            v1 = 1;
        }
        else if(v == 2) {
            felp0 = new felp(10, 0xFA000L, 600000L);
        }
        else {
            Log.w("RetryRateLimiter", "Invalid retry strategy (" + fczq.c(v) + "). Resolving to DEFAULT strategy.");
            felp0 = felq.b();
            v1 = v;
        }
        Log.d("WearableBluetooth", String.format("Using fixed values for retry strategy: %s [%s, %s, %s]", fczq.c(v1), ((int)felp0.a), ((long)felp0.c), ((long)felp0.b)));
        return new felq(felp0.a, felp0.b, felp0.c);
    }

    public final void c() {
        ffmn.a("WearableBluetooth", "acquireWakeLockAndRetryConnection", new Object[0]);
        if(this.f) {
            if(Log.isLoggable("WearableBluetooth", 3)) {
                Log.d("WearableBluetooth", "Ignoring connection retry; already connected for this device: " + this.b.b);
            }
            return;
        }
        this.i.lock();
        try {
            this.o = true;
            ffmn.a("WearableBluetooth", "Acquiring the WakeLock to signal a connection retry.", new Object[0]);
            this.g();
            this.j.signal();
        }
        finally {
            this.i.unlock();
        }
    }

    @Override
    public final void close() {
        ffmn.a("WearableBluetooth", "BTClientThread shutting down", new Object[0]);
        this.p = true;
        ffmm.a(((Closeable)this.m.get()));
        this.interrupt();
        ffmn.a("WearableBluetooth", "Joining BTClientThread", new Object[0]);
        gmde.c(this);
        ffmn.a("WearableBluetooth", "Joined BTClientThread", new Object[0]);
    }

    public final void d() {
        ((felq)this.d.get()).d();
        this.c();
    }

    public static final void e(int v, String s, Throwable throwable0) {
        ffgp.g().d(v, s, throwable0);
    }

    private final void f(BluetoothSocket bluetoothSocket0) {
        ffmn.a("WearableBluetooth", "connectLogged", new Object[0]);
        try {
            bluetoothSocket0.connect();
        }
        catch(IOException iOException0) {
            fdob.k(5);
            fdob.g(5, ffgp.m(), this.b.h());
            throw iOException0;
        }
    }

    private final void g() {
        AtomicBoolean atomicBoolean0 = this.q;
        synchronized(atomicBoolean0) {
            if(atomicBoolean0.get()) {
                long v1 = hzzi.a.i().c();
                if(v1 > 0L) {
                    ffmn.a("WearableBluetooth", "acquiring wakelock with timeout of %s seconds", new Object[]{v1});
                    this.k.c(v1 * 1000L);
                }
                else {
                    ffmn.a("WearableBluetooth", "acquiring wakelock with no timeout", new Object[0]);
                    this.k.b();
                }
            }
        }
    }

    private static final void h(int v, String s) {
        fejs.e(v, s, null);
    }

    @Override
    public final void run() {
        Lock lock0;
        long v5;
        long v4;
        cjnn cjnn0;
        AtomicBoolean atomicBoolean0;
        BluetoothSocket bluetoothSocket1;
        BluetoothSocket bluetoothSocket0;
        AtomicReference atomicReference0;
        BluetoothDevice bluetoothDevice0;
        while(!this.p) {
            try {
                bluetoothDevice0 = this.h;
                fejs.h(2, "Connecting to \"" + bluetoothDevice0.getName() + "\"");
                ffmn.a("WearableBluetooth", "doConnectionAcquireWakeLock", new Object[0]);
            }
            catch(RuntimeException runtimeException0) {
                goto label_174;
            }
            catch(Throwable throwable0) {
                goto label_185;
            }
            try {
                try {
                    this.a.c();
                    if(this.n && this.b.t) {
                        String s = ffmo.b(bluetoothDevice0.getAddress());
                        ffmn.d("WearableBluetooth", "Checking bond state of device %s before connecting", new Object[]{s});
                        if(bluetoothDevice0.getBondState() != 12) {
                            ffmn.f("WearableBluetooth", "Device not bonded, address: %s", new Object[]{s});
                            throw new fejq();
                        }
                    }
                    atomicReference0 = this.m;
                }
                catch(feai unused_ex) {
                    goto label_65;
                }
                catch(fdrr unused_ex) {
                    goto label_73;
                }
                catch(fejr fejr0) {
                    goto label_82;
                }
                catch(fejq fejq0) {
                    goto label_97;
                }
                catch(IOException iOException0) {
                    goto label_107;
                }
                catch(RuntimeException runtimeException1) {
                    goto label_114;
                }
                try {
                    bluetoothSocket0 = bluetoothDevice0.createRfcommSocketToServiceRecord(fejt.a);
                    goto label_16;
                }
                catch(RuntimeException runtimeException2) {
                }
                catch(feai unused_ex) {
                    goto label_65;
                }
                catch(fdrr unused_ex) {
                    goto label_73;
                }
                catch(fejr fejr0) {
                    goto label_82;
                }
                catch(fejq fejq0) {
                    goto label_97;
                }
                catch(IOException iOException0) {
                    goto label_107;
                }
                try {
                    try {
                        throw new IOException("Caught RuntimeException when creating the RFComm socket.", runtimeException2);
                    label_16:
                        atomicReference0.set(bluetoothSocket0);
                        hzun hzun0 = hzun.a;
                        if(hzun0.b().j()) {
                            bluetoothSocket1 = (BluetoothSocket)this.m.get();
                            atomicBoolean0 = new AtomicBoolean();
                            long v = SystemClock.elapsedRealtime() + hzun0.b().a() * 1000L;
                            BluetoothClientThread..ExternalSyntheticLambda1 bluetoothClientThread$$ExternalSyntheticLambda10 = new BluetoothClientThread..ExternalSyntheticLambda1(this, atomicBoolean0, bluetoothSocket1);
                            cjnn0 = this.r.b("SocketConnectAlarm", 2, v, null, this.l, bluetoothClientThread$$ExternalSyntheticLambda10);
                            goto label_26;
                        }
                        else {
                            this.f(((BluetoothSocket)this.m.get()));
                        }
                        goto label_51;
                    }
                    catch(feai unused_ex) {
                        goto label_65;
                    }
                    catch(fdrr unused_ex) {
                        goto label_73;
                    }
                    catch(fejr fejr0) {
                        goto label_82;
                    }
                    catch(fejq fejq0) {
                        goto label_97;
                    }
                    catch(IOException iOException0) {
                        goto label_107;
                    }
                    try {
                    label_26:
                        this.f(bluetoothSocket1);
                        synchronized(this.e) {
                            if(atomicBoolean0.get()) {
                                throw new fejr();
                            }
                            atomicBoolean0.set(true);
                        }
                        goto label_51;
                    }
                    catch(IOException iOException1) {
                    }
                    catch(feai unused_ex) {
                        goto label_65;
                    }
                    catch(fdrr unused_ex) {
                        goto label_73;
                    }
                    catch(fejr fejr0) {
                        goto label_82;
                    }
                    catch(fejq fejq0) {
                        goto label_97;
                    }
                    finally {
                        cjnn0.a();
                    }
                    try {
                        synchronized(this.e) {
                            if(atomicBoolean0.get()) {
                                throw new fejr(iOException1);
                            }
                        }
                        throw iOException1;
                    label_51:
                        ffmn.a("WearableBluetooth", "completed CONNECT", new Object[0]);
                        this.f = true;
                        ((felq)this.d.get()).d();
                        fekh fekh0 = this.a;
                        fekh0.b();
                        fejs.h(3, "Connected, running sync loop");
                        if(Log.isLoggable("WearableBluetooth", 3)) {
                            Log.d("WearableBluetooth", "Releasing WakeLock before calling handleConnection.");
                        }
                        this.k.g();
                        this.b.u = 1;
                        ffgp.d().p(new feke(fekh0, ((BluetoothSocket)this.m.get()).getInputStream()), new fekf(fekh0, ((BluetoothSocket)this.m.get()).getOutputStream()), this.b);
                        fekh0.d("Socket closed");
                        fejs.h(1, "Socket closed");
                        goto label_130;
                    }
                    catch(feai unused_ex) {
                    }
                    catch(fdrr unused_ex) {
                        goto label_73;
                    }
                    catch(fejr fejr0) {
                        goto label_82;
                    }
                    catch(fejq fejq0) {
                        goto label_97;
                    }
                    catch(IOException iOException0) {
                        goto label_107;
                    }
                }
                catch(RuntimeException runtimeException1) {
                    goto label_114;
                }
            label_65:
                this.a.d("Wire protocol version mismatch!");
                fejs.h(4, "Error: wire protocol version mismatch");
                ((felq)this.d.get()).c();
            }
            catch(Throwable throwable1) {
                goto label_124;
            }
            try {
                this.f = false;
                ffmm.a(((Closeable)this.m.getAndSet(null)));
                if(Log.isLoggable("WearableBluetooth", 3)) {
                    Log.d("WearableBluetooth", "Acquiring the WakeLock so that an alarm can be set.");
                }
                goto label_134;
            }
            catch(RuntimeException runtimeException0) {
                goto label_174;
            }
            catch(Throwable throwable0) {
                goto label_185;
            }
            try {
            label_73:
                this.a.d("Connection attempted from incorrect client");
                fejs.h(4, "Error: Connection attempted from incorrect client");
                ((felq)this.d.get()).c();
            }
            catch(Throwable throwable1) {
                goto label_124;
            }
            try {
                this.f = false;
                ffmm.a(((Closeable)this.m.getAndSet(null)));
                if(Log.isLoggable("WearableBluetooth", 3)) {
                    Log.d("WearableBluetooth", "Acquiring the WakeLock so that an alarm can be set.");
                }
                goto label_134;
            }
            catch(RuntimeException runtimeException0) {
                goto label_174;
            }
            catch(Throwable throwable0) {
                goto label_185;
            }
            try {
            label_82:
                this.a.d("Socket connect stalled");
                fejs.e(1, "Socket connect stalled", fejr0);
                Log.w("WearableBluetooth", "recordStalledSocketConnect: BT socket connect() stalled. Node ID is " + this.b.j);
                if(!bbqr.d(this.b.j)) {
                    fdob.b().a(fdnp.c).a(0L, 1L, ayvf.b);
                    if(hzun.a.b().k()) {
                        ffnd ffnd0 = ffgp.l() ? ffgp.h : null;
                        if(ffnd0 != null) {
                            ffgp.i().d(new fejp(this, ffnd0));
                        }
                    }
                }
            }
            catch(Throwable throwable1) {
                goto label_124;
            }
            try {
                this.f = false;
                ffmm.a(((Closeable)this.m.getAndSet(null)));
                if(Log.isLoggable("WearableBluetooth", 3)) {
                    Log.d("WearableBluetooth", "Acquiring the WakeLock so that an alarm can be set.");
                }
                goto label_134;
            }
            catch(RuntimeException runtimeException0) {
                goto label_174;
            }
            catch(Throwable throwable0) {
                goto label_185;
            }
            try {
            label_97:
                this.a.d("Not attempting to connect to non-bonded device");
                fejs.e(1, "Device not bonded", fejq0);
                ffmn.f("WearableBluetooth", "Device not bonded, aborting connection, address: %s", new Object[]{ffmo.b(this.h.getAddress())});
                ffmn.f("WearableBluetooth", "Not connecting to non-bonded device.", new Object[0]);
            }
            catch(Throwable throwable1) {
                goto label_124;
            }
            try {
                this.f = false;
                ffmm.a(((Closeable)this.m.getAndSet(null)));
                if(Log.isLoggable("WearableBluetooth", 3)) {
                    Log.d("WearableBluetooth", "Acquiring the WakeLock so that an alarm can be set.");
                }
                goto label_134;
            }
            catch(RuntimeException runtimeException0) {
                goto label_174;
            }
            catch(Throwable throwable0) {
                goto label_185;
            }
            try {
            label_107:
                fejs.e(1, "Failed to connect", this.a.a(iOException0));
            }
            catch(Throwable throwable1) {
                goto label_124;
            }
            try {
                this.f = false;
                ffmm.a(((Closeable)this.m.getAndSet(null)));
                if(Log.isLoggable("WearableBluetooth", 3)) {
                    Log.d("WearableBluetooth", "Acquiring the WakeLock so that an alarm can be set.");
                }
                goto label_134;
            }
            catch(RuntimeException runtimeException0) {
                goto label_174;
            }
            catch(Throwable throwable0) {
                goto label_185;
            }
            try {
            label_114:
                Log.d("WearableBluetooth", "Unexpected runtime exception", runtimeException1);
                IOException iOException2 = new IOException("Unexpected runtime exception", runtimeException1);
                this.a.a(iOException2);
                fejs.e(1, "Unexpected runtime exception", runtimeException1);
            }
            catch(Throwable throwable1) {
                goto label_124;
            }
            try {
                this.f = false;
                ffmm.a(((Closeable)this.m.getAndSet(null)));
                if(Log.isLoggable("WearableBluetooth", 3)) {
                    Log.d("WearableBluetooth", "Acquiring the WakeLock so that an alarm can be set.");
                    goto label_134;
                label_124:
                    this.f = false;
                    ffmm.a(((Closeable)this.m.getAndSet(null)));
                    if(Log.isLoggable("WearableBluetooth", 3)) {
                        Log.d("WearableBluetooth", "Acquiring the WakeLock so that an alarm can be set.");
                    }
                    this.g();
                    throw throwable1;
                label_130:
                    this.f = false;
                    ffmm.a(((Closeable)this.m.getAndSet(null)));
                    if(Log.isLoggable("WearableBluetooth", 3)) {
                        Log.d("WearableBluetooth", "Acquiring the WakeLock so that an alarm can be set.");
                    }
                }
            label_134:
                this.g();
                if(this.p) {
                    continue;
                }
                v4 = ((felq)this.d.get()).a();
                v5 = SystemClock.elapsedRealtime() + v4;
                lock0 = this.i;
                lock0.lock();
                if(v4 < 0L) {
                    goto label_141;
                }
                else {
                    goto label_143;
                }
                goto label_171;
            }
            catch(RuntimeException runtimeException0) {
                goto label_174;
            }
            catch(Throwable throwable0) {
                goto label_185;
            }
            try {
            label_141:
                fejs.h(1, "Not setting retry alarm as the reconnect strategy is OFF. Waiting for the watch to appear nearby.");
                goto label_149;
            label_143:
                if(Long.compare(v4, hzzi.a.i().g()) > 0) {
                    fejs.h(1, String.format(Locale.US, "Setting alarm for %.1f seconds to retry connection", ((float)(((float)v4) / 1000.0f))));
                    PendingIntent pendingIntent0 = this.a();
                    this.c.j("WearableBluetooth", 2, v5, pendingIntent0);
                    if(Log.isLoggable("WearableBluetooth", 3)) {
                        Log.d("WearableBluetooth", "Releasing the WakeLock after setting retry alarm.");
                    }
                label_149:
                    this.k.g();
                    while(!this.p && !this.o) {
                        this.j.await();
                    }
                    this.o = false;
                }
                else {
                    fejs.h(1, String.format(Locale.US, "Sleeping for %.1f seconds to retry connection", ((float)(((float)v4) / 1000.0f))));
                    while(!this.p && !this.o) {
                        if(this.j.await(v4, TimeUnit.MILLISECONDS)) {
                            continue;
                        }
                        else {
                            this.g();
                        }
                        break;
                    }
                    try {
                        try {
                            this.o = false;
                        }
                        catch(InterruptedException interruptedException0) {
                        label_164:
                            fejs.e(1, "Retry interrupted.", interruptedException0);
                            Thread.interrupted();
                            try {
                                try {
                                    lock0 = this.i;
                                    goto label_171;
                                label_169:
                                    this.i.unlock();
                                    throw throwable2;
                                label_171:
                                    lock0.unlock();
                                    continue;
                                }
                                catch(RuntimeException runtimeException0) {
                                }
                            label_174:
                                ffmn.c("WearableBluetooth", runtimeException0, "Wear OS BluetoothThread caught an unhandled exception", new Object[0]);
                                goto label_175;
                            }
                            catch(Throwable throwable0) {
                                goto label_185;
                            }
                        }
                    }
                    catch(Throwable throwable2) {
                        goto label_169;
                    }
                }
                goto label_171;
            }
            catch(InterruptedException interruptedException0) {
                goto label_164;
            }
            catch(Throwable throwable2) {
                goto label_169;
            }
        label_175:
            fejs.h(1, "Wear OS BluetoothThread finished");
            synchronized(this.q) {
                this.q.set(false);
                this.k.g();
            }
            return;
        label_185:
            fejs.h(1, "Wear OS BluetoothThread finished");
            synchronized(this.q) {
                this.q.set(false);
                this.k.g();
            }
            throw throwable0;
        }
        fejs.h(1, "Wear OS BluetoothThread finished");
        synchronized(this.q) {
            this.q.set(false);
            this.k.g();
        }
    }
}

