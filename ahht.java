import android.content.Intent;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.internal.InternalCredentialWrapper;

public final class ahht implements gfsi {
    public final ahia a;
    public final boolean b;
    public final InternalCredentialWrapper c;

    public ahht(ahia ahia0, boolean z, InternalCredentialWrapper internalCredentialWrapper0) {
        this.a = ahia0;
        this.b = z;
        this.c = internalCredentialWrapper0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ahia ahia0 = this.a;
        String s = ahia0.e;
        gixr gixr0 = aggj.d(s, ((Credential)object0));
        ahia0.f.a(gixr0);
        InternalCredentialWrapper internalCredentialWrapper0 = this.c;
        if(this.b) {
            Intent intent0 = new Intent("com.google.android.gms.auth.api.credentials.AUTO_SIGN_IN_WARM_WELCOME_SNACKBAR").setClassName(ahia0.a, "com.google.android.gms.auth.api.credentials.yolo.ui.CredentialsSnackbarActivity").setPackage("com.google.android.gms");
            intent0.addFlags(0x10000000);
            intent0.putExtra("log_session_id", s);
            bauc.l(internalCredentialWrapper0.a, intent0, "com.google.android.gms.credentials.Credential");
            ahia0.a.startActivity(intent0);
            return (Credential)object0;
        }
        Intent intent1 = new Intent("com.google.android.gms.auth.api.credentials.AUTO_SIGN_IN_SNACKBAR").setClassName(ahia0.a, "com.google.android.gms.auth.api.credentials.yolo.ui.CredentialsSnackbarActivity").setPackage("com.google.android.gms");
        intent1.addFlags(0x10000000);
        intent1.putExtra("log_session_id", s);
        bauc.l(internalCredentialWrapper0.a, intent1, "com.google.android.gms.credentials.Credential");
        ahia0.a.startActivity(intent1);
        return (Credential)object0;
    }
}

