import com.google.android.gms.asterism.GetAsterismConsentRequest;
import com.google.android.gms.common.api.ApiMetadata;
import j..util.Objects;

final class acnv implements azys {
    final GetAsterismConsentRequest a;

    public acnv(acoa acoa0, GetAsterismConsentRequest getAsterismConsentRequest0) {
        this.a = getAsterismConsentRequest0;
        Objects.requireNonNull(acoa0);
        super();
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        acos acos0 = (acos)object0;
        acnu acnu0 = new acnu(this, ((evqp)object1));
        acov acov0 = (acov)acos0.H();
        ApiMetadata apiMetadata0 = cclr.b(acos0.r);
        acov0.a(acnu0, this.a, apiMetadata0);
    }
}

