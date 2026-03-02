import j..util.Objects;

final class fedo implements gmbg {
    final fedp a;

    public fedo(fedp fedp0) {
        Objects.requireNonNull(fedp0);
        this.a = fedp0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        ffmn.f("AppCatalogService", "updateLocalDataItemIfNeeded - Local DataItem updated FAILURE. Throwable: %s", new Object[]{throwable0});
        this.a.a.a("Local DataItem updated FAILURE.");
    }

    @Override  // gmbg
    public final void b(Object object0) {
        fdvi fdvi0 = (fdvi)object0;
        this.a.a("Local DataItem updated SUCCESS.", "updateLocalDataItemIfNeeded");
    }
}

