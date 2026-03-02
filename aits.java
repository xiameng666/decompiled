import android.content.Context;
import android.content.pm.Signature;
import com.google.android.gms.common.api.Status;

public final class aits extends cjtm {
    public static final bboh a;
    public final aisi b;
    public final String c;
    public final Signature[] d;
    public final aisq e;
    private final icck f;

    static {
        aits.a = aiqz.b("GetPrivateRestoreCredentialKeyOperation");
    }

    public aits(aisi aisi0, String s, Signature[] arr_signature, aisq aisq0) {
        ibuq.f(aisi0, "restoreCred");
        ibuq.f(s, "packageName");
        ibuq.f(arr_signature, "signatures");
        ibuq.f(aisq0, "callback");
        super(381, "GetPrivateRestoreCredentialKeyOperation");
        this.b = aisi0;
        this.c = s;
        this.d = arr_signature;
        this.e = aisq0;
        this.f = iccl.b(cclw.b);
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        ibuq.f(context0, "context");
        aitr aitr0 = new aitr(this, null);
        icbb.b(this.f, null, null, aitr0, 3);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        ibuq.f(status0, "status");
        this.e.a(status0, new byte[0]);
    }
}

