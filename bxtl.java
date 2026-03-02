import j..util.Objects;

final class bxtl implements gmbg {
    final jqt a;
    final bxsf b;
    final bxtn c;

    public bxtl(bxtn bxtn0, jqt jqt0, bxsf bxsf0) {
        this.a = jqt0;
        this.b = bxsf0;
        Objects.requireNonNull(bxtn0);
        this.c = bxtn0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        this.b.a(this.c.a, bxme.c(throwable0));
        this.a.b(null);
    }

    @Override  // gmbg
    public final void b(Object object0) {
        this.a.b(null);
    }
}

