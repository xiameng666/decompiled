import com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse;
import com.google.android.gms.fido.fido2.api.common.ErrorCode;

public final class bmhb {
    public String a;
    public int b;
    private ErrorCode c;

    public final AuthenticatorErrorResponse a() {
        return new AuthenticatorErrorResponse(this.c.m, this.a, this.b);
    }

    public final void b(ErrorCode errorCode0) {
        batl.s(errorCode0);
        this.c = errorCode0;
    }
}

