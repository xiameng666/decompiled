import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import j..util.Objects;

final class cpxd implements gmbg {
    final cpxe a;

    public cpxd(cpxe cpxe0) {
        Objects.requireNonNull(cpxe0);
        this.a = cpxe0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        fkbp.g(throwable0, "%s: Failed AddConfigsForDownloadOperation", new Object[]{"Service"});
        try {
            this.a.a.a(Status.d);
        }
        catch(RemoteException remoteException0) {
            fkbp.k(remoteException0, "Client died during AddConfigsForDownloadOperation", new Object[0]);
        }
    }

    @Override  // gmbg
    public final void b(Object object0) {
        Void void0 = (Void)object0;
        try {
            this.a.a.a(Status.b);
        }
        catch(RemoteException remoteException0) {
            fkbp.k(remoteException0, "Client died during AddConfigsForDownloadOperation", new Object[0]);
        }
    }
}

