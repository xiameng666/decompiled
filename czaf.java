import com.google.android.gms.nearby.connection.ConnectionsDevice;
import com.google.android.gms.nearby.internal.connection.OnEndpointDistanceChangedParams;
import j..util.Objects;

final class czaf extends czar {
    final OnEndpointDistanceChangedParams a;

    public czaf(czaj czaj0, OnEndpointDistanceChangedParams onEndpointDistanceChangedParams0) {
        this.a = onEndpointDistanceChangedParams0;
        Objects.requireNonNull(czaj0);
        super();
    }

    @Override  // azye
    public final void a(Object object0) {
        ConnectionsDevice connectionsDevice0;
        cvxs cvxs0 = (cvxs)object0;
        OnEndpointDistanceChangedParams onEndpointDistanceChangedParams0 = this.a;
        int v = onEndpointDistanceChangedParams0.d;
        if(v == 1) {
            connectionsDevice0 = onEndpointDistanceChangedParams0.e;
            batl.s(connectionsDevice0);
        }
        else if(v == 3) {
            connectionsDevice0 = onEndpointDistanceChangedParams0.f;
            batl.s(connectionsDevice0);
        }
        else {
            connectionsDevice0 = null;
        }
        batl.s(connectionsDevice0);
    }
}

