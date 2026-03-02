import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import j..util.Objects;

public final class croy implements ServiceConnection, baqf, baqg {
    public volatile boolean a;
    public volatile cris b;
    final croz c;

    protected croy(croz croz0) {
        Objects.requireNonNull(croz0);
        this.c = croz0;
        super();
    }

    @Override  // baqf
    public final void a(Bundle bundle0) {
        this.c.aK().c();
        synchronized(this) {
            try {
                batl.s(this.b);
                crii crii0 = (crii)this.b.H();
                this.c.aK().f(new crot(this, crii0));
            }
            catch(DeadObjectException | IllegalStateException unused_ex) {
                this.b = null;
                this.a = false;
            }
        }
    }

    @Override  // baqf
    public final void b(int v) {
        this.c.aK().c();
        this.c.aJ().j.a("Service connection suspended");
        this.c.aK().f(new crou(this));
    }

    static void c(croy croy0) {
        croy0.a = false;
    }

    @Override  // baqg
    public final void hZ(ConnectionResult connectionResult0) {
        this.c.aK().c();
        crji crji0 = this.c.y.f;
        crji0 = crji0 != null && crji0.q() ? this.c.y.f : null;
        if(crji0 != null) {
            crji0.k.b("Service connection failed", connectionResult0);
        }
        synchronized(this) {
            this.a = false;
            this.b = null;
        }
        this.c.aK().f(new crox(this, connectionResult0));
    }

    @Override  // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName0, IBinder iBinder0) {
        crii crii0;
        this.c.aK().c();
        synchronized(this) {
            if(iBinder0 == null) {
                this.a = false;
                this.c.aJ().c.a("Service connected with null binder");
                return;
            }
            try {
                crii0 = null;
                String s = iBinder0.getInterfaceDescriptor();
                if("com.google.android.gms.measurement.internal.IMeasurementService".equals(s)) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    crii crii1 = (iInterface0 instanceof crii) ? ((crii)iInterface0) : new crig(iBinder0);
                    crii0 = crii1;
                    this.c.aJ().k.a("Bound to IMeasurementService interface");
                }
                else {
                    this.c.aJ().c.b("Got binder with a wrong descriptor", s);
                }
            }
            catch(RemoteException unused_ex) {
                this.c.aJ().c.a("Service connect failed to get IMeasurementService");
            }
            if(crii0 == null) {
                try {
                    this.a = false;
                    bbic.a().b(this.c.aj(), this.c.a);
                }
                catch(IllegalArgumentException unused_ex) {
                }
            }
            else {
                this.c.aK().f(new cror(this, crii0));
            }
        }
    }

    @Override  // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName0) {
        this.c.aK().c();
        this.c.aJ().j.a("Service disconnected");
        this.c.aK().f(new cros(this, componentName0));
    }
}

