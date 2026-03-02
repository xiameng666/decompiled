import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import j..util.Objects;
import java.util.concurrent.locks.Lock;

final class azvw implements azxt {
    final azvx a;

    public azvw(azvx azvx0) {
        Objects.requireNonNull(azvx0);
        this.a = azvx0;
        super();
    }

    @Override  // azxt
    public final void v(ConnectionResult connectionResult0) {
        this.a.g.lock();
        try {
            this.a.e = connectionResult0;
            this.a.g();
        }
        finally {
            this.a.g.unlock();
        }
    }

    @Override  // azxt
    public final void w(Bundle bundle0) {
        this.a.g.lock();
        try {
            this.a.e = ConnectionResult.a;
            this.a.g();
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
            if(azvx0.f) {
                azvx0.f = false;
                azvx0.l(v);
            }
            else {
                azvx0.f = true;
                azvx0.a.onConnectionSuspended(v);
            }
        }
        catch(Throwable throwable0) {
            this.a.g.unlock();
            throw throwable0;
        }
        lock0.unlock();
    }
}

