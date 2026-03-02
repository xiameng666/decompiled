import j..util.Objects;

final class iayy implements Runnable {
    final iavn a;
    final boolean b;
    final iazk c;

    public iayy(iazk iazk0, iavn iavn0, boolean z) {
        this.a = iavn0;
        this.b = z;
        Objects.requireNonNull(iazk0);
        this.c = iazk0;
        super();
    }

    @Override
    public final void run() {
        this.c.o.c(this.a, this.b);
    }
}

