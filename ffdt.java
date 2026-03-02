import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.wearable.internal.ConnectionEvent;

public final class ffdt implements fehg {
    private final String a;
    private final fehi b;
    private final fdis c;

    public ffdt(fdpl fdpl0, fehi fehi0, fdis fdis0) {
        this.a = fdpl0.b;
        this.b = fehi0;
        this.c = fdis0;
    }

    public final void a() {
        this.b("shutdown: Unregistering listener.", new Object[0]);
        ffmn.a("BleOffloadEventNotifier", "Removing %s", new Object[]{this.getClass().getName()});
        this.b.a.remove(this);
    }

    private final void b(String s, Object[] arr_object) {
        ffmn.a("ConnectionRequestMgr", "[%s] %s", new Object[]{this.a, String.format(s, arr_object)});
    }

    @Override  // fehg
    public final void z(String s, fehf fehf0) {
        if(!hzya.e()) {
            return;
        }
        int v = 3;
        this.b("Received connection event: %s", new Object[]{fehf0.name()});
        switch(fehf0.ordinal()) {
            case 2: {
                v = 1;
                break;
            }
            case 3: {
                break;
            }
            default: {
                this.b("Unexpected connection event (%s)", new Object[]{fehf0.name()});
                return;
            }
        }
        ConnectionEvent connectionEvent0 = new ConnectionEvent(s, 0, v);
        try {
            Parcel parcel0 = this.c.jo();
            wbz.f(parcel0, connectionEvent0);
            this.c.jp(2, parcel0);
        }
        catch(RemoteException unused_ex) {
            this.b("Encountered a RemoteException while invoking the callback", new Object[0]);
            this.a();
        }
    }
}

