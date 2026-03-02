import com.google.android.gms.common.api.ApiMetadata;
import j..util.Objects;

public final class ajun implements azys {
    final String a;
    final byte[] b;
    final int c;

    public ajun(azts azts0, String s, byte[] arr_b, int v) {
        this.a = s;
        this.b = arr_b;
        this.c = v;
        Objects.requireNonNull(azts0);
        super();
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        ajvn ajvn0 = (ajvn)object0;
        ajum ajum0 = new ajum(this, ((evqp)object1));
        ajti ajti0 = (ajti)ajvn0.H();
        ApiMetadata apiMetadata0 = cclr.a(ajvn0.r);
        ajti0.l(ajum0, this.a, this.b, this.c, apiMetadata0);
    }
}

