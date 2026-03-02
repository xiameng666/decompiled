import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.smartdevice.d2d.BootstrapOptions;

public final class eqdp implements azys {
    public final eqdz a;
    public final BootstrapOptions b;
    public final eqda c;

    public eqdp(eqdz eqdz0, BootstrapOptions bootstrapOptions0, eqda eqda0) {
        this.a = eqdz0;
        this.b = bootstrapOptions0;
        this.c = eqda0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        eqkx eqkx0 = (eqkx)object0;
        eqkz eqkz0 = new eqkz(((evqp)object1));
        eqis eqis0 = new eqis(new eqdy(this.a, this.c));
        eqiz eqiz0 = (eqiz)eqkx0.H();
        eqkv eqkv0 = new eqkv(eqkz0);
        ApiMetadata apiMetadata0 = cclr.a(eqkx0.r);
        eqiz0.f(eqkv0, this.b, eqis0, apiMetadata0);
    }
}

