import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.AppMetadata;
import j..util.Objects;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

final class croq implements Runnable {
    final AtomicReference a;
    final String b;
    final String c;
    final AppMetadata d;
    final boolean e;
    final croz f;

    public croq(croz croz0, AtomicReference atomicReference0, String s, String s1, AppMetadata appMetadata0, boolean z) {
        this.a = atomicReference0;
        this.b = s;
        this.c = s1;
        this.d = appMetadata0;
        this.e = z;
        Objects.requireNonNull(croz0);
        this.f = croz0;
        super();
    }

    @Override
    public final void run() {
        AtomicReference atomicReference0 = this.a;
        __monitor_enter(atomicReference0);
        try {
            try {
                croz croz0 = this.f;
                crii crii0 = croz0.b;
                if(crii0 != null) {
                    if(TextUtils.isEmpty(null)) {
                        batl.s(this.d);
                        atomicReference0.set(crii0.e(this.b, this.c, this.e, this.d));
                    }
                    else {
                        atomicReference0.set(crii0.f(null, this.b, this.c, this.e));
                    }
                    croz0.w();
                    goto label_18;
                }
                croz0.aJ().c.d("(legacy) Failed to get user properties; not connected to service", null, this.b, this.c);
                atomicReference0.set(Collections.EMPTY_LIST);
                goto label_24;
            }
            catch(RemoteException remoteException0) {
                this.f.aJ().c.d("(legacy) Failed to get user properties; remote exception", null, this.b, remoteException0);
                this.a.set(Collections.EMPTY_LIST);
            }
        }
        catch(Throwable throwable0) {
            goto label_22;
        }
        try {
        label_18:
            this.a.notify();
        }
        catch(Throwable throwable1) {
            __monitor_exit(atomicReference0);
            throw throwable1;
        }
        __monitor_exit(atomicReference0);
        return;
        try {
        label_22:
            this.a.notify();
            throw throwable0;
        label_24:
            atomicReference0.notify();
        }
        catch(Throwable throwable1) {
            __monitor_exit(atomicReference0);
            throw throwable1;
        }
        __monitor_exit(atomicReference0);
    }
}

