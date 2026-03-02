import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import j..util.Objects;

final class ccgr implements gmbg {
    final fmzu a;
    final ccgs b;

    public ccgr(ccgs ccgs0, fmzu fmzu0) {
        this.a = fmzu0;
        Objects.requireNonNull(ccgs0);
        this.b = ccgs0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        this.a.close();
        try {
            this.b.b.a(new Status(8, throwable0.getMessage()));
        }
        catch(RemoteException remoteException0) {
            ccgs.a.f(remoteException0, "RemoteException in onFailure");
        }
    }

    @Override  // gmbg
    public final void b(Object object0) {
        this.a.close();
        Status status0 = ((Boolean)object0).booleanValue() ? Status.b : new Status(8, "Cancellation was successful but Brella failed to clean up the local compute output directory!");
        try {
            this.b.b.a(status0);
        }
        catch(RemoteException remoteException0) {
            ccgs.a.f(remoteException0, "RemoteException in onSuccess");
        }
    }
}

