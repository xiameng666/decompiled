import com.google.android.gms.common.api.Status;
import com.google.android.gms.nearby.internal.connection.OnBandwidthChangedParams;
import com.google.android.gms.nearby.internal.connection.OnConnectionInitiatedParams;
import com.google.android.gms.nearby.internal.connection.OnConnectionResultParams;
import com.google.android.gms.nearby.internal.connection.OnDisconnectedParams;
import com.google.android.gms.nearby.internal.connection.OnEndpointIdRotatedParams;
import com.google.android.gms.nearby.internal.connection.OnEndpointIdRotationParams;
import com.google.android.gms.nearby.internal.connection.OnInternetConnectionChangedParams;
import java.util.Set;

public final class czae extends czew implements czaq {
    private final azyf a;
    private final Set b;
    private final Set c;

    public czae(azyf azyf0) {
        this.b = new bxf();
        this.c = new bxf();
        this.a = azyf0;
    }

    @Override  // czex
    public final void a(OnBandwidthChangedParams onBandwidthChangedParams0) {
        OnBandwidthChangedParams onBandwidthChangedParams1;
        if(onBandwidthChangedParams0.d == 0) {
            onBandwidthChangedParams1 = new OnBandwidthChangedParams();
            onBandwidthChangedParams1.a = onBandwidthChangedParams0.a;
            onBandwidthChangedParams1.b = onBandwidthChangedParams0.b;
            onBandwidthChangedParams1.c = onBandwidthChangedParams0.c;
            onBandwidthChangedParams1.d = 0;
            onBandwidthChangedParams1.e = onBandwidthChangedParams0.e;
            onBandwidthChangedParams1.f = onBandwidthChangedParams0.f;
            onBandwidthChangedParams1.g = onBandwidthChangedParams0.g;
            onBandwidthChangedParams1.h = onBandwidthChangedParams0.h;
            onBandwidthChangedParams1.i = onBandwidthChangedParams0.i;
            onBandwidthChangedParams1.j = onBandwidthChangedParams0.j;
            onBandwidthChangedParams1.k = onBandwidthChangedParams0.k;
            onBandwidthChangedParams1.l = onBandwidthChangedParams0.l;
            onBandwidthChangedParams1.m = onBandwidthChangedParams0.m;
            onBandwidthChangedParams1.n = onBandwidthChangedParams0.n;
            onBandwidthChangedParams1.o = onBandwidthChangedParams0.o;
            onBandwidthChangedParams1.d = 1;
            cuvq cuvq0 = new cuvq();
            cuvq0.d(onBandwidthChangedParams0.a);
            onBandwidthChangedParams1.f = cuvq0.a();
        }
        else {
            onBandwidthChangedParams1 = onBandwidthChangedParams0;
        }
        czab czab0 = new czab(this, onBandwidthChangedParams1, onBandwidthChangedParams0);
        this.a.b(czab0);
    }

    @Override  // czex
    public final void c(OnConnectionInitiatedParams onConnectionInitiatedParams0) {
        synchronized(this) {
            if(onConnectionInitiatedParams0.i == 0) {
                OnConnectionInitiatedParams onConnectionInitiatedParams1 = new OnConnectionInitiatedParams();
                onConnectionInitiatedParams1.a = onConnectionInitiatedParams0.a;
                onConnectionInitiatedParams1.b = onConnectionInitiatedParams0.b;
                onConnectionInitiatedParams1.c = onConnectionInitiatedParams0.c;
                onConnectionInitiatedParams1.d = onConnectionInitiatedParams0.d;
                onConnectionInitiatedParams1.e = onConnectionInitiatedParams0.e;
                onConnectionInitiatedParams1.f = onConnectionInitiatedParams0.f;
                onConnectionInitiatedParams1.g = onConnectionInitiatedParams0.g;
                onConnectionInitiatedParams1.h = onConnectionInitiatedParams0.h;
                onConnectionInitiatedParams1.i = 0;
                onConnectionInitiatedParams1.j = onConnectionInitiatedParams0.j;
                onConnectionInitiatedParams1.k = onConnectionInitiatedParams0.k;
                onConnectionInitiatedParams1.l = onConnectionInitiatedParams0.l;
                onConnectionInitiatedParams1.m = onConnectionInitiatedParams0.m;
                onConnectionInitiatedParams1.i = 1;
                cuvq cuvq0 = new cuvq();
                cuvq0.d(onConnectionInitiatedParams0.a);
                cuvq0.a = onConnectionInitiatedParams0.g;
                onConnectionInitiatedParams1.k = cuvq0.a();
                onConnectionInitiatedParams0 = onConnectionInitiatedParams1;
            }
            cuwd cuwd0 = czdz.c(onConnectionInitiatedParams0);
            this.b.add(cuwd0);
            cyzx cyzx0 = new cyzx(this, onConnectionInitiatedParams0);
            this.a.b(cyzx0);
        }
    }

    @Override  // czex
    public final void d(OnConnectionResultParams onConnectionResultParams0) {
        OnConnectionResultParams onConnectionResultParams1;
        synchronized(this) {
            if(onConnectionResultParams0.d == 0) {
                onConnectionResultParams1 = new OnConnectionResultParams();
                onConnectionResultParams1.a = onConnectionResultParams0.a;
                onConnectionResultParams1.b = onConnectionResultParams0.b;
                onConnectionResultParams1.c = onConnectionResultParams0.c;
                onConnectionResultParams1.d = 0;
                onConnectionResultParams1.e = onConnectionResultParams0.e;
                onConnectionResultParams1.f = onConnectionResultParams0.f;
                onConnectionResultParams1.g = onConnectionResultParams0.g;
                onConnectionResultParams1.d = 1;
                cuvq cuvq0 = new cuvq();
                cuvq0.d(onConnectionResultParams0.a);
                onConnectionResultParams1.f = cuvq0.a();
            }
            else {
                onConnectionResultParams1 = onConnectionResultParams0;
            }
            cuwd cuwd0 = czdz.d(onConnectionResultParams1);
            this.b.remove(cuwd0);
            Status status0 = czbf.s(onConnectionResultParams0.b);
            if(status0.e()) {
                cuwd cuwd1 = czdz.d(onConnectionResultParams1);
                this.c.add(cuwd1);
            }
            cyzy cyzy0 = new cyzy(this, onConnectionResultParams1, status0);
            this.a.b(cyzy0);
        }
    }

    @Override  // czex
    public final void e(OnDisconnectedParams onDisconnectedParams0) {
        synchronized(this) {
            if(onDisconnectedParams0.b == 0) {
                OnDisconnectedParams onDisconnectedParams1 = new OnDisconnectedParams();
                onDisconnectedParams1.a = onDisconnectedParams0.a;
                onDisconnectedParams1.b = 0;
                onDisconnectedParams1.c = onDisconnectedParams0.c;
                onDisconnectedParams1.d = onDisconnectedParams0.d;
                onDisconnectedParams1.e = onDisconnectedParams0.e;
                onDisconnectedParams1.f = onDisconnectedParams0.f;
                onDisconnectedParams1.b = 1;
                cuvq cuvq0 = new cuvq();
                cuvq0.d(onDisconnectedParams0.a);
                onDisconnectedParams1.d = cuvq0.a();
                onDisconnectedParams0 = onDisconnectedParams1;
            }
            cuwd cuwd0 = czdz.e(onDisconnectedParams0);
            this.c.remove(cuwd0);
            czaa czaa0 = new czaa(this, onDisconnectedParams0);
            this.a.b(czaa0);
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
        cyzz cyzz0 = new cyzz(this, onInternetConnectionChangedParams0);
        this.a.b(cyzz0);
    }

    @Override  // czaq
    public final void i() {
        synchronized(this) {
            Set set0 = this.b;
            bxe bxe0 = new bxe(((bxf)set0));
            while(bxe0.hasNext()) {
                Object object0 = bxe0.next();
                czac czac0 = new czac(this, ((cuwd)object0));
                this.a.b(czac0);
            }
            set0.clear();
            Set set1 = this.c;
            bxe bxe1 = new bxe(((bxf)set1));
            while(bxe1.hasNext()) {
                Object object1 = bxe1.next();
                czad czad0 = new czad(this, ((cuwd)object1));
                this.a.b(czad0);
            }
            set1.clear();
        }
    }
}

