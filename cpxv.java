import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import j..util.Objects;

final class cpxv implements gmbg {
    final cpxw a;

    public cpxv(cpxw cpxw0) {
        Objects.requireNonNull(cpxw0);
        this.a = cpxw0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        fkbp.c("%s: Failed VerifyPendingGroupsOperation.", "Service");
        try {
            this.a.a.a(Status.d);
        }
        catch(RemoteException remoteException0) {
            fkbp.k(remoteException0, "Client died during VerifyPendingGroupsOperation", new Object[0]);
        }
    }

    @Override  // gmbg
    public final void b(Object object0) {
        Void void0 = (Void)object0;
        try {
            this.a.a.a(Status.b);
        }
        catch(RemoteException remoteException0) {
            fkbp.k(remoteException0, "Client died during VerifyPendingGroupsOperation", new Object[0]);
        }
    }
}

