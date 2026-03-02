import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import j..util.Objects;
import java.util.HashMap;

final class soq implements ServiceConnection {
    public HashMap a;
    public final dcqo b;
    final sod c;

    public soq(sod sod0, dcqo dcqo0) {
        Objects.requireNonNull(sod0);
        this.c = sod0;
        super();
        this.a = null;
        this.b = dcqo0;
    }

    @Override  // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName0, IBinder iBinder0) {
        soa soa0;
        if(iBinder0 == null) {
            soa0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.android.vending.p2p.IPeerAppSharingService");
            soa0 = (iInterface0 instanceof soa) ? ((soa)iInterface0) : new soa(iBinder0);
        }
        this.c.e = soa0;
        sop sop0 = new sop(this);
        this.c.c(sop0);
    }

    @Override  // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName0) {
        this.c.d = false;
        this.c.c = null;
        dcvz.a.b().p("Phonesky P2P service disconnected.", new Object[0]);
    }
}

