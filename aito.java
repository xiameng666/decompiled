import android.content.Context;
import com.google.android.gms.auth.blockstore.restorecredential.ClearRestoreCredentialRequest;
import com.google.android.gms.common.api.Status;

public final class aito extends cjtm {
    public static final bboh a;
    public final aisi b;
    public final ClearRestoreCredentialRequest c;
    public final aisk d;
    private final icck e;

    static {
        aito.a = aiqz.b("ClearRestoreCredentialOperation");
    }

    public aito(aisi aisi0, ClearRestoreCredentialRequest clearRestoreCredentialRequest0, aisk aisk0) {
        ibuq.f(aisi0, "restoreCred");
        ibuq.f(clearRestoreCredentialRequest0, "request");
        ibuq.f(aisk0, "callback");
        super(381, "ClearRestoreCredentialOperation");
        this.b = aisi0;
        this.c = clearRestoreCredentialRequest0;
        this.d = aisk0;
        this.e = iccl.b(cclw.b);
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        ibuq.f(context0, "context");
        aitn aitn0 = new aitn(this, null);
        icbb.b(this.e, null, null, aitn0, 3);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        ibuq.f(status0, "status");
        this.d.a(status0, false);
    }
}

