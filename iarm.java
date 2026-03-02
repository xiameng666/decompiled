import android.os.DeadObjectException;
import android.os.IBinder.DeathRecipient;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.TransactionTooLargeException;
import j..util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class iarm implements IBinder.DeathRecipient {
    private final iaml a;
    public static final Logger j;
    public static final iakj k;
    public static final iakj l;
    public final ibcd m;
    public final ScheduledExecutorService n;
    public final iase o;
    protected final ConcurrentHashMap p;
    public final LinkedHashSet q;
    protected iakk r;
    protected iapk s;
    public iasm t;
    public final iarp u;
    public long v;
    public long w;
    public int x;

    static {
        iarm.j = Logger.getLogger(iarm.class.getName());
        iarm.k = new iakj("internal:remote-uid");
        iarm.l = new iakj("internal:inbound-parcelable-policy");
    }

    public iarm(ibcd ibcd0, iakk iakk0, iaml iaml0) {
        this.q = new LinkedHashSet();
        this.x = 1;
        this.m = ibcd0;
        this.r = iakk0;
        this.a = iaml0;
        this.n = (ScheduledExecutorService)ibcd0.a();
        this.o = new iase(new iare(this));
        this.p = new ConcurrentHashMap();
        this.u = new iarp();
    }

    private final void a() {
        iasm iasm0 = this.t;
        if(iasm0 != null) {
            try {
                iasm0.b.unlinkToDeath(this, 0);
            }
            catch(NoSuchElementException unused_ex) {
            }
            try(iasp iasp0 = iasp.c()) {
                iasp0.a().writeInt(0);
                this.t.a(2, iasp0);
            }
            catch(RemoteException unused_ex) {
            }
        }
    }

    @Override  // android.os.IBinder$DeathRecipient
    public final void binderDied() {
        synchronized(this) {
            this.u(iapk.q.f("Peer process crashed, exited or was killed (binderDied)"), true);
        }
    }

    public final iaml c() {
        return this.a;
    }

    protected void g(Parcel parcel0) {
    }

    protected void i(Parcel parcel0) {
    }

    public abstract void j(iapk arg1);

    public abstract void k();

    public void o() {
        throw null;
    }

    public final iakk r() {
        synchronized(this) {
        }
        return this.r;
    }

    public static iapk s(RemoteException remoteException0) {
        return (remoteException0 instanceof DeadObjectException) || (remoteException0 instanceof TransactionTooLargeException) ? iapk.q.e(remoteException0) : iapk.p.e(remoteException0);
    }

    final void t(int v, iasp iasp0) {
        int v1 = iasp0.a().dataSize();
        try {
            this.t.a(v, iasp0);
        }
        catch(RemoteException remoteException0) {
            throw new iapl(iarm.s(remoteException0));
        }
        if(this.u.b(((long)v1))) {
            iarm.j.logp(Level.FINE, "io.grpc.binder.internal.BinderTransport", "sendTransaction", "transmit window now full " + this.toString());
        }
    }

    final void u(iapk iapk0, boolean z) {
        if(!this.w()) {
            this.s = iapk0;
            this.x(4);
            this.j(iapk0);
        }
        if(!this.y(5) && (z || this.p.isEmpty())) {
            this.o.a = null;
            this.x(5);
            this.a();
            ArrayList arrayList0 = new ArrayList(this.p.values());
            this.p.clear();
            iarf iarf0 = new iarf(this, arrayList0, iapk0);
            this.n.execute(iarf0);
        }
    }

    final boolean v() {
        return !this.u.a;
    }

    final boolean w() {
        return this.y(4) || this.y(5);
    }

    final void x(int v) {
        int v1 = this.x;
        boolean z = false;
        switch(v - 1) {
            case 1: {
                if(v1 == 1) {
                    z = true;
                }
                gftb.q(z);
                break;
            }
            case 2: {
                if(v1 == 1 || v1 == 2) {
                    z = true;
                }
                gftb.q(z);
                break;
            }
            case 3: {
                if(v1 == 1 || v1 == 2 || v1 == 3) {
                    z = true;
                }
                gftb.q(z);
                break;
            }
            default: {
                if(v1 == 4) {
                    z = true;
                }
                gftb.q(z);
            }
        }
        this.x = v;
    }

    final boolean y(int v) {
        return this.x == v;
    }
}

