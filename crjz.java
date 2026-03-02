import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import j..util.Objects;

public final class crjz implements ServiceConnection {
    public final String a;
    final crka b;

    public crjz(crka crka0, String s) {
        Objects.requireNonNull(crka0);
        this.b = crka0;
        super();
        this.a = s;
    }

    @Override  // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName0, IBinder iBinder0) {
        if(iBinder0 != null) {
            try {
                IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
                yxg yxg0 = (iInterface0 instanceof yxg) ? ((yxg)iInterface0) : new yxg(iBinder0);
                if(yxg0 == null) {
                    this.b.a.aJ().f.a("Install Referrer Service implementation was not found");
                    return;
                }
                this.b.a.aJ().k.a("Install Referrer Service connected");
                this.b.a.aK().f(new crjy(this, yxg0, this));
            }
            catch(RuntimeException runtimeException0) {
                this.b.a.aJ().f.b("Exception occurred while calling Install Referrer API", runtimeException0);
            }
            return;
        }
        this.b.a.aJ().f.a("Install Referrer connection returned with null binder");
    }

    @Override  // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName0) {
        this.b.a.aJ().k.a("Install Referrer Service disconnected");
    }
}

