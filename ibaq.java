import j..util.Objects;
import java.util.concurrent.ScheduledExecutorService;

final class ibaq extends iakr {
    final ibaz a;

    public ibaq(ibaz ibaz0) {
        Objects.requireNonNull(ibaz0);
        this.a = ibaz0;
        super();
    }

    @Override  // iakr
    public final iakv a(gRPCMethodDescriptor iaoj0, iakq iakq0) {
        ibbd ibbd0 = this.a.c;
        ScheduledExecutorService scheduledExecutorService0 = ibbd0.F ? null : ibbd0.j.c();
        iakv iakv0 = new iaux(iaoj0, ibbd0.l(iakq0), iakq0, ibbd0.T, scheduledExecutorService0, ibbd0.G);
        iakv0.j = ibbd0.o;
        iakv0.k = ibbd0.p;
        return iakv0;
    }

    @Override  // iakr
    public final String b() {
        return this.a.b;
    }
}

