import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions;

public final class blkv extends cjtm {
    private final String a;
    private final String b;
    private final bmnx c;
    private final PublicKeyCredentialRequestOptions d;

    static {
        bnaa.d("GetAuthenticatePasskeyIntentOperation");
    }

    public blkv(String s, String s1, PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions0, bmnx bmnx0, azug azug0) {
        super(180, "AuthenticatePasskey", azug0);
        this.a = s;
        this.b = s1;
        this.c = bmnx0;
        this.d = publicKeyCredentialRequestOptions0;
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        gfsx gfsx0 = gfsx.m(this.b);
        gfsx gfsx1 = gfsx.m(this.a);
        PendingIntent pendingIntent0 = blyo.a(context0, bnaf.d, this.d, gfsx0, gfsx1, gfqx.a);
        ApiMetadata apiMetadata0 = cckf.d(bbdp.bv);
        this.c.c(Status.b, pendingIntent0, apiMetadata0);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.c.a(status0, ApiMetadata.b);
    }
}

