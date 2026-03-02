import com.google.android.gms.common.api.ApiMetadata;

public final class ejxy implements azys {
    public final ejyn a;
    public final String b;
    public final String c;

    public ejxy(ejyn ejyn0, String s) {
        this.a = ejyn0;
        this.b = "SYNC_CORE";
        this.c = s;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        ekfl ekfl0 = (ekfl)object0;
        ejye ejye0 = new ejye(this.a, ((evqp)object1));
        ekfk ekfk0 = (ekfk)ekfl0.H();
        ApiMetadata apiMetadata0 = cclr.b(ekfl0.r);
        ekfk0.g(ejye0, this.b, this.c, apiMetadata0);
    }
}

