import j..util.Objects;

final class bgur implements gmbg {
    final bgus a;

    public bgur(bgus bgus0) {
        Objects.requireNonNull(bgus0);
        this.a = bgus0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        a.ae(bgus.d.h(), "warning box", throwable0);
    }

    @Override  // gmbg
    public final void b(Object object0) {
        bgva bgva0 = bgva.a(((gxof)object0));
        if(bgva0 == bgva.c) {
            bgup bgup0 = new bgup(this);
            this.a.L(bgup0);
        }
        else {
            bguo bguo0 = new bguo(this, bgva0);
            this.a.L(bguo0);
        }
        this.a.al.j(bgva0.g);
    }
}

