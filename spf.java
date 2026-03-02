import j..util.Objects;

final class spf implements Runnable {
    final spg a;

    public spf(spg spg0) {
        Objects.requireNonNull(spg0);
        this.a = spg0;
        super();
    }

    @Override
    public final void run() {
        this.a.c.e(this.a.d);
    }
}

