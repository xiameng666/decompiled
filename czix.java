import com.google.android.gms.nearby.connection.v3.DiscoveryOptions;
import com.google.android.gms.nearby.internal.connection.StartDiscoveryParamsV3;

public final class czix implements azys {
    public final czjq a;
    public final azyf b;
    public final DiscoveryOptions c;
    public final cvxs d;

    public czix(czjq czjq0, azyf azyf0, DiscoveryOptions discoveryOptions0, cvxs cvxs0) {
        this.a = czjq0;
        this.b = azyf0;
        this.c = discoveryOptions0;
        this.d = cvxs0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        czbf czbf0 = (czbf)object0;
        czjp czjp0 = new czjp(((evqp)object1));
        String s = this.d.a.getName();
        czaj czaj0 = new czaj(this.b);
        czbf0.d.add(czaj0);
        czft czft0 = (czft)czbf0.H();
        StartDiscoveryParamsV3 startDiscoveryParamsV30 = new StartDiscoveryParamsV3();
        startDiscoveryParamsV30.a = new czbc(czjp0);
        startDiscoveryParamsV30.b = this.a.b;
        startDiscoveryParamsV30.c = this.c;
        startDiscoveryParamsV30.d = czaj0;
        startDiscoveryParamsV30.e = s;
        czft0.w(startDiscoveryParamsV30);
    }
}

