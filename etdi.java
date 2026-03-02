import com.google.android.gms.common.api.ApiMetadata;

public final class etdi implements azys {
    public final etgl a;
    public final byte[] b;

    public etdi(etgl etgl0, byte[] arr_b) {
        this.a = etgl0;
        this.b = arr_b;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        etau etau0 = (etau)object0;
        eszv eszv0 = (eszv)etau0.H();
        etfq etfq0 = new etfq(this.a, ((evqp)object1));
        ApiMetadata apiMetadata0 = cclr.a(etau0.r);
        eszv0.ac(this.b, etfq0, apiMetadata0);
    }
}

