import com.google.android.gms.common.api.ApiMetadata;

public final class ejxz implements azys {
    public final ejyn a;
    public final String b;
    public final long c;

    public ejxz(ejyn ejyn0, String s, long v) {
        this.a = ejyn0;
        this.b = s;
        this.c = v;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        ekfl ekfl0 = (ekfl)object0;
        ejyj ejyj0 = new ejyj(this.a, ((evqp)object1));
        ekfk ekfk0 = (ekfk)ekfl0.H();
        ApiMetadata apiMetadata0 = cclr.b(ekfl0.r);
        ekfk0.c(ejyj0, this.b, this.c, apiMetadata0);
    }
}

