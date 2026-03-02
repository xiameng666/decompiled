import com.google.android.gms.common.api.ApiMetadata;

public final class ejxx implements azys {
    public final ejyn a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String[] f;

    public ejxx(ejyn ejyn0, String s, String s1, String s2, String s3, String[] arr_s) {
        this.a = ejyn0;
        this.b = s;
        this.c = s1;
        this.d = s2;
        this.e = s3;
        this.f = arr_s;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        ekfl ekfl0 = (ekfl)object0;
        ejyk ejyk0 = new ejyk(this.a, ((evqp)object1));
        ekfk ekfk0 = (ekfk)ekfl0.H();
        ApiMetadata apiMetadata0 = cclr.b(ekfl0.r);
        ekfk0.h(ejyk0, this.b, this.c, this.d, this.e, this.f, apiMetadata0);
    }
}

