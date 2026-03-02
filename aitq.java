import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.auth.blockstore.restorecredential.CreateRestoreCredentialRequest;
import com.google.android.gms.auth.blockstore.restorecredential.CreateRestoreCredentialResponse;
import com.google.android.gms.common.api.Status;

public final class aitq extends cjtm {
    public static final bboh a;
    public static final CreateRestoreCredentialResponse b;
    public final aisi c;
    public final CreateRestoreCredentialRequest d;
    public final aisn e;
    private final icck f;

    static {
        aitq.a = aiqz.b("CreateRestoreCredentialOperation");
        aitq.b = new CreateRestoreCredentialResponse(new Bundle());
    }

    public aitq(aisi aisi0, CreateRestoreCredentialRequest createRestoreCredentialRequest0, aisn aisn0) {
        ibuq.f(aisi0, "restoreCred");
        ibuq.f(createRestoreCredentialRequest0, "request");
        ibuq.f(aisn0, "callback");
        super(381, "CreateRestoreCredentialOperation");
        this.c = aisi0;
        this.d = createRestoreCredentialRequest0;
        this.e = aisn0;
        this.f = iccl.b(cclw.b);
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        ibuq.f(context0, "context");
        aitp aitp0 = new aitp(this, null);
        icbb.b(this.f, null, null, aitp0, 3);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        ibuq.f(status0, "status");
        this.e.a(status0, aitq.b);
    }
}

