import android.content.Context;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.gms.common.api.Status;

public final class aixn extends cjtm {
    public static final bboh a;
    private final aink b;
    private final aiow c;

    static {
        aixn.a = aiqz.b("RetrieveBytesOperation");
    }

    public aixn(aink aink0, aiow aiow0) {
        super(0x102, "RetrieveBytes");
        this.b = aink0;
        this.c = aiow0;
    }

    public final void b(Status status0, byte[] arr_b) {
        try {
            this.c.a(status0, arr_b);
        }
        catch(RemoteException remoteException0) {
            a.ae(aixn.a.i(), "Client died during retrieveBytes()", remoteException0);
        }
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        gmcd gmcd0;
        boolean z = bbod.c(hprv.d());
        aink aink0 = this.b;
        if(z) {
            long v = SystemClock.elapsedRealtime();
            ainz ainz0 = new ainz();
            ainz0.b(gged_interceptors.l("com.google.android.gms.auth.blockstore.DEFAULT_BYTES_DATA_KEY"));
            gmcd0 = glzd.f(gmbt.h(aink0.d(ainz0.a(), v)), new aine(aink0, v), aink0.k);
        }
        else {
            gmcd0 = gmbu.i(aink.b);
        }
        gmcd gmcd1 = glzd.f(gmbt.h(gmcd0), new aixl(this), gmap.a);
        aixm aixm0 = new aixm(this);
        aixk.b(glyi.f(gmcd1, Throwable.class, aixm0, gmap.a), aixn.a, "Uncaught exception during retrieveBytes()", new Object[0]);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.c.a(status0, null);
    }
}

