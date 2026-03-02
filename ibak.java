import j..util.Objects;

final class ibak extends iayo {
    final ibbd b;

    public ibak(ibbd ibbd0) {
        Objects.requireNonNull(ibbd0);
        this.b = ibbd0;
        super();
    }

    @Override  // iayo
    protected final void a() {
        this.b.o();
    }

    @Override  // iayo
    protected final void b() {
        ibbd ibbd0 = this.b;
        if(ibbd0.C.get()) {
            return;
        }
        ibbd0.r();
    }
}

