import j..util.Objects;

final class iazz implements Runnable {
    final ibbd a;

    public iazz(ibbd ibbd0) {
        Objects.requireNonNull(ibbd0);
        this.a = ibbd0;
        super();
    }

    @Override
    public final void run() {
        ibbd ibbd0 = this.a;
        if(!ibbd0.C.get() && ibbd0.v != null) {
            ibbd0.m(false);
            ibbd0.n();
        }
    }
}

