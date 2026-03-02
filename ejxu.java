import com.google.android.gms.common.api.ApiMetadata;

public final class ejxu implements azys {
    public final ejyn a;
    public final String b;

    public ejxu(ejyn ejyn0, String s) {
        this.a = ejyn0;
        this.b = s;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        ekfl ekfl0 = (ekfl)object0;
        ejyd ejyd0 = new ejyd(this.a, ((evqp)object1));
        ekfk ekfk0 = (ekfk)ekfl0.H();
        ApiMetadata apiMetadata0 = cclr.b(ekfl0.r);
        ekfk0.d(ejyd0, this.b, apiMetadata0);
    }
}

