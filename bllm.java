import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions;

public final class bllm extends cjtm {
    private final String a;
    private final BrowserPublicKeyCredentialRequestOptions b;
    private final bmnx c;
    private final boolean d;

    static {
        bnaa.h("PrivilegedGetAuthenticatePasskeyIntentOperation");
    }

    public bllm(String s, BrowserPublicKeyCredentialRequestOptions browserPublicKeyCredentialRequestOptions0, boolean z, bmnx bmnx0, azug azug0) {
        super(180, "PrivilegedGetAuthenticatePasskeyIntentOperation", azug0);
        this.a = s;
        this.b = browserPublicKeyCredentialRequestOptions0;
        this.c = bmnx0;
        this.d = z;
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        gfsx gfsx0 = gfsx.m("com.google.android.gms");
        gfsx gfsx1 = gfsx.m(this.a);
        PendingIntent pendingIntent0 = blyo.b(context0, bnaf.d, this.b, gfsx0, gfsx1, gfqx.a, this.d);
        ApiMetadata apiMetadata0 = cckf.d(bbdp.bv);
        this.c.c(Status.b, pendingIntent0, apiMetadata0);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.c.a(status0, ApiMetadata.b);
    }
}

