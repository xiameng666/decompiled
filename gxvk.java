import android.os.IBinder.DeathRecipient;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.nearby.discovery.service.DiscoveryChimeraService;
import java.util.List;

public abstract class gxvk extends wby implements gxvl {
    public final DiscoveryChimeraService a;
    private final gxum b;
    private final gxum c;
    private final IBinder.DeathRecipient d;
    private final gxuf e;
    private gxvo f;
    private final Object g;

    public gxvk(DiscoveryChimeraService discoveryChimeraService0, gxuf gxuf0) {
        super("com.google.location.nearby.common.fastpair.IDiscoveryService");
        this.b = new cxsn(this);
        this.c = new cxso(this);
        this.d = new cxsm(this);
        this.g = new Object();
        this.a = discoveryChimeraService0;
        this.e = gxuf0;
    }

    protected abstract List a(List arg1);

    @Override  // gxvl
    public final void b(gxvo gxvo0) {
        synchronized(this.g) {
            if(this.h(gxvo0)) {
                cwfa.a.b().x("Incoming binder is different than the stored one. Ignore the unregister request.");
                return;
            }
        }
        this.e();
    }

    public void c() {
        throw null;
    }

    public void d() {
        throw null;
    }

    public final void e() {
        synchronized(this.g) {
            gxvo gxvo0 = this.f;
            if(gxvo0 != null) {
                gxvo0.asBinder().unlinkToDeath(this.d, 1);
            }
            this.f = null;
        }
        this.e.f(this.c);
    }

    public final boolean f() {
        synchronized(this.g) {
        }
        return this.f != null;
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        gxvo gxvo0 = null;
        switch(v) {
            case 1: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.location.nearby.common.fastpair.IDiscoveryServiceCallback");
                    gxvo0 = (iInterface0 instanceof gxvo) ? ((gxvo)iInterface0) : new gxvm(iBinder0);
                }
                gxvk.gr(parcel0);
                this.jg(gxvo0);
                return true;
            }
            case 2: {
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 != null) {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.location.nearby.common.fastpair.IDiscoveryServiceCallback");
                    gxvo0 = (iInterface1 instanceof gxvo) ? ((gxvo)iInterface1) : new gxvm(iBinder1);
                }
                gxvk.gr(parcel0);
                this.b(gxvo0);
                return true;
            }
            default: {
                return false;
            }
        }
    }

    public final void g(List list0) {
        Object object0 = this.g;
        List list1 = this.a(list0);
        synchronized(object0) {
            gxvo gxvo0 = this.f;
            if(gxvo0 != null) {
                try {
                    gxvo0.a(list1);
                }
                catch(RemoteException remoteException0) {
                    ((ggtj)cwfa.a.e().s(remoteException0)).x("DiscoveryService failed to notify Service");
                }
            }
        }
    }

    private final boolean h(gxvo gxvo0) {
        return this.f != null && this.f.asBinder() != gxvo0.asBinder();
    }

    @Override  // gxvl
    public final void jg(gxvo gxvo0) {
        synchronized(this.g) {
            if(this.h(gxvo0)) {
                cwfa.a.b().x("Incoming binder is different than the stored one. Release the stored binder.");
                this.e();
            }
            try {
                this.f = gxvo0;
                gxvo0.asBinder().linkToDeath(this.d, 1);
            }
            catch(RemoteException remoteException0) {
                ((ggtj)cwfa.a.e().s(remoteException0)).x("DiscoveryService failed to register.");
            }
        }
        this.e.f(this.b);
    }
}

