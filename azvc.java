import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

public abstract class azvc extends BasePendingResult implements azvd {
    public final azss b;
    public final azta_api c;

    @Deprecated
    protected azvc(azss azss0, aztw aztw0) {
        batl.t(aztw0, "GoogleApiClient must not be null");
        super(aztw0);
        this.b = azss0;
        this.c = null;
    }

    protected azvc(azta_api azta0, aztw aztw0) {
        batl.t(aztw0, "GoogleApiClient must not be null");
        super(aztw0);
        batl.t(azta0, "Api must not be null");
        this.b = azta0.c;
        this.c = azta0;
    }

    @Override  // azvd
    public final void a(Status status0) {
        batl.c(((boolean)(status0.e() ^ 1)), "Failed result must not be success");
        this.n(this.g(status0));
    }

    @Override  // azvd
    public void b(Object object0) {
        throw null;
    }

    protected abstract void h(azsr arg1);

    public final void i(azsr azsr0) {
        try {
            this.h(azsr0);
        }
        catch(DeadObjectException deadObjectException0) {
            this.r(deadObjectException0);
            throw deadObjectException0;
        }
        catch(RemoteException remoteException0) {
            this.r(remoteException0);
        }
    }

    private final void r(RemoteException remoteException0) {
        this.a(new Status(8, remoteException0.getLocalizedMessage(), null));
    }
}

