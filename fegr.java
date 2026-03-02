import android.bluetooth.BluetoothSocket;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public final class fegr implements glzn {
    public final fegy a;

    public fegr(fegy fegy0) {
        this.a = fegy0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        gmcd gmcd1;
        gmcd gmcd0;
        long v1;
        Condition condition0;
        Lock lock0;
        boolean z;
        fegy fegy0;
        Void void0 = (Void)object0;
        while(true) {
            fegy0 = this.a;
            AtomicBoolean atomicBoolean0 = fegy0.h;
            if(!atomicBoolean0.get() || fegy0.j.get()) {
                break;
            }
            try {
                z = false;
                fegy0.n.a("doOffloadSocketSetupAndConnect: Connecting. attemptCount=" + 1);
                fegy0.c.lock();
            }
            catch(fegx fegx0) {
                goto label_47;
            }
            catch(IOException iOException0) {
                goto label_51;
            }
            try {
                int v = fegy0.s.a(fegy0.b);
                if(v < 0) {
                    throw new fegx();
                }
                if(!atomicBoolean0.get()) {
                    throw new IllegalStateException("connection aborted");
                }
                ffmn.a("BleOffloadClientConn", "Connecting with PSM=%d", new Object[]{v});
                fegy0.q = fegy0.e.createL2capChannel(v);
                goto label_18;
            }
            catch(Throwable throwable0) {
                try {
                    fegy0.c.unlock();
                    throw throwable0;
                label_18:
                    lock0 = fegy0.c;
                    lock0.unlock();
                    fegy0.l.b(fegy0.b, fehf.a);
                    fegy0.f.cancelDiscovery();
                    fegy0.a().connect();
                    ffmn.a("BleOffloadClientConn", "Client connection to %s established", new Object[]{fegy0.e.getAddress()});
                    fdpk fdpk0 = fegy0.n;
                    fdpk0.a("doOffloadSocketSetupAndConnect: Socket connected");
                    AtomicBoolean atomicBoolean1 = fegy0.h;
                    if(!atomicBoolean1.get()) {
                        break;
                    }
                    fegy0.f();
                    fdpk0.a("doOffloadSocketSetupAndConnect: Handshake complete");
                    ffmn.a("BleOffloadClientConn", "doOffloadSocketSetupAndConnect: Handshake complete", new Object[0]);
                    lock0.lock();
                }
                catch(fegx fegx0) {
                    goto label_47;
                }
                catch(IOException iOException0) {
                    goto label_51;
                }
            }
            try {
                if(fegy0.q == null) {
                    ffmn.f("BleOffloadClientConn", "doOffloadSocketSetupAndConnect: Socket disconnected, aborting setup", new Object[0]);
                }
                else if(atomicBoolean1.get()) {
                    fegy0.j.set(true);
                    ffmn.a("BleOffloadClientConn", "Offload socket setup complete", new Object[0]);
                }
                else {
                    ffmn.f("BleOffloadClientConn", "doOffloadSocketSetupAndConnect: Connection not active, aborting setup", new Object[0]);
                }
                goto label_44;
            }
            catch(Throwable throwable1) {
                try {
                    fegy0.c.unlock();
                    throw throwable1;
                label_44:
                    lock0.unlock();
                    break;
                }
                catch(fegx fegx0) {
                }
                catch(IOException iOException0) {
                    goto label_51;
                }
            }
        label_47:
            fegy0.n.a("doOffloadSocketSetupAndConnect: WearBleOffloadException: " + fegx0.getMessage());
            ffmn.g("BleOffloadClientConn", fegx0, "Unrecoverable BT exception", new Object[0]);
            break;
        label_51:
            ffmn.g("BleOffloadClientConn", iOException0, "Socket connection attempt failed", new Object[0]);
            fegy0.c.lock();
            try {
                BluetoothSocket bluetoothSocket0 = fegy0.q;
                fegy0.q = null;
                if(bluetoothSocket0 != null) {
                    try {
                        bluetoothSocket0.close();
                    }
                    catch(IOException unused_ex) {
                    }
                }
                ffmn.f("BleOffloadClientConn", "Backing off for %d seconds", new Object[]{fegy.a.toSeconds()});
                condition0 = fegy0.d;
                v1 = gmby.a(fegy.a);
            }
            catch(Throwable throwable2) {
                fegy0.c.unlock();
                throw throwable2;
            }
            try {
                long v2 = TimeUnit.NANOSECONDS.toNanos(v1);
                long v3 = System.nanoTime() + v2;
                while(true) {
                    try {
                        condition0.await(v2, TimeUnit.NANOSECONDS);
                        goto label_71;
                    }
                    catch(InterruptedException unused_ex) {
                        v2 = v3 - System.nanoTime();
                        z = true;
                    }
                }
            }
            catch(Throwable throwable3) {
                try {
                    if(z) {
                        Thread.currentThread().interrupt();
                    }
                    throw throwable3;
                label_71:
                    if(z) {
                        Thread.currentThread().interrupt();
                    }
                    goto label_77;
                }
                catch(Throwable throwable2) {
                }
            }
            fegy0.c.unlock();
            throw throwable2;
        label_77:
            fegy0.c.unlock();
        }
        Lock lock1 = fegy0.c;
        lock1.lock();
        try {
            if(fegy0.h.get()) {
                if(!fegy0.j.get()) {
                    gmcd0 = gmbu.h(new IllegalStateException("The socket has not completed setup"));
                    goto label_94;
                }
                fegq fegq0 = new fegq(fegy0);
                gmcd1 = fegy0.g.e(fegq0);
                goto label_87;
            }
            else {
                goto label_89;
            }
            goto label_94;
        }
        catch(Throwable throwable4) {
            fegy0.c.unlock();
            throw throwable4;
        }
    label_87:
        fegy0.c.unlock();
        return gmcd1;
        try {
        label_89:
            gmcd0 = gmbu.h(new IllegalStateException("Cannot utilize an inactive connection"));
        }
        catch(Throwable throwable4) {
            fegy0.c.unlock();
            throw throwable4;
        }
    label_94:
        lock1.unlock();
        return gmcd0;
    }
}

