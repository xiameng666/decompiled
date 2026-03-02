import j..util.Objects;

final class ibam implements Runnable {
    final iban a;

    public ibam(iban iban0) {
        Objects.requireNonNull(iban0);
        this.a = iban0;
        super();
    }

    @Override
    public final void run() {
        ibbd ibbd0 = this.a.b;
        ibbd0.n.d();
        if(ibbd0.u) {
            ibbd0.t.b();
        }
    }
}

