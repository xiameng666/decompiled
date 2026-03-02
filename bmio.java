import android.os.ResultReceiver;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions;
import com.google.android.gms.fido.fido2.api.common.TokenBinding;
import com.google.android.gms.fido.fido2.api.common.UserVerificationRequirement;
import java.util.List;

public final class bmio {
    public Double a;
    public List b;
    public Integer c;
    public TokenBinding d;
    public UserVerificationRequirement e;
    public AuthenticationExtensions f;
    public Long g;
    public ResultReceiver h;
    private byte[] i;
    private String j;

    public bmio() {
    }

    public bmio(PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions0) {
        if(publicKeyCredentialRequestOptions0 != null) {
            this.i = publicKeyCredentialRequestOptions0.a;
            this.a = publicKeyCredentialRequestOptions0.b;
            this.j = publicKeyCredentialRequestOptions0.c;
            this.b = publicKeyCredentialRequestOptions0.d;
            this.c = publicKeyCredentialRequestOptions0.e;
            this.d = publicKeyCredentialRequestOptions0.f;
            this.e = publicKeyCredentialRequestOptions0.g;
            this.f = publicKeyCredentialRequestOptions0.h;
            this.g = publicKeyCredentialRequestOptions0.i;
            this.h = publicKeyCredentialRequestOptions0.j;
        }
    }

    public final PublicKeyCredentialRequestOptions a() {
        byte[] arr_b = this.i;
        Double double0 = this.a;
        String s = this.j;
        List list0 = this.b;
        Integer integer0 = this.c;
        TokenBinding tokenBinding0 = this.d;
        return this.e == null ? new PublicKeyCredentialRequestOptions(arr_b, double0, s, list0, integer0, tokenBinding0, null, this.f, this.g, null, this.h) : new PublicKeyCredentialRequestOptions(arr_b, double0, s, list0, integer0, tokenBinding0, this.e.d, this.f, this.g, null, this.h);
    }

    public final void b(byte[] arr_b) {
        batl.s(arr_b);
        this.i = arr_b;
    }

    public final void c(String s) {
        batl.s(s);
        this.j = s;
    }
}

