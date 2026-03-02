import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

public final class aixf extends cjtm {
    public static final bboh a;
    private final aink b;
    private final aiot c;

    static {
        aixf.a = aiqz.b("IsEndToEndEncryptionAvailableOperation");
    }

    public aixf(aink aink0, aiot aiot0) {
        super(0x102, "IsEndToEndEncryptionAvailable");
        this.b = aink0;
        this.c = aiot0;
    }

    public final void b(Status status0, boolean z) {
        try {
            this.c.a(status0, z);
        }
        catch(RemoteException unused_ex) {
            ((ggtj)aixf.a.h()).x("Client died during onIsEndToEndEncryptionAvailable()");
        }
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        gmcd gmcd0 = glzd.g(gmbt.h(this.b.b()), new aixd(this), gmap.a);
        aixe aixe0 = new aixe(this);
        aixk.b(glyi.g(gmcd0, Throwable.class, aixe0, gmap.a), aixf.a, "Uncaught exception during isEndToEndEncryptionAvailable()", new Object[0]);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.c.a(status0, false);
    }
}

