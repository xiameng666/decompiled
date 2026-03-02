import j..util.Objects;

final class ibaw implements Runnable {
    final Runnable a;
    final ibay b;

    public ibaw(ibay ibay0, Runnable runnable0) {
        this.a = runnable0;
        Objects.requireNonNull(ibay0);
        this.b = ibay0;
        super();
    }

    @Override
    public final void run() {
        this.a.run();
        ibax ibax0 = new ibax(this.b);
        this.b.f.c.n.execute(ibax0);
    }
}

