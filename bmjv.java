import com.google.android.gms.fido.fido2.api.common.ErrorCode;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import j..util.Objects;

public final class bmjv implements gmbg {
    final bmhg a;
    final bmjx b;

    public bmjv(bmjx bmjx0, bmhg bmhg0) {
        this.a = bmhg0;
        Objects.requireNonNull(bmjx0);
        this.b = bmjx0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        this.b.p.c(ErrorCode.h, throwable0.getMessage(), this.a);
    }

    @Override  // gmbg
    public final void b(Object object0) {
        if(((gfsx)object0).i()) {
            bmzj bmzj0 = this.b.p;
            PublicKeyCredential publicKeyCredential0 = (PublicKeyCredential)((gfsx)object0).d();
            bmzj0.a(this.a, publicKeyCredential0);
            return;
        }
        this.b.p.c(ErrorCode.e, "User exited credential selection UI.", this.a);
    }
}

