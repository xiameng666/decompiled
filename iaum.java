import java.net.SocketAddress;
import java.util.Collection;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

final class iaum implements iavd {
    public final Executor a;
    private final iavd b;

    public iaum(iavd iavd0, Executor executor0) {
        this.b = iavd0;
        gftb.z(executor0, "appExecutor");
        this.a = executor0;
    }

    @Override  // iavd
    public final iavn a(SocketAddress socketAddress0, iavc iavc0, iakt iakt0) {
        return new iaul(this, this.b.a(socketAddress0, iavc0, iakt0), iavc0.a);
    }

    @Override  // iavd
    public final Collection b() {
        return this.b.b();
    }

    @Override  // iavd
    public final ScheduledExecutorService c() {
        return this.b.c();
    }

    @Override  // iavd
    public final void close() {
        this.b.close();
    }
}

