import j..util.Objects;

final class crnx implements Runnable {
    final crns a;
    final long b;
    final crnz c;

    public crnx(crnz crnz0, crns crns0, long v) {
        this.a = crns0;
        this.b = v;
        Objects.requireNonNull(crnz0);
        this.c = crnz0;
        super();
    }

    @Override
    public final void run() {
        this.c.w(this.a, false, this.b);
        this.c.c = null;
        this.c.k().A(null);
    }
}

