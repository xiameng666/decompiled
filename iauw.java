import j..util.Objects;

final class iauw implements iava {
    public final iaku a;
    public iapk b;
    final iaux c;

    public iauw(iaux iaux0, iaku iaku0) {
        Objects.requireNonNull(iaux0);
        this.c = iaux0;
        super();
        gftb.z(iaku0, "observer");
        this.a = iaku0;
    }

    @Override  // iava
    public final void a(iapk iapk0, iauz iauz0, iaof_metadata iaof0) {
        iaux iaux0 = this.c;
        ials ials0 = iaux0.f();
        if(iapk0.t == iaph.b && ials0 != null) {
            if(ials0.c) {
                iapk0 = iaux0.f.a();
                iaof0 = new iaof_metadata();
            }
            else if(ials0.b - System.nanoTime() <= 0L) {
                ials0.c = true;
                iapk0 = iaux0.f.a();
                iaof0 = new iaof_metadata();
            }
        }
        iauu iauu0 = new iauu(this, iapk0, iaof0);
        iaux0.c.execute(iauu0);
    }

    public final void b(iapk iapk0) {
        this.b = iapk0;
        this.c.h.c(iapk0);
    }

    @Override  // iava
    public final void c(iaof_metadata iaof0) {
        iaus iaus0 = new iaus(this, iaof0);
        this.c.c.execute(iaus0);
    }

    @Override  // ibfq
    public final void d(ibfp ibfp0) {
        iaut iaut0 = new iaut(this, ibfp0);
        this.c.c.execute(iaut0);
    }

    @Override  // ibfq
    public final void e() {
        iaux iaux0 = this.c;
        if(iaux0.b.type_.a()) {
            return;
        }
        iauv iauv0 = new iauv(this);
        iaux0.c.execute(iauv0);
    }
}

