import j..util.Objects;

final class gyjt implements Runnable {
    final gyjz a;
    private final gyjy b;

    public gyjt(gyjz gyjz0, gyjy gyjy0) {
        Objects.requireNonNull(gyjz0);
        this.a = gyjz0;
        super();
        this.b = gyjy0;
    }

    @Override
    public final void run() {
        this.a.e.add(this.b);
        this.a.b.post(this.a.g);
        synchronized(this.a.c) {
            this.a.d.E(this.b, this);
        }
    }
}

