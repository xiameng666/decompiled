import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.credential.manager.invocationparams.CredentialManagerInvocationParams;

public final class bgfv extends cjtm {
    private final CredentialManagerInvocationParams a;
    private final bdic b;

    public bgfv(bdic bdic0, CredentialManagerInvocationParams credentialManagerInvocationParams0, azug azug0) {
        super(0xC4, "GetCredentialManagerIntent", azug0);
        this.b = bdic0;
        this.a = credentialManagerInvocationParams0;
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        try {
            Intent intent0 = bdin.c(this.a.a.a);
            PendingIntent pendingIntent0 = bgfy.a(context0, this.a, intent0, 0, true);
            ApiMetadata apiMetadata0 = cckf.d(bbdp.aX);
            this.b.a(Status.b, pendingIntent0, apiMetadata0);
        }
        catch(RuntimeException runtimeException0) {
            throw new cjuh(8, "Error while getting Credential Manager pending intent", null, runtimeException0);
        }
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.b.a(status0, null, ApiMetadata.b);
    }
}

