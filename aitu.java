import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.auth.blockstore.restorecredential.GetRestoreCredentialRequest;
import com.google.android.gms.auth.blockstore.restorecredential.GetRestoreCredentialResponse;
import com.google.android.gms.common.api.Status;

public final class aitu extends cjtm {
    public static final bboh a;
    public static final GetRestoreCredentialResponse b;
    public final aisi c;
    public final GetRestoreCredentialRequest d;
    public final aist e;
    private final icck f;

    static {
        aitu.a = aiqz.b("GetRestoreCredentialOperation");
        aitu.b = new GetRestoreCredentialResponse(new Bundle());
    }

    public aitu(aisi aisi0, GetRestoreCredentialRequest getRestoreCredentialRequest0, aist aist0) {
        ibuq.f(aisi0, "restoreCred");
        ibuq.f(getRestoreCredentialRequest0, "request");
        ibuq.f(aist0, "callback");
        super(381, "GetRestoreCredentialOperation");
        this.c = aisi0;
        this.d = getRestoreCredentialRequest0;
        this.e = aist0;
        this.f = iccl.b(cclw.b);
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        ibuq.f(context0, "context");
        aitt aitt0 = new aitt(this, null);
        icbb.b(this.f, null, null, aitt0, 3);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        ibuq.f(status0, "status");
        this.e.a(status0, aitu.b);
    }
}

