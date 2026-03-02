import com.google.android.gms.carrierauth.EAPAKARequest;
import com.google.android.gms.common.api.ApiMetadata;
import j..util.Objects;

public final class atqk implements azys {
    final EAPAKARequest a;

    public atqk(atql atql0, EAPAKARequest eAPAKARequest0) {
        this.a = eAPAKARequest0;
        Objects.requireNonNull(atql0);
        super();
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        atqr atqr0 = (atqr)object0;
        atqj atqj0 = new atqj(this, ((evqp)object1));
        atqx atqx0 = (atqx)atqr0.H();
        ApiMetadata apiMetadata0 = cclr.b(atqr0.r);
        atqx0.b(atqj0, this.a, apiMetadata0);
    }
}

