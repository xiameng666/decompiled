import java.util.IdentityHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

public final class iaon {
    public final int a;
    public final iapc b;
    public final iaps c;
    public final iaot d;
    public final ScheduledExecutorService e;
    public final Executor f;
    private final iakt g;
    private final iaoy h;
    private final IdentityHashMap i;
    private final ibcb j;

    public iaon(iaol iaol0) {
        gftb.z(iaol0.a, "defaultPort not set");
        this.a = 443;
        iapc iapc0 = iaol0.b;
        gftb.z(iapc0, "proxyDetector not set");
        this.b = iapc0;
        iaps iaps0 = iaol0.c;
        gftb.z(iaps0, "syncContext not set");
        this.c = iaps0;
        iaot iaot0 = iaol0.d;
        gftb.z(iaot0, "serviceConfigParser not set");
        this.d = iaot0;
        this.e = iaol0.e;
        this.g = iaol0.f;
        this.f = iaol0.g;
        this.j = iaol0.j;
        this.h = iaol0.h;
        this.i = iaol0.i == null ? null : new IdentityHashMap(iaol0.i);
    }

    public final Object a(iaom iaom0) {
        return this.i == null ? null : this.i.get(iaom0);
    }

    @Override
    public final String toString() {
        ToStringHelper gfsv0 = MoreObjects.toStringHelper(this);
        gfsv0.f("defaultPort", this.a);
        gfsv0.add("proxyDetector", this.b);
        gfsv0.add("syncContext", this.c);
        gfsv0.add("serviceConfigParser", this.d);
        gfsv0.add("customArgs", this.i);
        gfsv0.add("scheduledExecutorService", this.e);
        gfsv0.add("channelLogger", this.g);
        gfsv0.add("executor", this.f);
        gfsv0.add("overrideAuthority", null);
        gfsv0.add("metricRecorder", this.j);
        gfsv0.add("nameResolverRegistry", this.h);
        return gfsv0.toString();
    }
}

