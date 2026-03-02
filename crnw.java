import j..util.Objects;

final class crnw implements Runnable {
    final long a;
    final crnz b;

    public crnw(crnz crnz0, long v) {
        this.a = v;
        Objects.requireNonNull(crnz0);
        this.b = crnz0;
        super();
    }

    @Override
    public final void run() {
        this.b.e().c(this.a);
        this.b.c = null;
    }
}

