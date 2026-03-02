import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

final class iatc implements iavd {
    private final ScheduledExecutorService a;
    private final Executor b;
    private final iatd c;
    private final ibfu d;

    public iatc(iatd iatd0, Executor executor0, ibfu ibfu0) {
        this.a = (ScheduledExecutorService)ibfl.a(iayh.n);
        this.c = iatd0;
        gftb.z(executor0, "executor");
        this.b = executor0;
        this.d = ibfu0;
    }

    @Override  // iavd
    public final iavn a(SocketAddress socketAddress0, iavc iavc0, iakt iakt0) {
        return new iatm(this.c, ((InetSocketAddress)socketAddress0), iavc0.a, iavc0.c, iavc0.b, this.b, this.d);
    }

    @Override  // iavd
    public final Collection b() {
        return Collections.singleton(InetSocketAddress.class);
    }

    @Override  // iavd
    public final ScheduledExecutorService c() {
        return this.a;
    }

    @Override  // iavd
    public final void close() {
        ibfl.d(iayh.n, this.a);
    }
}

