import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.auth.blockstore.StoreBytesData;
import com.google.android.gms.common.api.Status;

public final class aixz extends cjtm {
    public static final bboh a;
    private final aink b;
    private final aipc c;
    private final StoreBytesData d;

    static {
        aixz.a = aiqz.b("StoreBytesOperation");
    }

    public aixz(aink aink0, aipc aipc0, StoreBytesData storeBytesData0) {
        super(0x102, "StoreBytes");
        this.b = aink0;
        this.c = aipc0;
        this.d = storeBytesData0;
    }

    public final void b(Status status0, int v) {
        try {
            this.c.a(status0, v);
        }
        catch(RemoteException remoteException0) {
            a.ae(aixz.a.i(), "Client died during storeBytes()", remoteException0);
        }
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        gmcd gmcd0 = glzd.f(gmbt.h(this.b.e(this.d)), new aixx(this), gmap.a);
        aixy aixy0 = new aixy(this);
        aixk.b(glyi.f(gmcd0, Throwable.class, aixy0, gmap.a), aixz.a, "Uncaught exception during storeBytes()", new Object[0]);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.c.a(status0, 0);
    }
}

