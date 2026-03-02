import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.IdToken;
import com.google.android.gms.auth.api.credentials.yolo.ui.CredentialPickerChimeraActivity;
import j..util.Objects;

public final class ahjy implements gmbg {
    final advu a;
    final CredentialPickerChimeraActivity b;

    public ahjy(CredentialPickerChimeraActivity credentialPickerChimeraActivity0, advu advu0) {
        this.a = advu0;
        Objects.requireNonNull(credentialPickerChimeraActivity0);
        this.b = credentialPickerChimeraActivity0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        Credential credential0 = this.a.a();
        CredentialPickerChimeraActivity.n(this.b, 101, credential0);
    }

    @Override  // gmbg
    public final void b(Object object0) {
        this.a.c = gged_interceptors.l(((IdToken)object0));
        Credential credential0 = this.a.a();
        CredentialPickerChimeraActivity.n(this.b, 201, credential0);
    }
}

