import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import com.google.android.gms.common.internal.ConnectionInfo;
import java.lang.ref.WeakReference;

final class eqld extends basg {
    private final Handler a;
    private final WeakReference b;

    public eqld(Handler handler0, eqle eqle0) {
        this.a = handler0;
        this.b = new WeakReference(eqle0);
    }

    @Override  // bash
    public final void a(int v, Bundle bundle0) {
    }

    @Override  // wby, android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override  // bash
    public final void c(int v, IBinder iBinder0, Bundle bundle0) {
    }

    @Override  // bash
    public final void d(int v, IBinder iBinder0, ConnectionInfo connectionInfo0) {
        baun baun0 = eqle.a;
        baun0.j("PostInitComplete %s - status %d", new Object[]{iBinder0, v});
        eqle eqle0 = (eqle)this.b.get();
        if(eqle0 == null) {
            baun0.m("client is null", new Object[0]);
            return;
        }
        eqlc eqlc0 = new eqlc(this, eqle0, iBinder0);
        this.a.post(eqlc0);
    }
}

