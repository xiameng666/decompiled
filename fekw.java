import android.content.IntentFilter;
import java.util.concurrent.locks.ReentrantLock;

public final class fekw implements Runnable {
    public final felm a;
    public final fczq b;

    public fekw(felm felm0, fczq fczq0) {
        this.a = felm0;
        this.b = fczq0;
    }

    @Override
    public final void run() {
        felm felm0 = this.a;
        if(felm0.p == null) {
            fesc fesc0 = (fesc)felm0.s.get();
            gmcg gmcg0 = ffgp.i();
            felm0.p = new feht(felm0.b, felm0.g, felm0.A, fesc0, felm0.B, gmcg0);
        }
        fczq fczq0 = this.b;
        feht feht0 = felm0.p;
        if(fczq0.g() && fczq0.d == 6) {
            ReentrantLock reentrantLock0 = feht0.c;
            reentrantLock0.lock();
            try {
                feht0.d.a("startConnection for " + fczq0.c);
                if(feht0.f()) {
                    ffmn.f("BleOffloadServerConnMgr", "startConnection: Existing connection is active. Stopping it first.", new Object[0]);
                    feht0.c();
                }
                fehs fehs0 = feht0.b(fczq0);
                if(fehs0 != null) {
                    feht0.g = fczq0;
                    feht0.f.set(fehs0);
                    ffmn.a("BleOffloadServerConnMgr", "Registering the BT adapter state broadcast receiver", new Object[0]);
                    IntentFilter intentFilter0 = new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED");
                    jwe.b(feht0.e.a.a, feht0.e, intentFilter0, 2);
                    if(hzya.h()) {
                        feht0.b.p(feht0);
                    }
                    fehs0.d();
                    goto label_24;
                }
                goto label_26;
            }
            catch(Throwable throwable0) {
                feht0.c.unlock();
                throw throwable0;
            }
        label_24:
            feht0.c.unlock();
            return;
            try {
            label_26:
                ffmn.f("BleOffloadServerConnMgr", "Could not set up the connection", new Object[0]);
            }
            catch(Throwable throwable0) {
                feht0.c.unlock();
                throw throwable0;
            }
            reentrantLock0.unlock();
            return;
        }
        ffmn.f("BleOffloadServerConnMgr", "setConnection: Incompatible config: %s", new Object[]{fczq0});
    }
}

