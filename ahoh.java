import com.google.android.gms.auth.api.fido.AuthenticationOptions;
import com.google.android.gms.common.api.ApiMetadata;

public final class ahoh implements azys {
    public final ahow a;
    public final AuthenticationOptions b;

    public ahoh(ahow ahow0, AuthenticationOptions authenticationOptions0) {
        this.a = ahow0;
        this.b = authenticationOptions0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        ahnf ahnf0 = (ahnf)object0;
        ahou ahou0 = new ahou(this.a, ((evqp)object1));
        ahnk ahnk0 = (ahnk)ahnf0.H();
        ApiMetadata apiMetadata0 = cclr.a(ahnf0.r);
        ahnk0.b(ahou0, this.b, apiMetadata0);
    }
}

