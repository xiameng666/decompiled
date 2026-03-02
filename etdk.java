import com.google.android.gms.common.api.ApiMetadata;

public final class etdk implements azys {
    public final etgl a;
    public final long b;

    public etdk(etgl etgl0, long v) {
        this.a = etgl0;
        this.b = v;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        etau etau0 = (etau)object0;
        eszv eszv0 = (eszv)etau0.H();
        etfm etfm0 = new etfm(this.a, ((evqp)object1));
        ApiMetadata apiMetadata0 = cclr.a(etau0.r);
        eszv0.d(this.b, etfm0, apiMetadata0);
    }
}

