import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

public final class aiwz extends cjtm {
    public static final bboh a;
    public final String b;
    private final aink c;
    private final aion d;

    static {
        aiwz.a = aiqz.b("GetAccessForPackageOperation");
    }

    public aiwz(aink aink0, String s, aion aion0) {
        super(0x102, "GetAccessForPackage");
        this.c = aink0;
        this.b = s;
        this.d = aion0;
    }

    public final void b(Status status0, int v) {
        try {
            this.d.a(status0, v);
        }
        catch(RemoteException remoteException0) {
            a.ae(aiwz.a.j(), "Client died during getAccessForPackage()", remoteException0);
        }
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        gmcd gmcd0 = glzd.g(gmbt.h((bbod.c(hprv.d()) ? this.c.f.c(this.b) : gmbu.i(Integer.valueOf(0)))), new aiwx(this), gmap.a);
        aiwy aiwy0 = new aiwy(this);
        aixk.b(glyi.f(gmcd0, Throwable.class, aiwy0, gmap.a), aiwz.a, "Uncaught exception during getAccessForPackage()", new Object[0]);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.d.a(status0, 0);
    }
}

