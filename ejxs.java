import com.google.android.gms.common.api.ApiMetadata;

public final class ejxs implements azys {
    public final ejyn a;
    public final String b;
    public final String c;
    public final String[] d;

    public ejxs(ejyn ejyn0, String s, String s1, String[] arr_s) {
        this.a = ejyn0;
        this.b = s;
        this.c = s1;
        this.d = arr_s;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        ekfl ekfl0 = (ekfl)object0;
        ejyc ejyc0 = new ejyc(this.a, ((evqp)object1));
        ekfk ekfk0 = (ekfk)ekfl0.H();
        ApiMetadata apiMetadata0 = cclr.b(ekfl0.r);
        ekfk0.f(ejyc0, this.b, this.c, this.d, apiMetadata0);
    }
}

