import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import j..util.Objects;

final class cpyd implements gmbg {
    final cpye a;

    public cpyd(cpye cpye0) {
        Objects.requireNonNull(cpye0);
        this.a = cpye0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        fkbp.f(throwable0, "MaintenanceOperation failed");
        try {
            this.a.a.a(Status.d);
        }
        catch(RemoteException remoteException0) {
            fkbp.k(remoteException0, "Client died during MaintenanceOperation", new Object[0]);
        }
    }

    @Override  // gmbg
    public final void b(Object object0) {
        Void void0 = (Void)object0;
        try {
            this.a.a.a(Status.b);
        }
        catch(RemoteException remoteException0) {
            fkbp.k(remoteException0, "Client died during MaintenanceOperation", new Object[0]);
        }
    }
}

