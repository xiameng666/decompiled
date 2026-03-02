import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.common.api.ApiMetadata;

public final class ahwn implements azys {
    public final ahwq a;
    public final BeginSignInRequest b;

    public ahwn(ahwq ahwq0, BeginSignInRequest beginSignInRequest0) {
        this.a = ahwq0;
        this.b = beginSignInRequest0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        ahwr ahwr0 = (ahwr)object0;
        ahrh ahrh0 = new ahrh(this.a, ((evqp)object1));
        ahub ahub0 = (ahub)ahwr0.H();
        ApiMetadata apiMetadata0 = cclr.a(ahwr0.r);
        ahub0.a(ahrh0, this.b, apiMetadata0);
    }
}

