import j..util.Objects;

final class aroc extends cuvg {
    public final gmcu a;
    final arot b;

    public aroc(arot arot0, gmcu gmcu0) {
        Objects.requireNonNull(arot0);
        this.b = arot0;
        super();
        this.a = gmcu0;
    }

    @Override  // cuvg
    public final void b(String s, cuvf cuvf0) {
        aqql aqql0 = arot.a;
        aqql0.h("onConnectionInitiated(endpointId=%s)", new Object[]{s});
        if("wifi_d2d_target".equals(cuvf0.a)) {
            this.b.o = cuvf0.c;
            aroo aroo0 = new aroo(this.b);
            evql evql0 = this.b.b.c(s, aroo0);
            evql0.b(new arnx(this));
            evql0.A(new arnw(this.b));
            return;
        }
        aqql0.m("Rejecting connection request from unexpected endpoint: %s.", new Object[]{s});
        evql evql1 = this.b.b.f(s);
        evql1.b(new arny(this));
        evql1.A(new arop(this.b));
    }

    @Override  // cuvg
    public final void c(String s, cuvl cuvl0) {
        arot.a.h("onConnectionResult(endpointId=%s, status=%s)", new Object[]{s, cuvl0.a});
        arob arob0 = new arob(this, s, cuvl0);
        this.b.c.execute(arob0);
    }

    @Override  // cuvg
    public final void d(String s) {
        arot.a.h("onDisconnected(endpointId=%s)", new Object[]{s});
        Objects.requireNonNull(this.b);
        aroa aroa0 = new aroa(this.b);
        this.b.c.execute(aroa0);
    }

    @Override  // cuvg
    public final void g(String s, cuuz cuuz0) {
        arot.a.h("onBandwidthChanged(endpointId=%s, bandwidthQuality=%d, medium=%d)", new Object[]{s, ((int)cuuz0.a), ((int)cuuz0.c)});
        arnz arnz0 = new arnz(this, cuuz0);
        this.b.c.execute(arnz0);
    }
}

