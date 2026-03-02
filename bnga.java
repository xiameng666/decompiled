import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fido.u2f.api.common.SignRequestParams;
import com.google.android.gms.fido.u2f.ui.AuthenticateChimeraActivity;

public final class bnga extends cjtm {
    private final SignRequestParams a;
    private final bnfp b;

    public bnga(bnfp bnfp0, SignRequestParams signRequestParams0, azug azug0) {
        super(0x75, "SignApp", azug0);
        this.b = bnfp0;
        this.a = signRequestParams0;
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        PendingIntent pendingIntent0 = bbmq.g(context0, AuthenticateChimeraActivity.t(context0, bnaf.j, this.a), 0xA000000);
        ApiMetadata apiMetadata0 = cckf.d(bbdp.bv);
        this.b.a(Status.b, pendingIntent0, apiMetadata0);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.b.a(status0, null, ApiMetadata.b);
    }
}

