import j..util.Objects;

final class bguf implements gmbg {
    final bgug a;

    public bguf(bgug bgug0) {
        Objects.requireNonNull(bgug0);
        this.a = bgug0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        a.ae(bgug.d.h(), "warning box", throwable0);
    }

    @Override  // gmbg
    public final void b(Object object0) {
        bgud bgud0 = new bgud(this, bgva.a(((gxof)object0)));
        this.a.L(bgud0);
    }
}

