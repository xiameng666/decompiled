import j..util.Objects;

final class fmui implements gmbg {
    final fmus a;

    public fmui(fmus fmus0) {
        Objects.requireNonNull(fmus0);
        this.a = fmus0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        flbj.c("ConvPresenter", "OpenConversationRequest fails for " + this.a.b + ", error: " + throwable0.getMessage());
        fmai fmai0 = fmaj.a();
        fmai0.n(this.a.e.c().f());
        fmai0.g(0xD5);
        fmaj fmaj0 = fmai0.a();
        this.a.ah.b(fmaj0);
    }

    @Override  // gmbg
    public final void b(Object object0) {
        Void void0 = (Void)object0;
        flbj.a("ConvPresenter", "OpenConversationRequest completes successfully on " + this.a.b);
        fmai fmai0 = fmaj.a();
        fmai0.n(this.a.e.c().f());
        fmai0.g(0xD4);
        fmaj fmaj0 = fmai0.a();
        this.a.ah.b(fmaj0);
    }
}

