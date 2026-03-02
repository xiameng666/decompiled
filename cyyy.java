import com.google.android.gms.common.api.Status;
import com.google.android.gms.nearby.internal.connection.OnBandwidthChangedParams;
import com.google.android.gms.nearby.internal.connection.OnConnectionInitiatedParams;
import com.google.android.gms.nearby.internal.connection.OnConnectionResultParams;
import com.google.android.gms.nearby.internal.connection.OnDisconnectedParams;
import com.google.android.gms.nearby.internal.connection.OnEndpointIdRotatedParams;
import com.google.android.gms.nearby.internal.connection.OnEndpointIdRotationParams;
import com.google.android.gms.nearby.internal.connection.OnInternetConnectionChangedParams;
import java.util.Set;

final class cyyy extends czew implements czaq {
    private final azyf a;
    private final Set b;
    private final Set c;

    public cyyy(azyf azyf0) {
        this.b = new bxf();
        this.c = new bxf();
        this.a = azyf0;
    }

    @Override  // czex
    public final void a(OnBandwidthChangedParams onBandwidthChangedParams0) {
        cyyu cyyu0 = new cyyu(this, onBandwidthChangedParams0);
        this.a.b(cyyu0);
    }

    @Override  // czex
    public final void c(OnConnectionInitiatedParams onConnectionInitiatedParams0) {
        synchronized(this) {
            this.b.add(onConnectionInitiatedParams0.a);
            cyyr cyyr0 = new cyyr(this, onConnectionInitiatedParams0);
            this.a.b(cyyr0);
        }
    }

    @Override  // czex
    public final void d(OnConnectionResultParams onConnectionResultParams0) {
        synchronized(this) {
            this.b.remove(onConnectionResultParams0.a);
            Status status0 = czbf.s(onConnectionResultParams0.b);
            if(status0.e()) {
                this.c.add(onConnectionResultParams0.a);
            }
            cyys cyys0 = new cyys(this, onConnectionResultParams0, status0);
            this.a.b(cyys0);
        }
    }

    @Override  // czex
    public final void e(OnDisconnectedParams onDisconnectedParams0) {
        synchronized(this) {
            this.c.remove(onDisconnectedParams0.a);
            cyyt cyyt0 = new cyyt(this, onDisconnectedParams0);
            this.a.b(cyyt0);
        }
    }

    @Override  // czex
    public final void f(OnEndpointIdRotatedParams onEndpointIdRotatedParams0) {
    }

    @Override  // czex
    public final void g(OnEndpointIdRotationParams onEndpointIdRotationParams0) {
        cyyv cyyv0 = new cyyv(this, onEndpointIdRotationParams0);
        this.a.b(cyyv0);
    }

    @Override  // czex
    public final void h(OnInternetConnectionChangedParams onInternetConnectionChangedParams0) {
    }

    @Override  // czaq
    public final void i() {
        synchronized(this) {
            Set set0 = this.b;
            bxe bxe0 = new bxe(((bxf)set0));
            while(bxe0.hasNext()) {
                Object object0 = bxe0.next();
                cyyw cyyw0 = new cyyw(this, ((String)object0));
                this.a.b(cyyw0);
            }
            set0.clear();
            Set set1 = this.c;
            bxe bxe1 = new bxe(((bxf)set1));
            while(bxe1.hasNext()) {
                Object object1 = bxe1.next();
                cyyx cyyx0 = new cyyx(this, ((String)object1));
                this.a.b(cyyx0);
            }
            set1.clear();
        }
    }
}

