import com.google.android.gms.common.api.ApiMetadata;

public final class ajug implements azys {
    public final String a;
    public final byte[] b;
    public final byte[] c;
    public final azts d;

    public ajug(azts azts0, String s, byte[] arr_b, byte[] arr_b1) {
        this.d = azts0;
        this.a = s;
        this.b = arr_b;
        this.c = arr_b1;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        ajvn ajvn0 = (ajvn)object0;
        ajuz ajuz0 = new ajuz(this.d, ((evqp)object1));
        ajti ajti0 = (ajti)ajvn0.H();
        ApiMetadata apiMetadata0 = cclr.a(ajvn0.r);
        ajti0.d(ajuz0, this.a, this.b, this.c, apiMetadata0);
    }
}

