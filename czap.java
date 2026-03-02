import com.google.android.gms.nearby.internal.connection.OnEndpointDistanceChangedParams;
import com.google.android.gms.nearby.internal.connection.OnEndpointFoundParams;
import com.google.android.gms.nearby.internal.connection.OnEndpointLostParams;
import com.google.android.gms.nearby.internal.connection.OnStoppedDiscoveryParams;
import java.util.Set;

final class czap extends czfl {
    private final azyf a;
    private final Set b;

    public czap(azyf azyf0) {
        this.b = new bxf();
        this.a = azyf0;
    }

    @Override  // czfm
    public final void a(OnEndpointDistanceChangedParams onEndpointDistanceChangedParams0) {
        synchronized(this) {
            czal czal0 = new czal(this, onEndpointDistanceChangedParams0);
            this.a.b(czal0);
        }
    }

    @Override  // czfm
    public final void c(OnEndpointFoundParams onEndpointFoundParams0) {
        synchronized(this) {
            if(!czap.g(onEndpointFoundParams0)) {
                this.b.add(onEndpointFoundParams0.a);
            }
            czam czam0 = new czam(this, onEndpointFoundParams0);
            this.a.b(czam0);
        }
    }

    @Override  // czfm
    public final void d(OnEndpointLostParams onEndpointLostParams0) {
        synchronized(this) {
            this.b.remove(onEndpointLostParams0.a);
            czan czan0 = new czan(this, onEndpointLostParams0);
            this.a.b(czan0);
        }
    }

    @Override  // czfm
    public final void e(OnStoppedDiscoveryParams onStoppedDiscoveryParams0) {
    }

    final void f() {
        synchronized(this) {
            Set set0 = this.b;
            bxe bxe0 = new bxe(((bxf)set0));
            while(bxe0.hasNext()) {
                Object object0 = bxe0.next();
                czao czao0 = new czao(this, ((String)object0));
                this.a.b(czao0);
            }
            set0.clear();
        }
    }

    public static boolean g(OnEndpointFoundParams onEndpointFoundParams0) {
        return onEndpointFoundParams0.d == null ? false : onEndpointFoundParams0.a == null || "__UNRECOGNIZED_BLUETOOTH_DEVICE__".equals(onEndpointFoundParams0.a);
    }
}

