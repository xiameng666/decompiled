import android.bluetooth.BluetoothAdapter;
import android.bluetooth.le.AdvertiseData.Builder;
import android.bluetooth.le.AdvertiseData;
import android.bluetooth.le.AdvertiseSettings.Builder;
import android.bluetooth.le.AdvertiseSettings;
import j..util.Objects;
import j..util.Optional;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public final class fehs implements ffmj {
    public final String a;
    public final BluetoothAdapter b;
    public final fego c;
    public final feqn d;
    public final fdpk e;
    public final fesc f;
    private final Lock g;
    private final Executor h;
    private final fehi i;
    private final AtomicReference j;
    private final fehu k;
    private final AtomicReference l;

    public fehs(String s, BluetoothAdapter bluetoothAdapter0, Executor executor0, fego fego0, fesc fesc0, feqn feqn0, fehi fehi0) {
        this.g = new ReentrantLock();
        this.e = new fdpk();
        AtomicReference atomicReference0 = new AtomicReference();
        this.j = atomicReference0;
        this.k = new fehu();
        this.l = new AtomicReference(Optional.empty());
        this.a = s;
        this.b = bluetoothAdapter0;
        this.h = executor0;
        this.c = fego0;
        this.f = fesc0;
        this.d = feqn0;
        this.i = fehi0;
        atomicReference0.set(gmbx.a);
    }

    public final gmcd a() {
        fego fego0 = this.c;
        if(!fego0.b.getAndSet(true)) {
            ffmn.d("BleAdvertisingManager", "Starting BLE advertising", new Object[0]);
            if(fego0.c != null) {
                ffmn.d("BleAdvertisingManager", "Stopping current advertising first", new Object[0]);
                fegn fegn0 = fego0.c;
                gftb.check(fegn0);
                fego0.a.stopAdvertising(fegn0);
            }
            fego0.c = new fegn();
            AdvertiseData.Builder advertiseData$Builder0 = new AdvertiseData.Builder().setIncludeDeviceName(true);
            AdvertiseSettings advertiseSettings0 = new AdvertiseSettings.Builder().setAdvertiseMode(1).setConnectable(true).setTxPowerLevel(1).build();
            AdvertiseData advertiseData0 = advertiseData$Builder0.build();
            fegn fegn1 = fego0.c;
            gftb.check(fegn1);
            fego0.a.startAdvertising(advertiseSettings0, advertiseData0, fegn1);
        }
        return glzd.g(gmbt.h(jqy.a(new fepw(((feqm)this.d)))), new fehj(this), this.h);
    }

    public final gmcd b() {
        gmbt gmbt0 = gmbt.h(gmbu.m(new fehl(this), this.h));
        fehm fehm0 = new fehm();
        gmcd gmcd0 = glyi.g(gmbt0, IOException.class, fehm0, this.h);
        Objects.requireNonNull(this.f);
        gmcd gmcd1 = glzd.g(glzd.g(glzd.g(gmcd0, new fehn(this.f), this.h), new feho(this), this.h), new fehp(this), this.h);
        fehq fehq0 = new fehq(this);
        return glyi.g(gmcd1, IOException.class, fehq0, this.h);
    }

    public final void c(fehf fehf0) {
        if(fehf0 == fehf.c) {
            this.e.a("Socket connected");
            fdny.a(fdnm.c);
            if(hzya.d()) {
                AtomicReference atomicReference0 = this.l;
                if(((Optional)atomicReference0.get()).isPresent()) {
                    fehu.a(((ccyy)((Optional)atomicReference0.get()).get()));
                    ffmn.f("BleOffloadServerConn", "connectionDurationTimer preemted. Logging connection termination.", new Object[0]);
                }
                ffmn.a("BleOffloadStats", "startAndGetConnectionDurationTimer", new Object[0]);
                ccyz ccyz0 = this.k.a;
                atomicReference0.set(Optional.of(new ccyy(ccyz0, ccyz0)));
            }
        }
        else if(fehf0 == fehf.d) {
            this.e.a("Socket disconnected");
            fdny.a(fdnm.d);
            if(hzya.d()) {
                AtomicReference atomicReference1 = this.l;
                if(((Optional)atomicReference1.get()).isPresent()) {
                    fehu.a(((ccyy)((Optional)atomicReference1.get()).get()));
                    atomicReference1.set(Optional.empty());
                }
                else {
                    ffmn.f("BleOffloadServerConn", "connectionDurationTimer not set, duration not logged.", new Object[0]);
                }
            }
        }
        this.i.b(this.a, fehf0);
    }

    public final void d() {
        this.g.lock();
        try {
            this.e.a("startConnection");
            ffmn.d("BleOffloadServerConn", "Starting the offload server for %s", new Object[]{this.a});
            gmcd gmcd0 = this.b();
            this.j.set(gmcd0);
        }
        finally {
            this.g.unlock();
        }
    }

    public final void f() {
        this.g.lock();
        try {
            this.e.a("stopConnection");
            ((gmcd)this.j.get()).cancel(false);
            ffmn.d("BleOffloadServerConn", "Stopping the offload server", new Object[0]);
            this.c.a();
            Objects.requireNonNull(this.f);
            gmbu.t(gmbu.n(new fehk(this.f), this.h), new fehr(this), this.h);
        }
        finally {
            this.g.unlock();
        }
    }

    @Override  // ffmj
    public final void md(bbpd bbpd0, boolean z, boolean z1) {
        bbpd0.print("clientNodeId=");
        bbpd0.println(this.a);
        bbpd0.println("isActive=" + ((boolean)(((gmcd)this.j.get()).isDone() ^ 1)));
        bbpd0.println("Connection History");
        bbpd0.b();
        bbpd0.print(this.e);
        bbpd0.a();
    }
}

