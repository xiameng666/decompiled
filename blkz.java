import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions;
import com.google.android.gms.fido.fido2.api.common.RequestOptions;

public final class blkz extends cjtm {
    private final bmnx a;
    private final RequestOptions b;
    private final String c;
    private final bnaf d;

    public blkz(bmnx bmnx0, PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions0, String s, bnaf bnaf0, azug azug0) {
        super(0x94, "InitiateHybridSignFlow", azug0);
        this.a = bmnx0;
        this.b = publicKeyCredentialRequestOptions0;
        this.c = s;
        this.d = bnaf0;
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        gfsx gfsx0 = gfsx.l(this.c);
        PendingIntent pendingIntent0 = blyo.d(context0, this.b, gfsx0, this.d);
        ApiMetadata apiMetadata0 = cckf.d(bbdp.bv);
        this.a.c(Status.b, pendingIntent0, apiMetadata0);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.a.a(status0, ApiMetadata.b);
    }
}

