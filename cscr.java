import j..util.Objects;

final class cscr implements evqc {
    final cscs a;

    public cscr(cscs cscs0) {
        Objects.requireNonNull(cscs0);
        this.a = cscs0;
        super();
    }

    @Override  // evqc
    public final void gv(Exception exception0) {
        a.ae(cscs.a.j(), "GetUpsellOffer failed on eSIM", exception0);
        cscb.B(this.a.b, this.a.d, hhct.ec, this.a.c.b);
    }
}

