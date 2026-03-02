import android.content.Context;
import com.google.android.gms.common.api.Status;

public final class arvv extends cjtm {
    private static final bboh a;
    private final arvs b;
    private final aqjk c;
    private final aqic d;

    static {
        arvv.a = bboh.b("IsBackupEnabledForCallingPackageOperation", bbcu.cJ);
    }

    public arvv(aqic aqic0, arvs arvs0, aqjk aqjk0) {
        ibuq.f(aqic0, "callback");
        ibuq.f(arvs0, "backupStateLogger");
        ibuq.f(aqjk0, "backupManagerWrapper");
        super(439, "isBackupEnabledForCallingPackage");
        this.d = aqic0;
        this.b = arvs0;
        this.c = aqjk0;
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        ibuq.f(context0, "context");
        ((ggtj)arvv.a.h()).x("getIsBackupEnabledForCallingPackage called");
        this.b.b(gian.b);
        boolean z = this.c.i();
        this.d.b(arvw.a, z);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        ibuq.f(status0, "status");
        this.b.b(gian.c);
        this.d.b(status0, false);
    }
}

