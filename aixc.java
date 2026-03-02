import android.content.Context;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.gms.common.api.Status;

public final class aixc extends cjtm {
    public static final bboh a;
    private final aink b;
    private final aioq c;

    static {
        aixc.a = aiqz.b("GetBlockstoreDataOperation");
    }

    public aixc(aink aink0, aioq aioq0) {
        super(0x102, "GetBlockstoreData");
        this.b = aink0;
        this.c = aioq0;
    }

    public final void b(Status status0, byte[] arr_b) {
        try {
            this.c.a(status0, arr_b);
        }
        catch(RemoteException remoteException0) {
            a.ae(aixc.a.i(), "Client died during getBlockstoreData()", remoteException0);
        }
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        gmcd gmcd0;
        boolean z = bbod.c(hprv.d());
        aink aink0 = this.b;
        if(!z) {
            gmcd0 = gmbu.i(aink.b);
        }
        else if(!bbod.c(hprv.c())) {
            gmcd0 = gmbu.i(aink.b);
        }
        else if(aink.c.contains(aink0.d)) {
            long v = SystemClock.elapsedRealtime();
            gmcd0 = glzd.f(gmbt.h(aink0.h.h(false)), new ainh(aink0, v), gmap.a);
        }
        else {
            gmcd0 = gmbu.i(aink.b);
        }
        gmcd gmcd1 = glzd.f(gmbt.h(gmcd0), new aixa(this), gmap.a);
        aixb aixb0 = new aixb(this);
        aixk.b(glyi.f(gmcd1, Throwable.class, aixb0, gmap.a), aixc.a, "Uncaught exception during getBlockstoreData()", new Object[0]);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.c.a(status0, null);
    }
}

