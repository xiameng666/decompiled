import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.identity.InternalSignInCredentialWrapper;
import com.google.android.gms.auth.api.identity.SignInCredential;

public final class ahix implements gftc {
    public final ahjb a;

    public ahix(ahjb ahjb0) {
        this.a = ahjb0;
    }

    @Override  // gftc
    public final boolean a(Object object0) {
        SignInCredential signInCredential0 = ((InternalSignInCredentialWrapper)object0).g;
        Credential credential0 = this.a.b;
        return credential0.a.equals(signInCredential0.a) && credential0.e.equals(signInCredential0.f);
    }
}

