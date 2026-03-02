import com.google.android.gms.common.api.ApiMetadata;

public final class ajub implements azys {
    public final String a;
    public final String b;
    public final byte[] c;
    public final azts d;

    public ajub(azts azts0, String s, String s1, byte[] arr_b) {
        this.d = azts0;
        this.a = s;
        this.b = s1;
        this.c = arr_b;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        ajvn ajvn0 = (ajvn)object0;
        ajvb ajvb0 = new ajvb(this.d, ((evqp)object1));
        ajti ajti0 = (ajti)ajvn0.H();
        ApiMetadata apiMetadata0 = cclr.a(ajvn0.r);
        ajti0.e(ajvb0, this.a, this.b, this.c, apiMetadata0);
    }
}

