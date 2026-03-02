import com.google.android.gms.nearby.connection.ConnectionsDevice;
import j..util.Objects;

public final class czdb implements evqc {
    final cuwd a;
    final czdu b;

    public czdb(czdu czdu0, cuwd cuwd0) {
        this.a = cuwd0;
        Objects.requireNonNull(czdu0);
        this.b = czdu0;
        super();
    }

    @Override  // evqc
    public final void gv(Exception exception0) {
        if((exception0 instanceof aztb) && ((aztb)exception0).b() == 8003) {
            return;
        }
        this.b.cB(((ConnectionsDevice)this.a).a);
    }
}

