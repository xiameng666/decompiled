import com.google.android.gms.nearby.connection.DiscoveryOptions;
import com.google.android.gms.nearby.internal.connection.StartDiscoveryParams;

public final class czck implements azys {
    public final czdu a;
    public final String b;
    public final azyf c;
    public final DiscoveryOptions d;

    public czck(czdu czdu0, String s, azyf azyf0, DiscoveryOptions discoveryOptions0) {
        this.a = czdu0;
        this.b = s;
        this.c = azyf0;
        this.d = discoveryOptions0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        czbf czbf0 = (czbf)object0;
        czds czds0 = new czds(this.a, ((evqp)object1));
        com.google.android.gms.nearby.internal.connection.DiscoveryOptions discoveryOptions0 = com.google.android.gms.nearby.internal.connection.DiscoveryOptions.a(this.d);
        czap czap0 = new czap(this.c);
        czbf0.c.add(czap0);
        czft czft0 = (czft)czbf0.H();
        StartDiscoveryParams startDiscoveryParams0 = new StartDiscoveryParams();
        startDiscoveryParams0.a = new czbc(czds0);
        startDiscoveryParams0.c = this.b;
        startDiscoveryParams0.e = discoveryOptions0;
        startDiscoveryParams0.f = czap0;
        czft0.v(startDiscoveryParams0);
    }
}

