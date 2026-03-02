import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

public final class aiyc extends cjtm {
    public static final bboh a;
    public final String b;
    private final aink c;
    private final int d;
    private final azxs e;

    static {
        aiyc.a = aiqz.b("UpgradeAccessForPackageOperation");
    }

    public aiyc(aink aink0, String s, int v, azxs azxs0) {
        super(0x102, "SetAccessForPackage");
        this.c = aink0;
        this.b = s;
        this.d = v;
        this.e = azxs0;
    }

    public final void b(Status status0) {
        try {
            this.e.a(status0);
        }
        catch(RemoteException remoteException0) {
            a.ae(aiyc.a.j(), "Client died during upgradeAccessForPackage()", remoteException0);
        }
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        gmcd gmcd0 = glzd.g(gmbt.h((bbod.c(hprv.d()) ? this.c.f.g(this.b, this.d) : gmbx.a)), new aiya(this), gmap.a);
        aiyb aiyb0 = new aiyb(this);
        aixk.b(glyi.f(gmcd0, Throwable.class, aiyb0, gmap.a), aiyc.a, "Uncaught exception during upgradeAccessForPackage()", new Object[0]);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.e.a(status0);
    }
}

