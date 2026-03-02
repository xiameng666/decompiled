import com.google.android.gms.nearby.connection.ConnectionsDevice;
import j..util.Objects;

public final class eqal extends cvxe {
    final eqam a;
    private final eqak b;

    public eqal(eqam eqam0, eqak eqak0) {
        Objects.requireNonNull(eqam0);
        this.a = eqam0;
        super();
        this.b = eqak0;
    }

    @Override  // cvxe
    public final void a(cuwd cuwd0, cuuz cuuz0) {
        ConnectionsDevice connectionsDevice0 = (ConnectionsDevice)cuwd0;
        eqam.b.h("Nearby connections onBandwidthChanged: %s", new Object[]{cuuz0});
    }

    @Override  // cvxe
    public final void b(cuwd cuwd0, cuvf cuvf0) {
        this.a.i = ((ConnectionsDevice)cuwd0).a;
        this.b.b(((ConnectionsDevice)cuwd0).a, cuvf0);
    }

    @Override  // cvxe
    public final void c(cuwd cuwd0, cuvl cuvl0) {
        this.b.c(((ConnectionsDevice)cuwd0).a, cuvl0);
    }

    @Override  // cvxe
    public final void d(cuwd cuwd0) {
        this.b.d(((ConnectionsDevice)cuwd0).a);
    }
}

