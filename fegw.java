import j..util.Objects;

final class fegw implements gmbg {
    final gmcd a;
    final fegy b;

    public fegw(fegy fegy0, gmcd gmcd0) {
        this.a = gmcd0;
        Objects.requireNonNull(fegy0);
        this.b = fegy0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        this.b.c.lock();
        try {
            this.b.h.set(false);
            ffmn.a("BleOffloadClientConn", "startConnectionLocked: clear future on failure: %s", new Object[]{Boolean.valueOf(fegv.a(this.b.o, this.a))});
        }
        finally {
            this.b.c.unlock();
        }
    }

    @Override  // gmbg
    public final void b(Object object0) {
        Boolean boolean0 = Boolean.valueOf(fegv.a(this.b.o, this.a));
        ffmn.a("BleOffloadClientConn", "Created BleOffloadClientSocket for %s, updated future: %s", new Object[]{((fehe)object0).a, boolean0});
    }
}

