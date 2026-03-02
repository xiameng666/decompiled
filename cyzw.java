import com.google.android.gms.common.api.Status;
import com.google.android.gms.nearby.internal.connection.OnBandwidthChangedParams;
import com.google.android.gms.nearby.internal.connection.OnConnectionInitiatedParams;
import com.google.android.gms.nearby.internal.connection.OnConnectionResultParams;
import com.google.android.gms.nearby.internal.connection.OnDisconnectedParams;
import com.google.android.gms.nearby.internal.connection.OnEndpointIdRotatedParams;
import com.google.android.gms.nearby.internal.connection.OnEndpointIdRotationParams;
import com.google.android.gms.nearby.internal.connection.OnInternetConnectionChangedParams;
import java.util.Set;

final class cyzw extends czew implements czaq {
    private final azyf a;
    private final Set b;
    private final Set c;

    public cyzw(azyf azyf0) {
        this.b = new bxf();
        this.c = new bxf();
        this.a = azyf0;
    }

    @Override  // czex
    public final void a(OnBandwidthChangedParams onBandwidthChangedParams0) {
        cyzt cyzt0 = new cyzt(this, onBandwidthChangedParams0);
        this.a.b(cyzt0);
    }

    @Override  // czex
    public final void c(OnConnectionInitiatedParams onConnectionInitiatedParams0) {
        synchronized(this) {
            cuwd cuwd0 = czdz.c(onConnectionInitiatedParams0);
            this.b.add(cuwd0);
            cyzq cyzq0 = new cyzq(this, onConnectionInitiatedParams0);
            this.a.b(cyzq0);
        }
    }

    @Override  // czex
    public final void d(OnConnectionResultParams onConnectionResultParams0) {
        synchronized(this) {
            cuwd cuwd0 = czdz.d(onConnectionResultParams0);
            this.b.remove(cuwd0);
            Status status0 = czbf.s(onConnectionResultParams0.b);
            if(status0.e()) {
                cuwd cuwd1 = czdz.d(onConnectionResultParams0);
                this.c.add(cuwd1);
            }
            cyzr cyzr0 = new cyzr(this, onConnectionResultParams0, status0);
            this.a.b(cyzr0);
        }
    }

    @Override  // czex
    public final void e(OnDisconnectedParams onDisconnectedParams0) {
        synchronized(this) {
            cuwd cuwd0 = czdz.e(onDisconnectedParams0);
            this.c.remove(cuwd0);
            cyzs cyzs0 = new cyzs(this, onDisconnectedParams0);
            this.a.b(cyzs0);
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
                cyzu cyzu0 = new cyzu(this, ((cuwd)object0));
                this.a.b(cyzu0);
            }
            set0.clear();
            Set set1 = this.c;
            bxe bxe1 = new bxe(((bxf)set1));
            while(bxe1.hasNext()) {
                Object object1 = bxe1.next();
                cyzv cyzv0 = new cyzv(this, ((cuwd)object1));
                this.a.b(cyzv0);
            }
            set1.clear();
        }
    }
}

