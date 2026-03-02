import android.os.IBinder.DeathRecipient;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.libs.identity.ClientIdentity;
import com.google.android.gms.significantplaces.SignificantPlacesRequest;
import java.util.NoSuchElementException;

public final class epow extends cjdn implements IBinder.DeathRecipient {
    final eppe d;
    private final ClientIdentity e;
    private final SignificantPlacesRequest f;
    private epfz g;

    public epow(eppe eppe0, ClientIdentity clientIdentity0, SignificantPlacesRequest significantPlacesRequest0, epgz epgz0) {
        ibuq.f(significantPlacesRequest0, "request");
        ibuq.f(epgz0, "listener");
        this.d = eppe0;
        super(epgz0, eppe.C());
        this.e = clientIdentity0;
        this.f = significantPlacesRequest0;
    }

    @Override  // cjdm
    protected final void b() {
        eppe eppe0 = this.d;
        cjdi cjdi0 = this.n(((epfz)eppe0.g.b()));
        if(cjdi0 != null) {
            epou epou0 = new epou(this, cjdi0, null);
            icbb.b(eppe0.d, cclw.f, null, epou0, 2);
        }
    }

    @Override  // android.os.IBinder$DeathRecipient
    public final void binderDied() {
        try {
            this.l();
        }
        catch(RuntimeException runtimeException0) {
            throw new AssertionError(runtimeException0);
        }
    }

    @Override  // cjdm
    protected final void d(Exception exception0) {
        if((exception0 instanceof RemoteException)) {
            ((ggtj)((ggtj)eppf.a.j()).s(exception0)).B("registration %s transport failure", this.e);
            this.l();
            return;
        }
        super.d(exception0);
    }

    @Override  // cjdn
    protected final void f() {
        try {
            ((IBinder)this.j()).unlinkToDeath(this, 0);
        }
        catch(NoSuchElementException noSuchElementException0) {
            a.ae(eppf.a.j(), "failed to unregister binder death listener", noSuchElementException0);
        }
        super.f();
    }

    @Override  // cjdn
    public final cjcp i() {
        return this.d;
    }

    @Override  // cjdn
    protected final void k() {
        try {
            ((IBinder)this.j()).linkToDeath(this, 0);
        }
        catch(RemoteException unused_ex) {
            this.l();
        }
    }

    public final cjdi n(epfz epfz0) {
        ibuq.f(epfz0, "event");
        if(epfz0 == this.g) {
            return null;
        }
        this.g = epfz0;
        return new epov(epfz0);
    }

    @Override
    public final String toString() {
        synchronized(this.d.a) {
        }
        return this.e + " " + this.f;
    }
}

