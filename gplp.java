import j..util.Objects;

final class gplp extends iaku {
    public final iaku a;
    boolean b;
    final gplt c;

    public gplp(gplt gplt0, iaku iaku0) {
        Objects.requireNonNull(gplt0);
        this.c = gplt0;
        super();
        this.b = false;
        this.a = iaku0;
    }

    @Override  // iaku
    public final void a(iapk iapk0, iaof_metadata iaof0) {
        gplm gplm0 = new gplm(this, iapk0, iaof0);
        this.c.a.execute(gplm0);
    }

    @Override  // iaku
    public final void b(iaof_metadata iaof0) {
        gpll gpll0 = new gpll(this, iaof0);
        this.c.a.execute(gpll0);
    }

    @Override  // iaku
    public final void c(Object object0) {
        gpln gpln0 = new gpln(this, object0);
        this.c.a.execute(gpln0);
    }

    @Override  // iaku
    public final void d() {
        gplo gplo0 = new gplo(this);
        this.c.a.execute(gplo0);
    }
}

