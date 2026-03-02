import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.credential.manager.invocationparams.CredentialManagerInvocationParams;

public final class bgfw extends cjtm {
    private final bdic a;
    private final CredentialManagerInvocationParams b;
    private final int c;
    private final boolean d;

    public bgfw(bdic bdic0, CredentialManagerInvocationParams credentialManagerInvocationParams0, int v, boolean z, azug azug0) {
        super(0xC4, "getPasswordCheckupIntent", azug0);
        this.a = bdic0;
        this.b = credentialManagerInvocationParams0;
        this.c = v;
        this.d = z;
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        try {
            Intent intent0 = bdin.c(this.b.a.a).putExtra("pwm.DataFieldNames.deepLinkToPasswordCheckup", true);
            PendingIntent pendingIntent0 = bgfy.a(context0, this.b, intent0, this.c, this.d);
            ApiMetadata apiMetadata0 = cckf.d(bbdp.aX);
            this.a.a(Status.b, pendingIntent0, apiMetadata0);
        }
        catch(RuntimeException runtimeException0) {
            throw new cjuh(8, "Error while getting Password Checkup pending intent", null, runtimeException0);
        }
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.a.a(status0, null, ApiMetadata.b);
    }
}

