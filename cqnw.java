import j..util.Objects;

final class cqnw implements gmbg {
    final cqny a;
    final cqny b;
    final cqnz c;

    public cqnw(cqnz cqnz0, cqny cqny0, cqny cqny1) {
        this.a = cqny0;
        this.b = cqny1;
        Objects.requireNonNull(cqnz0);
        this.c = cqnz0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        cqnx cqnx0 = new cqnx(this.b, throwable0);
        this.c.b.ii(cqnx0);
    }

    @Override  // gmbg
    public final void b(Object object0) {
        Void void0 = (Void)object0;
        this.c.b(this.a);
    }
}

