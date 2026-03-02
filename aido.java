import com.google.android.gms.auth.api.proxy.ProxyResponse;
import com.google.android.gms.common.api.Status;
import j..util.Objects;

final class aido extends ahwu {
    final evqp a;

    public aido(azts azts0, evqp evqp0) {
        this.a = evqp0;
        Objects.requireNonNull(azts0);
        super();
    }

    @Override  // ahwu
    public final void a(ProxyResponse proxyResponse0) {
        azzf.b(new Status(proxyResponse0.b), proxyResponse0, this.a);
    }
}

