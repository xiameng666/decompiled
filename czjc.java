import com.google.android.gms.nearby.connection.v3.AdvertisingOptions;
import com.google.android.gms.nearby.internal.connection.StartAdvertisingParamsV3;

public final class czjc implements azys {
    public final czjq a;
    public final byte[] b;
    public final azyf c;
    public final AdvertisingOptions d;
    public final cvxg e;

    public czjc(czjq czjq0, byte[] arr_b, azyf azyf0, AdvertisingOptions advertisingOptions0, cvxg cvxg0) {
        this.a = czjq0;
        this.b = arr_b;
        this.c = azyf0;
        this.d = advertisingOptions0;
        this.e = cvxg0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        czbf czbf0 = (czbf)object0;
        czjp czjp0 = new czjp(((evqp)object1));
        String s = this.e.c.getName();
        cyzi cyzi0 = new cyzi(this.c);
        czbf0.g.add(cyzi0);
        czft czft0 = (czft)czbf0.H();
        StartAdvertisingParamsV3 startAdvertisingParamsV30 = new StartAdvertisingParamsV3();
        startAdvertisingParamsV30.a = new czbe(czjp0);
        startAdvertisingParamsV30.e = this.b;
        startAdvertisingParamsV30.b = this.a.b;
        startAdvertisingParamsV30.c = this.d;
        startAdvertisingParamsV30.d = cyzi0;
        startAdvertisingParamsV30.f = s;
        czft0.u(startAdvertisingParamsV30);
    }
}

