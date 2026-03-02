import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import j..util.Objects;
import java.util.concurrent.locks.Lock;

final class azvv implements azxt {
    final azvx a;

    public azvv(azvx azvx0) {
        Objects.requireNonNull(azvx0);
        this.a = azvx0;
        super();
    }

    @Override  // azxt
    public final void v(ConnectionResult connectionResult0) {
        this.a.g.lock();
        try {
            this.a.d = connectionResult0;
            this.a.g();
        }
        finally {
            this.a.g.unlock();
        }
    }

    @Override  // azxt
    public final void w(Bundle bundle0) {
        azvx azvx0 = this.a;
        azvx0.g.lock();
        try {
            Bundle bundle1 = azvx0.c;
            if(bundle1 == null) {
                azvx0.c = bundle0;
            }
            else if(bundle0 != null) {
                bundle1.putAll(bundle0);
            }
            azvx0.d = ConnectionResult.a;
            azvx0.g();
        }
        finally {
            this.a.g.unlock();
        }
    }

    @Override  // azxt
    public final void x(int v) {
        azvx azvx0 = this.a;
        Lock lock0 = azvx0.g;
        lock0.lock();
        try {
            if(!azvx0.f && (azvx0.e != null && azvx0.e.d())) {
                azvx0.f = true;
                azvx0.b.onConnectionSuspended(v);
                goto label_6;
            }
            goto label_8;
        }
        catch(Throwable throwable0) {
            this.a.g.unlock();
            throw throwable0;
        }
    label_6:
        this.a.g.unlock();
        return;
        try {
        label_8:
            azvx0.f = false;
            azvx0.l(v);
        }
        catch(Throwable throwable0) {
            this.a.g.unlock();
            throw throwable0;
        }
        lock0.unlock();
    }
}

