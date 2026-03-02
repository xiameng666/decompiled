import j..util.Objects;

public final class fedn implements gmbg {
    final fedp a;

    public fedn(fedp fedp0) {
        Objects.requireNonNull(fedp0);
        this.a = fedp0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        this.a.a("Service failed to initialize", "init");
    }

    @Override  // gmbg
    public final void b(Object object0) {
        Void void0 = (Void)object0;
        this.a.l.set(true);
        this.a.a("Service initialized", "init");
    }
}

