import j..util.Objects;

final class bluj implements gmbg {
    final blul a;

    public bluj(blul blul0) {
        Objects.requireNonNull(blul0);
        this.a = blul0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        this.a.c.accept(throwable0);
    }

    @Override  // gmbg
    public final void b(Object object0) {
        if(((gfsx)object0).i()) {
            this.a.e = ((gfsx)object0).d();
            this.a.b();
            return;
        }
        this.a.b.run();
    }
}

