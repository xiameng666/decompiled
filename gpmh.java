import j..util.Objects;

public final class gpmh extends iaku {
    public final iaku a;
    private final gdsc b;

    public gpmh(iaku iaku0) {
        this.a = iaku0;
        this.b = new gdsc(gdpc.c());
    }

    @Override  // iaku
    public final void a(iapk iapk0, iaof_metadata iaof0) {
        this.e(new gpmf(this, iapk0, iaof0));
    }

    @Override  // iaku
    public final void b(iaof_metadata iaof0) {
        this.e(new gpmd(this, iaof0));
    }

    @Override  // iaku
    public final void c(Object object0) {
        this.e(new gpmg(this, object0));
    }

    @Override  // iaku
    public final void d() {
        Objects.requireNonNull(this.a);
        this.e(new gpme(this.a));
    }

    private final void e(Runnable runnable0) {
        if(!gdsp.j(gdsq.a)) {
            new gdrq(this.b.a, runnable0).run();
            return;
        }
        runnable0.run();
    }
}

