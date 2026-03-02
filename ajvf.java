import com.google.android.gms.common.api.ApiMetadata;
import j..util.Objects;

public final class ajvf implements azys {
    final String a;

    public ajvf(azts azts0, String s) {
        this.a = s;
        Objects.requireNonNull(azts0);
        super();
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        ajvn ajvn0 = (ajvn)object0;
        ajtw ajtw0 = new ajtw(this, ((evqp)object1));
        ajti ajti0 = (ajti)ajvn0.H();
        ApiMetadata apiMetadata0 = cclr.a(ajvn0.r);
        ajti0.h(ajtw0, this.a, apiMetadata0);
    }
}

