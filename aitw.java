import android.content.Context;
import android.content.pm.Signature;
import com.google.android.gms.common.api.Status;

public final class aitw extends cjtm {
    public static final bboh a;
    public final aisi b;
    public final String c;
    public final Signature[] d;
    public final byte[] e;
    public final boolean f;
    public final aisz g;
    private final icck h;

    static {
        aitw.a = aiqz.b("SetPrivateRestoreCredentialKeyOperation");
    }

    public aitw(aisi aisi0, String s, Signature[] arr_signature, byte[] arr_b, boolean z, aisz aisz0) {
        ibuq.f(aisi0, "restoreCred");
        ibuq.f(s, "packageName");
        ibuq.f(arr_signature, "signatures");
        ibuq.f(arr_b, "restoreKey");
        ibuq.f(aisz0, "callback");
        super(381, "SetPrivateRestoreCredentialKeyOperation");
        this.b = aisi0;
        this.c = s;
        this.d = arr_signature;
        this.e = arr_b;
        this.f = z;
        this.g = aisz0;
        this.h = iccl.b(cclw.b);
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        ibuq.f(context0, "context");
        aitv aitv0 = new aitv(this, null);
        icbb.b(this.h, null, null, aitv0, 3);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        ibuq.f(status0, "status");
        this.g.a(status0, 0);
    }
}

