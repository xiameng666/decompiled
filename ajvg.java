import com.google.android.gms.common.api.ApiMetadata;
import j..util.Objects;

public final class ajvg implements azys {
    final String a;
    final String b;

    public ajvg(azts azts0, String s) {
        this.a = s;
        this.b = "android_intrusion_logging";
        Objects.requireNonNull(azts0);
        super();
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        ajvn ajvn0 = (ajvn)object0;
        ajtn ajtn0 = new ajtn(this, ((evqp)object1));
        ajti ajti0 = (ajti)ajvn0.H();
        ApiMetadata apiMetadata0 = cclr.a(ajvn0.r);
        ajti0.j(ajtn0, this.a, this.b, apiMetadata0);
    }
}

