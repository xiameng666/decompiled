import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import j..util.Objects;

final class cpxr implements gmbg {
    final cpxs a;

    public cpxr(cpxs cpxs0) {
        Objects.requireNonNull(cpxs0);
        this.a = cpxs0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        fkbp.c("%s: Failed VerifyPendingGroupsOperation.", "Service");
        try {
            this.a.c.a(Status.d);
        }
        catch(RemoteException remoteException0) {
            fkbp.k(remoteException0, "Client died during HandleFlagChangeOperation", new Object[0]);
        }
    }

    @Override  // gmbg
    public final void b(Object object0) {
        Void void0 = (Void)object0;
        try {
            this.a.c.a(Status.b);
        }
        catch(RemoteException remoteException0) {
            fkbp.k(remoteException0, "Client died during HandleFlagChangeOperation", new Object[0]);
        }
    }
}

