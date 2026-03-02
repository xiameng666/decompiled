import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialCreationOptions;

public final class blkw extends cjtm {
    private final bmnx a;
    private final BrowserPublicKeyCredentialCreationOptions b;

    public blkw(bmnx bmnx0, BrowserPublicKeyCredentialCreationOptions browserPublicKeyCredentialCreationOptions0, azug azug0) {
        super(180, "GetBrowserHybridClientRegistrationPendingIntent", azug0);
        this.a = bmnx0;
        this.b = browserPublicKeyCredentialCreationOptions0;
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        PendingIntent pendingIntent0 = blyo.d(context0, this.b, gfqx.a, bnaf.d);
        ApiMetadata apiMetadata0 = cckf.d(bbdp.bv);
        this.a.c(Status.b, pendingIntent0, apiMetadata0);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.a.a(Status.d, ApiMetadata.b);
    }
}

