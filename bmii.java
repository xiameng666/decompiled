import com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity;
import com.google.android.gms.fido.fido2.api.common.TokenBinding;
import java.util.List;

public final class bmii {
    public PublicKeyCredentialRpEntity a;
    public PublicKeyCredentialUserEntity b;
    public Double c;
    public List d;
    public AuthenticatorSelectionCriteria e;
    public Integer f;
    public TokenBinding g;
    public AttestationConveyancePreference h;
    public AuthenticationExtensions i;
    public List j;
    private byte[] k;
    private List l;

    public final PublicKeyCredentialCreationOptions a() {
        PublicKeyCredentialRpEntity publicKeyCredentialRpEntity0 = this.a;
        PublicKeyCredentialUserEntity publicKeyCredentialUserEntity0 = this.b;
        byte[] arr_b = this.k;
        List list0 = this.l;
        Double double0 = this.c;
        List list1 = this.d;
        AuthenticatorSelectionCriteria authenticatorSelectionCriteria0 = this.e;
        Integer integer0 = this.f;
        TokenBinding tokenBinding0 = this.g;
        return this.h == null ? new PublicKeyCredentialCreationOptions(publicKeyCredentialRpEntity0, publicKeyCredentialUserEntity0, arr_b, list0, double0, list1, authenticatorSelectionCriteria0, integer0, tokenBinding0, null, this.i, null, null, this.j) : new PublicKeyCredentialCreationOptions(publicKeyCredentialRpEntity0, publicKeyCredentialUserEntity0, arr_b, list0, double0, list1, authenticatorSelectionCriteria0, integer0, tokenBinding0, this.h.d, this.i, null, null, this.j);
    }

    public final void b(byte[] arr_b) {
        batl.s(arr_b);
        this.k = arr_b;
    }

    public final void c(List list0) {
        batl.s(list0);
        this.l = list0;
    }

    public final void d(PublicKeyCredentialRpEntity publicKeyCredentialRpEntity0) {
        this.a = publicKeyCredentialRpEntity0;
    }

    public final void e(PublicKeyCredentialUserEntity publicKeyCredentialUserEntity0) {
        this.b = publicKeyCredentialUserEntity0;
    }
}

