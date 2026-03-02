import com.google.android.gms.common.api.ApiMetadata;
import j..util.Objects;

public final class ajvd implements azys {
    final String a;
    final boolean b;

    public ajvd(azts azts0, String s, boolean z) {
        this.a = s;
        this.b = z;
        Objects.requireNonNull(azts0);
        super();
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        ajvn ajvn0 = (ajvn)object0;
        ajux ajux0 = new ajux(this, ((evqp)object1));
        ajti ajti0 = (ajti)ajvn0.H();
        ApiMetadata apiMetadata0 = cclr.a(ajvn0.r);
        ajti0.x(ajux0, this.a, this.b, apiMetadata0);
    }
}

