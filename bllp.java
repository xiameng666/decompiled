import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialCreationOptions;

public final class bllp extends cjtm {
    private final String a;
    private final String b;
    private final BrowserPublicKeyCredentialCreationOptions c;
    private final bmnx d;

    static {
        bnaa.h("PrivilegedGetRegisterPasskeyIntentOperation");
    }

    public bllp(String s, String s1, BrowserPublicKeyCredentialCreationOptions browserPublicKeyCredentialCreationOptions0, bmnx bmnx0, azug azug0) {
        super(180, "PrivilegedGetRegisterPasskeyIntentOperation", azug0);
        this.a = s;
        this.b = s1;
        this.d = bmnx0;
        this.c = browserPublicKeyCredentialCreationOptions0;
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        gfsx gfsx0 = gfsx.m("com.google.android.gms");
        gfsx gfsx1 = gfsx.m(this.a);
        gfsx gfsx2 = gfsx.m(this.b);
        PendingIntent pendingIntent0 = blyo.a(context0, bnaf.d, this.c, gfsx0, gfsx1, gfsx2);
        ApiMetadata apiMetadata0 = cckf.d(bbdp.bv);
        this.d.c(Status.b, pendingIntent0, apiMetadata0);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.d.a(status0, ApiMetadata.b);
    }
}

