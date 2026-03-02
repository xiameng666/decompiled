import j..util.Objects;

final class ggsq implements Runnable {
    final ggsp a;
    final ggsr b;

    public ggsq(ggsr ggsr0, ggsp ggsp0) {
        this.a = ggsp0;
        Objects.requireNonNull(ggsr0);
        this.b = ggsr0;
        super();
    }

    @Override
    public final void run() {
        this.b.a.remove(this.a);
    }
}

