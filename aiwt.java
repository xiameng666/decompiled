import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

public final class aiwt extends cjtm {
    public static final bboh a;
    public final String b;
    private final aink c;
    private final azxs d;

    static {
        aiwt.a = aiqz.b("ClearAccessForPackageOperation");
    }

    public aiwt(aink aink0, String s, azxs azxs0) {
        super(0x102, "ClearAccessForPackage");
        this.c = aink0;
        this.b = s;
        this.d = azxs0;
    }

    public final void b(Status status0) {
        try {
            this.d.a(status0);
        }
        catch(RemoteException remoteException0) {
            a.ae(aiwt.a.j(), "Client died during clearAccessForPackage()", remoteException0);
        }
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        gmcd gmcd0 = glzd.g(gmbt.h((bbod.c(hprv.d()) ? this.c.f.b(this.b) : gmbx.a)), new aiwr(this), gmap.a);
        aiws aiws0 = new aiws(this);
        aixk.b(glyi.f(gmcd0, Throwable.class, aiws0, gmap.a), aiwt.a, "Uncaught exception during clearAccessForPackage()", new Object[0]);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.d.a(status0);
    }
}

