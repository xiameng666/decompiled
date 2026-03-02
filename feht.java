import android.bluetooth.BluetoothAdapter;
import android.bluetooth.le.BluetoothLeAdvertiser;
import android.content.Context;
import com.google.android.gms.wearable.node.ble.offload.BleOffloadServerConnectionManager.BluetoothAdapterStateReceiver;
import j..util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;

public final class feht implements fdui, ffmj {
    public final Context a;
    public final fdxu b;
    public final ReentrantLock c;
    public final fdpk d;
    public final BleOffloadServerConnectionManager.BluetoothAdapterStateReceiver e;
    public final AtomicReference f;
    public fczq g;
    private final feqn h;
    private final fehi i;
    private final Executor j;
    private final fesc k;

    public feht(Context context0, fdxu fdxu0, feqn feqn0, fesc fesc0, fehi fehi0, Executor executor0) {
        this.c = new ReentrantLock();
        this.d = new fdpk();
        this.e = new BleOffloadServerConnectionManager.BluetoothAdapterStateReceiver(this);
        this.f = new AtomicReference();
        this.b = fdxu0;
        this.a = context0;
        this.h = feqn0;
        this.k = fesc0;
        this.i = fehi0;
        this.j = new gmct(executor0);
    }

    @Override  // fdui
    public final void a(String s, boolean z) {
        if(!hzya.h()) {
            return;
        }
        ReentrantLock reentrantLock0 = this.c;
        reentrantLock0.lock();
        try {
            if(this.g != null && Objects.equals(s, this.g.j)) {
                if(z) {
                    ffmn.a("BleOffloadServerConnMgr", "Main connection to node %s is established, resuming offload connection", new Object[]{s});
                    this.d();
                }
                goto label_12;
            }
            goto label_14;
        }
        catch(Throwable throwable0) {
            this.c.unlock();
            throw throwable0;
        }
    label_12:
        this.c.unlock();
        return;
    label_14:
        reentrantLock0.unlock();
    }

    public final fehs b(fczq fczq0) {
        fego fego0;
        BluetoothAdapter bluetoothAdapter0 = bahu.a(this.a);
        if(bluetoothAdapter0 == null) {
            ffmn.f("BleOffloadServerConn", "Null BluetoothAdapter", new Object[0]);
            return null;
        }
        try {
            BluetoothLeAdvertiser bluetoothLeAdvertiser0 = bluetoothAdapter0.getBluetoothLeAdvertiser();
            if(bluetoothLeAdvertiser0 == null) {
                throw new IllegalStateException("BLE advertiser not available");
            }
            fego0 = new fego(bluetoothLeAdvertiser0);
        }
        catch(IllegalStateException unused_ex) {
            fego0 = null;
        }
        String s = fczq0.j;
        if(bbqr.d(s)) {
            ffmn.f("BleOffloadServerConn", "Cannot create an offload server without the client node ID", new Object[0]);
            return null;
        }
        if(fego0 == null) {
            ffmn.f("BleOffloadServerConn", "BleAdvertisingManager is not available", new Object[0]);
            return null;
        }
        fehs fehs0 = new fehs(s, bluetoothAdapter0, this.j, fego0, this.k, this.h, this.i);
        ((feqm)this.h).o.set(fehs0);
        return fehs0;
    }

    public final void c() {
        fehs fehs0;
        ReentrantLock reentrantLock0 = this.c;
        reentrantLock0.lock();
        try {
            this.d.a("removeConnection");
            if(hzya.h()) {
                this.b.t(this);
            }
            ffmn.a("BleOffloadServerConnMgr", "Unregistering the BT adapter state broadcast receiver", new Object[0]);
            this.e.a.a.unregisterReceiver(this.e);
            this.g = null;
            fehs0 = (fehs)this.f.getAndSet(null);
            if(fehs0 == null) {
                ffmn.a("BleOffloadServerConnMgr", "removeConnection: The connection has not been set yet.", new Object[0]);
                goto label_11;
            }
            goto label_13;
        }
        catch(Throwable throwable0) {
            this.c.unlock();
            throw throwable0;
        }
    label_11:
        reentrantLock0.unlock();
        return;
        try {
        label_13:
            fehs0.f();
        }
        catch(Throwable throwable0) {
            this.c.unlock();
            throw throwable0;
        }
        this.c.unlock();
    }

    public final void d() {
        ReentrantLock reentrantLock0 = this.c;
        reentrantLock0.lock();
        try {
            this.d.a("resumeConnection");
            if(this.g == null) {
                goto label_18;
            }
            else {
                AtomicReference atomicReference0 = this.f;
                if(((fehs)atomicReference0.get()) == null) {
                    fczq fczq0 = this.g;
                    batl.s(fczq0);
                    fehs fehs0 = this.b(fczq0);
                    if(fehs0 == null) {
                        ffmn.b("BleOffloadServerConnMgr", "resumeConnection: offload not available", new Object[0]);
                        goto label_23;
                    }
                    fehs0.d();
                    atomicReference0.set(fehs0);
                    goto label_14;
                }
                else {
                    goto label_16;
                }
            }
            goto label_23;
        }
        catch(Throwable throwable0) {
            this.c.unlock();
            throw throwable0;
        }
    label_14:
        this.c.unlock();
        return;
        try {
        label_16:
            ffmn.a("BleOffloadServerConnMgr", "resumeConnection: already started", new Object[0]);
            goto label_23;
        label_18:
            ffmn.b("BleOffloadServerConnMgr", "resumeConnection: configuration null", new Object[0]);
        }
        catch(Throwable throwable0) {
            this.c.unlock();
            throw throwable0;
        }
    label_23:
        reentrantLock0.unlock();
    }

    public final boolean f() {
        boolean z;
        this.c.lock();
        try {
            z = ((fehs)this.f.get()) != null;
        }
        finally {
            this.c.unlock();
        }
        return z;
    }

    @Override  // ffmj
    public final void md(bbpd bbpd0, boolean z, boolean z1) {
        fehs fehs0;
        this.c.lock();
        try {
            fehs0 = (fehs)this.f.get();
        }
        finally {
            this.c.unlock();
        }
        if(fehs0 == null) {
            bbpd0.println("Connection not created");
            return;
        }
        bbpd0.print("Connection created for node ");
        bbpd0.print(fehs0.a);
        bbpd0.print(", active=");
        bbpd0.println(this.f());
        bbpd0.println("Manager Activity");
        bbpd0.b();
        bbpd0.println(this.d);
        bbpd0.a();
        bbpd0.println("Connection dump state");
        bbpd0.b();
        fehs0.md(bbpd0, z, z1);
        bbpd0.a();
    }
}

