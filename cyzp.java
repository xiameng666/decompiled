import com.google.android.gms.common.api.Status;
import com.google.android.gms.nearby.internal.connection.OnBandwidthChangedParams;
import com.google.android.gms.nearby.internal.connection.OnConnectionInitiatedParams;
import com.google.android.gms.nearby.internal.connection.OnConnectionResultParams;
import com.google.android.gms.nearby.internal.connection.OnDisconnectedParams;
import com.google.android.gms.nearby.internal.connection.OnEndpointIdRotatedParams;
import com.google.android.gms.nearby.internal.connection.OnEndpointIdRotationParams;
import com.google.android.gms.nearby.internal.connection.OnInternetConnectionChangedParams;
import java.util.Set;

final class cyzp extends czew implements czaq {
    private final azyf a;
    private final Set b;
    private final Set c;

    public cyzp(azyf azyf0) {
        this.b = new bxf();
        this.c = new bxf();
        this.a = azyf0;
    }

    @Override  // czex
    public final void a(OnBandwidthChangedParams onBandwidthChangedParams0) {
        cyzm cyzm0 = new cyzm(this, onBandwidthChangedParams0);
        this.a.b(cyzm0);
    }

    @Override  // czex
    public final void c(OnConnectionInitiatedParams onConnectionInitiatedParams0) {
        synchronized(this) {
            this.b.add(onConnectionInitiatedParams0.a);
            cyzj cyzj0 = new cyzj(this, onConnectionInitiatedParams0);
            this.a.b(cyzj0);
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
            cyzk cyzk0 = new cyzk(this, onConnectionResultParams0, status0);
            this.a.b(cyzk0);
        }
    }

    @Override  // czex
    public final void e(OnDisconnectedParams onDisconnectedParams0) {
        synchronized(this) {
            this.c.remove(onDisconnectedParams0.a);
            cyzl cyzl0 = new cyzl(this, onDisconnectedParams0);
            this.a.b(cyzl0);
        }
    }

    @Override  // czex
    public final void f(OnEndpointIdRotatedParams onEndpointIdRotatedParams0) {
    }

    @Override  // czex
    public final void g(OnEndpointIdRotationParams onEndpointIdRotationParams0) {
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
                cyzn cyzn0 = new cyzn(this, ((String)object0));
                this.a.b(cyzn0);
            }
            set0.clear();
            Set set1 = this.c;
            bxe bxe1 = new bxe(((bxf)set1));
            while(bxe1.hasNext()) {
                Object object1 = bxe1.next();
                cyzo cyzo0 = new cyzo(this, ((String)object1));
                this.a.b(cyzo0);
            }
            set1.clear();
        }
    }
}

