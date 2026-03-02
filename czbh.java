import com.google.android.gms.nearby.connection.DiscoveryOptions;
import com.google.android.gms.nearby.internal.connection.UpdateDiscoveryOptionsParams;

public final class czbh implements azys {
    public final czdu a;
    public final String b;
    public final DiscoveryOptions c;

    public czbh(czdu czdu0, DiscoveryOptions discoveryOptions0) {
        this.a = czdu0;
        this.b = "NearbySharing";
        this.c = discoveryOptions0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        czds czds0 = new czds(this.a, ((evqp)object1));
        com.google.android.gms.nearby.internal.connection.DiscoveryOptions discoveryOptions0 = com.google.android.gms.nearby.internal.connection.DiscoveryOptions.a(this.c);
        czft czft0 = (czft)((czbf)object0).H();
        UpdateDiscoveryOptionsParams updateDiscoveryOptionsParams0 = new UpdateDiscoveryOptionsParams();
        updateDiscoveryOptionsParams0.a = new czbc(czds0);
        updateDiscoveryOptionsParams0.b = this.b;
        updateDiscoveryOptionsParams0.c = discoveryOptions0;
        czft0.M(updateDiscoveryOptionsParams0);
    }
}

