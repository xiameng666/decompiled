import j..util.Objects;

final class ibch implements Runnable {
    final ibcr a;

    public ibch(ibcr ibcr0) {
        Objects.requireNonNull(ibcr0);
        this.a = ibcr0;
        super();
    }

    @Override
    public final void run() {
        this.a.p = null;
        this.a.i.c();
        this.a.c();
    }
}

