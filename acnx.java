import com.google.android.gms.asterism.SetAsterismConsentRequest;
import com.google.android.gms.common.api.ApiMetadata;
import j..util.Objects;

final class acnx implements azys {
    final SetAsterismConsentRequest a;

    public acnx(acoa acoa0, SetAsterismConsentRequest setAsterismConsentRequest0) {
        this.a = setAsterismConsentRequest0;
        Objects.requireNonNull(acoa0);
        super();
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        acos acos0 = (acos)object0;
        acnw acnw0 = new acnw(this, ((evqp)object1));
        acov acov0 = (acov)acos0.H();
        ApiMetadata apiMetadata0 = cclr.b(acos0.r);
        acov0.d(acnw0, this.a, apiMetadata0);
    }
}

