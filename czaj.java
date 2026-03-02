import com.google.android.gms.nearby.connection.ConnectionsDevice;
import com.google.android.gms.nearby.internal.connection.OnEndpointDistanceChangedParams;
import com.google.android.gms.nearby.internal.connection.OnEndpointFoundParams;
import com.google.android.gms.nearby.internal.connection.OnEndpointLostParams;
import com.google.android.gms.nearby.internal.connection.OnStoppedDiscoveryParams;
import java.util.Set;

public final class czaj extends czfl {
    private final azyf a;
    private final Set b;

    public czaj(azyf azyf0) {
        this.b = new bxf();
        this.a = azyf0;
    }

    @Override  // czfm
    public final void a(OnEndpointDistanceChangedParams onEndpointDistanceChangedParams0) {
        synchronized(this) {
            czaf czaf0 = new czaf(this, onEndpointDistanceChangedParams0);
            this.a.b(czaf0);
        }
    }

    @Override  // czfm
    public final void c(OnEndpointFoundParams onEndpointFoundParams0) {
        ConnectionsDevice connectionsDevice0;
        synchronized(this) {
            int v1 = onEndpointFoundParams0.f;
            if(v1 == 1) {
                connectionsDevice0 = onEndpointFoundParams0.g;
                batl.s(connectionsDevice0);
            }
            else if(v1 == 3) {
                connectionsDevice0 = onEndpointFoundParams0.h;
                batl.s(connectionsDevice0);
            }
            else {
                connectionsDevice0 = null;
            }
            batl.s(connectionsDevice0);
            if(!czaj.g(onEndpointFoundParams0)) {
                this.b.add(connectionsDevice0);
            }
            czag czag0 = new czag(this, onEndpointFoundParams0, connectionsDevice0);
            this.a.b(czag0);
        }
    }

    @Override  // czfm
    public final void d(OnEndpointLostParams onEndpointLostParams0) {
        ConnectionsDevice connectionsDevice0;
        synchronized(this) {
            int v1 = onEndpointLostParams0.b;
            if(v1 == 1) {
                connectionsDevice0 = onEndpointLostParams0.c;
                batl.s(connectionsDevice0);
            }
            else if(v1 == 3) {
                connectionsDevice0 = onEndpointLostParams0.d;
                batl.s(connectionsDevice0);
            }
            else {
                connectionsDevice0 = null;
            }
            batl.s(connectionsDevice0);
            this.b.remove(connectionsDevice0);
            czah czah0 = new czah(this, connectionsDevice0);
            this.a.b(czah0);
        }
    }

    @Override  // czfm
    public final void e(OnStoppedDiscoveryParams onStoppedDiscoveryParams0) {
    }

    public final void f() {
        synchronized(this) {
            Set set0 = this.b;
            bxe bxe0 = new bxe(((bxf)set0));
            while(bxe0.hasNext()) {
                Object object0 = bxe0.next();
                czai czai0 = new czai(this, ((cuwd)object0));
                this.a.b(czai0);
            }
            set0.clear();
        }
    }

    public static boolean g(OnEndpointFoundParams onEndpointFoundParams0) {
        return onEndpointFoundParams0.d == null ? false : onEndpointFoundParams0.a == null || "__UNRECOGNIZED_BLUETOOTH_DEVICE__".equals(onEndpointFoundParams0.a);
    }
}

