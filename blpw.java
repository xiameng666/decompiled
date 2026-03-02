import com.google.android.gms.fido.fido2.api.common.AuthenticatorResponse;

public final class blpw {
    public final boolean a;
    public final bmgk b;
    private final AuthenticatorResponse c;
    private final bmhg d;

    public blpw(AuthenticatorResponse authenticatorResponse0) {
        this.c = authenticatorResponse0;
        this.d = null;
        this.a = false;
        this.b = new bmgk(gfqx.a, gfqx.a);
    }

    public blpw(AuthenticatorResponse authenticatorResponse0, bmhg bmhg0, boolean z, bmgk bmgk0) {
        this.d = bmhg0;
        this.c = authenticatorResponse0;
        this.a = z;
        this.b = bmgk0;
    }

    public final gfsx a() {
        return gfsx.l(this.c);
    }

    public final gfsx b() {
        return gfsx.l(this.d);
    }
}

