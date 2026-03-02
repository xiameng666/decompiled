import j..util.Objects;

public final class bwuj {
    final Runnable a;
    public final bwur b;

    public bwuj(bwur bwur0, Runnable runnable0) {
        Objects.requireNonNull(bwur0);
        this.b = bwur0;
        super();
        this.a = runnable0;
    }

    public final bwur a() {
        this.a.run();
        return this.b;
    }
}

