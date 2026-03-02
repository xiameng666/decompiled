import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.auth.blockstore.DeleteBytesRequest;
import com.google.android.gms.common.api.Status;

public final class aiww extends cjtm {
    public static final bboh a;
    private final aink b;
    private final aiom c;
    private final DeleteBytesRequest d;

    static {
        aiww.a = aiqz.b("DeleteBytesOperation");
    }

    public aiww(aink aink0, aiom aiom0, DeleteBytesRequest deleteBytesRequest0) {
        super(0x102, "DeleteBytes");
        this.b = aink0;
        this.c = aiom0;
        this.d = deleteBytesRequest0;
    }

    public final void b(Status status0, boolean z) {
        try {
            this.c.a(status0, z);
        }
        catch(RemoteException remoteException0) {
            a.ae(aiww.a.j(), "Client died during deleteBytes(DeleteBytesRequest)", remoteException0);
        }
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        gmcd gmcd0 = glzd.g(gmbt.h(this.b.a(this.d)), new aiwu(this), gmap.a);
        aiwv aiwv0 = new aiwv(this);
        aixk.b(glyi.f(gmcd0, Throwable.class, aiwv0, gmap.a), aiww.a, "Uncaught exception during deleteBytes(DeleteBytesRequest)", new Object[0]);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.c.a(status0, false);
    }
}

