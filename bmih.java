import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorResponse;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType;

public final class bmih {
    public String a;
    public ByteString b;
    public AuthenticatorResponse c;
    public AuthenticationExtensionsClientOutputs d;
    public String e;

    public final PublicKeyCredential a() {
        return new PublicKeyCredential(this.a, PublicKeyCredentialType.a.b, this.b, ((this.c instanceof AuthenticatorAttestationResponse) ? ((AuthenticatorAttestationResponse)this.c) : null), ((this.c instanceof AuthenticatorAssertionResponse) ? ((AuthenticatorAssertionResponse)this.c) : null), ((this.c instanceof AuthenticatorErrorResponse) ? ((AuthenticatorErrorResponse)this.c) : null), this.d, this.e);
    }

    public final void b(byte[] arr_b) {
        this.b = arr_b == null ? null : ByteString.copyFrom(arr_b);
    }
}

