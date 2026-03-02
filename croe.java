import android.os.RemoteException;
import com.google.android.gms.measurement.internal.AppMetadata;
import j..util.Objects;
import java.util.concurrent.atomic.AtomicReference;

final class croe implements Runnable {
    final AtomicReference a;
    final AppMetadata b;
    final croz c;

    public croe(croz croz0, AtomicReference atomicReference0, AppMetadata appMetadata0) {
        this.a = atomicReference0;
        this.b = appMetadata0;
        Objects.requireNonNull(croz0);
        this.c = croz0;
        super();
    }

    @Override
    public final void run() {
        croz croz0;
        AtomicReference atomicReference0 = this.a;
        __monitor_enter(atomicReference0);
        try {
            croz0 = this.c;
            if(croz0.ap().f().q()) {
                crii crii0 = croz0.b;
                if(crii0 != null) {
                    batl.s(this.b);
                    atomicReference0.set(crii0.b(this.b));
                    String s = (String)atomicReference0.get();
                    if(s != null) {
                        croz0.h().A(s);
                        croz0.ap().f.b(s);
                    }
                    croz0.w();
                    goto label_13;
                }
                goto label_15;
            }
            else {
                goto label_17;
            }
            goto label_30;
        }
        catch(RemoteException remoteException0) {
            goto label_23;
        }
        catch(Throwable throwable0) {
            goto label_28;
        }
        try {
        label_13:
            atomicReference0.notify();
            goto label_25;
        }
        catch(Throwable throwable1) {
            __monitor_exit(atomicReference0);
            throw throwable1;
        }
        try {
            try {
            label_15:
                croz0.aJ().c.a("Failed to get app instance id");
                goto label_30;
            label_17:
                croz0.aJ().h.a("Analytics storage consent denied; will not get app instance id");
                croz0.h().A(null);
                croz0.ap().f.b(null);
                atomicReference0.set(null);
                goto label_30;
            }
            catch(RemoteException remoteException0) {
            }
        label_23:
            this.c.aJ().c.b("Failed to get app instance id", remoteException0);
        }
        catch(Throwable throwable0) {
            goto label_28;
        }
        try {
            this.a.notify();
        }
        catch(Throwable throwable1) {
            __monitor_exit(atomicReference0);
            throw throwable1;
        }
    label_25:
        __monitor_exit(atomicReference0);
        return;
        try {
        label_28:
            this.a.notify();
            throw throwable0;
        label_30:
            atomicReference0.notify();
        }
        catch(Throwable throwable1) {
            __monitor_exit(atomicReference0);
            throw throwable1;
        }
        __monitor_exit(atomicReference0);
    }
}

