import com.google.android.gms.common.api.ApiMetadata;
import j..util.Objects;

public final class ajup implements azys {
    final String a;
    final int b;

    public ajup(azts azts0, String s, int v) {
        this.a = s;
        this.b = v;
        Objects.requireNonNull(azts0);
        super();
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        ajvn ajvn0 = (ajvn)object0;
        ajuo ajuo0 = new ajuo(this, ((evqp)object1));
        ajti ajti0 = (ajti)ajvn0.H();
        ApiMetadata apiMetadata0 = cclr.a(ajvn0.r);
        ajti0.A(ajuo0, this.a, this.b, apiMetadata0);
    }
}

