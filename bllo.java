import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions;

public final class bllo extends cjtm {
    private final BrowserPublicKeyCredentialRequestOptions a;
    private final bmnx b;

    static {
        bnaa.h("PrivilegedGetHybridClientSignIntentOperation");
    }

    public bllo(BrowserPublicKeyCredentialRequestOptions browserPublicKeyCredentialRequestOptions0, bmnx bmnx0, azug azug0) {
        super(180, "PrivilegedGetHybridClientSignIntentOperation", azug0);
        this.a = browserPublicKeyCredentialRequestOptions0;
        this.b = bmnx0;
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        gfsx gfsx0 = gfsx.m("com.google.android.gms");
        PendingIntent pendingIntent0 = blyo.d(context0, this.a, gfsx0, bnaf.d);
        ApiMetadata apiMetadata0 = cckf.d(bbdp.bv);
        this.b.c(Status.b, pendingIntent0, apiMetadata0);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.b.a(status0, ApiMetadata.b);
    }
}

