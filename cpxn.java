import android.os.RemoteException;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import j..util.Objects;
import java.util.List;

final class cpxn implements gmbg {
    final cpxo a;

    public cpxn(cpxo cpxo0) {
        Objects.requireNonNull(cpxo0);
        this.a = cpxo0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        fkbp.f(throwable0, "FileGroupListForDebugUIOperation failed");
        try {
            this.a.a.a(Status.d, null, ApiMetadata.b);
        }
        catch(RemoteException remoteException0) {
            fkbp.k(remoteException0, "Client died during FileGroupsListForDebugUIOperation", new Object[0]);
        }
    }

    @Override  // gmbg
    public final void b(Object object0) {
        List list0 = (List)object0;
        try {
            ApiMetadata apiMetadata0 = cckf.d(bbdp.cM);
            this.a.a.a(Status.b, list0, apiMetadata0);
        }
        catch(RemoteException remoteException0) {
            fkbp.k(remoteException0, "Client died during FileGroupListForDebugUIOperation", new Object[0]);
        }
    }
}

