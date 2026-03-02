import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.auth.blockstore.AppRestoreInfo;
import com.google.android.gms.common.api.Status;
import java.util.List;

public final class aixi extends cjtm {
    public static final bboh a;
    private final ainy b;
    private final List c;
    private final int d;
    private final AppRestoreInfo e;
    private final azxs f;

    static {
        aixi.a = aiqz.b("NotifyAppRestoreOperation");
    }

    public aixi(ainy ainy0, List list0, int v, AppRestoreInfo appRestoreInfo0, azxs azxs0) {
        super(0x102, "NotifyAppRestore");
        this.b = ainy0;
        this.c = list0;
        this.d = v;
        this.e = appRestoreInfo0;
        this.f = azxs0;
    }

    public final void b(Status status0) {
        try {
            this.f.a(status0);
        }
        catch(RemoteException unused_ex) {
            ((ggtj)aixi.a.h()).x("Client died during onAppRestore()");
        }
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        gmcd gmcd0 = glzd.g(gmbt.h(this.b.a(this.c, this.d, this.e)), new aixg(this), gmap.a);
        aixh aixh0 = new aixh(this);
        aixk.b(glyi.g(gmcd0, Throwable.class, aixh0, gmap.a), aixi.a, "Uncaught exception during onAppRestore()", new Object[0]);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.f.a(status0);
    }
}

